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
        long value = getValue(expr.value(), s);
        // Si il y a une opération...
        if (expr.operation() != null) {
            value = handleOperation(expr, s, value);
            if (expr.operation().mod() != null) //TODO voir si gérer comme ça ça passe (exp_mod surement pas quoi)
                value %= getValue(expr.operation().mod().value(), s);
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
            long value2 = getValue(expr.operation().value(), s);
            if (expr.operation().op().POW() != null) {
                return (long) Math.pow(value, value2);
            } else return (int) engine.eval(value + expr.operation().op().getText() + value2);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return value;
    }

    public static boolean handleCondition(ProbabilisticLanguageParser.CondContext condition, State s) throws ScriptException {
        ProbabilisticLanguageParser.CompContext comp = condition.comp();
        long value1 = handleExpr(condition.expr(0), s);
        long value2 = handleExpr(condition.expr(1), s);
        return (boolean) engine.eval(value1 + comp.getText() + value2);
    }

    /**
     * Vérifie si une boucle est infinie, et donc si le programme termine bien
     */
    public static void checkInfiniteLoop(Program p, State s) throws ScriptException, InfiniteProgramException {
        ProbabilisticLanguageParser.VarContext varWhile = p.getCommand(0).whileStatement().cond().expr(0).value().var();
        if(varWhile == null && p.getCommand(0).whileStatement().cond().expr(1).value().var() == null) {
            if(handleCondition(p.getCommand(0).whileStatement().cond(), s)) {
                throw new InfiniteProgramException("Programme infini car condition toujours vérifiée sans variables");
            }
        } else {
            if (varWhile == null) { // Variable après le signe si pas avant
                varWhile = p.getCommand(0).whileStatement().cond().expr(1).value().var();
            }
            boolean affectationFound = false;
            // Boucle de recherche d'affectation
            for (ProbabilisticLanguageParser.CommandContext command : p.getCommand(0).whileStatement().commands().command()) {
                if (command.affectation() != null) {
                    TerminalNode varCommand = command.affectation().var().IDENT();
                    if (varCommand.getText().equals(varWhile.IDENT().getText())) {
                        if (command.affectation().probFunc() != null) {
                            affectationFound=false;
                        } else {
                            affectationFound = checkAffectationForLoop(p.getCommand(0).whileStatement().cond(), command.affectation());
                        }
                    }
                }
            }
            if (!affectationFound) {
                throw new InfiniteProgramException("Programme infini car pas d'affectation pour sortir de la boucle while");
            }
        }
    }



    /**
     * Vérifie si une affectation modifiera le comportement d'une boucle
     */
    public static boolean checkAffectationForLoop(ProbabilisticLanguageParser.CondContext cond, ProbabilisticLanguageParser.AffectationContext affectation) throws InfiniteProgramException {
        if (cond.comp().getText().equals("==")) {
            if (affectation.expr().operation() == null) {
                if (cond.expr(0).value().var() != null) {
                    if (cond.expr(1).value().getText().equals(affectation.expr().value().getText())) {
                        return false;
                    }
                } else {
                    if (cond.expr(0).value().getText().equals(affectation.expr().value().getText())) {
                        return false;
                    }
                }
            }
        } else {
            boolean firstOperand = (cond.expr(0).value().var() != null);
            if ((firstOperand && cond.comp().getText().equals("<")) || (!firstOperand && cond.comp().getText().equals(">"))) {
                if (affectation.expr().operation() == null) {
                    return false;
                } else {
                    if(!affectation.expr().operation().op().getText().equals("+")) {
                        return false;
                    }
                }
            } else if ((firstOperand && cond.comp().getText().equals(">")) || (!firstOperand && cond.comp().getText().equals("<"))) {
                if (affectation.expr().operation() == null) {
                    return false;
                } else {
                    if(!affectation.expr().operation().op().getText().equals("-")) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
