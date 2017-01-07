// Generated from /home/user/Documents/EPU/SI5/PreuvesCrypto/Projet/Projet1/antlr/ProbalisticLanguage.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProbalisticLanguageParser}.
 */
public interface ProbalisticLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProbalisticLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ProbalisticLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbalisticLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ProbalisticLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbalisticLanguageParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(ProbalisticLanguageParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbalisticLanguageParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(ProbalisticLanguageParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbalisticLanguageParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectation(ProbalisticLanguageParser.AffectationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbalisticLanguageParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectation(ProbalisticLanguageParser.AffectationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbalisticLanguageParser#skip}.
	 * @param ctx the parse tree
	 */
	void enterSkip(ProbalisticLanguageParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbalisticLanguageParser#skip}.
	 * @param ctx the parse tree
	 */
	void exitSkip(ProbalisticLanguageParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbalisticLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ProbalisticLanguageParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbalisticLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ProbalisticLanguageParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbalisticLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ProbalisticLanguageParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbalisticLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ProbalisticLanguageParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbalisticLanguageParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ProbalisticLanguageParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbalisticLanguageParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ProbalisticLanguageParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbalisticLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ProbalisticLanguageParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbalisticLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ProbalisticLanguageParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbalisticLanguageParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(ProbalisticLanguageParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbalisticLanguageParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(ProbalisticLanguageParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbalisticLanguageParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(ProbalisticLanguageParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbalisticLanguageParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(ProbalisticLanguageParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbalisticLanguageParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(ProbalisticLanguageParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbalisticLanguageParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(ProbalisticLanguageParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbalisticLanguageParser#probFunc}.
	 * @param ctx the parse tree
	 */
	void enterProbFunc(ProbalisticLanguageParser.ProbFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbalisticLanguageParser#probFunc}.
	 * @param ctx the parse tree
	 */
	void exitProbFunc(ProbalisticLanguageParser.ProbFuncContext ctx);
}