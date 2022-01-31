// Generated from C:/Users/juans/Desktop/Lenguajes de programacion/animationJS/grammar\AnimationJS.g4 by ANTLR 4.9.2
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
	 * Visit a parse tree produced by {@link AnimationJSParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(AnimationJSParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#setCanvas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCanvas(AnimationJSParser.SetCanvasContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#declarationG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationG(AnimationJSParser.DeclarationGContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#declarationL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationL(AnimationJSParser.DeclarationLContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#assignation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignation(AnimationJSParser.AssignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#assigUsual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigUsual(AnimationJSParser.AssigUsualContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#assigPlPl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigPlPl(AnimationJSParser.AssigPlPlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#assigPlEq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigPlEq(AnimationJSParser.AssigPlEqContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#assigMinEq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigMinEq(AnimationJSParser.AssigMinEqContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#assigArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigArr(AnimationJSParser.AssigArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#assignationImgArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignationImgArray(AnimationJSParser.AssignationImgArrayContext ctx);
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
	 * Visit a parse tree produced by {@link AnimationJSParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(AnimationJSParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#rgb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRgb(AnimationJSParser.RgbContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#hideCursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHideCursor(AnimationJSParser.HideCursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#ifStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStr(AnimationJSParser.IfStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#ifPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfPart(AnimationJSParser.IfPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#elseIfPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfPart(AnimationJSParser.ElseIfPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#elsePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsePart(AnimationJSParser.ElsePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#whileStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStr(AnimationJSParser.WhileStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#breakStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStr(AnimationJSParser.BreakStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#waitStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitStr(AnimationJSParser.WaitStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#forStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStr(AnimationJSParser.ForStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#forDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDecl(AnimationJSParser.ForDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#forExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpr(AnimationJSParser.ForExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#forAssig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForAssig(AnimationJSParser.ForAssigContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#switchStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStr(AnimationJSParser.SwitchStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCase(AnimationJSParser.SwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#switchDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchDefault(AnimationJSParser.SwitchDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#declarationImg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationImg(AnimationJSParser.DeclarationImgContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#declarationImgArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationImgArray(AnimationJSParser.DeclarationImgArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#declarationAnim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationAnim(AnimationJSParser.DeclarationAnimContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#anim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnim(AnimationJSParser.AnimContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(AnimationJSParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#system_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_vars(AnimationJSParser.System_varsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#key_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_vars(AnimationJSParser.Key_varsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(AnimationJSParser.DtypeContext ctx);
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
	 * Visit a parse tree produced by {@link AnimationJSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(AnimationJSParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#oper_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_num(AnimationJSParser.Oper_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#oper_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_comp(AnimationJSParser.Oper_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#oper_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_log(AnimationJSParser.Oper_logContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnimationJSParser#tf_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTf_log(AnimationJSParser.Tf_logContext ctx);
}