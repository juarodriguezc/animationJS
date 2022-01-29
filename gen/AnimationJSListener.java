// Generated from /home/sebastian/Desktop/animationJS/grammar/AnimationJS.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AnimationJSParser}.
 */
public interface AnimationJSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(AnimationJSParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(AnimationJSParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#setup}.
	 * @param ctx the parse tree
	 */
	void enterSetup(AnimationJSParser.SetupContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#setup}.
	 * @param ctx the parse tree
	 */
	void exitSetup(AnimationJSParser.SetupContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#animate}.
	 * @param ctx the parse tree
	 */
	void enterAnimate(AnimationJSParser.AnimateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#animate}.
	 * @param ctx the parse tree
	 */
	void exitAnimate(AnimationJSParser.AnimateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#main_commands}.
	 * @param ctx the parse tree
	 */
	void enterMain_commands(AnimationJSParser.Main_commandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#main_commands}.
	 * @param ctx the parse tree
	 */
	void exitMain_commands(AnimationJSParser.Main_commandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(AnimationJSParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(AnimationJSParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#m_command}.
	 * @param ctx the parse tree
	 */
	void enterM_command(AnimationJSParser.M_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#m_command}.
	 * @param ctx the parse tree
	 */
	void exitM_command(AnimationJSParser.M_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#setCanvas}.
	 * @param ctx the parse tree
	 */
	void enterSetCanvas(AnimationJSParser.SetCanvasContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#setCanvas}.
	 * @param ctx the parse tree
	 */
	void exitSetCanvas(AnimationJSParser.SetCanvasContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(AnimationJSParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(AnimationJSParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#asignation}.
	 * @param ctx the parse tree
	 */
	void enterAsignation(AnimationJSParser.AsignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#asignation}.
	 * @param ctx the parse tree
	 */
	void exitAsignation(AnimationJSParser.AsignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#console}.
	 * @param ctx the parse tree
	 */
	void enterConsole(AnimationJSParser.ConsoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#console}.
	 * @param ctx the parse tree
	 */
	void exitConsole(AnimationJSParser.ConsoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#setBackground}.
	 * @param ctx the parse tree
	 */
	void enterSetBackground(AnimationJSParser.SetBackgroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#setBackground}.
	 * @param ctx the parse tree
	 */
	void exitSetBackground(AnimationJSParser.SetBackgroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#draw}.
	 * @param ctx the parse tree
	 */
	void enterDraw(AnimationJSParser.DrawContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#draw}.
	 * @param ctx the parse tree
	 */
	void exitDraw(AnimationJSParser.DrawContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#rgb}.
	 * @param ctx the parse tree
	 */
	void enterRgb(AnimationJSParser.RgbContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#rgb}.
	 * @param ctx the parse tree
	 */
	void exitRgb(AnimationJSParser.RgbContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#dt_numeric}.
	 * @param ctx the parse tree
	 */
	void enterDt_numeric(AnimationJSParser.Dt_numericContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#dt_numeric}.
	 * @param ctx the parse tree
	 */
	void exitDt_numeric(AnimationJSParser.Dt_numericContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#num_expr}.
	 * @param ctx the parse tree
	 */
	void enterNum_expr(AnimationJSParser.Num_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#num_expr}.
	 * @param ctx the parse tree
	 */
	void exitNum_expr(AnimationJSParser.Num_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#oper_num}.
	 * @param ctx the parse tree
	 */
	void enterOper_num(AnimationJSParser.Oper_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#oper_num}.
	 * @param ctx the parse tree
	 */
	void exitOper_num(AnimationJSParser.Oper_numContext ctx);
}