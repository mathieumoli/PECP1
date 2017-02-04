package problang.utils;

import antlr.ProbabilisticLanguageParser;
import org.antlr.v4.runtime.tree.TerminalNode;
import problang.elems.Program;
import problang.elems.State;
import problang.exceptions.InfiniteProgramException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by lorynf on 26/01/17.
 */
public final class ExprHandler {
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

    /**
     * Vérifie si une boucle est infinie, et donc si le programme termine bien
     * @param p
     * @return
     */
    public static boolean checkInfiniteLoop(Program p, State s) throws ScriptException, InfiniteProgramException{
        ProbabilisticLanguageParser.VarContext varWhile = p.getCommand(0).whileStatement().cond().expr(0).value().var();
        if (varWhile == null) {
            if (p.getCommand(0).whileStatement().cond().expr(1).value().var() != null) {
                System.out.println("Variable après le signe");
                varWhile = p.getCommand(0).whileStatement().cond().expr(1).value().var();
                boolean affectationFound = false;
                for (ProbabilisticLanguageParser.CommandContext command : p.getCommand(0).whileStatement().commands().command()) {
                    if (command.affectation() != null) {
                        TerminalNode varCommand = command.affectation().var().IDENT();
                        if (varCommand.getText().equals(varWhile.IDENT().getText())) {
                            affectationFound = true;
                            System.out.println("j'ai trouvé une affectation avec la bonne variable");
                            // Vérification de l'utilité de l'opération réalisée (si débouchera sur une sortie du while)
                            ProbabilisticLanguageParser.CompContext comparator = p.getCommand(0).whileStatement().cond().comp();
                        } else {
                            System.out.println("pas une affectation avec la bonne variable");
                        }
                    }
                }
                if (!affectationFound) {
                    throw new InfiniteProgramException("Programme infini");
                }
            } else {
                System.out.println("Pas de variable dans le while");
                return handleCondition(p.getCommand(0).whileStatement().cond(), s);
            }
        } else {
            if (p.getCommand(0).whileStatement().cond().expr(1).value().var() != null) {
                System.out.println("Deux variables dans le while");
            } else {
                System.out.println("Variable avant le signe");
            }
        }
        return false;
    }
}
