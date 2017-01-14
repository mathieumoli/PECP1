package problang.builder;

import antlr.ProbabilisticLanguageParser;
import antlr.ProbabilisticLanguageParser.CodeContext;
import com.sun.org.apache.bcel.internal.classfile.Code;
import org.antlr.v4.runtime.tree.TerminalNode;
import problang.elems.Configuration;
import problang.elems.Distribution;
import problang.elems.Program;
import problang.elems.State;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * Created by lorynf on 09/01/17.
 */
public final class DistributionTransformer {

    private static ScriptEngineManager manager = new ScriptEngineManager();
    private static ScriptEngine engine = manager.getEngineByName("JavaScript");

    public static Distribution transformation(Distribution d) {
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
            int value = handleExpr(p.getCommand(0).affectation().expr(), s);

            s.getMemory().put(var, value);

            d1.addElement(new Configuration(p1, s), 1.0 * d.getElements().get(c));
        }
        // Deuxième cas : on affecte une fonction probabiliste
        else {
            assert p.getCommand(0).affectation().probFunc() != null;
            ProbabilisticLanguageParser.ProbFuncContext probFunc = p.getCommand(0).affectation().probFunc();
            if (probFunc.uniformDistrib() != null) {
                double proba = (double)1/(probFunc.uniformDistrib().NUMBER().size());
                for (TerminalNode number : probFunc.uniformDistrib().NUMBER()) {
                    State s1 = new State(s);
                    int value = Integer.parseInt(number.getText());
                    s1.getMemory().put(var,value);
                    d1.addElement(new Configuration(p1, s1), proba * d.getElements().get(c));
                }
            } else if (probFunc.zq() != null) {
                int q = Integer.parseInt(probFunc.zq().NUMBER().getText());
                for (int i = 0; i < q; i++) {
                    State s1 = new State(s);
                    s1.getMemory().put(var,i);
                    d1.addElement(new Configuration(p1,s1), (1/q) * d.getElements().get(c));
                }
            } else {
                //TODO les fonctions encryption
            }
        }
        return d1;
    }

    private static int handleExpr(ProbabilisticLanguageParser.ExprContext expr, State s) {
        int value = getValue(expr.value(),s);
        // Si il y a une opération...
        if (expr.operation() != null)
            value = handleOperation(expr,s,value);
        return value;
    }

    private static int getValue(ProbabilisticLanguageParser.ValueContext valueContext, State s) {
        int value;
        // Si c'est un nombre, on récupère la valeur
        if (valueContext.NUMBER() != null) {
            value = Integer.parseInt(valueContext.NUMBER().getText());
        }
        // Si c'est une variable, il faut récupérer la valeur dans la mémoire
        else {
            assert valueContext.var() != null;
            String memVar = valueContext.var().getText();
            value = s.getMemory().get(memVar);
        }
        return value;
    }

    private static int handleOperation(ProbabilisticLanguageParser.ExprContext expr, State s, int value) {
        try {
            int value2 = getValue(expr.operation().value(),s);
            return (int) engine.eval(value + expr.operation().op().getText() + value2 );
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return value;
    }

    private static Distribution applyWhileRule(Configuration c, Distribution d1, Distribution d) {
        Program p = c.getProgram();
        State etat = c.getState();
        Map<String, Integer> memory = etat.getMemory();
        if(memory.isEmpty()){
            int value1 = 0;
            int value2 = 0;
            ProbabilisticLanguageParser.CondContext condition = p.getCommand(0).whileStatement().cond();
            ProbabilisticLanguageParser.ExprContext expr1 = condition.expr(0);
            ProbabilisticLanguageParser.ExprContext expr2 = condition.expr(1);

            ProbabilisticLanguageParser.CompContext comp  = condition.comp();
            value1 = handleExpr(expr1, etat);
            value2 = handleExpr(expr2,etat);

            try {
                if((boolean) engine.eval(value1 + comp.getText() + value2)){
                    List<CodeContext> liste = p.getCommand(0).whileStatement().program().code();
                    liste.add(p.getCommand(0));
                    Program p1 = new Program(liste);
                    Configuration conf = new Configuration(p1, etat);
                    d1.addElement(conf, 1.0 * d.getElements().get(c));
                }else
                {
                    Program pf = new Program(new ArrayList<CodeContext>());
                    Configuration conf = new Configuration(pf, etat);
                    d1.addElement(conf, 1.0 * d.getElements().get(c));


                }
            } catch (ScriptException e) {
                e.printStackTrace();
            }
        }
        return d1;
    }

    private static Distribution applyIfRule(Configuration c, Distribution d1, Distribution d) {
        Program program = c.getProgram();
        State state = c.getState();

        ProbabilisticLanguageParser.CondContext condition = program.getCommand(0).ifStatement().cond();
        ProbabilisticLanguageParser.ExprContext expr1 = condition.expr(0);
        ProbabilisticLanguageParser.ExprContext expr2 = condition.expr(1);

        ProbabilisticLanguageParser.CompContext comp  = condition.comp();
        int value1 = handleExpr(expr1, state);
        int value2 = handleExpr(expr2, state);
        List<CodeContext> listCodeExecute = new ArrayList<>();

        try {
            if ((boolean) engine.eval(value1 + comp.getText() + value2)) {
                CodeContext codeTrue = program.getCommand(0).ifStatement().code(0);

            } else {

            }
            listCodeExecute.addAll(program.getCommands().subList(1, program.getCommands().size()));
        } catch (ScriptException e) {
            e.printStackTrace();
        }

        // TODO a vous de jouer les mecs
        return d1;
    }

    private static Distribution applySkipRule(Configuration c, Distribution d1, Distribution d) {
        Program p = c.getProgram();
        State s = c.getState();

        // On crée le programme qu'on aura après le skip (le reste du programme)
        Program p1 = new Program(p.getCommands().subList(1, p.getCommands().size()));

        d1.addElement(new Configuration(p1,s), 1.0 * d.getElements().get(c));
        return d1;
    }
}

