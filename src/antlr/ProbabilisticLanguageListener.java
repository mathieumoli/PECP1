// Generated from /home/user/Documents/EPU/SI5/PreuvesCrypto/Projet/Projet1/resources/antlr/ProbabilisticLanguage.g4 by ANTLR 4.5.3
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProbabilisticLanguageParser}.
 */
public interface ProbabilisticLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ProbabilisticLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ProbabilisticLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(ProbabilisticLanguageParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(ProbabilisticLanguageParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectation(ProbabilisticLanguageParser.AffectationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectation(ProbabilisticLanguageParser.AffectationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#skip}.
	 * @param ctx the parse tree
	 */
	void enterSkip(ProbabilisticLanguageParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#skip}.
	 * @param ctx the parse tree
	 */
	void exitSkip(ProbabilisticLanguageParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ProbabilisticLanguageParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ProbabilisticLanguageParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ProbabilisticLanguageParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ProbabilisticLanguageParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ProbabilisticLanguageParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ProbabilisticLanguageParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ProbabilisticLanguageParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ProbabilisticLanguageParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ProbabilisticLanguageParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ProbabilisticLanguageParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(ProbabilisticLanguageParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(ProbabilisticLanguageParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(ProbabilisticLanguageParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(ProbabilisticLanguageParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(ProbabilisticLanguageParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(ProbabilisticLanguageParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(ProbabilisticLanguageParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(ProbabilisticLanguageParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#probFunc}.
	 * @param ctx the parse tree
	 */
	void enterProbFunc(ProbabilisticLanguageParser.ProbFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#probFunc}.
	 * @param ctx the parse tree
	 */
	void exitProbFunc(ProbabilisticLanguageParser.ProbFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#uniformDistrib}.
	 * @param ctx the parse tree
	 */
	void enterUniformDistrib(ProbabilisticLanguageParser.UniformDistribContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#uniformDistrib}.
	 * @param ctx the parse tree
	 */
	void exitUniformDistrib(ProbabilisticLanguageParser.UniformDistribContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#zq}.
	 * @param ctx the parse tree
	 */
	void enterZq(ProbabilisticLanguageParser.ZqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#zq}.
	 * @param ctx the parse tree
	 */
	void exitZq(ProbabilisticLanguageParser.ZqContext ctx);
}