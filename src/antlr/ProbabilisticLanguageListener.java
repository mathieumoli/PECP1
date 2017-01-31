// Generated from /home/user/SI5/PreuvesCrypto/PECP1/resources/antlr/ProbabilisticLanguage.g4 by ANTLR 4.6
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
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#initialState}.
	 * @param ctx the parse tree
	 */
	void enterInitialState(ProbabilisticLanguageParser.InitialStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#initialState}.
	 * @param ctx the parse tree
	 */
	void exitInitialState(ProbabilisticLanguageParser.InitialStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#memory}.
	 * @param ctx the parse tree
	 */
	void enterMemory(ProbabilisticLanguageParser.MemoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#memory}.
	 * @param ctx the parse tree
	 */
	void exitMemory(ProbabilisticLanguageParser.MemoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(ProbabilisticLanguageParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(ProbabilisticLanguageParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(ProbabilisticLanguageParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(ProbabilisticLanguageParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ProbabilisticLanguageParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ProbabilisticLanguageParser.CommandContext ctx);
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
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#adversaryCode}.
	 * @param ctx the parse tree
	 */
	void enterAdversaryCode(ProbabilisticLanguageParser.AdversaryCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#adversaryCode}.
	 * @param ctx the parse tree
	 */
	void exitAdversaryCode(ProbabilisticLanguageParser.AdversaryCodeContext ctx);
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
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(ProbabilisticLanguageParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(ProbabilisticLanguageParser.ModContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#noNull}.
	 * @param ctx the parse tree
	 */
	void enterNoNull(ProbabilisticLanguageParser.NoNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#noNull}.
	 * @param ctx the parse tree
	 */
	void exitNoNull(ProbabilisticLanguageParser.NoNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(ProbabilisticLanguageParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(ProbabilisticLanguageParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ProbabilisticLanguageParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ProbabilisticLanguageParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticLanguageParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(ProbabilisticLanguageParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticLanguageParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(ProbabilisticLanguageParser.FunctionIdentifierContext ctx);
}