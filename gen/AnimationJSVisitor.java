// Generated from /home/sebastian/Desktop/animationJS/grammar/AnimationJS.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AnimationJSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AnimationJSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(AnimationJSParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#setup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetup(AnimationJSParser.SetupContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#animate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimate(AnimationJSParser.AnimateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#main_commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_commands(AnimationJSParser.Main_commandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(AnimationJSParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#m_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM_command(AnimationJSParser.M_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#setCanvas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCanvas(AnimationJSParser.SetCanvasContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(AnimationJSParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#asignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignation(AnimationJSParser.AsignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#console}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsole(AnimationJSParser.ConsoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#setBackground}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetBackground(AnimationJSParser.SetBackgroundContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#draw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDraw(AnimationJSParser.DrawContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#rgb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRgb(AnimationJSParser.RgbContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#dt_numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDt_numeric(AnimationJSParser.Dt_numericContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#num_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_expr(AnimationJSParser.Num_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#oper_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_num(AnimationJSParser.Oper_numContext ctx);
}