// Generated from /home/user/Documents/EPU/SI5/PreuvesCrypto/Projet/Projet1/antlr/ProbalisticLanguage.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProbalisticLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProbalisticLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProbalisticLanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ProbalisticLanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbalisticLanguageParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(ProbalisticLanguageParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbalisticLanguageParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectation(ProbalisticLanguageParser.AffectationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbalisticLanguageParser#skip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(ProbalisticLanguageParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbalisticLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ProbalisticLanguageParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbalisticLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ProbalisticLanguageParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbalisticLanguageParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ProbalisticLanguageParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbalisticLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ProbalisticLanguageParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbalisticLanguageParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(ProbalisticLanguageParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbalisticLanguageParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(ProbalisticLanguageParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbalisticLanguageParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(ProbalisticLanguageParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProbalisticLanguageParser#probFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProbFunc(ProbalisticLanguageParser.ProbFuncContext ctx);
}