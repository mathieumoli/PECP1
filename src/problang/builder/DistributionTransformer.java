package problang.builder;

import antlr.ProbabilisticLanguageLexer;
import antlr.ProbabilisticLanguageParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import problang.elems.*;
import problang.exceptions.InfiniteProgramException;

import javax.script.ScriptException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

import static problang.utils.ExprHandler.*;


/**
 * Created by lorynf on 09/01/17.
 */
public final class DistributionTransformer {
    static Map<String, Function> functions = new HashMap<>();

    public static Distribution getFinalDistribution(String filePath) throws IOException, InfiniteProgramException {
        // initialiser le lexer et le parser
        ANTLRInputStream in = new ANTLRInputStream(new FileReader(filePath));
        ProbabilisticLanguageLexer lexer = new ProbabilisticLanguageLexer(in);
        BufferedTokenStream tokens = new CommonTokenStream(lexer);
        ProbabilisticLanguageParser parser = new ProbabilisticLanguageParser(tokens);
        ProbabilisticLanguageParser.ProgramContext programContext = parser.program();

        // Création de l'état initial, à partir de l'initialState du programme
        State initialState = new State();
        for (ProbabilisticLanguageParser.ElementContext element :programContext.initialState().memory().element()) {
            initialState.addElement(element.var().IDENT().getText(),Integer.parseInt(element.NUMBER().getText()));
        }

        //Création du programme avec la liste des commandes
        Program initialProgram = new Program(programContext.commands().command());
        Configuration initialConfiguration = new Configuration(initialProgram, initialState);
        Distribution initialDistribution = new Distribution();
        initialDistribution.getElements().put(initialConfiguration, new BigDecimal(1));
        System.out.println(initialDistribution);

        // Récupération des fonctions
        if (programContext.functions() != null) {
            for (ProbabilisticLanguageParser.FunctionContext function : programContext.functions().function()) {
                String functionName = function.functionIdentifier().IDENT().getText();
                List<String> functionVars = new ArrayList<>();
                for (ProbabilisticLanguageParser.VarContext varContext : function.functionIdentifier().var()) {
                    functionVars.add(varContext.IDENT().getText());
                }
                List<ProbabilisticLanguageParser.CommandContext> functionCommands = function.commands().command();
                functions.put(functionName, new Function(functionName, functionVars, functionCommands));
            }
        }

        //On boucle jusqu'à avoir une distribution finale
        boolean goForward;
        Distribution distribution = initialDistribution;
        do {
            distribution = DistributionTransformer.transformation(distribution);
            System.out.println(distribution);
            goForward = false;
            for (Configuration c : distribution.getElements().keySet()) {
                if (!c.getProgram().getCommands().isEmpty()) {
                    goForward = true;
                }
            }
        } while (goForward);
        return distribution;
    }

    private static Distribution transformation(Distribution d) throws InfiniteProgramException {
        // La distribution finale à remplir
        Distribution d1 = new Distribution();

        // On boucle sur les configurations de la distribution
        for (Configuration c : d.getElements().keySet()) {
            // On récupère le programme
            Program p = c.getProgram();

            // si le programme est vide (tic)
            if (p.getCommands().isEmpty()) {
                d1.addElement(c, d.getElements().get(c));
            } else {
                // Si la première commande est une affectation
                if (p.getCommand(0).affectation() != null) {
                    d1 = applyAffectationRule(c, d1, d);
                }
                // Si c'est un while
                else if (p.getCommand(0).whileStatement() != null) {
                    d1 = applyWhileRule(c, d1, d);
                }
                // Si c'est un if
                else if (p.getCommand(0).ifStatement() != null) {
                    d1 = applyIfRule(c, d1, d);
                }
                // Si c'est A[E] (le code de l'adversaire)
                else if (p.getCommand(0).adversaryCode() != null) {
                    d1 = applyUnknownRule(c, d1, d);
                }
                // Il ne reste que le skip (normalement)
                else {
                    assert p.getCommand(0).skip() != null;
                    d1 = applySkipRule(c, d1, d);
                }
            }
        }
        return d1;
    }

    private static Distribution applyAffectationRule(Configuration c, Distribution d1, Distribution d) {
        Program p = c.getProgram();
        State s = c.getState();

        // On crée le programme qu'on aura après l'affectation (le reste du programme)
        Program p1 = new Program(p.getCommands().subList(1, p.getCommands().size()));

        String var = p.getCommand(0).affectation().var().IDENT().getText();

        // Premier cas : on affecte une expression
        if (p.getCommand(0).affectation().expr() != null) {
            long value = handleExpr(p.getCommand(0).affectation().expr(), s);
            s.getMemory().put(var, value);
            d1.addElement(new Configuration(p1, s), d.getElements().get(c));
        }
        // Deuxième cas : on affecte une fonction probabiliste
        else {
            assert p.getCommand(0).affectation().probFunc() != null;
            ProbabilisticLanguageParser.ProbFuncContext probFunc = p.getCommand(0).affectation().probFunc();
            if (probFunc.uniformDistrib() != null) {
                BigDecimal proba = BigDecimal.valueOf(1.0/(probFunc.uniformDistrib().value().size()));
                for (ProbabilisticLanguageParser.ValueContext valueContext : probFunc.uniformDistrib().value()) {
                    long value = getValue(valueContext,s);
                    State s1 = new State(s);
                    s1.getMemory().put(var,value);
                    d1.addElement(new Configuration(p1, s1), d.getElements().get(c).multiply(proba));
                }
            } else if (probFunc.zq() != null) {
                int i = (probFunc.zq().noNull() != null) ? 1 : 0;
                long q = getValue(probFunc.zq().value(),s);
                BigDecimal proba = BigDecimal.ONE.divide(BigDecimal.valueOf(q).subtract(BigDecimal.valueOf(i)), 1, BigDecimal.ROUND_HALF_UP);

                for (;i < q; i++) {
                    State s1 = new State(s);
                    s1.getMemory().put(var,(long)i);
                    d1.addElement(new Configuration(p1,s1), d.getElements().get(c).multiply(proba));
                }
            } else {
                assert probFunc.functionIdentifier() != null;
                Function f = functions.get(probFunc.functionIdentifier().IDENT().getText());
                p1.getCommands().addAll(0,f.getCommands());
                d1.addElement(new Configuration(p1,s), d.getElements().get(c));
                // du coup ça ressemble un peu au "inline" de la prof
                //TODO Manque la vérif des parametres

            }
        }
        return d1;
    }

    private static Distribution applyIfRule(Configuration c, Distribution d1, Distribution d) {
        Program program = c.getProgram();
        State s = c.getState();
        List<ProbabilisticLanguageParser.CommandContext> listCodeExecute = new ArrayList<>();

        try {
            boolean cond = handleCondition(program.getCommand(0).ifStatement().cond(),s);
            if (cond) {
                listCodeExecute.addAll(program.getCommand(0).ifStatement().commands(0).command());

            } else {
                listCodeExecute.addAll(program.getCommand(0).ifStatement().commands(1).command());
            }
            listCodeExecute.addAll(program.getCommands().subList(1, program.getCommands().size()));
            Configuration newConfig = new Configuration(new Program(listCodeExecute), s);
            d1.addElement(newConfig, d.getElements().get(c));
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return d1;
    }

    private static Distribution applyWhileRule(Configuration c, Distribution d1, Distribution d) throws InfiniteProgramException {
        Program p = c.getProgram();
        State s = c.getState();
        try {
            boolean cond = handleCondition(p.getCommand(0).whileStatement().cond(),s);
            if(cond){
                checkInfiniteLoop(p, s);
                List<ProbabilisticLanguageParser.CommandContext> liste = p.getCommand(0).whileStatement().commands().command();
                liste.addAll(p.getCommands());
                Program p1 = new Program(liste);
                Configuration conf = new Configuration(p1, s);
                d1.addElement(conf, d.getElements().get(c));
            }else
            {
                Program pf = new Program(p.getCommands().subList(1, p.getCommands().size()));
                Configuration conf = new Configuration(pf, s);
                d1.addElement(conf, d.getElements().get(c));
            }
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return d1;
    }

    private static Distribution applyUnknownRule(Configuration c, Distribution d1, Distribution d) {
        Program p = c.getProgram();
        State s = c.getState();

        // On crée le programme qu'on aura après l'execution du code de l'adversaire (le reste du programme)
        Program p1 = new Program(p.getCommands().subList(1, p.getCommands().size()));

        // On récupère la variable que l'adversaire peut modifier
        String adversaryVar = p.getCommand(0).adversaryCode().var().getText();

        // On génère la probabilité que la variable vaille 0 et on en déduit la  probabilité pour 1
        Random r = new Random();
        //double prob0 = r.nextDouble();
        BigDecimal prob0 = BigDecimal.valueOf(r.nextDouble());
        BigDecimal prob1 = BigDecimal.ONE.subtract(prob0);

        // On crée la configuration associé à chaque probabilité et on les ajoute à la distribution
        State s0 = new State(s);
        s0.getMemory().put(adversaryVar, (long)0);
        d1.addElement(new Configuration(p1, s0), d.getElements().get(c).multiply(prob0));

        State s1 = new State(s);
        s0.getMemory().put(adversaryVar, (long)1);
        d1.addElement(new Configuration(p1, s1), d.getElements().get(c).multiply(prob1));

        return d1;
    }

    private static Distribution applySkipRule(Configuration c, Distribution d1, Distribution d) {
        Program p = c.getProgram();
        State s = c.getState();

        // On crée le programme qu'on aura après le skip (le reste du programme)
        Program p1 = new Program(p.getCommands().subList(1, p.getCommands().size()));

        d1.addElement(new Configuration(p1,s), d.getElements().get(c));
        return d1;
    }
}

