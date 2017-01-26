package problang.utils;

import antlr.ProbabilisticLanguageParser;
import problang.elems.State;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by lorynf on 26/01/17.
 */
public final class Utils {
    private static ScriptEngineManager manager = new ScriptEngineManager();
    private static ScriptEngine engine = manager.getEngineByName("JavaScript");

    public static long handleExpr(ProbabilisticLanguageParser.ExprContext expr, State s) {
        long value = getValue(expr.value(),s);
        // Si il y a une opération...
        if (expr.operation() != null) {
            value = handleOperation(expr, s, value);
            if (expr.operation().mod() != null) //TODO voir si gérer comme ça ça passe (exp_mod surement pas quoi)
                value %= getValue(expr.operation().mod().value(),s);
        }
        return value;
    }

    public static long getValue(ProbabilisticLanguageParser.ValueContext valueContext, State s) {
        long value;
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

    public static long handleOperation(ProbabilisticLanguageParser.ExprContext expr, State s, long value) {
        try {
            long value2 = getValue(expr.operation().value(),s);
            if (expr.operation().op().POW() != null) {
                System.out.println((long) Math.pow(value,value2));
                return (long) Math.pow(value,value2);
            }
           else return (int) engine.eval(value + expr.operation().op().getText() + value2 );
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return value;
    }

    public static boolean handleCondition(ProbabilisticLanguageParser.CondContext condition, State s) throws ScriptException {
        ProbabilisticLanguageParser.CompContext comp  = condition.comp();
        long value1 = handleExpr(condition.expr(0), s);
        long value2 = handleExpr(condition.expr(1),s);
        return (boolean) engine.eval(value1 + comp.getText() + value2);
    }
}
