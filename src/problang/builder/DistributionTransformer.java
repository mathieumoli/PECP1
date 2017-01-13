package problang.builder;

import antlr.ProbabilisticLanguageParser;
import antlr.ProbabilisticLanguageParser.CodeContext;
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

    public static Distribution transformation(Distribution d) {
        // La distribution finale à remplir
        Distribution d1 = new Distribution();

        // On boucle sur les configurations de la distribution
        for (Configuration c : d.getElements().keySet()) {
            // On récupère le programme
            Program p = c.getProgram();

            // si le programme est vide (tic)
            if (p.getCommands().isEmpty()) {
                d1.getElements().put(c, d.getElements().get(c));
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

            // TODO verifier que var n'est pas déjà dedans
            s.getMemory().put(var, value);

            // TODO si on a déjà cette configuration additionner la probabilité
            d1.getElements().put(new Configuration(p1, s), 1.0 * d.getElements().get(c));
        }
        // Deuxième cas : on affecte une fonction probabiliste
        else {
            assert p.getCommand(0).affectation().probFunc() != null;
            //TODO
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
        int value2 = getValue(expr.operation().value(),s);
        switch (expr.operation().op().getText()) {
            case "+":
                value += value2;
                break;
            case "-":
                value -= value2;
                break;
            case "*":
                value *= value2;
                break;
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
			
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("JavaScript");            		
			            		
				try {
					if((boolean) engine.eval(value1 + comp.getText() + value2)){
						List<CodeContext> liste = p.getCommand(0).whileStatement().program().code();
						liste.add(p.getCommand(0));
						Program p1 = new Program(liste);
						Configuration conf = new Configuration(p1, etat);
						d1.getElements().put(conf, 1.0 * d.getElements().get(c));
					}else
					{
						Program pf = new Program(new ArrayList<CodeContext>());
						Configuration conf = new Configuration(pf, etat);
						d1.getElements().put(conf, 1.0 * d.getElements().get(c));
						
						
					}
				} catch (ScriptException e) {
                    e.printStackTrace();
				}
		}
		return d1;
    }

    private static Distribution applyIfRule(Configuration c, Distribution d1, Distribution d) {
        // TODO a vous de jouer les mecs
        return d1;
    }

    private static Distribution applySkipRule(Configuration c, Distribution d1, Distribution d) {
        Program p = c.getProgram();
        State s = c.getState();

        // On crée le programme qu'on aura après le skip (le reste du programme)
        Program p1 = new Program(p.getCommands().subList(1, p.getCommands().size()));

        // TODO si on a déjà cette configuration additionner la probabilité
        d1.getElements().put(new Configuration(p1,s), 1.0 * d.getElements().get(c));
        return d1;
    }
}

