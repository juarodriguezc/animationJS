// Generated from C:/Users/juans/Desktop/Lenguajes de programacion/animationJS/grammar\AnimationJS.g4 by ANTLR 4.9.2
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
	 * Enter a parse tree produced by {@link AnimationJSParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(AnimationJSParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(AnimationJSParser.CommandContext ctx);
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
	 * Enter a parse tree produced by {@link AnimationJSParser#declarationG}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationG(AnimationJSParser.DeclarationGContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#declarationG}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationG(AnimationJSParser.DeclarationGContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#declarationL}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationL(AnimationJSParser.DeclarationLContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#declarationL}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationL(AnimationJSParser.DeclarationLContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(AnimationJSParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(AnimationJSParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#assigUsual}.
	 * @param ctx the parse tree
	 */
	void enterAssigUsual(AnimationJSParser.AssigUsualContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#assigUsual}.
	 * @param ctx the parse tree
	 */
	void exitAssigUsual(AnimationJSParser.AssigUsualContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#assigPlPl}.
	 * @param ctx the parse tree
	 */
	void enterAssigPlPl(AnimationJSParser.AssigPlPlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#assigPlPl}.
	 * @param ctx the parse tree
	 */
	void exitAssigPlPl(AnimationJSParser.AssigPlPlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#assigPlEq}.
	 * @param ctx the parse tree
	 */
	void enterAssigPlEq(AnimationJSParser.AssigPlEqContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#assigPlEq}.
	 * @param ctx the parse tree
	 */
	void exitAssigPlEq(AnimationJSParser.AssigPlEqContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#assigMinEq}.
	 * @param ctx the parse tree
	 */
	void enterAssigMinEq(AnimationJSParser.AssigMinEqContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#assigMinEq}.
	 * @param ctx the parse tree
	 */
	void exitAssigMinEq(AnimationJSParser.AssigMinEqContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#assigArr}.
	 * @param ctx the parse tree
	 */
	void enterAssigArr(AnimationJSParser.AssigArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#assigArr}.
	 * @param ctx the parse tree
	 */
	void exitAssigArr(AnimationJSParser.AssigArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#assignationImgArray}.
	 * @param ctx the parse tree
	 */
	void enterAssignationImgArray(AnimationJSParser.AssignationImgArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#assignationImgArray}.
	 * @param ctx the parse tree
	 */
	void exitAssignationImgArray(AnimationJSParser.AssignationImgArrayContext ctx);
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
	 * Enter a parse tree produced by {@link AnimationJSParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(AnimationJSParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(AnimationJSParser.TextContext ctx);
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
	 * Enter a parse tree produced by {@link AnimationJSParser#hideCursor}.
	 * @param ctx the parse tree
	 */
	void enterHideCursor(AnimationJSParser.HideCursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#hideCursor}.
	 * @param ctx the parse tree
	 */
	void exitHideCursor(AnimationJSParser.HideCursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#ifStr}.
	 * @param ctx the parse tree
	 */
	void enterIfStr(AnimationJSParser.IfStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#ifStr}.
	 * @param ctx the parse tree
	 */
	void exitIfStr(AnimationJSParser.IfStrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#ifPart}.
	 * @param ctx the parse tree
	 */
	void enterIfPart(AnimationJSParser.IfPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#ifPart}.
	 * @param ctx the parse tree
	 */
	void exitIfPart(AnimationJSParser.IfPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#elseIfPart}.
	 * @param ctx the parse tree
	 */
	void enterElseIfPart(AnimationJSParser.ElseIfPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#elseIfPart}.
	 * @param ctx the parse tree
	 */
	void exitElseIfPart(AnimationJSParser.ElseIfPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#elsePart}.
	 * @param ctx the parse tree
	 */
	void enterElsePart(AnimationJSParser.ElsePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#elsePart}.
	 * @param ctx the parse tree
	 */
	void exitElsePart(AnimationJSParser.ElsePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#whileStr}.
	 * @param ctx the parse tree
	 */
	void enterWhileStr(AnimationJSParser.WhileStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#whileStr}.
	 * @param ctx the parse tree
	 */
	void exitWhileStr(AnimationJSParser.WhileStrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#breakStr}.
	 * @param ctx the parse tree
	 */
	void enterBreakStr(AnimationJSParser.BreakStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#breakStr}.
	 * @param ctx the parse tree
	 */
	void exitBreakStr(AnimationJSParser.BreakStrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#waitStr}.
	 * @param ctx the parse tree
	 */
	void enterWaitStr(AnimationJSParser.WaitStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#waitStr}.
	 * @param ctx the parse tree
	 */
	void exitWaitStr(AnimationJSParser.WaitStrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#forStr}.
	 * @param ctx the parse tree
	 */
	void enterForStr(AnimationJSParser.ForStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#forStr}.
	 * @param ctx the parse tree
	 */
	void exitForStr(AnimationJSParser.ForStrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#forDecl}.
	 * @param ctx the parse tree
	 */
	void enterForDecl(AnimationJSParser.ForDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#forDecl}.
	 * @param ctx the parse tree
	 */
	void exitForDecl(AnimationJSParser.ForDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#forExpr}.
	 * @param ctx the parse tree
	 */
	void enterForExpr(AnimationJSParser.ForExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#forExpr}.
	 * @param ctx the parse tree
	 */
	void exitForExpr(AnimationJSParser.ForExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#forAssig}.
	 * @param ctx the parse tree
	 */
	void enterForAssig(AnimationJSParser.ForAssigContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#forAssig}.
	 * @param ctx the parse tree
	 */
	void exitForAssig(AnimationJSParser.ForAssigContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#switchStr}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStr(AnimationJSParser.SwitchStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#switchStr}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStr(AnimationJSParser.SwitchStrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(AnimationJSParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(AnimationJSParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#switchDefault}.
	 * @param ctx the parse tree
	 */
	void enterSwitchDefault(AnimationJSParser.SwitchDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#switchDefault}.
	 * @param ctx the parse tree
	 */
	void exitSwitchDefault(AnimationJSParser.SwitchDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#declarationImg}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationImg(AnimationJSParser.DeclarationImgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#declarationImg}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationImg(AnimationJSParser.DeclarationImgContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#declarationImgArray}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationImgArray(AnimationJSParser.DeclarationImgArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#declarationImgArray}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationImgArray(AnimationJSParser.DeclarationImgArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#declarationAnim}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationAnim(AnimationJSParser.DeclarationAnimContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#declarationAnim}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationAnim(AnimationJSParser.DeclarationAnimContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#anim}.
	 * @param ctx the parse tree
	 */
	void enterAnim(AnimationJSParser.AnimContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#anim}.
	 * @param ctx the parse tree
	 */
	void exitAnim(AnimationJSParser.AnimContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(AnimationJSParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(AnimationJSParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#system_vars}.
	 * @param ctx the parse tree
	 */
	void enterSystem_vars(AnimationJSParser.System_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#system_vars}.
	 * @param ctx the parse tree
	 */
	void exitSystem_vars(AnimationJSParser.System_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#key_vars}.
	 * @param ctx the parse tree
	 */
	void enterKey_vars(AnimationJSParser.Key_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#key_vars}.
	 * @param ctx the parse tree
	 */
	void exitKey_vars(AnimationJSParser.Key_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterDtype(AnimationJSParser.DtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitDtype(AnimationJSParser.DtypeContext ctx);
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
	 * Enter a parse tree produced by {@link AnimationJSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AnimationJSParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AnimationJSParser.ExprContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#oper_comp}.
	 * @param ctx the parse tree
	 */
	void enterOper_comp(AnimationJSParser.Oper_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#oper_comp}.
	 * @param ctx the parse tree
	 */
	void exitOper_comp(AnimationJSParser.Oper_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#oper_log}.
	 * @param ctx the parse tree
	 */
	void enterOper_log(AnimationJSParser.Oper_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#oper_log}.
	 * @param ctx the parse tree
	 */
	void exitOper_log(AnimationJSParser.Oper_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link AnimationJSParser#tf_log}.
	 * @param ctx the parse tree
	 */
	void enterTf_log(AnimationJSParser.Tf_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link AnimationJSParser#tf_log}.
	 * @param ctx the parse tree
	 */
	void exitTf_log(AnimationJSParser.Tf_logContext ctx);
}