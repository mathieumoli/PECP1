// Generated from /home/user/Documents/EPU/SI5/PreuvesCrypto/Projet/Projet1/resources/antlr/ProbabilisticLanguage.g4 by ANTLR 4.5.3
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProbabilisticLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProbabilisticLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ProbabilisticLanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#initialState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialState(ProbabilisticLanguageParser.InitialStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#memory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemory(ProbabilisticLanguageParser.MemoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(ProbabilisticLanguageParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(ProbabilisticLanguageParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(ProbabilisticLanguageParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectation(ProbabilisticLanguageParser.AffectationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#skip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(ProbabilisticLanguageParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ProbabilisticLanguageParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ProbabilisticLanguageParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ProbabilisticLanguageParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ProbabilisticLanguageParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ProbabilisticLanguageParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(ProbabilisticLanguageParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(ProbabilisticLanguageParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(ProbabilisticLanguageParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(ProbabilisticLanguageParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#probFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProbFunc(ProbabilisticLanguageParser.ProbFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#uniformDistrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniformDistrib(ProbabilisticLanguageParser.UniformDistribContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbabilisticLanguageParser#zq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZq(ProbabilisticLanguageParser.ZqContext ctx);
}