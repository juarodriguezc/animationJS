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
		TRIANGLE=45, FILLTRIANGLE=46, KEYRELEASED=47, KEYPRESSED=48, MOUSEX=49, 
		MOUSEY=50, CLICK=51, MOUSEXCLICK=52, MOUSEYCLICK=53, FRAMES=54, LEFT=55, 
		CANVAS_WIDTH=56, CANVAS_HEIGHT=57, DT_INT=58, DT_FLOAT=59, DT_STRING=60, 
		COMMA=61, PYC=62, EQU=63, DOSP=64, SUMA=65, RESTA=66, MULTIPLICACION=67, 
		DIVISION=68, MODULO=69, POTENCIA=70, SIN=71, COS=72, PI=73, RANDOM=74, 
		INTRANDOM=75, IGUALDAD=76, DIFERENTE=77, MAYOR=78, MENOR=79, MAIGUAL=80, 
		MEIGUAL=81, AND=82, OR=83, TRUE=84, FALSE=85, NEGACION=86, PAR_IZQ=87, 
		PAR_DER=88, COR_IZQ=89, COR_DER=90, LLAVE_IZQ=91, LLAVE_DER=92, ID=93, 
		WS=94, LINECOMMENT=95, COMMENT=96;
	public static final int
		RULE_code = 0, RULE_setup = 1, RULE_animate = 2, RULE_main_commands = 3, 
		RULE_commands = 4, RULE_m_command = 5, RULE_command = 6, RULE_setCanvas = 7, 
		RULE_declarationG = 8, RULE_declarationL = 9, RULE_assignation = 10, RULE_assigUsual = 11, 
		RULE_assigPlPl = 12, RULE_assigPlEq = 13, RULE_assigMinEq = 14, RULE_assigArr = 15, 
		RULE_console = 16, RULE_setBackground = 17, RULE_draw = 18, RULE_text = 19, 
		RULE_rgb = 20, RULE_hideCursor = 21, RULE_ifStr = 22, RULE_ifPart = 23, 
		RULE_elseIfPart = 24, RULE_elsePart = 25, RULE_whileStr = 26, RULE_breakStr = 27, 
		RULE_waitStr = 28, RULE_forStr = 29, RULE_forDecl = 30, RULE_forExpr = 31, 
		RULE_forAssig = 32, RULE_switchStr = 33, RULE_switchCase = 34, RULE_switchDefault = 35, 
		RULE_declarationImg = 36, RULE_declarationAnim = 37, RULE_anim = 38, RULE_length = 39, 
		RULE_system_vars = 40, RULE_key_vars = 41, RULE_dtype = 42, RULE_dt_numeric = 43, 
		RULE_num_expr = 44, RULE_expr = 45, RULE_oper_num = 46, RULE_oper_comp = 47, 
		RULE_oper_log = 48, RULE_tf_log = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "setup", "animate", "main_commands", "commands", "m_command", 
			"command", "setCanvas", "declarationG", "declarationL", "assignation", 
			"assigUsual", "assigPlPl", "assigPlEq", "assigMinEq", "assigArr", "console", 
			"setBackground", "draw", "text", "rgb", "hideCursor", "ifStr", "ifPart", 
			"elseIfPart", "elsePart", "whileStr", "breakStr", "waitStr", "forStr", 
			"forDecl", "forExpr", "forAssig", "switchStr", "switchCase", "switchDefault", 
			"declarationImg", "declarationAnim", "anim", "length", "system_vars", 
			"key_vars", "dtype", "dt_numeric", "num_expr", "expr", "oper_num", "oper_comp", 
			"oper_log", "tf_log"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'A'", "'S'", "'D'", "'W'", "'ENTER'", "'SPACE'", "'BACKSPACE'", 
			"'UP'", "'DOWN'", "'RIGHT'", "'float'", "'string'", "'bool'", "'function'", 
			"'setup'", "'animate'", "'SetCanvas'", "'Console'", "'SetBackground'", 
			"'RGB'", "'Draw'", "'Text'", "'HideCursor'", "'if'", "'else'", "'while'", 
			"'Break'", "'Wait'", "'for'", "'int'", "'img'", "'Src'", "'switch'", 
			"'case'", "'default'", "'animation'", "'Nanimation'", "'Anim'", "'Array'", 
			"'Len'", "'Circle'", "'FillCircle'", "'Rect'", "'FillRect'", "'Triangle'", 
			"'FillTriangle'", "'KEYRELEASED'", "'KEYPRESSED'", "'MOUSEX'", "'MOUSEY'", 
			"'CLICK'", "'MOUSEXCLICK'", "'MOUSEYCLICK'", "'FRAMES'", "'LEFT'", "'CANVAS_WIDTH'", 
			"'CANVAS_HEIGHT'", null, null, null, "','", "';'", "'='", "':'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'^'", "'Sin'", "'Cos'", "'PI'", "'Random'", 
			"'IntRandom'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", 
			"'||'", "'true'", "'false'", "'!'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'"
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
			"FILLRECT", "TRIANGLE", "FILLTRIANGLE", "KEYRELEASED", "KEYPRESSED", 
			"MOUSEX", "MOUSEY", "CLICK", "MOUSEXCLICK", "MOUSEYCLICK", "FRAMES", 
			"LEFT", "CANVAS_WIDTH", "CANVAS_HEIGHT", "DT_INT", "DT_FLOAT", "DT_STRING", 
			"COMMA", "PYC", "EQU", "DOSP", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", 
			"MODULO", "POTENCIA", "SIN", "COS", "PI", "RANDOM", "INTRANDOM", "IGUALDAD", 
			"DIFERENTE", "MAYOR", "MENOR", "MAIGUAL", "MEIGUAL", "AND", "OR", "TRUE", 
			"FALSE", "NEGACION", "PAR_IZQ", "PAR_DER", "COR_IZQ", "COR_DER", "LLAVE_IZQ", 
			"LLAVE_DER", "ID", "WS", "LINECOMMENT", "COMMENT"
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
			setState(100);
			setup();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(101);
				animate();
				}
			}

			setState(104);
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
			setState(106);
			match(FUNCTION);
			setState(107);
			match(SETUP);
			setState(108);
			match(PAR_IZQ);
			setState(109);
			match(PAR_DER);
			setState(110);
			match(LLAVE_IZQ);
			setState(111);
			main_commands();
			setState(112);
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
			setState(114);
			match(FUNCTION);
			setState(115);
			match(ANIMATE);
			setState(116);
			match(PAR_IZQ);
			setState(117);
			match(PAR_DER);
			setState(118);
			match(LLAVE_IZQ);
			setState(119);
			commands();
			setState(120);
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
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << SETCANVAS) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << HIDECURSOR) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << IMG) | (1L << SWITCH) | (1L << ANIMATION))) != 0) || _la==ID) {
				{
				{
				setState(122);
				m_command();
				}
				}
				setState(127);
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
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << SWITCH) | (1L << ANIM))) != 0) || _la==ID) {
				{
				{
				setState(128);
				command();
				}
				}
				setState(133);
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
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SETCANVAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				setCanvas();
				}
				break;
			case T__10:
			case T__11:
			case T__12:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				declarationG();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				assignation();
				}
				break;
			case CONSOLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				console();
				}
				break;
			case SETBACKGROUND:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				setBackground();
				}
				break;
			case DRAW:
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				draw();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				text();
				}
				break;
			case HIDECURSOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(141);
				hideCursor();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 9);
				{
				setState(142);
				ifStr();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 10);
				{
				setState(143);
				whileStr();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 11);
				{
				setState(144);
				breakStr();
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 12);
				{
				setState(145);
				waitStr();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 13);
				{
				setState(146);
				forStr();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 14);
				{
				setState(147);
				switchStr();
				}
				break;
			case IMG:
				enterOuterAlt(_localctx, 15);
				{
				setState(148);
				declarationImg();
				}
				break;
			case ANIMATION:
				enterOuterAlt(_localctx, 16);
				{
				setState(149);
				declarationAnim();
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
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case T__12:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				declarationL();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				assignation();
				}
				break;
			case CONSOLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				console();
				}
				break;
			case SETBACKGROUND:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				setBackground();
				}
				break;
			case DRAW:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				draw();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				text();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				ifStr();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(159);
				whileStr();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 9);
				{
				setState(160);
				breakStr();
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 10);
				{
				setState(161);
				waitStr();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 11);
				{
				setState(162);
				forStr();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 12);
				{
				setState(163);
				switchStr();
				}
				break;
			case ANIM:
				enterOuterAlt(_localctx, 13);
				{
				setState(164);
				anim();
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
			setState(167);
			match(SETCANVAS);
			setState(168);
			match(PAR_IZQ);
			setState(169);
			match(DT_INT);
			setState(170);
			match(COMMA);
			setState(171);
			match(DT_INT);
			setState(172);
			match(PAR_DER);
			setState(173);
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
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				dtype();
				setState(176);
				match(ID);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQU) {
					{
					setState(177);
					match(EQU);
					setState(178);
					expr(0);
					}
				}

				setState(181);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				dtype();
				setState(184);
				match(COR_IZQ);
				setState(185);
				match(COR_DER);
				setState(186);
				match(ID);
				setState(187);
				match(EQU);
				setState(188);
				match(ARRAY);
				setState(189);
				match(PAR_IZQ);
				setState(190);
				num_expr(0);
				setState(191);
				match(PAR_DER);
				setState(192);
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
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				dtype();
				setState(197);
				match(ID);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQU) {
					{
					setState(198);
					match(EQU);
					setState(199);
					expr(0);
					}
				}

				setState(202);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				dtype();
				setState(205);
				match(COR_IZQ);
				setState(206);
				match(COR_DER);
				setState(207);
				match(ID);
				setState(208);
				match(EQU);
				setState(209);
				match(ARRAY);
				setState(210);
				match(PAR_IZQ);
				setState(211);
				num_expr(0);
				setState(212);
				match(PAR_DER);
				setState(213);
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
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				assigUsual();
				setState(218);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				assigPlPl();
				setState(221);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				assigPlEq();
				setState(224);
				match(PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				assigMinEq();
				setState(227);
				match(PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				assigArr();
				setState(230);
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
			setState(234);
			match(ID);
			setState(235);
			match(EQU);
			setState(236);
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
			setState(238);
			match(ID);
			setState(239);
			match(SUMA);
			setState(240);
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
			setState(242);
			match(ID);
			setState(243);
			match(SUMA);
			setState(244);
			match(EQU);
			setState(245);
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
			setState(247);
			match(ID);
			setState(248);
			match(RESTA);
			setState(249);
			match(EQU);
			setState(250);
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
			setState(252);
			match(ID);
			setState(253);
			match(COR_IZQ);
			setState(254);
			num_expr(0);
			setState(255);
			match(COR_DER);
			setState(256);
			match(EQU);
			setState(257);
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
		enterRule(_localctx, 32, RULE_console);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(CONSOLE);
			setState(260);
			match(PAR_IZQ);
			setState(261);
			expr(0);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(262);
				match(COMMA);
				setState(263);
				expr(0);
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(PAR_DER);
			setState(270);
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
		enterRule(_localctx, 34, RULE_setBackground);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(SETBACKGROUND);
			setState(273);
			match(PAR_IZQ);
			setState(274);
			rgb();
			setState(275);
			match(PAR_DER);
			setState(276);
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
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
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
		enterRule(_localctx, 36, RULE_draw);
		int _la;
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(DRAW);
				setState(279);
				match(PAR_IZQ);
				setState(280);
				match(CIRCLE);
				setState(281);
				match(COMMA);
				setState(282);
				num_expr(0);
				setState(283);
				match(COMMA);
				setState(284);
				num_expr(0);
				setState(285);
				match(COMMA);
				setState(286);
				num_expr(0);
				setState(289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(287);
					match(COMMA);
					setState(288);
					num_expr(0);
					}
					break;
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(291);
					match(COMMA);
					setState(292);
					rgb();
					}
				}

				setState(295);
				match(PAR_DER);
				setState(296);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(DRAW);
				setState(299);
				match(PAR_IZQ);
				setState(300);
				match(FILLCIRCLE);
				setState(301);
				match(COMMA);
				setState(302);
				num_expr(0);
				setState(303);
				match(COMMA);
				setState(304);
				num_expr(0);
				setState(305);
				match(COMMA);
				setState(306);
				num_expr(0);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(307);
					match(COMMA);
					setState(308);
					rgb();
					}
				}

				setState(311);
				match(PAR_DER);
				setState(312);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				match(DRAW);
				setState(315);
				match(PAR_IZQ);
				setState(316);
				match(RECT);
				setState(317);
				match(COMMA);
				setState(318);
				num_expr(0);
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
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(325);
					match(COMMA);
					setState(326);
					num_expr(0);
					}
					break;
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(329);
					match(COMMA);
					setState(330);
					rgb();
					}
				}

				setState(333);
				match(PAR_DER);
				setState(334);
				match(PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				match(DRAW);
				setState(337);
				match(PAR_IZQ);
				setState(338);
				match(FILLRECT);
				setState(339);
				match(COMMA);
				setState(340);
				num_expr(0);
				setState(341);
				match(COMMA);
				setState(342);
				num_expr(0);
				setState(343);
				match(COMMA);
				setState(344);
				num_expr(0);
				setState(345);
				match(COMMA);
				setState(346);
				num_expr(0);
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(354);
				match(DRAW);
				setState(355);
				match(PAR_IZQ);
				setState(356);
				match(TRIANGLE);
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
				setState(365);
				match(COMMA);
				setState(366);
				num_expr(0);
				setState(367);
				match(COMMA);
				setState(368);
				num_expr(0);
				setState(371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(369);
					match(COMMA);
					setState(370);
					num_expr(0);
					}
					break;
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(373);
					match(COMMA);
					setState(374);
					rgb();
					}
				}

				setState(377);
				match(PAR_DER);
				setState(378);
				match(PYC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(380);
				match(DRAW);
				setState(381);
				match(PAR_IZQ);
				setState(382);
				match(FILLTRIANGLE);
				setState(383);
				match(COMMA);
				setState(384);
				num_expr(0);
				setState(385);
				match(COMMA);
				setState(386);
				num_expr(0);
				setState(387);
				match(COMMA);
				setState(388);
				num_expr(0);
				setState(389);
				match(COMMA);
				setState(390);
				num_expr(0);
				setState(391);
				match(COMMA);
				setState(392);
				num_expr(0);
				setState(393);
				match(COMMA);
				setState(394);
				num_expr(0);
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(395);
					match(COMMA);
					setState(396);
					rgb();
					}
				}

				setState(399);
				match(PAR_DER);
				setState(400);
				match(PYC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(402);
				match(DRAW);
				setState(403);
				match(PAR_IZQ);
				setState(404);
				match(ID);
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
				setState(413);
				match(PAR_DER);
				setState(414);
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
		enterRule(_localctx, 38, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(TEXT);
			setState(419);
			match(PAR_IZQ);
			setState(420);
			expr(0);
			setState(421);
			match(COMMA);
			setState(422);
			num_expr(0);
			setState(423);
			match(COMMA);
			setState(424);
			num_expr(0);
			setState(425);
			match(COMMA);
			setState(426);
			num_expr(0);
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(427);
				match(COMMA);
				setState(428);
				num_expr(0);
				}
				break;
			}
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(431);
				match(COMMA);
				setState(432);
				rgb();
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
				match(DT_STRING);
				}
			}

			setState(439);
			match(PAR_DER);
			setState(440);
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
		enterRule(_localctx, 40, RULE_rgb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(RGB);
			setState(443);
			match(PAR_IZQ);
			setState(444);
			num_expr(0);
			setState(445);
			match(COMMA);
			setState(446);
			num_expr(0);
			setState(447);
			match(COMMA);
			setState(448);
			num_expr(0);
			setState(449);
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
		enterRule(_localctx, 42, RULE_hideCursor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(HIDECURSOR);
			setState(452);
			match(PAR_IZQ);
			setState(453);
			match(PAR_DER);
			setState(454);
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
		enterRule(_localctx, 44, RULE_ifStr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			ifPart();
			setState(460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(457);
					elseIfPart();
					}
					} 
				}
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(463);
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
		enterRule(_localctx, 46, RULE_ifPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(IF);
			setState(467);
			match(PAR_IZQ);
			setState(468);
			expr(0);
			setState(469);
			match(PAR_DER);
			setState(470);
			match(LLAVE_IZQ);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << SWITCH) | (1L << ANIM))) != 0) || _la==ID) {
				{
				{
				setState(471);
				command();
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477);
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
		enterRule(_localctx, 48, RULE_elseIfPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(ELSE);
			setState(480);
			match(IF);
			setState(481);
			match(PAR_IZQ);
			setState(482);
			expr(0);
			setState(483);
			match(PAR_DER);
			setState(484);
			match(LLAVE_IZQ);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << SWITCH) | (1L << ANIM))) != 0) || _la==ID) {
				{
				{
				setState(485);
				command();
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
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
		enterRule(_localctx, 50, RULE_elsePart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(ELSE);
			setState(494);
			match(LLAVE_IZQ);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << SWITCH) | (1L << ANIM))) != 0) || _la==ID) {
				{
				{
				setState(495);
				command();
				}
				}
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(501);
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
		enterRule(_localctx, 52, RULE_whileStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(WHILE);
			setState(504);
			match(PAR_IZQ);
			setState(505);
			expr(0);
			setState(506);
			match(PAR_DER);
			setState(507);
			match(LLAVE_IZQ);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << SWITCH) | (1L << ANIM))) != 0) || _la==ID) {
				{
				{
				setState(508);
				command();
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(514);
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
		enterRule(_localctx, 54, RULE_breakStr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(BREAK);
			setState(517);
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
		enterRule(_localctx, 56, RULE_waitStr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(WAIT);
			setState(520);
			match(PAR_IZQ);
			setState(521);
			num_expr(0);
			setState(522);
			match(PAR_DER);
			setState(523);
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
		enterRule(_localctx, 58, RULE_forStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(FOR);
			setState(526);
			match(PAR_IZQ);
			setState(527);
			forDecl();
			setState(528);
			match(PYC);
			setState(529);
			forExpr();
			setState(530);
			match(PYC);
			setState(531);
			forAssig();
			setState(532);
			match(PAR_DER);
			setState(533);
			match(LLAVE_IZQ);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << SWITCH) | (1L << ANIM))) != 0) || _la==ID) {
				{
				{
				setState(534);
				command();
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(540);
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
		enterRule(_localctx, 60, RULE_forDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(ID);
			setState(543);
			match(EQU);
			setState(544);
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
		enterRule(_localctx, 62, RULE_forExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
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
		enterRule(_localctx, 64, RULE_forAssig);
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				assigUsual();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				assigPlPl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(550);
				assigPlEq();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(551);
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
		enterRule(_localctx, 66, RULE_switchStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(SWITCH);
			setState(555);
			match(PAR_IZQ);
			setState(556);
			expr(0);
			setState(557);
			match(PAR_DER);
			setState(558);
			match(LLAVE_IZQ);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(559);
				switchCase();
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(565);
				switchDefault();
				}
			}

			setState(568);
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
		enterRule(_localctx, 68, RULE_switchCase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(CASE);
			setState(571);
			expr(0);
			setState(572);
			match(DOSP);
			setState(576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(573);
					command();
					}
					} 
				}
				setState(578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(579);
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
		enterRule(_localctx, 70, RULE_switchDefault);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(DEFAULT);
			setState(582);
			match(DOSP);
			setState(586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(583);
					command();
					}
					} 
				}
				setState(588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(589);
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
		enterRule(_localctx, 72, RULE_declarationImg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(IMG);
			setState(593);
			match(ID);
			setState(594);
			match(EQU);
			setState(595);
			match(SRC);
			setState(596);
			match(PAR_IZQ);
			setState(597);
			match(DT_STRING);
			setState(598);
			match(PAR_DER);
			setState(599);
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
		enterRule(_localctx, 74, RULE_declarationAnim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(ANIMATION);
			setState(602);
			match(ID);
			setState(603);
			match(EQU);
			setState(604);
			match(NANIMATION);
			setState(605);
			match(PAR_IZQ);
			setState(606);
			match(ID);
			setState(607);
			match(COMMA);
			setState(608);
			num_expr(0);
			setState(609);
			match(COMMA);
			setState(610);
			num_expr(0);
			setState(611);
			match(COMMA);
			setState(612);
			num_expr(0);
			setState(613);
			match(PAR_DER);
			setState(614);
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
		enterRule(_localctx, 76, RULE_anim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(ANIM);
			setState(617);
			match(PAR_IZQ);
			setState(618);
			match(ID);
			setState(619);
			match(COMMA);
			setState(620);
			num_expr(0);
			setState(621);
			match(COMMA);
			setState(622);
			num_expr(0);
			setState(623);
			match(COMMA);
			setState(624);
			num_expr(0);
			setState(625);
			match(COMMA);
			setState(626);
			num_expr(0);
			setState(627);
			match(COMMA);
			setState(628);
			num_expr(0);
			setState(629);
			match(PAR_DER);
			setState(630);
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
		enterRule(_localctx, 78, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(LEN);
			setState(633);
			match(PAR_IZQ);
			setState(634);
			match(ID);
			setState(635);
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
		enterRule(_localctx, 80, RULE_system_vars);
		try {
			setState(648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYRELEASED:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				match(KEYRELEASED);
				}
				break;
			case KEYPRESSED:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				match(KEYPRESSED);
				}
				break;
			case MOUSEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(639);
				match(MOUSEX);
				}
				break;
			case MOUSEY:
				enterOuterAlt(_localctx, 4);
				{
				setState(640);
				match(MOUSEY);
				}
				break;
			case CLICK:
				enterOuterAlt(_localctx, 5);
				{
				setState(641);
				match(CLICK);
				}
				break;
			case MOUSEXCLICK:
				enterOuterAlt(_localctx, 6);
				{
				setState(642);
				match(MOUSEXCLICK);
				}
				break;
			case MOUSEYCLICK:
				enterOuterAlt(_localctx, 7);
				{
				setState(643);
				match(MOUSEYCLICK);
				}
				break;
			case FRAMES:
				enterOuterAlt(_localctx, 8);
				{
				setState(644);
				match(FRAMES);
				}
				break;
			case CANVAS_WIDTH:
				enterOuterAlt(_localctx, 9);
				{
				setState(645);
				match(CANVAS_WIDTH);
				}
				break;
			case CANVAS_HEIGHT:
				enterOuterAlt(_localctx, 10);
				{
				setState(646);
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
				enterOuterAlt(_localctx, 11);
				{
				setState(647);
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
		enterRule(_localctx, 82, RULE_key_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
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
		enterRule(_localctx, 84, RULE_dtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
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
		enterRule(_localctx, 86, RULE_dt_numeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_num_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(657);
				match(PAR_IZQ);
				setState(658);
				num_expr(0);
				setState(659);
				match(PAR_DER);
				}
				break;
			case 2:
				{
				setState(661);
				match(RESTA);
				setState(662);
				match(PAR_IZQ);
				setState(663);
				num_expr(0);
				setState(664);
				match(PAR_DER);
				}
				break;
			case 3:
				{
				setState(666);
				match(RESTA);
				setState(667);
				match(ID);
				}
				break;
			case 4:
				{
				setState(668);
				match(RESTA);
				setState(669);
				dt_numeric();
				}
				break;
			case 5:
				{
				setState(670);
				dt_numeric();
				}
				break;
			case 6:
				{
				setState(671);
				system_vars();
				}
				break;
			case 7:
				{
				setState(672);
				match(ID);
				}
				break;
			case 8:
				{
				setState(673);
				match(SIN);
				setState(674);
				match(PAR_IZQ);
				setState(675);
				num_expr(0);
				setState(676);
				match(PAR_DER);
				}
				break;
			case 9:
				{
				setState(678);
				match(COS);
				setState(679);
				match(PAR_IZQ);
				setState(680);
				num_expr(0);
				setState(681);
				match(PAR_DER);
				}
				break;
			case 10:
				{
				setState(683);
				match(PI);
				}
				break;
			case 11:
				{
				setState(684);
				match(RANDOM);
				setState(685);
				match(PAR_IZQ);
				setState(686);
				num_expr(0);
				setState(687);
				match(COMMA);
				setState(688);
				num_expr(0);
				setState(689);
				match(PAR_DER);
				}
				break;
			case 12:
				{
				setState(691);
				match(INTRANDOM);
				setState(692);
				match(PAR_IZQ);
				setState(693);
				num_expr(0);
				setState(694);
				match(COMMA);
				setState(695);
				num_expr(0);
				setState(696);
				match(PAR_DER);
				}
				break;
			case 13:
				{
				setState(698);
				length();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(707);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Num_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_num_expr);
					setState(701);
					if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
					setState(702);
					oper_num();
					setState(703);
					num_expr(15);
					}
					} 
				}
				setState(709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(711);
				match(PAR_IZQ);
				setState(712);
				expr(0);
				setState(713);
				match(PAR_DER);
				}
				break;
			case 2:
				{
				setState(715);
				match(RESTA);
				setState(716);
				match(PAR_IZQ);
				setState(717);
				expr(0);
				setState(718);
				match(PAR_DER);
				}
				break;
			case 3:
				{
				setState(720);
				match(NEGACION);
				setState(721);
				match(PAR_IZQ);
				setState(722);
				expr(0);
				setState(723);
				match(PAR_DER);
				}
				break;
			case 4:
				{
				setState(725);
				match(SIN);
				setState(726);
				match(PAR_IZQ);
				setState(727);
				num_expr(0);
				setState(728);
				match(PAR_DER);
				}
				break;
			case 5:
				{
				setState(730);
				match(COS);
				setState(731);
				match(PAR_IZQ);
				setState(732);
				num_expr(0);
				setState(733);
				match(PAR_DER);
				}
				break;
			case 6:
				{
				setState(735);
				match(PI);
				}
				break;
			case 7:
				{
				setState(736);
				match(ID);
				}
				break;
			case 8:
				{
				setState(737);
				system_vars();
				}
				break;
			case 9:
				{
				setState(738);
				dt_numeric();
				}
				break;
			case 10:
				{
				setState(739);
				match(DT_STRING);
				}
				break;
			case 11:
				{
				setState(740);
				match(RESTA);
				setState(741);
				match(ID);
				}
				break;
			case 12:
				{
				setState(742);
				match(RESTA);
				setState(743);
				dt_numeric();
				}
				break;
			case 13:
				{
				setState(744);
				match(NEGACION);
				setState(745);
				match(ID);
				}
				break;
			case 14:
				{
				setState(746);
				tf_log();
				}
				break;
			case 15:
				{
				setState(747);
				match(NEGACION);
				setState(748);
				tf_log();
				}
				break;
			case 16:
				{
				setState(749);
				length();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(766);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(764);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(752);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(753);
						oper_num();
						setState(754);
						expr(20);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(756);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(757);
						oper_comp();
						setState(758);
						expr(19);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(760);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(761);
						oper_log();
						setState(762);
						expr(18);
						}
						break;
					}
					} 
				}
				setState(768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 92, RULE_oper_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SUMA - 65)) | (1L << (RESTA - 65)) | (1L << (MULTIPLICACION - 65)) | (1L << (DIVISION - 65)) | (1L << (MODULO - 65)) | (1L << (POTENCIA - 65)))) != 0)) ) {
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
		enterRule(_localctx, 94, RULE_oper_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (IGUALDAD - 76)) | (1L << (DIFERENTE - 76)) | (1L << (MAYOR - 76)) | (1L << (MENOR - 76)) | (1L << (MAIGUAL - 76)) | (1L << (MEIGUAL - 76)))) != 0)) ) {
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
		enterRule(_localctx, 96, RULE_oper_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
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
		enterRule(_localctx, 98, RULE_tf_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
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
		case 44:
			return num_expr_sempred((Num_exprContext)_localctx, predIndex);
		case 45:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean num_expr_sempred(Num_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3b\u030c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\5\2i\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\7\5~\n\5\f\5\16\5\u0081\13\5\3\6\7\6\u0084\n\6\f\6\16"+
		"\6\u0087\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u0099\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00a8\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n"+
		"\u00b6\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c5"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u00cb\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00da\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00eb\n\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u010b"+
		"\n\22\f\22\16\22\u010e\13\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0124"+
		"\n\24\3\24\3\24\5\24\u0128\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0138\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u014a\n\24"+
		"\3\24\3\24\5\24\u014e\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0160\n\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0176\n\24\3\24\3\24\5\24\u017a\n\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u0190\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01a3\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01b0\n\25\3\25\3\25"+
		"\5\25\u01b4\n\25\3\25\3\25\5\25\u01b8\n\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\7"+
		"\30\u01cd\n\30\f\30\16\30\u01d0\13\30\3\30\5\30\u01d3\n\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\7\31\u01db\n\31\f\31\16\31\u01de\13\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01e9\n\32\f\32\16\32\u01ec\13"+
		"\32\3\32\3\32\3\33\3\33\3\33\7\33\u01f3\n\33\f\33\16\33\u01f6\13\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0200\n\34\f\34\16\34\u0203"+
		"\13\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u021a\n\37\f\37\16\37\u021d"+
		"\13\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\5\"\u022b\n\"\3#\3"+
		"#\3#\3#\3#\3#\7#\u0233\n#\f#\16#\u0236\13#\3#\5#\u0239\n#\3#\3#\3$\3$"+
		"\3$\3$\7$\u0241\n$\f$\16$\u0244\13$\3$\3$\3%\3%\3%\7%\u024b\n%\f%\16%"+
		"\u024e\13%\3%\5%\u0251\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\5*\u028b\n*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\5.\u02be\n.\3.\3.\3.\3.\7.\u02c4\n.\f.\16.\u02c7"+
		"\13.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02f1\n/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u02ff\n/\f/\16/\u0302\13/\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\2\4Z\\\64\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\t\4"+
		"\2\3\f99\4\2\r\17  \3\2<=\3\2CH\3\2NS\3\2TU\3\2VW\2\u034a\2f\3\2\2\2\4"+
		"l\3\2\2\2\6t\3\2\2\2\b\177\3\2\2\2\n\u0085\3\2\2\2\f\u0098\3\2\2\2\16"+
		"\u00a7\3\2\2\2\20\u00a9\3\2\2\2\22\u00c4\3\2\2\2\24\u00d9\3\2\2\2\26\u00ea"+
		"\3\2\2\2\30\u00ec\3\2\2\2\32\u00f0\3\2\2\2\34\u00f4\3\2\2\2\36\u00f9\3"+
		"\2\2\2 \u00fe\3\2\2\2\"\u0105\3\2\2\2$\u0112\3\2\2\2&\u01a2\3\2\2\2(\u01a4"+
		"\3\2\2\2*\u01bc\3\2\2\2,\u01c5\3\2\2\2.\u01ca\3\2\2\2\60\u01d4\3\2\2\2"+
		"\62\u01e1\3\2\2\2\64\u01ef\3\2\2\2\66\u01f9\3\2\2\28\u0206\3\2\2\2:\u0209"+
		"\3\2\2\2<\u020f\3\2\2\2>\u0220\3\2\2\2@\u0224\3\2\2\2B\u022a\3\2\2\2D"+
		"\u022c\3\2\2\2F\u023c\3\2\2\2H\u0247\3\2\2\2J\u0252\3\2\2\2L\u025b\3\2"+
		"\2\2N\u026a\3\2\2\2P\u027a\3\2\2\2R\u028a\3\2\2\2T\u028c\3\2\2\2V\u028e"+
		"\3\2\2\2X\u0290\3\2\2\2Z\u02bd\3\2\2\2\\\u02f0\3\2\2\2^\u0303\3\2\2\2"+
		"`\u0305\3\2\2\2b\u0307\3\2\2\2d\u0309\3\2\2\2fh\5\4\3\2gi\5\6\4\2hg\3"+
		"\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\2\2\3k\3\3\2\2\2lm\7\20\2\2mn\7\21\2\2"+
		"no\7Y\2\2op\7Z\2\2pq\7]\2\2qr\5\b\5\2rs\7^\2\2s\5\3\2\2\2tu\7\20\2\2u"+
		"v\7\22\2\2vw\7Y\2\2wx\7Z\2\2xy\7]\2\2yz\5\n\6\2z{\7^\2\2{\7\3\2\2\2|~"+
		"\5\f\7\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\t\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\5\16\b\2\u0083\u0082\3\2\2\2"+
		"\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\13"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0099\5\20\t\2\u0089\u0099\5\22\n\2"+
		"\u008a\u0099\5\26\f\2\u008b\u0099\5\"\22\2\u008c\u0099\5$\23\2\u008d\u0099"+
		"\5&\24\2\u008e\u0099\5(\25\2\u008f\u0099\5,\27\2\u0090\u0099\5.\30\2\u0091"+
		"\u0099\5\66\34\2\u0092\u0099\58\35\2\u0093\u0099\5:\36\2\u0094\u0099\5"+
		"<\37\2\u0095\u0099\5D#\2\u0096\u0099\5J&\2\u0097\u0099\5L\'\2\u0098\u0088"+
		"\3\2\2\2\u0098\u0089\3\2\2\2\u0098\u008a\3\2\2\2\u0098\u008b\3\2\2\2\u0098"+
		"\u008c\3\2\2\2\u0098\u008d\3\2\2\2\u0098\u008e\3\2\2\2\u0098\u008f\3\2"+
		"\2\2\u0098\u0090\3\2\2\2\u0098\u0091\3\2\2\2\u0098\u0092\3\2\2\2\u0098"+
		"\u0093\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0097\3\2\2\2\u0099\r\3\2\2\2\u009a\u00a8\5\24\13\2\u009b\u00a8"+
		"\5\26\f\2\u009c\u00a8\5\"\22\2\u009d\u00a8\5$\23\2\u009e\u00a8\5&\24\2"+
		"\u009f\u00a8\5(\25\2\u00a0\u00a8\5.\30\2\u00a1\u00a8\5\66\34\2\u00a2\u00a8"+
		"\58\35\2\u00a3\u00a8\5:\36\2\u00a4\u00a8\5<\37\2\u00a5\u00a8\5D#\2\u00a6"+
		"\u00a8\5N(\2\u00a7\u009a\3\2\2\2\u00a7\u009b\3\2\2\2\u00a7\u009c\3\2\2"+
		"\2\u00a7\u009d\3\2\2\2\u00a7\u009e\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a0"+
		"\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7"+
		"\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\17\3\2\2"+
		"\2\u00a9\u00aa\7\23\2\2\u00aa\u00ab\7Y\2\2\u00ab\u00ac\7<\2\2\u00ac\u00ad"+
		"\7?\2\2\u00ad\u00ae\7<\2\2\u00ae\u00af\7Z\2\2\u00af\u00b0\7@\2\2\u00b0"+
		"\21\3\2\2\2\u00b1\u00b2\5V,\2\u00b2\u00b5\7_\2\2\u00b3\u00b4\7A\2\2\u00b4"+
		"\u00b6\5\\/\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\7@\2\2\u00b8\u00c5\3\2\2\2\u00b9\u00ba\5V,\2\u00ba\u00bb"+
		"\7[\2\2\u00bb\u00bc\7\\\2\2\u00bc\u00bd\7_\2\2\u00bd\u00be\7A\2\2\u00be"+
		"\u00bf\7)\2\2\u00bf\u00c0\7Y\2\2\u00c0\u00c1\5Z.\2\u00c1\u00c2\7Z\2\2"+
		"\u00c2\u00c3\7@\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00b1\3\2\2\2\u00c4\u00b9"+
		"\3\2\2\2\u00c5\23\3\2\2\2\u00c6\u00c7\5V,\2\u00c7\u00ca\7_\2\2\u00c8\u00c9"+
		"\7A\2\2\u00c9\u00cb\5\\/\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd\u00da\3\2\2\2\u00ce\u00cf\5V,"+
		"\2\u00cf\u00d0\7[\2\2\u00d0\u00d1\7\\\2\2\u00d1\u00d2\7_\2\2\u00d2\u00d3"+
		"\7A\2\2\u00d3\u00d4\7)\2\2\u00d4\u00d5\7Y\2\2\u00d5\u00d6\5Z.\2\u00d6"+
		"\u00d7\7Z\2\2\u00d7\u00d8\7@\2\2\u00d8\u00da\3\2\2\2\u00d9\u00c6\3\2\2"+
		"\2\u00d9\u00ce\3\2\2\2\u00da\25\3\2\2\2\u00db\u00dc\5\30\r\2\u00dc\u00dd"+
		"\7@\2\2\u00dd\u00eb\3\2\2\2\u00de\u00df\5\32\16\2\u00df\u00e0\7@\2\2\u00e0"+
		"\u00eb\3\2\2\2\u00e1\u00e2\5\34\17\2\u00e2\u00e3\7@\2\2\u00e3\u00eb\3"+
		"\2\2\2\u00e4\u00e5\5\36\20\2\u00e5\u00e6\7@\2\2\u00e6\u00eb\3\2\2\2\u00e7"+
		"\u00e8\5 \21\2\u00e8\u00e9\7@\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00db\3\2"+
		"\2\2\u00ea\u00de\3\2\2\2\u00ea\u00e1\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea"+
		"\u00e7\3\2\2\2\u00eb\27\3\2\2\2\u00ec\u00ed\7_\2\2\u00ed\u00ee\7A\2\2"+
		"\u00ee\u00ef\5\\/\2\u00ef\31\3\2\2\2\u00f0\u00f1\7_\2\2\u00f1\u00f2\7"+
		"C\2\2\u00f2\u00f3\7C\2\2\u00f3\33\3\2\2\2\u00f4\u00f5\7_\2\2\u00f5\u00f6"+
		"\7C\2\2\u00f6\u00f7\7A\2\2\u00f7\u00f8\5Z.\2\u00f8\35\3\2\2\2\u00f9\u00fa"+
		"\7_\2\2\u00fa\u00fb\7D\2\2\u00fb\u00fc\7A\2\2\u00fc\u00fd\5Z.\2\u00fd"+
		"\37\3\2\2\2\u00fe\u00ff\7_\2\2\u00ff\u0100\7[\2\2\u0100\u0101\5Z.\2\u0101"+
		"\u0102\7\\\2\2\u0102\u0103\7A\2\2\u0103\u0104\5\\/\2\u0104!\3\2\2\2\u0105"+
		"\u0106\7\24\2\2\u0106\u0107\7Y\2\2\u0107\u010c\5\\/\2\u0108\u0109\7?\2"+
		"\2\u0109\u010b\5\\/\2\u010a\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0110\7Z\2\2\u0110\u0111\7@\2\2\u0111#\3\2\2\2\u0112\u0113\7\25\2\2\u0113"+
		"\u0114\7Y\2\2\u0114\u0115\5*\26\2\u0115\u0116\7Z\2\2\u0116\u0117\7@\2"+
		"\2\u0117%\3\2\2\2\u0118\u0119\7\27\2\2\u0119\u011a\7Y\2\2\u011a\u011b"+
		"\7+\2\2\u011b\u011c\7?\2\2\u011c\u011d\5Z.\2\u011d\u011e\7?\2\2\u011e"+
		"\u011f\5Z.\2\u011f\u0120\7?\2\2\u0120\u0123\5Z.\2\u0121\u0122\7?\2\2\u0122"+
		"\u0124\5Z.\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0127\3\2\2"+
		"\2\u0125\u0126\7?\2\2\u0126\u0128\5*\26\2\u0127\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\7Z\2\2\u012a\u012b\7@\2\2\u012b"+
		"\u01a3\3\2\2\2\u012c\u012d\7\27\2\2\u012d\u012e\7Y\2\2\u012e\u012f\7,"+
		"\2\2\u012f\u0130\7?\2\2\u0130\u0131\5Z.\2\u0131\u0132\7?\2\2\u0132\u0133"+
		"\5Z.\2\u0133\u0134\7?\2\2\u0134\u0137\5Z.\2\u0135\u0136\7?\2\2\u0136\u0138"+
		"\5*\26\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013a\7Z\2\2\u013a\u013b\7@\2\2\u013b\u01a3\3\2\2\2\u013c\u013d\7\27"+
		"\2\2\u013d\u013e\7Y\2\2\u013e\u013f\7-\2\2\u013f\u0140\7?\2\2\u0140\u0141"+
		"\5Z.\2\u0141\u0142\7?\2\2\u0142\u0143\5Z.\2\u0143\u0144\7?\2\2\u0144\u0145"+
		"\5Z.\2\u0145\u0146\7?\2\2\u0146\u0149\5Z.\2\u0147\u0148\7?\2\2\u0148\u014a"+
		"\5Z.\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014d\3\2\2\2\u014b"+
		"\u014c\7?\2\2\u014c\u014e\5*\26\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7Z\2\2\u0150\u0151\7@\2\2\u0151\u01a3"+
		"\3\2\2\2\u0152\u0153\7\27\2\2\u0153\u0154\7Y\2\2\u0154\u0155\7.\2\2\u0155"+
		"\u0156\7?\2\2\u0156\u0157\5Z.\2\u0157\u0158\7?\2\2\u0158\u0159\5Z.\2\u0159"+
		"\u015a\7?\2\2\u015a\u015b\5Z.\2\u015b\u015c\7?\2\2\u015c\u015f\5Z.\2\u015d"+
		"\u015e\7?\2\2\u015e\u0160\5*\26\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\u0162\7Z\2\2\u0162\u0163\7@\2\2\u0163\u01a3"+
		"\3\2\2\2\u0164\u0165\7\27\2\2\u0165\u0166\7Y\2\2\u0166\u0167\7/\2\2\u0167"+
		"\u0168\7?\2\2\u0168\u0169\5Z.\2\u0169\u016a\7?\2\2\u016a\u016b\5Z.\2\u016b"+
		"\u016c\7?\2\2\u016c\u016d\5Z.\2\u016d\u016e\7?\2\2\u016e\u016f\5Z.\2\u016f"+
		"\u0170\7?\2\2\u0170\u0171\5Z.\2\u0171\u0172\7?\2\2\u0172\u0175\5Z.\2\u0173"+
		"\u0174\7?\2\2\u0174\u0176\5Z.\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2"+
		"\2\u0176\u0179\3\2\2\2\u0177\u0178\7?\2\2\u0178\u017a\5*\26\2\u0179\u0177"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\7Z\2\2\u017c"+
		"\u017d\7@\2\2\u017d\u01a3\3\2\2\2\u017e\u017f\7\27\2\2\u017f\u0180\7Y"+
		"\2\2\u0180\u0181\7\60\2\2\u0181\u0182\7?\2\2\u0182\u0183\5Z.\2\u0183\u0184"+
		"\7?\2\2\u0184\u0185\5Z.\2\u0185\u0186\7?\2\2\u0186\u0187\5Z.\2\u0187\u0188"+
		"\7?\2\2\u0188\u0189\5Z.\2\u0189\u018a\7?\2\2\u018a\u018b\5Z.\2\u018b\u018c"+
		"\7?\2\2\u018c\u018f\5Z.\2\u018d\u018e\7?\2\2\u018e\u0190\5*\26\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\7Z"+
		"\2\2\u0192\u0193\7@\2\2\u0193\u01a3\3\2\2\2\u0194\u0195\7\27\2\2\u0195"+
		"\u0196\7Y\2\2\u0196\u0197\7_\2\2\u0197\u0198\7?\2\2\u0198\u0199\5Z.\2"+
		"\u0199\u019a\7?\2\2\u019a\u019b\5Z.\2\u019b\u019c\7?\2\2\u019c\u019d\5"+
		"Z.\2\u019d\u019e\7?\2\2\u019e\u019f\5Z.\2\u019f\u01a0\7Z\2\2\u01a0\u01a1"+
		"\7@\2\2\u01a1\u01a3\3\2\2\2\u01a2\u0118\3\2\2\2\u01a2\u012c\3\2\2\2\u01a2"+
		"\u013c\3\2\2\2\u01a2\u0152\3\2\2\2\u01a2\u0164\3\2\2\2\u01a2\u017e\3\2"+
		"\2\2\u01a2\u0194\3\2\2\2\u01a3\'\3\2\2\2\u01a4\u01a5\7\30\2\2\u01a5\u01a6"+
		"\7Y\2\2\u01a6\u01a7\5\\/\2\u01a7\u01a8\7?\2\2\u01a8\u01a9\5Z.\2\u01a9"+
		"\u01aa\7?\2\2\u01aa\u01ab\5Z.\2\u01ab\u01ac\7?\2\2\u01ac\u01af\5Z.\2\u01ad"+
		"\u01ae\7?\2\2\u01ae\u01b0\5Z.\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2"+
		"\2\u01b0\u01b3\3\2\2\2\u01b1\u01b2\7?\2\2\u01b2\u01b4\5*\26\2\u01b3\u01b1"+
		"\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b6\7?\2\2\u01b6"+
		"\u01b8\7>\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9\u01ba\7Z\2\2\u01ba\u01bb\7@\2\2\u01bb)\3\2\2\2\u01bc\u01bd"+
		"\7\26\2\2\u01bd\u01be\7Y\2\2\u01be\u01bf\5Z.\2\u01bf\u01c0\7?\2\2\u01c0"+
		"\u01c1\5Z.\2\u01c1\u01c2\7?\2\2\u01c2\u01c3\5Z.\2\u01c3\u01c4\7Z\2\2\u01c4"+
		"+\3\2\2\2\u01c5\u01c6\7\31\2\2\u01c6\u01c7\7Y\2\2\u01c7\u01c8\7Z\2\2\u01c8"+
		"\u01c9\7@\2\2\u01c9-\3\2\2\2\u01ca\u01ce\5\60\31\2\u01cb\u01cd\5\62\32"+
		"\2\u01cc\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf"+
		"\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d3\5\64\33\2"+
		"\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3/\3\2\2\2\u01d4\u01d5\7"+
		"\32\2\2\u01d5\u01d6\7Y\2\2\u01d6\u01d7\5\\/\2\u01d7\u01d8\7Z\2\2\u01d8"+
		"\u01dc\7]\2\2\u01d9\u01db\5\16\b\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2"+
		"\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01df\u01e0\7^\2\2\u01e0\61\3\2\2\2\u01e1\u01e2\7\33\2"+
		"\2\u01e2\u01e3\7\32\2\2\u01e3\u01e4\7Y\2\2\u01e4\u01e5\5\\/\2\u01e5\u01e6"+
		"\7Z\2\2\u01e6\u01ea\7]\2\2\u01e7\u01e9\5\16\b\2\u01e8\u01e7\3\2\2\2\u01e9"+
		"\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2"+
		"\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee\7^\2\2\u01ee\63\3\2\2\2\u01ef\u01f0"+
		"\7\33\2\2\u01f0\u01f4\7]\2\2\u01f1\u01f3\5\16\b\2\u01f2\u01f1\3\2\2\2"+
		"\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7"+
		"\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f8\7^\2\2\u01f8\65\3\2\2\2\u01f9"+
		"\u01fa\7\34\2\2\u01fa\u01fb\7Y\2\2\u01fb\u01fc\5\\/\2\u01fc\u01fd\7Z\2"+
		"\2\u01fd\u0201\7]\2\2\u01fe\u0200\5\16\b\2\u01ff\u01fe\3\2\2\2\u0200\u0203"+
		"\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0204\u0205\7^\2\2\u0205\67\3\2\2\2\u0206\u0207\7\35\2"+
		"\2\u0207\u0208\7@\2\2\u02089\3\2\2\2\u0209\u020a\7\36\2\2\u020a\u020b"+
		"\7Y\2\2\u020b\u020c\5Z.\2\u020c\u020d\7Z\2\2\u020d\u020e\7@\2\2\u020e"+
		";\3\2\2\2\u020f\u0210\7\37\2\2\u0210\u0211\7Y\2\2\u0211\u0212\5> \2\u0212"+
		"\u0213\7@\2\2\u0213\u0214\5@!\2\u0214\u0215\7@\2\2\u0215\u0216\5B\"\2"+
		"\u0216\u0217\7Z\2\2\u0217\u021b\7]\2\2\u0218\u021a\5\16\b\2\u0219\u0218"+
		"\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021e\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f\7^\2\2\u021f=\3\2\2\2\u0220"+
		"\u0221\7_\2\2\u0221\u0222\7A\2\2\u0222\u0223\5Z.\2\u0223?\3\2\2\2\u0224"+
		"\u0225\5\\/\2\u0225A\3\2\2\2\u0226\u022b\5\30\r\2\u0227\u022b\5\32\16"+
		"\2\u0228\u022b\5\34\17\2\u0229\u022b\5\36\20\2\u022a\u0226\3\2\2\2\u022a"+
		"\u0227\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u0229\3\2\2\2\u022bC\3\2\2\2"+
		"\u022c\u022d\7#\2\2\u022d\u022e\7Y\2\2\u022e\u022f\5\\/\2\u022f\u0230"+
		"\7Z\2\2\u0230\u0234\7]\2\2\u0231\u0233\5F$\2\u0232\u0231\3\2\2\2\u0233"+
		"\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0238\3\2"+
		"\2\2\u0236\u0234\3\2\2\2\u0237\u0239\5H%\2\u0238\u0237\3\2\2\2\u0238\u0239"+
		"\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\7^\2\2\u023bE\3\2\2\2\u023c\u023d"+
		"\7$\2\2\u023d\u023e\5\\/\2\u023e\u0242\7B\2\2\u023f\u0241\5\16\b\2\u0240"+
		"\u023f\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2"+
		"\2\2\u0243\u0245\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0246\58\35\2\u0246"+
		"G\3\2\2\2\u0247\u0248\7%\2\2\u0248\u024c\7B\2\2\u0249\u024b\5\16\b\2\u024a"+
		"\u0249\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0251\58\35\2\u0250"+
		"\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251I\3\2\2\2\u0252\u0253\7!\2\2\u0253"+
		"\u0254\7_\2\2\u0254\u0255\7A\2\2\u0255\u0256\7\"\2\2\u0256\u0257\7Y\2"+
		"\2\u0257\u0258\7>\2\2\u0258\u0259\7Z\2\2\u0259\u025a\7@\2\2\u025aK\3\2"+
		"\2\2\u025b\u025c\7&\2\2\u025c\u025d\7_\2\2\u025d\u025e\7A\2\2\u025e\u025f"+
		"\7\'\2\2\u025f\u0260\7Y\2\2\u0260\u0261\7_\2\2\u0261\u0262\7?\2\2\u0262"+
		"\u0263\5Z.\2\u0263\u0264\7?\2\2\u0264\u0265\5Z.\2\u0265\u0266\7?\2\2\u0266"+
		"\u0267\5Z.\2\u0267\u0268\7Z\2\2\u0268\u0269\7@\2\2\u0269M\3\2\2\2\u026a"+
		"\u026b\7(\2\2\u026b\u026c\7Y\2\2\u026c\u026d\7_\2\2\u026d\u026e\7?\2\2"+
		"\u026e\u026f\5Z.\2\u026f\u0270\7?\2\2\u0270\u0271\5Z.\2\u0271\u0272\7"+
		"?\2\2\u0272\u0273\5Z.\2\u0273\u0274\7?\2\2\u0274\u0275\5Z.\2\u0275\u0276"+
		"\7?\2\2\u0276\u0277\5Z.\2\u0277\u0278\7Z\2\2\u0278\u0279\7@\2\2\u0279"+
		"O\3\2\2\2\u027a\u027b\7*\2\2\u027b\u027c\7Y\2\2\u027c\u027d\7_\2\2\u027d"+
		"\u027e\7Z\2\2\u027eQ\3\2\2\2\u027f\u028b\7\61\2\2\u0280\u028b\7\62\2\2"+
		"\u0281\u028b\7\63\2\2\u0282\u028b\7\64\2\2\u0283\u028b\7\65\2\2\u0284"+
		"\u028b\7\66\2\2\u0285\u028b\7\67\2\2\u0286\u028b\78\2\2\u0287\u028b\7"+
		":\2\2\u0288\u028b\7;\2\2\u0289\u028b\5T+\2\u028a\u027f\3\2\2\2\u028a\u0280"+
		"\3\2\2\2\u028a\u0281\3\2\2\2\u028a\u0282\3\2\2\2\u028a\u0283\3\2\2\2\u028a"+
		"\u0284\3\2\2\2\u028a\u0285\3\2\2\2\u028a\u0286\3\2\2\2\u028a\u0287\3\2"+
		"\2\2\u028a\u0288\3\2\2\2\u028a\u0289\3\2\2\2\u028bS\3\2\2\2\u028c\u028d"+
		"\t\2\2\2\u028dU\3\2\2\2\u028e\u028f\t\3\2\2\u028fW\3\2\2\2\u0290\u0291"+
		"\t\4\2\2\u0291Y\3\2\2\2\u0292\u0293\b.\1\2\u0293\u0294\7Y\2\2\u0294\u0295"+
		"\5Z.\2\u0295\u0296\7Z\2\2\u0296\u02be\3\2\2\2\u0297\u0298\7D\2\2\u0298"+
		"\u0299\7Y\2\2\u0299\u029a\5Z.\2\u029a\u029b\7Z\2\2\u029b\u02be\3\2\2\2"+
		"\u029c\u029d\7D\2\2\u029d\u02be\7_\2\2\u029e\u029f\7D\2\2\u029f\u02be"+
		"\5X-\2\u02a0\u02be\5X-\2\u02a1\u02be\5R*\2\u02a2\u02be\7_\2\2\u02a3\u02a4"+
		"\7I\2\2\u02a4\u02a5\7Y\2\2\u02a5\u02a6\5Z.\2\u02a6\u02a7\7Z\2\2\u02a7"+
		"\u02be\3\2\2\2\u02a8\u02a9\7J\2\2\u02a9\u02aa\7Y\2\2\u02aa\u02ab\5Z.\2"+
		"\u02ab\u02ac\7Z\2\2\u02ac\u02be\3\2\2\2\u02ad\u02be\7K\2\2\u02ae\u02af"+
		"\7L\2\2\u02af\u02b0\7Y\2\2\u02b0\u02b1\5Z.\2\u02b1\u02b2\7?\2\2\u02b2"+
		"\u02b3\5Z.\2\u02b3\u02b4\7Z\2\2\u02b4\u02be\3\2\2\2\u02b5\u02b6\7M\2\2"+
		"\u02b6\u02b7\7Y\2\2\u02b7\u02b8\5Z.\2\u02b8\u02b9\7?\2\2\u02b9\u02ba\5"+
		"Z.\2\u02ba\u02bb\7Z\2\2\u02bb\u02be\3\2\2\2\u02bc\u02be\5P)\2\u02bd\u0292"+
		"\3\2\2\2\u02bd\u0297\3\2\2\2\u02bd\u029c\3\2\2\2\u02bd\u029e\3\2\2\2\u02bd"+
		"\u02a0\3\2\2\2\u02bd\u02a1\3\2\2\2\u02bd\u02a2\3\2\2\2\u02bd\u02a3\3\2"+
		"\2\2\u02bd\u02a8\3\2\2\2\u02bd\u02ad\3\2\2\2\u02bd\u02ae\3\2\2\2\u02bd"+
		"\u02b5\3\2\2\2\u02bd\u02bc\3\2\2\2\u02be\u02c5\3\2\2\2\u02bf\u02c0\f\20"+
		"\2\2\u02c0\u02c1\5^\60\2\u02c1\u02c2\5Z.\21\u02c2\u02c4\3\2\2\2\u02c3"+
		"\u02bf\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2"+
		"\2\2\u02c6[\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c9\b/\1\2\u02c9\u02ca"+
		"\7Y\2\2\u02ca\u02cb\5\\/\2\u02cb\u02cc\7Z\2\2\u02cc\u02f1\3\2\2\2\u02cd"+
		"\u02ce\7D\2\2\u02ce\u02cf\7Y\2\2\u02cf\u02d0\5\\/\2\u02d0\u02d1\7Z\2\2"+
		"\u02d1\u02f1\3\2\2\2\u02d2\u02d3\7X\2\2\u02d3\u02d4\7Y\2\2\u02d4\u02d5"+
		"\5\\/\2\u02d5\u02d6\7Z\2\2\u02d6\u02f1\3\2\2\2\u02d7\u02d8\7I\2\2\u02d8"+
		"\u02d9\7Y\2\2\u02d9\u02da\5Z.\2\u02da\u02db\7Z\2\2\u02db\u02f1\3\2\2\2"+
		"\u02dc\u02dd\7J\2\2\u02dd\u02de\7Y\2\2\u02de\u02df\5Z.\2\u02df\u02e0\7"+
		"Z\2\2\u02e0\u02f1\3\2\2\2\u02e1\u02f1\7K\2\2\u02e2\u02f1\7_\2\2\u02e3"+
		"\u02f1\5R*\2\u02e4\u02f1\5X-\2\u02e5\u02f1\7>\2\2\u02e6\u02e7\7D\2\2\u02e7"+
		"\u02f1\7_\2\2\u02e8\u02e9\7D\2\2\u02e9\u02f1\5X-\2\u02ea\u02eb\7X\2\2"+
		"\u02eb\u02f1\7_\2\2\u02ec\u02f1\5d\63\2\u02ed\u02ee\7X\2\2\u02ee\u02f1"+
		"\5d\63\2\u02ef\u02f1\5P)\2\u02f0\u02c8\3\2\2\2\u02f0\u02cd\3\2\2\2\u02f0"+
		"\u02d2\3\2\2\2\u02f0\u02d7\3\2\2\2\u02f0\u02dc\3\2\2\2\u02f0\u02e1\3\2"+
		"\2\2\u02f0\u02e2\3\2\2\2\u02f0\u02e3\3\2\2\2\u02f0\u02e4\3\2\2\2\u02f0"+
		"\u02e5\3\2\2\2\u02f0\u02e6\3\2\2\2\u02f0\u02e8\3\2\2\2\u02f0\u02ea\3\2"+
		"\2\2\u02f0\u02ec\3\2\2\2\u02f0\u02ed\3\2\2\2\u02f0\u02ef\3\2\2\2\u02f1"+
		"\u0300\3\2\2\2\u02f2\u02f3\f\25\2\2\u02f3\u02f4\5^\60\2\u02f4\u02f5\5"+
		"\\/\26\u02f5\u02ff\3\2\2\2\u02f6\u02f7\f\24\2\2\u02f7\u02f8\5`\61\2\u02f8"+
		"\u02f9\5\\/\25\u02f9\u02ff\3\2\2\2\u02fa\u02fb\f\23\2\2\u02fb\u02fc\5"+
		"b\62\2\u02fc\u02fd\5\\/\24\u02fd\u02ff\3\2\2\2\u02fe\u02f2\3\2\2\2\u02fe"+
		"\u02f6\3\2\2\2\u02fe\u02fa\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2"+
		"\2\2\u0300\u0301\3\2\2\2\u0301]\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u0304"+
		"\t\5\2\2\u0304_\3\2\2\2\u0305\u0306\t\6\2\2\u0306a\3\2\2\2\u0307\u0308"+
		"\t\7\2\2\u0308c\3\2\2\2\u0309\u030a\t\b\2\2\u030ae\3\2\2\2-h\177\u0085"+
		"\u0098\u00a7\u00b5\u00c4\u00ca\u00d9\u00ea\u010c\u0123\u0127\u0137\u0149"+
		"\u014d\u015f\u0175\u0179\u018f\u01a2\u01af\u01b3\u01b7\u01ce\u01d2\u01dc"+
		"\u01ea\u01f4\u0201\u021b\u022a\u0234\u0238\u0242\u024c\u0250\u028a\u02bd"+
		"\u02c5\u02f0\u02fe\u0300";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}