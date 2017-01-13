package problang.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import antlr.ProbabilisticLanguageParser.CodeContext;
import antlr.ProbabilisticLanguageParser.CompContext;
import antlr.ProbabilisticLanguageParser.CondContext;
import antlr.ProbabilisticLanguageParser.ExprContext;
import problang.elems.*;

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

            // Si la première commande est une affectation
            if (p.getCommand(0).affectation() != null) {
                d1 = applyAffectationRule(c, d1, d);
            }
            else if(p.getCommand(0).whileStatement() != null){
            	d1= applyWhileRule(c,d1,d);
					
            	}           	          
            
            // TODO les autres regles
        }
        return d1;
    }

    private static Distribution applyAffectationRule(Configuration c, Distribution d1, Distribution d) {
        Program p = c.getProgram();
        State s = c.getState();

        // On crée le programme qu'on aura après l'affectation (le reste du programme)
        Program p1 = new Program(p.getCommands().subList(1, p.getCommands().size()));

        String var = p.getCommand(0).affectation().var().IDENT().getText();
        //System.out.println("var:"+var);

        // Premier cas : on affecte une expression
        if (p.getCommand(0).affectation().expr() != null) {
            int value;
            // Si c'est un nombre, on récupère la valeur
            if (p.getCommand(0).affectation().expr().NUMBER() != null) {
                value = Integer.parseInt(p.getCommand(0).affectation().expr().NUMBER().getText());
            }
            // Si c'est une variable, il faut récupérer la valeur dans la mémoire
            else {
                assert p.getCommand(0).affectation().expr().var() != null;
                //TODO
                value = 0;
            }
            // Si il y a une opération...
            if (p.getCommand(0).affectation().expr().op() != null) {
                //TODO
                value = 0;
            }
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
    
    private static Distribution applyWhileRule(Configuration c, Distribution d1, Distribution d) {
		Program p = c.getProgram();
		State etat = c.getState();
		Map<String, Integer> memory = etat.getMemory();
		if(memory.isEmpty()){
			int value1 = 0;
			int value2 = 0;
			CondContext condition = p.getCommand(0).whileStatement().cond();
			ExprContext expr1 = condition.expr(0);
			ExprContext expr2 = condition.expr(1);

			CompContext comp  = condition.comp();
			value1 = evaluerExpr(expr1,c);
			value2 = evaluerExpr(expr2,c);	
			
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return d1;
	
    }
    
    private static int evaluerExpr(ExprContext expr, Configuration c)
    {
    	
    	State etat = c.getState();
		Map<String, Integer> memory = etat.getMemory();
    	int value = 0;
    	if(expr.NUMBER() != null)
		{
			value = Integer.parseInt(expr.NUMBER().getText());
		}else{
			String var1 = expr.var().getText();
			if(memory.containsKey(var1)){
				value = memory.get(var1);				
			}
		}
		if(expr.op() != null){
			String op = expr.op().getText();
			int valueExpr = evaluerExpr(expr.expr(), c);
			ScriptEngineManager mgr = new ScriptEngineManager();
		    ScriptEngine engine = mgr.getEngineByName("JavaScript");
		    try {
				value = (int) engine.eval(value+op+valueExpr);
			} catch (ScriptException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
    	return value;
    }
    
}
