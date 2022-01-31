// Generated from C:/Users/juans/Desktop/Lenguajes de programacion/animationJS/grammar\AnimationJS.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AnimationJSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, FUNCTION=14, SETUP=15, ANIMATE=16, 
		SETCANVAS=17, CONSOLE=18, SETBACKGROUND=19, RGB=20, DRAW=21, TEXT=22, 
		HIDECURSOR=23, IF=24, ELSE=25, WHILE=26, BREAK=27, WAIT=28, FOR=29, INT=30, 
		IMG=31, SRC=32, SWITCH=33, CASE=34, DEFAULT=35, ANIMATION=36, NANIMATION=37, 
		ANIM=38, ARRAY=39, LEN=40, CIRCLE=41, FILLCIRCLE=42, RECT=43, FILLRECT=44, 
		TRIANGLE=45, FILLTRIANGLE=46, LINE=47, KEYRELEASED=48, KEYPRESSED=49, 
		MOUSEX=50, MOUSEY=51, CLICK=52, MOUSEPRESSED=53, MOUSEXCLICK=54, MOUSEYCLICK=55, 
		FRAMES=56, LEFT=57, CANVAS_WIDTH=58, CANVAS_HEIGHT=59, DT_INT=60, DT_FLOAT=61, 
		DT_STRING=62, COMMA=63, PYC=64, EQU=65, DOSP=66, SUMA=67, RESTA=68, MULTIPLICACION=69, 
		DIVISION=70, MODULO=71, POTENCIA=72, SIN=73, COS=74, PI=75, RANDOM=76, 
		INTRANDOM=77, IGUALDAD=78, DIFERENTE=79, MAYOR=80, MENOR=81, MAIGUAL=82, 
		MEIGUAL=83, AND=84, OR=85, TRUE=86, FALSE=87, NEGACION=88, PAR_IZQ=89, 
		PAR_DER=90, COR_IZQ=91, COR_DER=92, LLAVE_IZQ=93, LLAVE_DER=94, ID=95, 
		WS=96, LINECOMMENT=97, COMMENT=98;
	public static final int
		RULE_code = 0, RULE_setup = 1, RULE_animate = 2, RULE_main_commands = 3, 
		RULE_commands = 4, RULE_m_command = 5, RULE_command = 6, RULE_setCanvas = 7, 
		RULE_declarationG = 8, RULE_declarationL = 9, RULE_assignation = 10, RULE_assigUsual = 11, 
		RULE_assigPlPl = 12, RULE_assigPlEq = 13, RULE_assigMinEq = 14, RULE_assigArr = 15, 
		RULE_assignationImgArray = 16, RULE_console = 17, RULE_setBackground = 18, 
		RULE_draw = 19, RULE_text = 20, RULE_rgb = 21, RULE_hideCursor = 22, RULE_ifStr = 23, 
		RULE_ifPart = 24, RULE_elseIfPart = 25, RULE_elsePart = 26, RULE_whileStr = 27, 
		RULE_breakStr = 28, RULE_waitStr = 29, RULE_forStr = 30, RULE_forDecl = 31, 
		RULE_forExpr = 32, RULE_forAssig = 33, RULE_switchStr = 34, RULE_switchCase = 35, 
		RULE_switchDefault = 36, RULE_declarationImg = 37, RULE_declarationImgArray = 38, 
		RULE_declarationAnim = 39, RULE_anim = 40, RULE_length = 41, RULE_system_vars = 42, 
		RULE_key_vars = 43, RULE_dtype = 44, RULE_dt_numeric = 45, RULE_num_expr = 46, 
		RULE_expr = 47, RULE_oper_num = 48, RULE_oper_comp = 49, RULE_oper_log = 50, 
		RULE_tf_log = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "setup", "animate", "main_commands", "commands", "m_command", 
			"command", "setCanvas", "declarationG", "declarationL", "assignation", 
			"assigUsual", "assigPlPl", "assigPlEq", "assigMinEq", "assigArr", "assignationImgArray", 
			"console", "setBackground", "draw", "text", "rgb", "hideCursor", "ifStr", 
			"ifPart", "elseIfPart", "elsePart", "whileStr", "breakStr", "waitStr", 
			"forStr", "forDecl", "forExpr", "forAssig", "switchStr", "switchCase", 
			"switchDefault", "declarationImg", "declarationImgArray", "declarationAnim", 
			"anim", "length", "system_vars", "key_vars", "dtype", "dt_numeric", "num_expr", 
			"expr", "oper_num", "oper_comp", "oper_log", "tf_log"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'A'", "'S'", "'D'", "'W'", "'ENTER'", "'SPACE'", "'BACKSPACE'", 
			"'UP'", "'DOWN'", "'RIGHT'", "'float'", "'string'", "'bool'", "'function'", 
			"'setup'", "'animate'", "'SetCanvas'", "'Console'", "'SetBackground'", 
			"'RGB'", "'Draw'", "'Text'", "'HideCursor'", "'if'", "'else'", "'while'", 
			"'break'", "'Wait'", "'for'", "'int'", "'img'", "'Src'", "'switch'", 
			"'case'", "'default'", "'animation'", "'Nanimation'", "'Anim'", "'Array'", 
			"'Len'", "'Circle'", "'FillCircle'", "'Rect'", "'FillRect'", "'Triangle'", 
			"'FillTriangle'", "'Line'", "'KEYRELEASED'", "'KEYPRESSED'", "'MOUSEX'", 
			"'MOUSEY'", "'CLICK'", "'MOUSEPRESSED'", "'MOUSEXCLICK'", "'MOUSEYCLICK'", 
			"'FRAMES'", "'LEFT'", "'CANVAS_WIDTH'", "'CANVAS_HEIGHT'", null, null, 
			null, "','", "';'", "'='", "':'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'^'", "'Sin'", "'Cos'", "'PI'", "'Random'", "'IntRandom'", "'=='", "'!='", 
			"'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'true'", "'false'", "'!'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "FUNCTION", "SETUP", "ANIMATE", "SETCANVAS", "CONSOLE", "SETBACKGROUND", 
			"RGB", "DRAW", "TEXT", "HIDECURSOR", "IF", "ELSE", "WHILE", "BREAK", 
			"WAIT", "FOR", "INT", "IMG", "SRC", "SWITCH", "CASE", "DEFAULT", "ANIMATION", 
			"NANIMATION", "ANIM", "ARRAY", "LEN", "CIRCLE", "FILLCIRCLE", "RECT", 
			"FILLRECT", "TRIANGLE", "FILLTRIANGLE", "LINE", "KEYRELEASED", "KEYPRESSED", 
			"MOUSEX", "MOUSEY", "CLICK", "MOUSEPRESSED", "MOUSEXCLICK", "MOUSEYCLICK", 
			"FRAMES", "LEFT", "CANVAS_WIDTH", "CANVAS_HEIGHT", "DT_INT", "DT_FLOAT", 
			"DT_STRING", "COMMA", "PYC", "EQU", "DOSP", "SUMA", "RESTA", "MULTIPLICACION", 
			"DIVISION", "MODULO", "POTENCIA", "SIN", "COS", "PI", "RANDOM", "INTRANDOM", 
			"IGUALDAD", "DIFERENTE", "MAYOR", "MENOR", "MAIGUAL", "MEIGUAL", "AND", 
			"OR", "TRUE", "FALSE", "NEGACION", "PAR_IZQ", "PAR_DER", "COR_IZQ", "COR_DER", 
			"LLAVE_IZQ", "LLAVE_DER", "ID", "WS", "LINECOMMENT", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AnimationJS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AnimationJSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CodeContext extends ParserRuleContext {
		public SetupContext setup() {
			return getRuleContext(SetupContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AnimationJSParser.EOF, 0); }
		public AnimateContext animate() {
			return getRuleContext(AnimateContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			setup();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(105);
				animate();
				}
			}

			setState(108);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetupContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(AnimationJSParser.FUNCTION, 0); }
		public TerminalNode SETUP() { return getToken(AnimationJSParser.SETUP, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(AnimationJSParser.LLAVE_IZQ, 0); }
		public Main_commandsContext main_commands() {
			return getRuleContext(Main_commandsContext.class,0);
		}
		public TerminalNode LLAVE_DER() { return getToken(AnimationJSParser.LLAVE_DER, 0); }
		public SetupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterSetup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitSetup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitSetup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetupContext setup() throws RecognitionException {
		SetupContext _localctx = new SetupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(FUNCTION);
			setState(111);
			match(SETUP);
			setState(112);
			match(PAR_IZQ);
			setState(113);
			match(PAR_DER);
			setState(114);
			match(LLAVE_IZQ);
			setState(115);
			main_commands();
			setState(116);
			match(LLAVE_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnimateContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(AnimationJSParser.FUNCTION, 0); }
		public TerminalNode ANIMATE() { return getToken(AnimationJSParser.ANIMATE, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(AnimationJSParser.LLAVE_IZQ, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode LLAVE_DER() { return getToken(AnimationJSParser.LLAVE_DER, 0); }
		public AnimateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterAnimate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitAnimate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitAnimate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimateContext animate() throws RecognitionException {
		AnimateContext _localctx = new AnimateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_animate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(FUNCTION);
			setState(119);
			match(ANIMATE);
			setState(120);
			match(PAR_IZQ);
			setState(121);
			match(PAR_DER);
			setState(122);
			match(LLAVE_IZQ);
			setState(123);
			commands();
			setState(124);
			match(LLAVE_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_commandsContext extends ParserRuleContext {
		public List<M_commandContext> m_command() {
			return getRuleContexts(M_commandContext.class);
		}
		public M_commandContext m_command(int i) {
			return getRuleContext(M_commandContext.class,i);
		}
		public Main_commandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterMain_commands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitMain_commands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitMain_commands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_commandsContext main_commands() throws RecognitionException {
		Main_commandsContext _localctx = new Main_commandsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_main_commands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << SETCANVAS) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << HIDECURSOR) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << IMG) | (1L << SWITCH) | (1L << ANIMATION))) != 0) || _la==ID) {
				{
				{
				setState(126);
				m_command();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandsContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_commands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << SWITCH) | (1L << ANIM))) != 0) || _la==ID) {
				{
				{
				setState(132);
				command();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class M_commandContext extends ParserRuleContext {
		public SetCanvasContext setCanvas() {
			return getRuleContext(SetCanvasContext.class,0);
		}
		public DeclarationGContext declarationG() {
			return getRuleContext(DeclarationGContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public ConsoleContext console() {
			return getRuleContext(ConsoleContext.class,0);
		}
		public SetBackgroundContext setBackground() {
			return getRuleContext(SetBackgroundContext.class,0);
		}
		public DrawContext draw() {
			return getRuleContext(DrawContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public HideCursorContext hideCursor() {
			return getRuleContext(HideCursorContext.class,0);
		}
		public IfStrContext ifStr() {
			return getRuleContext(IfStrContext.class,0);
		}
		public WhileStrContext whileStr() {
			return getRuleContext(WhileStrContext.class,0);
		}
		public BreakStrContext breakStr() {
			return getRuleContext(BreakStrContext.class,0);
		}
		public WaitStrContext waitStr() {
			return getRuleContext(WaitStrContext.class,0);
		}
		public ForStrContext forStr() {
			return getRuleContext(ForStrContext.class,0);
		}
		public SwitchStrContext switchStr() {
			return getRuleContext(SwitchStrContext.class,0);
		}
		public DeclarationImgContext declarationImg() {
			return getRuleContext(DeclarationImgContext.class,0);
		}
		public DeclarationAnimContext declarationAnim() {
			return getRuleContext(DeclarationAnimContext.class,0);
		}
		public DeclarationImgArrayContext declarationImgArray() {
			return getRuleContext(DeclarationImgArrayContext.class,0);
		}
		public AssignationImgArrayContext assignationImgArray() {
			return getRuleContext(AssignationImgArrayContext.class,0);
		}
		public M_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterM_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitM_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitM_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final M_commandContext m_command() throws RecognitionException {
		M_commandContext _localctx = new M_commandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_m_command);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				setCanvas();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				declarationG();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				assignation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				console();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				setBackground();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				draw();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(144);
				text();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(145);
				hideCursor();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(146);
				ifStr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(147);
				whileStr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(148);
				breakStr();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(149);
				waitStr();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(150);
				forStr();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(151);
				switchStr();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(152);
				declarationImg();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(153);
				declarationAnim();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(154);
				declarationImgArray();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(155);
				assignationImgArray();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public DeclarationLContext declarationL() {
			return getRuleContext(DeclarationLContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public ConsoleContext console() {
			return getRuleContext(ConsoleContext.class,0);
		}
		public SetBackgroundContext setBackground() {
			return getRuleContext(SetBackgroundContext.class,0);
		}
		public DrawContext draw() {
			return getRuleContext(DrawContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public IfStrContext ifStr() {
			return getRuleContext(IfStrContext.class,0);
		}
		public WhileStrContext whileStr() {
			return getRuleContext(WhileStrContext.class,0);
		}
		public BreakStrContext breakStr() {
			return getRuleContext(BreakStrContext.class,0);
		}
		public WaitStrContext waitStr() {
			return getRuleContext(WaitStrContext.class,0);
		}
		public ForStrContext forStr() {
			return getRuleContext(ForStrContext.class,0);
		}
		public SwitchStrContext switchStr() {
			return getRuleContext(SwitchStrContext.class,0);
		}
		public AnimContext anim() {
			return getRuleContext(AnimContext.class,0);
		}
		public AssignationImgArrayContext assignationImgArray() {
			return getRuleContext(AssignationImgArrayContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_command);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				declarationL();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				assignation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				console();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				setBackground();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				draw();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				text();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(164);
				ifStr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(165);
				whileStr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(166);
				breakStr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(167);
				waitStr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(168);
				forStr();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(169);
				switchStr();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(170);
				anim();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(171);
				assignationImgArray();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetCanvasContext extends ParserRuleContext {
		public TerminalNode SETCANVAS() { return getToken(AnimationJSParser.SETCANVAS, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public List<TerminalNode> DT_INT() { return getTokens(AnimationJSParser.DT_INT); }
		public TerminalNode DT_INT(int i) {
			return getToken(AnimationJSParser.DT_INT, i);
		}
		public TerminalNode COMMA() { return getToken(AnimationJSParser.COMMA, 0); }
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode PYC() { return getToken(AnimationJSParser.PYC, 0); }
		public SetCanvasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setCanvas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterSetCanvas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitSetCanvas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitSetCanvas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetCanvasContext setCanvas() throws RecognitionException {
		SetCanvasContext _localctx = new SetCanvasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setCanvas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(SETCANVAS);
			setState(175);
			match(PAR_IZQ);
			setState(176);
			match(DT_INT);
			setState(177);
			match(COMMA);
			setState(178);
			match(DT_INT);
			setState(179);
			match(PAR_DER);
			setState(180);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationGContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
		public TerminalNode PYC() { return getToken(AnimationJSParser.PYC, 0); }
		public TerminalNode EQU() { return getToken(AnimationJSParser.EQU, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COR_IZQ() { return getToken(AnimationJSParser.COR_IZQ, 0); }
		public TerminalNode COR_DER() { return getToken(AnimationJSParser.COR_DER, 0); }
		public TerminalNode ARRAY() { return getToken(AnimationJSParser.ARRAY, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public DeclarationGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationG; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterDeclarationG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitDeclarationG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitDeclarationG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationGContext declarationG() throws RecognitionException {
		DeclarationGContext _localctx = new DeclarationGContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declarationG);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				dtype();
				setState(183);
				match(ID);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQU) {
					{
					setState(184);
					match(EQU);
					setState(185);
					expr(0);
					}
				}

				setState(188);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				dtype();
				setState(191);
				match(COR_IZQ);
				setState(192);
				match(COR_DER);
				setState(193);
				match(ID);
				setState(194);
				match(EQU);
				setState(195);
				match(ARRAY);
				setState(196);
				match(PAR_IZQ);
				setState(197);
				num_expr(0);
				setState(198);
				match(PAR_DER);
				setState(199);
				match(PYC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationLContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
		public TerminalNode PYC() { return getToken(AnimationJSParser.PYC, 0); }
		public TerminalNode EQU() { return getToken(AnimationJSParser.EQU, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COR_IZQ() { return getToken(AnimationJSParser.COR_IZQ, 0); }
		public TerminalNode COR_DER() { return getToken(AnimationJSParser.COR_DER, 0); }
		public TerminalNode ARRAY() { return getToken(AnimationJSParser.ARRAY, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public DeclarationLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterDeclarationL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitDeclarationL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitDeclarationL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationLContext declarationL() throws RecognitionException {
		DeclarationLContext _localctx = new DeclarationLContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declarationL);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				dtype();
				setState(204);
				match(ID);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQU) {
					{
					setState(205);
					match(EQU);
					setState(206);
					expr(0);
					}
				}

				setState(209);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				dtype();
				setState(212);
				match(COR_IZQ);
				setState(213);
				match(COR_DER);
				setState(214);
				match(ID);
				setState(215);
				match(EQU);
				setState(216);
				match(ARRAY);
				setState(217);
				match(PAR_IZQ);
				setState(218);
				num_expr(0);
				setState(219);
				match(PAR_DER);
				setState(220);
				match(PYC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignationContext extends ParserRuleContext {
		public AssigUsualContext assigUsual() {
			return getRuleContext(AssigUsualContext.class,0);
		}
		public TerminalNode PYC() { return getToken(AnimationJSParser.PYC, 0); }
		public AssigPlPlContext assigPlPl() {
			return getRuleContext(AssigPlPlContext.class,0);
		}
		public AssigPlEqContext assigPlEq() {
			return getRuleContext(AssigPlEqContext.class,0);
		}
		public AssigMinEqContext assigMinEq() {
			return getRuleContext(AssigMinEqContext.class,0);
		}
		public AssigArrContext assigArr() {
			return getRuleContext(AssigArrContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitAssignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitAssignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignation);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				assigUsual();
				setState(225);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				assigPlPl();
				setState(228);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				assigPlEq();
				setState(231);
				match(PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				assigMinEq();
				setState(234);
				match(PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				assigArr();
				setState(237);
				match(PYC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssigUsualContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
		public TerminalNode EQU() { return getToken(AnimationJSParser.EQU, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssigUsualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigUsual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterAssigUsual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitAssigUsual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitAssigUsual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigUsualContext assigUsual() throws RecognitionException {
		AssigUsualContext _localctx = new AssigUsualContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assigUsual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(ID);
			setState(242);
			match(EQU);
			setState(243);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssigPlPlContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
		public List<TerminalNode> SUMA() { return getTokens(AnimationJSParser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(AnimationJSParser.SUMA, i);
		}
		public AssigPlPlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigPlPl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterAssigPlPl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitAssigPlPl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitAssigPlPl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigPlPlContext assigPlPl() throws RecognitionException {
		AssigPlPlContext _localctx = new AssigPlPlContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assigPlPl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ID);
			setState(246);
			match(SUMA);
			setState(247);
			match(SUMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssigPlEqContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
		public TerminalNode SUMA() { return getToken(AnimationJSParser.SUMA, 0); }
		public TerminalNode EQU() { return getToken(AnimationJSParser.EQU, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public AssigPlEqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigPlEq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterAssigPlEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitAssigPlEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitAssigPlEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigPlEqContext assigPlEq() throws RecognitionException {
		AssigPlEqContext _localctx = new AssigPlEqContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assigPlEq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ID);
			setState(250);
			match(SUMA);
			setState(251);
			match(EQU);
			setState(252);
			num_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssigMinEqContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
		public TerminalNode RESTA() { return getToken(AnimationJSParser.RESTA, 0); }
		public TerminalNode EQU() { return getToken(AnimationJSParser.EQU, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public AssigMinEqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigMinEq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterAssigMinEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitAssigMinEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitAssigMinEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigMinEqContext assigMinEq() throws RecognitionException {
		AssigMinEqContext _localctx = new AssigMinEqContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assigMinEq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(ID);
			setState(255);
			match(RESTA);
			setState(256);
			match(EQU);
			setState(257);
			num_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssigArrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
		public TerminalNode COR_IZQ() { return getToken(AnimationJSParser.COR_IZQ, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public TerminalNode COR_DER() { return getToken(AnimationJSParser.COR_DER, 0); }
		public TerminalNode EQU() { return getToken(AnimationJSParser.EQU, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssigArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterAssigArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitAssigArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitAssigArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigArrContext assigArr() throws RecognitionException {
		AssigArrContext _localctx = new AssigArrContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assigArr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ID);
			setState(260);
			match(COR_IZQ);
			setState(261);
			num_expr(0);
			setState(262);
			match(COR_DER);
			setState(263);
			match(EQU);
			setState(264);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignationImgArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
		public TerminalNode COR_IZQ() { return getToken(AnimationJSParser.COR_IZQ, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public TerminalNode COR_DER() { return getToken(AnimationJSParser.COR_DER, 0); }
		public TerminalNode EQU() { return getToken(AnimationJSParser.EQU, 0); }
		public TerminalNode SRC() { return getToken(AnimationJSParser.SRC, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode PYC() { return getToken(AnimationJSParser.PYC, 0); }
		public AssignationImgArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignationImgArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterAssignationImgArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitAssignationImgArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitAssignationImgArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignationImgArrayContext assignationImgArray() throws RecognitionException {
		AssignationImgArrayContext _localctx = new AssignationImgArrayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignationImgArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(ID);
			setState(267);
			match(COR_IZQ);
			setState(268);
			num_expr(0);
			setState(269);
			match(COR_DER);
			setState(270);
			match(EQU);
			setState(271);
			match(SRC);
			setState(272);
			match(PAR_IZQ);
			setState(273);
			expr(0);
			setState(274);
			match(PAR_DER);
			setState(275);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsoleContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(AnimationJSParser.CONSOLE, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode PYC() { return getToken(AnimationJSParser.PYC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AnimationJSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AnimationJSParser.COMMA, i);
		}
		public ConsoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_console; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterConsole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitConsole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitConsole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsoleContext console() throws RecognitionException {
		ConsoleContext _localctx = new ConsoleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_console);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(CONSOLE);
			setState(278);
			match(PAR_IZQ);
			setState(279);
			expr(0);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(280);
				match(COMMA);
				setState(281);
				expr(0);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			match(PAR_DER);
			setState(288);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetBackgroundContext extends ParserRuleContext {
		public TerminalNode SETBACKGROUND() { return getToken(AnimationJSParser.SETBACKGROUND, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public RgbContext rgb() {
			return getRuleContext(RgbContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode PYC() { return getToken(AnimationJSParser.PYC, 0); }
		public SetBackgroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setBackground; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterSetBackground(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitSetBackground(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitSetBackground(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetBackgroundContext setBackground() throws RecognitionException {
		SetBackgroundContext _localctx = new SetBackgroundContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_setBackground);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(SETBACKGROUND);
			setState(291);
			match(PAR_IZQ);
			setState(292);
			rgb();
			setState(293);
			match(PAR_DER);
			setState(294);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DrawContext extends ParserRuleContext {
		public TerminalNode DRAW() { return getToken(AnimationJSParser.DRAW, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public TerminalNode CIRCLE() { return getToken(AnimationJSParser.CIRCLE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AnimationJSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AnimationJSParser.COMMA, i);
		}
		public List<Num_exprContext> num_expr() {
			return getRuleContexts(Num_exprContext.class);
		}
		public Num_exprContext num_expr(int i) {
			return getRuleContext(Num_exprContext.class,i);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode PYC() { return getToken(AnimationJSParser.PYC, 0); }
		public RgbContext rgb() {
			return getRuleContext(RgbContext.class,0);
		}
		public TerminalNode FILLCIRCLE() { return getToken(AnimationJSParser.FILLCIRCLE, 0); }
		public TerminalNode RECT() { return getToken(AnimationJSParser.RECT, 0); }
		public TerminalNode FILLRECT() { return getToken(AnimationJSParser.FILLRECT, 0); }
		public TerminalNode TRIANGLE() { return getToken(AnimationJSParser.TRIANGLE, 0); }
		public TerminalNode FILLTRIANGLE() { return getToken(AnimationJSParser.FILLTRIANGLE, 0); }
		public TerminalNode LINE() { return getToken(AnimationJSParser.LINE, 0); }
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
		public TerminalNode COR_IZQ() { return getToken(AnimationJSParser.COR_IZQ, 0); }
		public TerminalNode COR_DER() { return getToken(AnimationJSParser.COR_DER, 0); }
		public DrawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterDraw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitDraw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitDraw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawContext draw() throws RecognitionException {
		DrawContext _localctx = new DrawContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_draw);
		int _la;
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(DRAW);
				setState(297);
				match(PAR_IZQ);
				setState(298);
				match(CIRCLE);
				setState(299);
				match(COMMA);
				setState(300);
				num_expr(0);
				setState(301);
				match(COMMA);
				setState(302);
				num_expr(0);
				setState(303);
				match(COMMA);
				setState(304);
				num_expr(0);
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(305);
					match(COMMA);
					setState(306);
					num_expr(0);
					}
					break;
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(309);
					match(COMMA);
					setState(310);
					rgb();
					}
				}

				setState(313);
				match(PAR_DER);
				setState(314);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(DRAW);
				setState(317);
				match(PAR_IZQ);
				setState(318);
				match(FILLCIRCLE);
				setState(319);
				match(COMMA);
				setState(320);
				num_expr(0);
				setState(321);
				match(COMMA);
				setState(322);
				num_expr(0);
				setState(323);
				match(COMMA);
				setState(324);
				num_expr(0);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(325);
					match(COMMA);
					setState(326);
					rgb();
					}
				}

				setState(329);
				match(PAR_DER);
				setState(330);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				match(DRAW);
				setState(333);
				match(PAR_IZQ);
				setState(334);
				match(RECT);
				setState(335);
				match(COMMA);
				setState(336);
				num_expr(0);
				setState(337);
				match(COMMA);
				setState(338);
				num_expr(0);
				setState(339);
				match(COMMA);
				setState(340);
				num_expr(0);
				setState(341);
				match(COMMA);
				setState(342);
				num_expr(0);
				setState(345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(343);
					match(COMMA);
					setState(344);
					num_expr(0);
					}
					break;
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(347);
					match(COMMA);
					setState(348);
					rgb();
					}
				}

				setState(351);
				match(PAR_DER);
				setState(352);
				match(PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				match(DRAW);
				setState(355);
				match(PAR_IZQ);
				setState(356);
				match(FILLRECT);
				setState(357);
				match(COMMA);
				setState(358);
				num_expr(0);
				setState(359);
				match(COMMA);
				setState(360);
				num_expr(0);
				setState(361);
				match(COMMA);
				setState(362);
				num_expr(0);
				setState(363);
				match(COMMA);
				setState(364);
				num_expr(0);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(365);
					match(COMMA);
					setState(366);
					rgb();
					}
				}

				setState(369);
				match(PAR_DER);
				setState(370);
				match(PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(372);
				match(DRAW);
				setState(373);
				match(PAR_IZQ);
				setState(374);
				match(TRIANGLE);
				setState(375);
				match(COMMA);
				setState(376);
				num_expr(0);
				setState(377);
				match(COMMA);
				setState(378);
				num_expr(0);
				setState(379);
				match(COMMA);
				setState(380);
				num_expr(0);
				setState(381);
				match(COMMA);
				setState(382);
				num_expr(0);
				setState(383);
				match(COMMA);
				setState(384);
				num_expr(0);
				setState(385);
				match(COMMA);
				setState(386);
				num_expr(0);
				setState(389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(387);
					match(COMMA);
					setState(388);
					num_expr(0);
					}
					break;
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(391);
					match(COMMA);
					setState(392);
					rgb();
					}
				}

				setState(395);
				match(PAR_DER);
				setState(396);
				match(PYC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(398);
				match(DRAW);
				setState(399);
				match(PAR_IZQ);
				setState(400);
				match(FILLTRIANGLE);
				setState(401);
				match(COMMA);
				setState(402);
				num_expr(0);
				setState(403);
				match(COMMA);
				setState(404);
				num_expr(0);
				setState(405);
				match(COMMA);
				setState(406);
				num_expr(0);
				setState(407);
				match(COMMA);
				setState(408);
				num_expr(0);
				setState(409);
				match(COMMA);
				setState(410);
				num_expr(0);
				setState(411);
				match(COMMA);
				setState(412);
				num_expr(0);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(413);
					match(COMMA);
					setState(414);
					rgb();
					}
				}

				setState(417);
				match(PAR_DER);
				setState(418);
				match(PYC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(420);
				match(DRAW);
				setState(421);
				match(PAR_IZQ);
				setState(422);
				match(LINE);
				setState(423);
				match(COMMA);
				setState(424);
				num_expr(0);
				setState(425);
				match(COMMA);
				setState(426);
				num_expr(0);
				setState(427);
				match(COMMA);
				setState(428);
				num_expr(0);
				setState(429);
				match(COMMA);
				setState(430);
				num_expr(0);
				setState(433);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(431);
					match(COMMA);
					setState(432);
					num_expr(0);
					}
					break;
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(435);
					match(COMMA);
					setState(436);
					rgb();
					}
				}

				setState(439);
				match(PAR_DER);
				setState(440);
				match(PYC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(442);
				match(DRAW);
				setState(443);
				match(PAR_IZQ);
				setState(444);
				match(ID);
				setState(445);
				match(COMMA);
				setState(446);
				num_expr(0);
				setState(447);
				match(COMMA);
				setState(448);
				num_expr(0);
				setState(449);
				match(COMMA);
				setState(450);
				num_expr(0);
				setState(451);
				match(COMMA);
				setState(452);
				num_expr(0);
				setState(453);
				match(PAR_DER);
				setState(454);
				match(PYC);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(456);
				match(DRAW);
				setState(457);
				match(PAR_IZQ);
				setState(458);
				match(ID);
				setState(459);
				match(COR_IZQ);
				setState(460);
				num_expr(0);
				setState(461);
				match(COR_DER);
				setState(462);
				match(COMMA);
				setState(463);
				num_expr(0);
				setState(464);
				match(COMMA);
				setState(465);
				num_expr(0);
				setState(466);
				match(COMMA);
				setState(467);
				num_expr(0);
				setState(468);
				match(COMMA);
				setState(469);
				num_expr(0);
				setState(470);
				match(PAR_DER);
				setState(471);
				match(PYC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(AnimationJSParser.TEXT, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AnimationJSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AnimationJSParser.COMMA, i);
		}
		public List<Num_exprContext> num_expr() {
			return getRuleContexts(Num_exprContext.class);
		}
		public Num_exprContext num_expr(int i) {
			return getRuleContext(Num_exprContext.class,i);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode PYC() { return getToken(AnimationJSParser.PYC, 0); }
		public RgbContext rgb() {
			return getRuleContext(RgbContext.class,0);
		}
		public TerminalNode DT_STRING() { return getToken(AnimationJSParser.DT_STRING, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(TEXT);
			setState(476);
			match(PAR_IZQ);
			setState(477);
			expr(0);
			setState(478);
			match(COMMA);
			setState(479);
			num_expr(0);
			setState(480);
			match(COMMA);
			setState(481);
			num_expr(0);
			setState(482);
			match(COMMA);
			setState(483);
			num_expr(0);
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(484);
				match(COMMA);
				setState(485);
				num_expr(0);
				}
				break;
			}
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(488);
				match(COMMA);
				setState(489);
				rgb();
				}
				break;
			}
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(492);
				match(COMMA);
				setState(493);
				match(DT_STRING);
				}
			}

			setState(496);
			match(PAR_DER);
			setState(497);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RgbContext extends ParserRuleContext {
		public TerminalNode RGB() { return getToken(AnimationJSParser.RGB, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public List<Num_exprContext> num_expr() {
			return getRuleContexts(Num_exprContext.class);
		}
		public Num_exprContext num_expr(int i) {
			return getRuleContext(Num_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AnimationJSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AnimationJSParser.COMMA, i);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public RgbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterRgb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitRgb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitRgb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RgbContext rgb() throws RecognitionException {
		RgbContext _localctx = new RgbContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rgb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(RGB);
			setState(500);
			match(PAR_IZQ);
			setState(501);
			num_expr(0);
			setState(502);
			match(COMMA);
			setState(503);
			num_expr(0);
			setState(504);
			match(COMMA);
			setState(505);
			num_expr(0);
			setState(506);
			match(PAR_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HideCursorContext extends ParserRuleContext {
		public TerminalNode HIDECURSOR() { return getToken(AnimationJSParser.HIDECURSOR, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode PYC() { return getToken(AnimationJSParser.PYC, 0); }
		public HideCursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hideCursor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterHideCursor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitHideCursor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitHideCursor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HideCursorContext hideCursor() throws RecognitionException {
		HideCursorContext _localctx = new HideCursorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_hideCursor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(HIDECURSOR);
			setState(509);
			match(PAR_IZQ);
			setState(510);
			match(PAR_DER);
			setState(511);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStrContext extends ParserRuleContext {
		public IfPartContext ifPart() {
			return getRuleContext(IfPartContext.class,0);
		}
		public List<ElseIfPartContext> elseIfPart() {
			return getRuleContexts(ElseIfPartContext.class);
		}
		public ElseIfPartContext elseIfPart(int i) {
			return getRuleContext(ElseIfPartContext.class,i);
		}
		public ElsePartContext elsePart() {
			return getRuleContext(ElsePartContext.class,0);
		}
		public IfStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterIfStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitIfStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitIfStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStrContext ifStr() throws RecognitionException {
		IfStrContext _localctx = new IfStrContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			ifPart();
			setState(517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(514);
					elseIfPart();
					}
					} 
				}
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(520);
				elsePart();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfPartContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AnimationJSParser.IF, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(AnimationJSParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(AnimationJSParser.LLAVE_DER, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public IfPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterIfPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitIfPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitIfPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfPartContext ifPart() throws RecognitionException {
		IfPartContext _localctx = new IfPartContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(IF);
			setState(524);
			match(PAR_IZQ);
			setState(525);
			expr(0);
			setState(526);
			match(PAR_DER);
			setState(527);
			match(LLAVE_IZQ);
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << SWITCH) | (1L << ANIM))) != 0) || _la==ID) {
				{
				{
				setState(528);
				command();
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(534);
			match(LLAVE_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfPartContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(AnimationJSParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(AnimationJSParser.IF, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(AnimationJSParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(AnimationJSParser.LLAVE_DER, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ElseIfPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterElseIfPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitElseIfPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitElseIfPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfPartContext elseIfPart() throws RecognitionException {
		ElseIfPartContext _localctx = new ElseIfPartContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elseIfPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(ELSE);
			setState(537);
			match(IF);
			setState(538);
			match(PAR_IZQ);
			setState(539);
			expr(0);
			setState(540);
			match(PAR_DER);
			setState(541);
			match(LLAVE_IZQ);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << SWITCH) | (1L << ANIM))) != 0) || _la==ID) {
				{
				{
				setState(542);
				command();
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(548);
			match(LLAVE_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsePartContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(AnimationJSParser.ELSE, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(AnimationJSParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(AnimationJSParser.LLAVE_DER, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ElsePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterElsePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitElsePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitElsePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsePartContext elsePart() throws RecognitionException {
		ElsePartContext _localctx = new ElsePartContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_elsePart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(ELSE);
			setState(551);
			match(LLAVE_IZQ);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << SWITCH) | (1L << ANIM))) != 0) || _la==ID) {
				{
				{
				setState(552);
				command();
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(558);
			match(LLAVE_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStrContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AnimationJSParser.WHILE, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(AnimationJSParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(AnimationJSParser.LLAVE_DER, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public WhileStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterWhileStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitWhileStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitWhileStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStrContext whileStr() throws RecognitionException {
		WhileStrContext _localctx = new WhileStrContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_whileStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(WHILE);
			setState(561);
			match(PAR_IZQ);
			setState(562);
			expr(0);
			setState(563);
			match(PAR_DER);
			setState(564);
			match(LLAVE_IZQ);
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << SWITCH) | (1L << ANIM))) != 0) || _la==ID) {
				{
				{
				setState(565);
				command();
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(571);
			match(LLAVE_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStrContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(AnimationJSParser.BREAK, 0); }
		public TerminalNode PYC() { return getToken(AnimationJSParser.PYC, 0); }
		public BreakStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterBreakStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitBreakStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitBreakStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStrContext breakStr() throws RecognitionException {
		BreakStrContext _localctx = new BreakStrContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_breakStr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(BREAK);
			setState(574);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WaitStrContext extends ParserRuleContext {
		public TerminalNode WAIT() { return getToken(AnimationJSParser.WAIT, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode PYC() { return getToken(AnimationJSParser.PYC, 0); }
		public WaitStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waitStr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterWaitStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitWaitStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitWaitStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaitStrContext waitStr() throws RecognitionException {
		WaitStrContext _localctx = new WaitStrContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_waitStr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(WAIT);
			setState(577);
			match(PAR_IZQ);
			setState(578);
			num_expr(0);
			setState(579);
			match(PAR_DER);
			setState(580);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStrContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AnimationJSParser.FOR, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public ForDeclContext forDecl() {
			return getRuleContext(ForDeclContext.class,0);
		}
		public List<TerminalNode> PYC() { return getTokens(AnimationJSParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(AnimationJSParser.PYC, i);
		}
		public ForExprContext forExpr() {
			return getRuleContext(ForExprContext.class,0);
		}
		public ForAssigContext forAssig() {
			return getRuleContext(ForAssigContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(AnimationJSParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(AnimationJSParser.LLAVE_DER, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ForStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterForStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitForStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitForStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStrContext forStr() throws RecognitionException {
		ForStrContext _localctx = new ForStrContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(FOR);
			setState(583);
			match(PAR_IZQ);
			setState(584);
			forDecl();
			setState(585);
			match(PYC);
			setState(586);
			forExpr();
			setState(587);
			match(PYC);
			setState(588);
			forAssig();
			setState(589);
			match(PAR_DER);
			setState(590);
			match(LLAVE_IZQ);
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << SWITCH) | (1L << ANIM))) != 0) || _la==ID) {
				{
				{
				setState(591);
				command();
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(597);
			match(LLAVE_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
		public TerminalNode EQU() { return getToken(AnimationJSParser.EQU, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public ForDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterForDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitForDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitForDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclContext forDecl() throws RecognitionException {
		ForDeclContext _localctx = new ForDeclContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_forDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(ID);
			setState(600);
			match(EQU);
			setState(601);
			num_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterForExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitForExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitForExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExprContext forExpr() throws RecognitionException {
		ForExprContext _localctx = new ForExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForAssigContext extends ParserRuleContext {
		public AssigUsualContext assigUsual() {
			return getRuleContext(AssigUsualContext.class,0);
		}
		public AssigPlPlContext assigPlPl() {
			return getRuleContext(AssigPlPlContext.class,0);
		}
		public AssigPlEqContext assigPlEq() {
			return getRuleContext(AssigPlEqContext.class,0);
		}
		public AssigMinEqContext assigMinEq() {
			return getRuleContext(AssigMinEqContext.class,0);
		}
		public ForAssigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forAssig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterForAssig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitForAssig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitForAssig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForAssigContext forAssig() throws RecognitionException {
		ForAssigContext _localctx = new ForAssigContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forAssig);
		try {
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				assigUsual();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				assigPlPl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(607);
				assigPlEq();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(608);
				assigMinEq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStrContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(AnimationJSParser.SWITCH, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(AnimationJSParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(AnimationJSParser.LLAVE_DER, 0); }
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
		}
		public SwitchDefaultContext switchDefault() {
			return getRuleContext(SwitchDefaultContext.class,0);
		}
		public SwitchStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterSwitchStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitSwitchStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitSwitchStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStrContext switchStr() throws RecognitionException {
		SwitchStrContext _localctx = new SwitchStrContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_switchStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(SWITCH);
			setState(612);
			match(PAR_IZQ);
			setState(613);
			expr(0);
			setState(614);
			match(PAR_DER);
			setState(615);
			match(LLAVE_IZQ);
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(616);
				switchCase();
				}
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(622);
				switchDefault();
				}
			}

			setState(625);
			match(LLAVE_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(AnimationJSParser.CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOSP() { return getToken(AnimationJSParser.DOSP, 0); }
		public BreakStrContext breakStr() {
			return getRuleContext(BreakStrContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitSwitchCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitSwitchCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_switchCase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(CASE);
			setState(628);
			expr(0);
			setState(629);
			match(DOSP);
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(630);
					command();
					}
					} 
				}
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(636);
			breakStr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchDefaultContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(AnimationJSParser.DEFAULT, 0); }
		public TerminalNode DOSP() { return getToken(AnimationJSParser.DOSP, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public BreakStrContext breakStr() {
			return getRuleContext(BreakStrContext.class,0);
		}
		public SwitchDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterSwitchDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitSwitchDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitSwitchDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchDefaultContext switchDefault() throws RecognitionException {
		SwitchDefaultContext _localctx = new SwitchDefaultContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_switchDefault);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(DEFAULT);
			setState(639);
			match(DOSP);
			setState(643);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(640);
					command();
					}
					} 
				}
				setState(645);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(646);
				breakStr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationImgContext extends ParserRuleContext {
		public TerminalNode IMG() { return getToken(AnimationJSParser.IMG, 0); }
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
		public TerminalNode EQU() { return getToken(AnimationJSParser.EQU, 0); }
		public TerminalNode SRC() { return getToken(AnimationJSParser.SRC, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public TerminalNode DT_STRING() { return getToken(AnimationJSParser.DT_STRING, 0); }
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode PYC() { return getToken(AnimationJSParser.PYC, 0); }
		public DeclarationImgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationImg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterDeclarationImg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitDeclarationImg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitDeclarationImg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationImgContext declarationImg() throws RecognitionException {
		DeclarationImgContext _localctx = new DeclarationImgContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_declarationImg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(IMG);
			setState(650);
			match(ID);
			setState(651);
			match(EQU);
			setState(652);
			match(SRC);
			setState(653);
			match(PAR_IZQ);
			setState(654);
			match(DT_STRING);
			setState(655);
			match(PAR_DER);
			setState(656);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationImgArrayContext extends ParserRuleContext {
		public TerminalNode IMG() { return getToken(AnimationJSParser.IMG, 0); }
		public TerminalNode COR_IZQ() { return getToken(AnimationJSParser.COR_IZQ, 0); }
		public TerminalNode COR_DER() { return getToken(AnimationJSParser.COR_DER, 0); }
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
		public TerminalNode EQU() { return getToken(AnimationJSParser.EQU, 0); }
		public TerminalNode ARRAY() { return getToken(AnimationJSParser.ARRAY, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode PYC() { return getToken(AnimationJSParser.PYC, 0); }
		public DeclarationImgArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationImgArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterDeclarationImgArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitDeclarationImgArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitDeclarationImgArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationImgArrayContext declarationImgArray() throws RecognitionException {
		DeclarationImgArrayContext _localctx = new DeclarationImgArrayContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_declarationImgArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(IMG);
			setState(659);
			match(COR_IZQ);
			setState(660);
			match(COR_DER);
			setState(661);
			match(ID);
			setState(662);
			match(EQU);
			setState(663);
			match(ARRAY);
			setState(664);
			match(PAR_IZQ);
			setState(665);
			num_expr(0);
			setState(666);
			match(PAR_DER);
			setState(667);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationAnimContext extends ParserRuleContext {
		public TerminalNode ANIMATION() { return getToken(AnimationJSParser.ANIMATION, 0); }
		public List<TerminalNode> ID() { return getTokens(AnimationJSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AnimationJSParser.ID, i);
		}
		public TerminalNode EQU() { return getToken(AnimationJSParser.EQU, 0); }
		public TerminalNode NANIMATION() { return getToken(AnimationJSParser.NANIMATION, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AnimationJSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AnimationJSParser.COMMA, i);
		}
		public List<Num_exprContext> num_expr() {
			return getRuleContexts(Num_exprContext.class);
		}
		public Num_exprContext num_expr(int i) {
			return getRuleContext(Num_exprContext.class,i);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode PYC() { return getToken(AnimationJSParser.PYC, 0); }
		public DeclarationAnimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationAnim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterDeclarationAnim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitDeclarationAnim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitDeclarationAnim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationAnimContext declarationAnim() throws RecognitionException {
		DeclarationAnimContext _localctx = new DeclarationAnimContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_declarationAnim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(ANIMATION);
			setState(670);
			match(ID);
			setState(671);
			match(EQU);
			setState(672);
			match(NANIMATION);
			setState(673);
			match(PAR_IZQ);
			setState(674);
			match(ID);
			setState(675);
			match(COMMA);
			setState(676);
			num_expr(0);
			setState(677);
			match(COMMA);
			setState(678);
			num_expr(0);
			setState(679);
			match(COMMA);
			setState(680);
			num_expr(0);
			setState(681);
			match(PAR_DER);
			setState(682);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnimContext extends ParserRuleContext {
		public TerminalNode ANIM() { return getToken(AnimationJSParser.ANIM, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AnimationJSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AnimationJSParser.COMMA, i);
		}
		public List<Num_exprContext> num_expr() {
			return getRuleContexts(Num_exprContext.class);
		}
		public Num_exprContext num_expr(int i) {
			return getRuleContext(Num_exprContext.class,i);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode PYC() { return getToken(AnimationJSParser.PYC, 0); }
		public AnimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterAnim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitAnim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitAnim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimContext anim() throws RecognitionException {
		AnimContext _localctx = new AnimContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_anim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(ANIM);
			setState(685);
			match(PAR_IZQ);
			setState(686);
			match(ID);
			setState(687);
			match(COMMA);
			setState(688);
			num_expr(0);
			setState(689);
			match(COMMA);
			setState(690);
			num_expr(0);
			setState(691);
			match(COMMA);
			setState(692);
			num_expr(0);
			setState(693);
			match(COMMA);
			setState(694);
			num_expr(0);
			setState(695);
			match(COMMA);
			setState(696);
			num_expr(0);
			setState(697);
			match(PAR_DER);
			setState(698);
			match(PYC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(AnimationJSParser.LEN, 0); }
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(LEN);
			setState(701);
			match(PAR_IZQ);
			setState(702);
			match(ID);
			setState(703);
			match(PAR_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class System_varsContext extends ParserRuleContext {
		public TerminalNode KEYRELEASED() { return getToken(AnimationJSParser.KEYRELEASED, 0); }
		public TerminalNode KEYPRESSED() { return getToken(AnimationJSParser.KEYPRESSED, 0); }
		public TerminalNode MOUSEX() { return getToken(AnimationJSParser.MOUSEX, 0); }
		public TerminalNode MOUSEY() { return getToken(AnimationJSParser.MOUSEY, 0); }
		public TerminalNode CLICK() { return getToken(AnimationJSParser.CLICK, 0); }
		public TerminalNode MOUSEPRESSED() { return getToken(AnimationJSParser.MOUSEPRESSED, 0); }
		public TerminalNode MOUSEXCLICK() { return getToken(AnimationJSParser.MOUSEXCLICK, 0); }
		public TerminalNode MOUSEYCLICK() { return getToken(AnimationJSParser.MOUSEYCLICK, 0); }
		public TerminalNode FRAMES() { return getToken(AnimationJSParser.FRAMES, 0); }
		public TerminalNode CANVAS_WIDTH() { return getToken(AnimationJSParser.CANVAS_WIDTH, 0); }
		public TerminalNode CANVAS_HEIGHT() { return getToken(AnimationJSParser.CANVAS_HEIGHT, 0); }
		public Key_varsContext key_vars() {
			return getRuleContext(Key_varsContext.class,0);
		}
		public System_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterSystem_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitSystem_vars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitSystem_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final System_varsContext system_vars() throws RecognitionException {
		System_varsContext _localctx = new System_varsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_system_vars);
		try {
			setState(717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYRELEASED:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				match(KEYRELEASED);
				}
				break;
			case KEYPRESSED:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				match(KEYPRESSED);
				}
				break;
			case MOUSEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(707);
				match(MOUSEX);
				}
				break;
			case MOUSEY:
				enterOuterAlt(_localctx, 4);
				{
				setState(708);
				match(MOUSEY);
				}
				break;
			case CLICK:
				enterOuterAlt(_localctx, 5);
				{
				setState(709);
				match(CLICK);
				}
				break;
			case MOUSEPRESSED:
				enterOuterAlt(_localctx, 6);
				{
				setState(710);
				match(MOUSEPRESSED);
				}
				break;
			case MOUSEXCLICK:
				enterOuterAlt(_localctx, 7);
				{
				setState(711);
				match(MOUSEXCLICK);
				}
				break;
			case MOUSEYCLICK:
				enterOuterAlt(_localctx, 8);
				{
				setState(712);
				match(MOUSEYCLICK);
				}
				break;
			case FRAMES:
				enterOuterAlt(_localctx, 9);
				{
				setState(713);
				match(FRAMES);
				}
				break;
			case CANVAS_WIDTH:
				enterOuterAlt(_localctx, 10);
				{
				setState(714);
				match(CANVAS_WIDTH);
				}
				break;
			case CANVAS_HEIGHT:
				enterOuterAlt(_localctx, 11);
				{
				setState(715);
				match(CANVAS_HEIGHT);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case LEFT:
				enterOuterAlt(_localctx, 12);
				{
				setState(716);
				key_vars();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key_varsContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(AnimationJSParser.LEFT, 0); }
		public Key_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterKey_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitKey_vars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitKey_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_varsContext key_vars() throws RecognitionException {
		Key_varsContext _localctx = new Key_varsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_key_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << LEFT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AnimationJSParser.INT, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitDtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitDtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dt_numericContext extends ParserRuleContext {
		public TerminalNode DT_FLOAT() { return getToken(AnimationJSParser.DT_FLOAT, 0); }
		public TerminalNode DT_INT() { return getToken(AnimationJSParser.DT_INT, 0); }
		public Dt_numericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dt_numeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterDt_numeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitDt_numeric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitDt_numeric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dt_numericContext dt_numeric() throws RecognitionException {
		Dt_numericContext _localctx = new Dt_numericContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_dt_numeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			_la = _input.LA(1);
			if ( !(_la==DT_INT || _la==DT_FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_exprContext extends ParserRuleContext {
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public List<Num_exprContext> num_expr() {
			return getRuleContexts(Num_exprContext.class);
		}
		public Num_exprContext num_expr(int i) {
			return getRuleContext(Num_exprContext.class,i);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode RESTA() { return getToken(AnimationJSParser.RESTA, 0); }
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
		public Dt_numericContext dt_numeric() {
			return getRuleContext(Dt_numericContext.class,0);
		}
		public System_varsContext system_vars() {
			return getRuleContext(System_varsContext.class,0);
		}
		public TerminalNode SIN() { return getToken(AnimationJSParser.SIN, 0); }
		public TerminalNode COS() { return getToken(AnimationJSParser.COS, 0); }
		public TerminalNode PI() { return getToken(AnimationJSParser.PI, 0); }
		public TerminalNode RANDOM() { return getToken(AnimationJSParser.RANDOM, 0); }
		public TerminalNode COMMA() { return getToken(AnimationJSParser.COMMA, 0); }
		public TerminalNode INTRANDOM() { return getToken(AnimationJSParser.INTRANDOM, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode COR_IZQ() { return getToken(AnimationJSParser.COR_IZQ, 0); }
		public TerminalNode COR_DER() { return getToken(AnimationJSParser.COR_DER, 0); }
		public Oper_numContext oper_num() {
			return getRuleContext(Oper_numContext.class,0);
		}
		public Num_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterNum_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitNum_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitNum_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_exprContext num_expr() throws RecognitionException {
		return num_expr(0);
	}

	private Num_exprContext num_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Num_exprContext _localctx = new Num_exprContext(_ctx, _parentState);
		Num_exprContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_num_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(726);
				match(PAR_IZQ);
				setState(727);
				num_expr(0);
				setState(728);
				match(PAR_DER);
				}
				break;
			case 2:
				{
				setState(730);
				match(RESTA);
				setState(731);
				match(PAR_IZQ);
				setState(732);
				num_expr(0);
				setState(733);
				match(PAR_DER);
				}
				break;
			case 3:
				{
				setState(735);
				match(RESTA);
				setState(736);
				match(ID);
				}
				break;
			case 4:
				{
				setState(737);
				match(RESTA);
				setState(738);
				dt_numeric();
				}
				break;
			case 5:
				{
				setState(739);
				dt_numeric();
				}
				break;
			case 6:
				{
				setState(740);
				system_vars();
				}
				break;
			case 7:
				{
				setState(741);
				match(ID);
				}
				break;
			case 8:
				{
				setState(742);
				match(SIN);
				setState(743);
				match(PAR_IZQ);
				setState(744);
				num_expr(0);
				setState(745);
				match(PAR_DER);
				}
				break;
			case 9:
				{
				setState(747);
				match(COS);
				setState(748);
				match(PAR_IZQ);
				setState(749);
				num_expr(0);
				setState(750);
				match(PAR_DER);
				}
				break;
			case 10:
				{
				setState(752);
				match(PI);
				}
				break;
			case 11:
				{
				setState(753);
				match(RANDOM);
				setState(754);
				match(PAR_IZQ);
				setState(755);
				num_expr(0);
				setState(756);
				match(COMMA);
				setState(757);
				num_expr(0);
				setState(758);
				match(PAR_DER);
				}
				break;
			case 12:
				{
				setState(760);
				match(INTRANDOM);
				setState(761);
				match(PAR_IZQ);
				setState(762);
				num_expr(0);
				setState(763);
				match(COMMA);
				setState(764);
				num_expr(0);
				setState(765);
				match(PAR_DER);
				}
				break;
			case 13:
				{
				setState(767);
				length();
				}
				break;
			case 14:
				{
				setState(768);
				match(ID);
				setState(769);
				match(COR_IZQ);
				setState(770);
				num_expr(0);
				setState(771);
				match(COR_DER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(781);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Num_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_num_expr);
					setState(775);
					if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
					setState(776);
					oper_num();
					setState(777);
					num_expr(16);
					}
					} 
				}
				setState(783);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode PAR_IZQ() { return getToken(AnimationJSParser.PAR_IZQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PAR_DER() { return getToken(AnimationJSParser.PAR_DER, 0); }
		public TerminalNode RESTA() { return getToken(AnimationJSParser.RESTA, 0); }
		public TerminalNode NEGACION() { return getToken(AnimationJSParser.NEGACION, 0); }
		public TerminalNode SIN() { return getToken(AnimationJSParser.SIN, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public TerminalNode COS() { return getToken(AnimationJSParser.COS, 0); }
		public TerminalNode PI() { return getToken(AnimationJSParser.PI, 0); }
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
		public System_varsContext system_vars() {
			return getRuleContext(System_varsContext.class,0);
		}
		public Dt_numericContext dt_numeric() {
			return getRuleContext(Dt_numericContext.class,0);
		}
		public TerminalNode DT_STRING() { return getToken(AnimationJSParser.DT_STRING, 0); }
		public Tf_logContext tf_log() {
			return getRuleContext(Tf_logContext.class,0);
		}
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode COR_IZQ() { return getToken(AnimationJSParser.COR_IZQ, 0); }
		public TerminalNode COR_DER() { return getToken(AnimationJSParser.COR_DER, 0); }
		public Oper_numContext oper_num() {
			return getRuleContext(Oper_numContext.class,0);
		}
		public Oper_compContext oper_comp() {
			return getRuleContext(Oper_compContext.class,0);
		}
		public Oper_logContext oper_log() {
			return getRuleContext(Oper_logContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(785);
				match(PAR_IZQ);
				setState(786);
				expr(0);
				setState(787);
				match(PAR_DER);
				}
				break;
			case 2:
				{
				setState(789);
				match(RESTA);
				setState(790);
				match(PAR_IZQ);
				setState(791);
				expr(0);
				setState(792);
				match(PAR_DER);
				}
				break;
			case 3:
				{
				setState(794);
				match(NEGACION);
				setState(795);
				match(PAR_IZQ);
				setState(796);
				expr(0);
				setState(797);
				match(PAR_DER);
				}
				break;
			case 4:
				{
				setState(799);
				match(SIN);
				setState(800);
				match(PAR_IZQ);
				setState(801);
				num_expr(0);
				setState(802);
				match(PAR_DER);
				}
				break;
			case 5:
				{
				setState(804);
				match(COS);
				setState(805);
				match(PAR_IZQ);
				setState(806);
				num_expr(0);
				setState(807);
				match(PAR_DER);
				}
				break;
			case 6:
				{
				setState(809);
				match(PI);
				}
				break;
			case 7:
				{
				setState(810);
				match(ID);
				}
				break;
			case 8:
				{
				setState(811);
				system_vars();
				}
				break;
			case 9:
				{
				setState(812);
				dt_numeric();
				}
				break;
			case 10:
				{
				setState(813);
				match(DT_STRING);
				}
				break;
			case 11:
				{
				setState(814);
				match(RESTA);
				setState(815);
				match(ID);
				}
				break;
			case 12:
				{
				setState(816);
				match(RESTA);
				setState(817);
				dt_numeric();
				}
				break;
			case 13:
				{
				setState(818);
				match(NEGACION);
				setState(819);
				match(ID);
				}
				break;
			case 14:
				{
				setState(820);
				tf_log();
				}
				break;
			case 15:
				{
				setState(821);
				match(NEGACION);
				setState(822);
				tf_log();
				}
				break;
			case 16:
				{
				setState(823);
				length();
				}
				break;
			case 17:
				{
				setState(824);
				match(ID);
				setState(825);
				match(COR_IZQ);
				setState(826);
				num_expr(0);
				setState(827);
				match(COR_DER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(845);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(843);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(831);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(832);
						oper_num();
						setState(833);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(835);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(836);
						oper_comp();
						setState(837);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(839);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(840);
						oper_log();
						setState(841);
						expr(19);
						}
						break;
					}
					} 
				}
				setState(847);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Oper_numContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(AnimationJSParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(AnimationJSParser.RESTA, 0); }
		public TerminalNode MULTIPLICACION() { return getToken(AnimationJSParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(AnimationJSParser.DIVISION, 0); }
		public TerminalNode MODULO() { return getToken(AnimationJSParser.MODULO, 0); }
		public TerminalNode POTENCIA() { return getToken(AnimationJSParser.POTENCIA, 0); }
		public Oper_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterOper_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitOper_num(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitOper_num(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oper_numContext oper_num() throws RecognitionException {
		Oper_numContext _localctx = new Oper_numContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_oper_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SUMA - 67)) | (1L << (RESTA - 67)) | (1L << (MULTIPLICACION - 67)) | (1L << (DIVISION - 67)) | (1L << (MODULO - 67)) | (1L << (POTENCIA - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Oper_compContext extends ParserRuleContext {
		public TerminalNode IGUALDAD() { return getToken(AnimationJSParser.IGUALDAD, 0); }
		public TerminalNode DIFERENTE() { return getToken(AnimationJSParser.DIFERENTE, 0); }
		public TerminalNode MAYOR() { return getToken(AnimationJSParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(AnimationJSParser.MENOR, 0); }
		public TerminalNode MAIGUAL() { return getToken(AnimationJSParser.MAIGUAL, 0); }
		public TerminalNode MEIGUAL() { return getToken(AnimationJSParser.MEIGUAL, 0); }
		public Oper_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterOper_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitOper_comp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitOper_comp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oper_compContext oper_comp() throws RecognitionException {
		Oper_compContext _localctx = new Oper_compContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_oper_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (IGUALDAD - 78)) | (1L << (DIFERENTE - 78)) | (1L << (MAYOR - 78)) | (1L << (MENOR - 78)) | (1L << (MAIGUAL - 78)) | (1L << (MEIGUAL - 78)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Oper_logContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(AnimationJSParser.AND, 0); }
		public TerminalNode OR() { return getToken(AnimationJSParser.OR, 0); }
		public Oper_logContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterOper_log(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitOper_log(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitOper_log(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oper_logContext oper_log() throws RecognitionException {
		Oper_logContext _localctx = new Oper_logContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_oper_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tf_logContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(AnimationJSParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AnimationJSParser.FALSE, 0); }
		public Tf_logContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tf_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterTf_log(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitTf_log(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitTf_log(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tf_logContext tf_log() throws RecognitionException {
		Tf_logContext _localctx = new Tf_logContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_tf_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 46:
			return num_expr_sempred((Num_exprContext)_localctx, predIndex);
		case 47:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean num_expr_sempred(Num_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3d\u035b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\5\2m\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\7\5\u0082\n\5\f\5\16\5\u0085\13\5"+
		"\3\6\7\6\u0088\n\6\f\6\16\6\u008b\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009f\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00af\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00bd\n\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00cc\n\n\3\13\3\13\3\13\3\13\5\13\u00d2"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00e1\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00f2\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u011d\n\23\f\23\16\23\u0120\13\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0136\n\25\3\25\3\25\5\25\u013a\n\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u014a\n\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u015c\n\25\3\25\3\25\5\25\u0160\n\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0172"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0188\n\25\3\25\3\25\5\25\u018c"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01a2\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01b4"+
		"\n\25\3\25\3\25\5\25\u01b8\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01dc"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01e9"+
		"\n\26\3\26\3\26\5\26\u01ed\n\26\3\26\3\26\5\26\u01f1\n\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\7\31\u0206\n\31\f\31\16\31\u0209\13\31\3\31\5\31\u020c\n"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0214\n\32\f\32\16\32\u0217\13"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0222\n\33\f\33"+
		"\16\33\u0225\13\33\3\33\3\33\3\34\3\34\3\34\7\34\u022c\n\34\f\34\16\34"+
		"\u022f\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0239\n\35\f"+
		"\35\16\35\u023c\13\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0253\n \f \16 \u0256\13 \3 \3"+
		" \3!\3!\3!\3!\3\"\3\"\3#\3#\3#\3#\5#\u0264\n#\3$\3$\3$\3$\3$\3$\7$\u026c"+
		"\n$\f$\16$\u026f\13$\3$\5$\u0272\n$\3$\3$\3%\3%\3%\3%\7%\u027a\n%\f%\16"+
		"%\u027d\13%\3%\3%\3&\3&\3&\7&\u0284\n&\f&\16&\u0287\13&\3&\5&\u028a\n"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\5,\u02d0\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5"+
		"\60\u0308\n\60\3\60\3\60\3\60\3\60\7\60\u030e\n\60\f\60\16\60\u0311\13"+
		"\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\5\61\u0340\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\7\61\u034e\n\61\f\61\16\61\u0351\13\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\2\4^`\66\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\t"+
		"\4\2\3\f;;\4\2\r\17  \3\2>?\3\2EJ\3\2PU\3\2VW\3\2XY\2\u03a1\2j\3\2\2\2"+
		"\4p\3\2\2\2\6x\3\2\2\2\b\u0083\3\2\2\2\n\u0089\3\2\2\2\f\u009e\3\2\2\2"+
		"\16\u00ae\3\2\2\2\20\u00b0\3\2\2\2\22\u00cb\3\2\2\2\24\u00e0\3\2\2\2\26"+
		"\u00f1\3\2\2\2\30\u00f3\3\2\2\2\32\u00f7\3\2\2\2\34\u00fb\3\2\2\2\36\u0100"+
		"\3\2\2\2 \u0105\3\2\2\2\"\u010c\3\2\2\2$\u0117\3\2\2\2&\u0124\3\2\2\2"+
		"(\u01db\3\2\2\2*\u01dd\3\2\2\2,\u01f5\3\2\2\2.\u01fe\3\2\2\2\60\u0203"+
		"\3\2\2\2\62\u020d\3\2\2\2\64\u021a\3\2\2\2\66\u0228\3\2\2\28\u0232\3\2"+
		"\2\2:\u023f\3\2\2\2<\u0242\3\2\2\2>\u0248\3\2\2\2@\u0259\3\2\2\2B\u025d"+
		"\3\2\2\2D\u0263\3\2\2\2F\u0265\3\2\2\2H\u0275\3\2\2\2J\u0280\3\2\2\2L"+
		"\u028b\3\2\2\2N\u0294\3\2\2\2P\u029f\3\2\2\2R\u02ae\3\2\2\2T\u02be\3\2"+
		"\2\2V\u02cf\3\2\2\2X\u02d1\3\2\2\2Z\u02d3\3\2\2\2\\\u02d5\3\2\2\2^\u0307"+
		"\3\2\2\2`\u033f\3\2\2\2b\u0352\3\2\2\2d\u0354\3\2\2\2f\u0356\3\2\2\2h"+
		"\u0358\3\2\2\2jl\5\4\3\2km\5\6\4\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\2"+
		"\2\3o\3\3\2\2\2pq\7\20\2\2qr\7\21\2\2rs\7[\2\2st\7\\\2\2tu\7_\2\2uv\5"+
		"\b\5\2vw\7`\2\2w\5\3\2\2\2xy\7\20\2\2yz\7\22\2\2z{\7[\2\2{|\7\\\2\2|}"+
		"\7_\2\2}~\5\n\6\2~\177\7`\2\2\177\7\3\2\2\2\u0080\u0082\5\f\7\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\t\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\5\16\b\2\u0087\u0086"+
		"\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\13\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u009f\5\20\t\2\u008d\u009f\5\22"+
		"\n\2\u008e\u009f\5\26\f\2\u008f\u009f\5$\23\2\u0090\u009f\5&\24\2\u0091"+
		"\u009f\5(\25\2\u0092\u009f\5*\26\2\u0093\u009f\5.\30\2\u0094\u009f\5\60"+
		"\31\2\u0095\u009f\58\35\2\u0096\u009f\5:\36\2\u0097\u009f\5<\37\2\u0098"+
		"\u009f\5> \2\u0099\u009f\5F$\2\u009a\u009f\5L\'\2\u009b\u009f\5P)\2\u009c"+
		"\u009f\5N(\2\u009d\u009f\5\"\22\2\u009e\u008c\3\2\2\2\u009e\u008d\3\2"+
		"\2\2\u009e\u008e\3\2\2\2\u009e\u008f\3\2\2\2\u009e\u0090\3\2\2\2\u009e"+
		"\u0091\3\2\2\2\u009e\u0092\3\2\2\2\u009e\u0093\3\2\2\2\u009e\u0094\3\2"+
		"\2\2\u009e\u0095\3\2\2\2\u009e\u0096\3\2\2\2\u009e\u0097\3\2\2\2\u009e"+
		"\u0098\3\2\2\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\r\3\2\2\2\u00a0\u00af"+
		"\5\24\13\2\u00a1\u00af\5\26\f\2\u00a2\u00af\5$\23\2\u00a3\u00af\5&\24"+
		"\2\u00a4\u00af\5(\25\2\u00a5\u00af\5*\26\2\u00a6\u00af\5\60\31\2\u00a7"+
		"\u00af\58\35\2\u00a8\u00af\5:\36\2\u00a9\u00af\5<\37\2\u00aa\u00af\5>"+
		" \2\u00ab\u00af\5F$\2\u00ac\u00af\5R*\2\u00ad\u00af\5\"\22\2\u00ae\u00a0"+
		"\3\2\2\2\u00ae\u00a1\3\2\2\2\u00ae\u00a2\3\2\2\2\u00ae\u00a3\3\2\2\2\u00ae"+
		"\u00a4\3\2\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00a6\3\2\2\2\u00ae\u00a7\3\2"+
		"\2\2\u00ae\u00a8\3\2\2\2\u00ae\u00a9\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae"+
		"\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\17\3\2\2"+
		"\2\u00b0\u00b1\7\23\2\2\u00b1\u00b2\7[\2\2\u00b2\u00b3\7>\2\2\u00b3\u00b4"+
		"\7A\2\2\u00b4\u00b5\7>\2\2\u00b5\u00b6\7\\\2\2\u00b6\u00b7\7B\2\2\u00b7"+
		"\21\3\2\2\2\u00b8\u00b9\5Z.\2\u00b9\u00bc\7a\2\2\u00ba\u00bb\7C\2\2\u00bb"+
		"\u00bd\5`\61\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\7B\2\2\u00bf\u00cc\3\2\2\2\u00c0\u00c1\5Z.\2\u00c1\u00c2"+
		"\7]\2\2\u00c2\u00c3\7^\2\2\u00c3\u00c4\7a\2\2\u00c4\u00c5\7C\2\2\u00c5"+
		"\u00c6\7)\2\2\u00c6\u00c7\7[\2\2\u00c7\u00c8\5^\60\2\u00c8\u00c9\7\\\2"+
		"\2\u00c9\u00ca\7B\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00b8\3\2\2\2\u00cb\u00c0"+
		"\3\2\2\2\u00cc\23\3\2\2\2\u00cd\u00ce\5Z.\2\u00ce\u00d1\7a\2\2\u00cf\u00d0"+
		"\7C\2\2\u00d0\u00d2\5`\61\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\7B\2\2\u00d4\u00e1\3\2\2\2\u00d5\u00d6\5Z."+
		"\2\u00d6\u00d7\7]\2\2\u00d7\u00d8\7^\2\2\u00d8\u00d9\7a\2\2\u00d9\u00da"+
		"\7C\2\2\u00da\u00db\7)\2\2\u00db\u00dc\7[\2\2\u00dc\u00dd\5^\60\2\u00dd"+
		"\u00de\7\\\2\2\u00de\u00df\7B\2\2\u00df\u00e1\3\2\2\2\u00e0\u00cd\3\2"+
		"\2\2\u00e0\u00d5\3\2\2\2\u00e1\25\3\2\2\2\u00e2\u00e3\5\30\r\2\u00e3\u00e4"+
		"\7B\2\2\u00e4\u00f2\3\2\2\2\u00e5\u00e6\5\32\16\2\u00e6\u00e7\7B\2\2\u00e7"+
		"\u00f2\3\2\2\2\u00e8\u00e9\5\34\17\2\u00e9\u00ea\7B\2\2\u00ea\u00f2\3"+
		"\2\2\2\u00eb\u00ec\5\36\20\2\u00ec\u00ed\7B\2\2\u00ed\u00f2\3\2\2\2\u00ee"+
		"\u00ef\5 \21\2\u00ef\u00f0\7B\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00e2\3\2"+
		"\2\2\u00f1\u00e5\3\2\2\2\u00f1\u00e8\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1"+
		"\u00ee\3\2\2\2\u00f2\27\3\2\2\2\u00f3\u00f4\7a\2\2\u00f4\u00f5\7C\2\2"+
		"\u00f5\u00f6\5`\61\2\u00f6\31\3\2\2\2\u00f7\u00f8\7a\2\2\u00f8\u00f9\7"+
		"E\2\2\u00f9\u00fa\7E\2\2\u00fa\33\3\2\2\2\u00fb\u00fc\7a\2\2\u00fc\u00fd"+
		"\7E\2\2\u00fd\u00fe\7C\2\2\u00fe\u00ff\5^\60\2\u00ff\35\3\2\2\2\u0100"+
		"\u0101\7a\2\2\u0101\u0102\7F\2\2\u0102\u0103\7C\2\2\u0103\u0104\5^\60"+
		"\2\u0104\37\3\2\2\2\u0105\u0106\7a\2\2\u0106\u0107\7]\2\2\u0107\u0108"+
		"\5^\60\2\u0108\u0109\7^\2\2\u0109\u010a\7C\2\2\u010a\u010b\5`\61\2\u010b"+
		"!\3\2\2\2\u010c\u010d\7a\2\2\u010d\u010e\7]\2\2\u010e\u010f\5^\60\2\u010f"+
		"\u0110\7^\2\2\u0110\u0111\7C\2\2\u0111\u0112\7\"\2\2\u0112\u0113\7[\2"+
		"\2\u0113\u0114\5`\61\2\u0114\u0115\7\\\2\2\u0115\u0116\7B\2\2\u0116#\3"+
		"\2\2\2\u0117\u0118\7\24\2\2\u0118\u0119\7[\2\2\u0119\u011e\5`\61\2\u011a"+
		"\u011b\7A\2\2\u011b\u011d\5`\61\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2"+
		"\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0122\7\\\2\2\u0122\u0123\7B\2\2\u0123%\3\2\2\2\u0124"+
		"\u0125\7\25\2\2\u0125\u0126\7[\2\2\u0126\u0127\5,\27\2\u0127\u0128\7\\"+
		"\2\2\u0128\u0129\7B\2\2\u0129\'\3\2\2\2\u012a\u012b\7\27\2\2\u012b\u012c"+
		"\7[\2\2\u012c\u012d\7+\2\2\u012d\u012e\7A\2\2\u012e\u012f\5^\60\2\u012f"+
		"\u0130\7A\2\2\u0130\u0131\5^\60\2\u0131\u0132\7A\2\2\u0132\u0135\5^\60"+
		"\2\u0133\u0134\7A\2\2\u0134\u0136\5^\60\2\u0135\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0138\7A\2\2\u0138\u013a\5,\27\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7\\"+
		"\2\2\u013c\u013d\7B\2\2\u013d\u01dc\3\2\2\2\u013e\u013f\7\27\2\2\u013f"+
		"\u0140\7[\2\2\u0140\u0141\7,\2\2\u0141\u0142\7A\2\2\u0142\u0143\5^\60"+
		"\2\u0143\u0144\7A\2\2\u0144\u0145\5^\60\2\u0145\u0146\7A\2\2\u0146\u0149"+
		"\5^\60\2\u0147\u0148\7A\2\2\u0148\u014a\5,\27\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\7\\\2\2\u014c\u014d\7B"+
		"\2\2\u014d\u01dc\3\2\2\2\u014e\u014f\7\27\2\2\u014f\u0150\7[\2\2\u0150"+
		"\u0151\7-\2\2\u0151\u0152\7A\2\2\u0152\u0153\5^\60\2\u0153\u0154\7A\2"+
		"\2\u0154\u0155\5^\60\2\u0155\u0156\7A\2\2\u0156\u0157\5^\60\2\u0157\u0158"+
		"\7A\2\2\u0158\u015b\5^\60\2\u0159\u015a\7A\2\2\u015a\u015c\5^\60\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015e\7A"+
		"\2\2\u015e\u0160\5,\27\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0162\7\\\2\2\u0162\u0163\7B\2\2\u0163\u01dc\3\2"+
		"\2\2\u0164\u0165\7\27\2\2\u0165\u0166\7[\2\2\u0166\u0167\7.\2\2\u0167"+
		"\u0168\7A\2\2\u0168\u0169\5^\60\2\u0169\u016a\7A\2\2\u016a\u016b\5^\60"+
		"\2\u016b\u016c\7A\2\2\u016c\u016d\5^\60\2\u016d\u016e\7A\2\2\u016e\u0171"+
		"\5^\60\2\u016f\u0170\7A\2\2\u0170\u0172\5,\27\2\u0171\u016f\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\7\\\2\2\u0174\u0175\7B"+
		"\2\2\u0175\u01dc\3\2\2\2\u0176\u0177\7\27\2\2\u0177\u0178\7[\2\2\u0178"+
		"\u0179\7/\2\2\u0179\u017a\7A\2\2\u017a\u017b\5^\60\2\u017b\u017c\7A\2"+
		"\2\u017c\u017d\5^\60\2\u017d\u017e\7A\2\2\u017e\u017f\5^\60\2\u017f\u0180"+
		"\7A\2\2\u0180\u0181\5^\60\2\u0181\u0182\7A\2\2\u0182\u0183\5^\60\2\u0183"+
		"\u0184\7A\2\2\u0184\u0187\5^\60\2\u0185\u0186\7A\2\2\u0186\u0188\5^\60"+
		"\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u018a"+
		"\7A\2\2\u018a\u018c\5,\27\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018e\7\\\2\2\u018e\u018f\7B\2\2\u018f\u01dc\3\2"+
		"\2\2\u0190\u0191\7\27\2\2\u0191\u0192\7[\2\2\u0192\u0193\7\60\2\2\u0193"+
		"\u0194\7A\2\2\u0194\u0195\5^\60\2\u0195\u0196\7A\2\2\u0196\u0197\5^\60"+
		"\2\u0197\u0198\7A\2\2\u0198\u0199\5^\60\2\u0199\u019a\7A\2\2\u019a\u019b"+
		"\5^\60\2\u019b\u019c\7A\2\2\u019c\u019d\5^\60\2\u019d\u019e\7A\2\2\u019e"+
		"\u01a1\5^\60\2\u019f\u01a0\7A\2\2\u01a0\u01a2\5,\27\2\u01a1\u019f\3\2"+
		"\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\7\\\2\2\u01a4"+
		"\u01a5\7B\2\2\u01a5\u01dc\3\2\2\2\u01a6\u01a7\7\27\2\2\u01a7\u01a8\7["+
		"\2\2\u01a8\u01a9\7\61\2\2\u01a9\u01aa\7A\2\2\u01aa\u01ab\5^\60\2\u01ab"+
		"\u01ac\7A\2\2\u01ac\u01ad\5^\60\2\u01ad\u01ae\7A\2\2\u01ae\u01af\5^\60"+
		"\2\u01af\u01b0\7A\2\2\u01b0\u01b3\5^\60\2\u01b1\u01b2\7A\2\2\u01b2\u01b4"+
		"\5^\60\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5"+
		"\u01b6\7A\2\2\u01b6\u01b8\5,\27\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\7\\\2\2\u01ba\u01bb\7B\2\2\u01bb"+
		"\u01dc\3\2\2\2\u01bc\u01bd\7\27\2\2\u01bd\u01be\7[\2\2\u01be\u01bf\7a"+
		"\2\2\u01bf\u01c0\7A\2\2\u01c0\u01c1\5^\60\2\u01c1\u01c2\7A\2\2\u01c2\u01c3"+
		"\5^\60\2\u01c3\u01c4\7A\2\2\u01c4\u01c5\5^\60\2\u01c5\u01c6\7A\2\2\u01c6"+
		"\u01c7\5^\60\2\u01c7\u01c8\7\\\2\2\u01c8\u01c9\7B\2\2\u01c9\u01dc\3\2"+
		"\2\2\u01ca\u01cb\7\27\2\2\u01cb\u01cc\7[\2\2\u01cc\u01cd\7a\2\2\u01cd"+
		"\u01ce\7]\2\2\u01ce\u01cf\5^\60\2\u01cf\u01d0\7^\2\2\u01d0\u01d1\7A\2"+
		"\2\u01d1\u01d2\5^\60\2\u01d2\u01d3\7A\2\2\u01d3\u01d4\5^\60\2\u01d4\u01d5"+
		"\7A\2\2\u01d5\u01d6\5^\60\2\u01d6\u01d7\7A\2\2\u01d7\u01d8\5^\60\2\u01d8"+
		"\u01d9\7\\\2\2\u01d9\u01da\7B\2\2\u01da\u01dc\3\2\2\2\u01db\u012a\3\2"+
		"\2\2\u01db\u013e\3\2\2\2\u01db\u014e\3\2\2\2\u01db\u0164\3\2\2\2\u01db"+
		"\u0176\3\2\2\2\u01db\u0190\3\2\2\2\u01db\u01a6\3\2\2\2\u01db\u01bc\3\2"+
		"\2\2\u01db\u01ca\3\2\2\2\u01dc)\3\2\2\2\u01dd\u01de\7\30\2\2\u01de\u01df"+
		"\7[\2\2\u01df\u01e0\5`\61\2\u01e0\u01e1\7A\2\2\u01e1\u01e2\5^\60\2\u01e2"+
		"\u01e3\7A\2\2\u01e3\u01e4\5^\60\2\u01e4\u01e5\7A\2\2\u01e5\u01e8\5^\60"+
		"\2\u01e6\u01e7\7A\2\2\u01e7\u01e9\5^\60\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9"+
		"\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01eb\7A\2\2\u01eb\u01ed\5,\27\2\u01ec"+
		"\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ef\7A"+
		"\2\2\u01ef\u01f1\7@\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f3\7\\\2\2\u01f3\u01f4\7B\2\2\u01f4+\3\2\2\2\u01f5"+
		"\u01f6\7\26\2\2\u01f6\u01f7\7[\2\2\u01f7\u01f8\5^\60\2\u01f8\u01f9\7A"+
		"\2\2\u01f9\u01fa\5^\60\2\u01fa\u01fb\7A\2\2\u01fb\u01fc\5^\60\2\u01fc"+
		"\u01fd\7\\\2\2\u01fd-\3\2\2\2\u01fe\u01ff\7\31\2\2\u01ff\u0200\7[\2\2"+
		"\u0200\u0201\7\\\2\2\u0201\u0202\7B\2\2\u0202/\3\2\2\2\u0203\u0207\5\62"+
		"\32\2\u0204\u0206\5\64\33\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u020a\u020c\5\66\34\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\61\3\2\2\2\u020d\u020e\7\32\2\2\u020e\u020f\7[\2\2\u020f\u0210\5`\61"+
		"\2\u0210\u0211\7\\\2\2\u0211\u0215\7_\2\2\u0212\u0214\5\16\b\2\u0213\u0212"+
		"\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u0218\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u0219\7`\2\2\u0219\63\3\2\2\2"+
		"\u021a\u021b\7\33\2\2\u021b\u021c\7\32\2\2\u021c\u021d\7[\2\2\u021d\u021e"+
		"\5`\61\2\u021e\u021f\7\\\2\2\u021f\u0223\7_\2\2\u0220\u0222\5\16\b\2\u0221"+
		"\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224\u0226\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0227\7`\2\2\u0227"+
		"\65\3\2\2\2\u0228\u0229\7\33\2\2\u0229\u022d\7_\2\2\u022a\u022c\5\16\b"+
		"\2\u022b\u022a\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e"+
		"\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0231\7`\2\2\u0231"+
		"\67\3\2\2\2\u0232\u0233\7\34\2\2\u0233\u0234\7[\2\2\u0234\u0235\5`\61"+
		"\2\u0235\u0236\7\\\2\2\u0236\u023a\7_\2\2\u0237\u0239\5\16\b\2\u0238\u0237"+
		"\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u023d\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023e\7`\2\2\u023e9\3\2\2\2\u023f"+
		"\u0240\7\35\2\2\u0240\u0241\7B\2\2\u0241;\3\2\2\2\u0242\u0243\7\36\2\2"+
		"\u0243\u0244\7[\2\2\u0244\u0245\5^\60\2\u0245\u0246\7\\\2\2\u0246\u0247"+
		"\7B\2\2\u0247=\3\2\2\2\u0248\u0249\7\37\2\2\u0249\u024a\7[\2\2\u024a\u024b"+
		"\5@!\2\u024b\u024c\7B\2\2\u024c\u024d\5B\"\2\u024d\u024e\7B\2\2\u024e"+
		"\u024f\5D#\2\u024f\u0250\7\\\2\2\u0250\u0254\7_\2\2\u0251\u0253\5\16\b"+
		"\2\u0252\u0251\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255"+
		"\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258\7`\2\2\u0258"+
		"?\3\2\2\2\u0259\u025a\7a\2\2\u025a\u025b\7C\2\2\u025b\u025c\5^\60\2\u025c"+
		"A\3\2\2\2\u025d\u025e\5`\61\2\u025eC\3\2\2\2\u025f\u0264\5\30\r\2\u0260"+
		"\u0264\5\32\16\2\u0261\u0264\5\34\17\2\u0262\u0264\5\36\20\2\u0263\u025f"+
		"\3\2\2\2\u0263\u0260\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0262\3\2\2\2\u0264"+
		"E\3\2\2\2\u0265\u0266\7#\2\2\u0266\u0267\7[\2\2\u0267\u0268\5`\61\2\u0268"+
		"\u0269\7\\\2\2\u0269\u026d\7_\2\2\u026a\u026c\5H%\2\u026b\u026a\3\2\2"+
		"\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0271"+
		"\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0272\5J&\2\u0271\u0270\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\7`\2\2\u0274G\3\2\2\2\u0275"+
		"\u0276\7$\2\2\u0276\u0277\5`\61\2\u0277\u027b\7D\2\2\u0278\u027a\5\16"+
		"\b\2\u0279\u0278\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u027f\5:"+
		"\36\2\u027fI\3\2\2\2\u0280\u0281\7%\2\2\u0281\u0285\7D\2\2\u0282\u0284"+
		"\5\16\b\2\u0283\u0282\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2"+
		"\u0285\u0286\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u028a"+
		"\5:\36\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028aK\3\2\2\2\u028b"+
		"\u028c\7!\2\2\u028c\u028d\7a\2\2\u028d\u028e\7C\2\2\u028e\u028f\7\"\2"+
		"\2\u028f\u0290\7[\2\2\u0290\u0291\7@\2\2\u0291\u0292\7\\\2\2\u0292\u0293"+
		"\7B\2\2\u0293M\3\2\2\2\u0294\u0295\7!\2\2\u0295\u0296\7]\2\2\u0296\u0297"+
		"\7^\2\2\u0297\u0298\7a\2\2\u0298\u0299\7C\2\2\u0299\u029a\7)\2\2\u029a"+
		"\u029b\7[\2\2\u029b\u029c\5^\60\2\u029c\u029d\7\\\2\2\u029d\u029e\7B\2"+
		"\2\u029eO\3\2\2\2\u029f\u02a0\7&\2\2\u02a0\u02a1\7a\2\2\u02a1\u02a2\7"+
		"C\2\2\u02a2\u02a3\7\'\2\2\u02a3\u02a4\7[\2\2\u02a4\u02a5\7a\2\2\u02a5"+
		"\u02a6\7A\2\2\u02a6\u02a7\5^\60\2\u02a7\u02a8\7A\2\2\u02a8\u02a9\5^\60"+
		"\2\u02a9\u02aa\7A\2\2\u02aa\u02ab\5^\60\2\u02ab\u02ac\7\\\2\2\u02ac\u02ad"+
		"\7B\2\2\u02adQ\3\2\2\2\u02ae\u02af\7(\2\2\u02af\u02b0\7[\2\2\u02b0\u02b1"+
		"\7a\2\2\u02b1\u02b2\7A\2\2\u02b2\u02b3\5^\60\2\u02b3\u02b4\7A\2\2\u02b4"+
		"\u02b5\5^\60\2\u02b5\u02b6\7A\2\2\u02b6\u02b7\5^\60\2\u02b7\u02b8\7A\2"+
		"\2\u02b8\u02b9\5^\60\2\u02b9\u02ba\7A\2\2\u02ba\u02bb\5^\60\2\u02bb\u02bc"+
		"\7\\\2\2\u02bc\u02bd\7B\2\2\u02bdS\3\2\2\2\u02be\u02bf\7*\2\2\u02bf\u02c0"+
		"\7[\2\2\u02c0\u02c1\7a\2\2\u02c1\u02c2\7\\\2\2\u02c2U\3\2\2\2\u02c3\u02d0"+
		"\7\62\2\2\u02c4\u02d0\7\63\2\2\u02c5\u02d0\7\64\2\2\u02c6\u02d0\7\65\2"+
		"\2\u02c7\u02d0\7\66\2\2\u02c8\u02d0\7\67\2\2\u02c9\u02d0\78\2\2\u02ca"+
		"\u02d0\79\2\2\u02cb\u02d0\7:\2\2\u02cc\u02d0\7<\2\2\u02cd\u02d0\7=\2\2"+
		"\u02ce\u02d0\5X-\2\u02cf\u02c3\3\2\2\2\u02cf\u02c4\3\2\2\2\u02cf\u02c5"+
		"\3\2\2\2\u02cf\u02c6\3\2\2\2\u02cf\u02c7\3\2\2\2\u02cf\u02c8\3\2\2\2\u02cf"+
		"\u02c9\3\2\2\2\u02cf\u02ca\3\2\2\2\u02cf\u02cb\3\2\2\2\u02cf\u02cc\3\2"+
		"\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02ce\3\2\2\2\u02d0W\3\2\2\2\u02d1\u02d2"+
		"\t\2\2\2\u02d2Y\3\2\2\2\u02d3\u02d4\t\3\2\2\u02d4[\3\2\2\2\u02d5\u02d6"+
		"\t\4\2\2\u02d6]\3\2\2\2\u02d7\u02d8\b\60\1\2\u02d8\u02d9\7[\2\2\u02d9"+
		"\u02da\5^\60\2\u02da\u02db\7\\\2\2\u02db\u0308\3\2\2\2\u02dc\u02dd\7F"+
		"\2\2\u02dd\u02de\7[\2\2\u02de\u02df\5^\60\2\u02df\u02e0\7\\\2\2\u02e0"+
		"\u0308\3\2\2\2\u02e1\u02e2\7F\2\2\u02e2\u0308\7a\2\2\u02e3\u02e4\7F\2"+
		"\2\u02e4\u0308\5\\/\2\u02e5\u0308\5\\/\2\u02e6\u0308\5V,\2\u02e7\u0308"+
		"\7a\2\2\u02e8\u02e9\7K\2\2\u02e9\u02ea\7[\2\2\u02ea\u02eb\5^\60\2\u02eb"+
		"\u02ec\7\\\2\2\u02ec\u0308\3\2\2\2\u02ed\u02ee\7L\2\2\u02ee\u02ef\7[\2"+
		"\2\u02ef\u02f0\5^\60\2\u02f0\u02f1\7\\\2\2\u02f1\u0308\3\2\2\2\u02f2\u0308"+
		"\7M\2\2\u02f3\u02f4\7N\2\2\u02f4\u02f5\7[\2\2\u02f5\u02f6\5^\60\2\u02f6"+
		"\u02f7\7A\2\2\u02f7\u02f8\5^\60\2\u02f8\u02f9\7\\\2\2\u02f9\u0308\3\2"+
		"\2\2\u02fa\u02fb\7O\2\2\u02fb\u02fc\7[\2\2\u02fc\u02fd\5^\60\2\u02fd\u02fe"+
		"\7A\2\2\u02fe\u02ff\5^\60\2\u02ff\u0300\7\\\2\2\u0300\u0308\3\2\2\2\u0301"+
		"\u0308\5T+\2\u0302\u0303\7a\2\2\u0303\u0304\7]\2\2\u0304\u0305\5^\60\2"+
		"\u0305\u0306\7^\2\2\u0306\u0308\3\2\2\2\u0307\u02d7\3\2\2\2\u0307\u02dc"+
		"\3\2\2\2\u0307\u02e1\3\2\2\2\u0307\u02e3\3\2\2\2\u0307\u02e5\3\2\2\2\u0307"+
		"\u02e6\3\2\2\2\u0307\u02e7\3\2\2\2\u0307\u02e8\3\2\2\2\u0307\u02ed\3\2"+
		"\2\2\u0307\u02f2\3\2\2\2\u0307\u02f3\3\2\2\2\u0307\u02fa\3\2\2\2\u0307"+
		"\u0301\3\2\2\2\u0307\u0302\3\2\2\2\u0308\u030f\3\2\2\2\u0309\u030a\f\21"+
		"\2\2\u030a\u030b\5b\62\2\u030b\u030c\5^\60\22\u030c\u030e\3\2\2\2\u030d"+
		"\u0309\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2"+
		"\2\2\u0310_\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u0313\b\61\1\2\u0313\u0314"+
		"\7[\2\2\u0314\u0315\5`\61\2\u0315\u0316\7\\\2\2\u0316\u0340\3\2\2\2\u0317"+
		"\u0318\7F\2\2\u0318\u0319\7[\2\2\u0319\u031a\5`\61\2\u031a\u031b\7\\\2"+
		"\2\u031b\u0340\3\2\2\2\u031c\u031d\7Z\2\2\u031d\u031e\7[\2\2\u031e\u031f"+
		"\5`\61\2\u031f\u0320\7\\\2\2\u0320\u0340\3\2\2\2\u0321\u0322\7K\2\2\u0322"+
		"\u0323\7[\2\2\u0323\u0324\5^\60\2\u0324\u0325\7\\\2\2\u0325\u0340\3\2"+
		"\2\2\u0326\u0327\7L\2\2\u0327\u0328\7[\2\2\u0328\u0329\5^\60\2\u0329\u032a"+
		"\7\\\2\2\u032a\u0340\3\2\2\2\u032b\u0340\7M\2\2\u032c\u0340\7a\2\2\u032d"+
		"\u0340\5V,\2\u032e\u0340\5\\/\2\u032f\u0340\7@\2\2\u0330\u0331\7F\2\2"+
		"\u0331\u0340\7a\2\2\u0332\u0333\7F\2\2\u0333\u0340\5\\/\2\u0334\u0335"+
		"\7Z\2\2\u0335\u0340\7a\2\2\u0336\u0340\5h\65\2\u0337\u0338\7Z\2\2\u0338"+
		"\u0340\5h\65\2\u0339\u0340\5T+\2\u033a\u033b\7a\2\2\u033b\u033c\7]\2\2"+
		"\u033c\u033d\5^\60\2\u033d\u033e\7^\2\2\u033e\u0340\3\2\2\2\u033f\u0312"+
		"\3\2\2\2\u033f\u0317\3\2\2\2\u033f\u031c\3\2\2\2\u033f\u0321\3\2\2\2\u033f"+
		"\u0326\3\2\2\2\u033f\u032b\3\2\2\2\u033f\u032c\3\2\2\2\u033f\u032d\3\2"+
		"\2\2\u033f\u032e\3\2\2\2\u033f\u032f\3\2\2\2\u033f\u0330\3\2\2\2\u033f"+
		"\u0332\3\2\2\2\u033f\u0334\3\2\2\2\u033f\u0336\3\2\2\2\u033f\u0337\3\2"+
		"\2\2\u033f\u0339\3\2\2\2\u033f\u033a\3\2\2\2\u0340\u034f\3\2\2\2\u0341"+
		"\u0342\f\26\2\2\u0342\u0343\5b\62\2\u0343\u0344\5`\61\27\u0344\u034e\3"+
		"\2\2\2\u0345\u0346\f\25\2\2\u0346\u0347\5d\63\2\u0347\u0348\5`\61\26\u0348"+
		"\u034e\3\2\2\2\u0349\u034a\f\24\2\2\u034a\u034b\5f\64\2\u034b\u034c\5"+
		"`\61\25\u034c\u034e\3\2\2\2\u034d\u0341\3\2\2\2\u034d\u0345\3\2\2\2\u034d"+
		"\u0349\3\2\2\2\u034e\u0351\3\2\2\2\u034f\u034d\3\2\2\2\u034f\u0350\3\2"+
		"\2\2\u0350a\3\2\2\2\u0351\u034f\3\2\2\2\u0352\u0353\t\5\2\2\u0353c\3\2"+
		"\2\2\u0354\u0355\t\6\2\2\u0355e\3\2\2\2\u0356\u0357\t\7\2\2\u0357g\3\2"+
		"\2\2\u0358\u0359\t\b\2\2\u0359i\3\2\2\2/l\u0083\u0089\u009e\u00ae\u00bc"+
		"\u00cb\u00d1\u00e0\u00f1\u011e\u0135\u0139\u0149\u015b\u015f\u0171\u0187"+
		"\u018b\u01a1\u01b3\u01b7\u01db\u01e8\u01ec\u01f0\u0207\u020b\u0215\u0223"+
		"\u022d\u023a\u0254\u0263\u026d\u0271\u027b\u0285\u0289\u02cf\u0307\u030f"+
		"\u033f\u034d\u034f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}