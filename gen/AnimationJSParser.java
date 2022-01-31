// Generated from /home/sebastian/Desktop/animationJS/grammar/AnimationJS.g4 by ANTLR 4.9.2
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
		ANIM=38, CIRCLE=39, FILLCIRCLE=40, RECT=41, FILLRECT=42, TRIANGLE=43, 
		FILLTRIANGLE=44, KEYRELEASED=45, KEYPRESSED=46, MOUSEX=47, MOUSEY=48, 
		CLICK=49, MOUSEXCLICK=50, MOUSEYCLICK=51, FRAMES=52, LEFT=53, CANVAS_WIDTH=54, 
		CANVAS_HEIGHT=55, DT_INT=56, DT_FLOAT=57, DT_STRING=58, COMMA=59, PYC=60, 
		EQU=61, DOSP=62, SUMA=63, RESTA=64, MULTIPLICACION=65, DIVISION=66, MODULO=67, 
		POTENCIA=68, SIN=69, COS=70, PI=71, RANDOM=72, INTRANDOM=73, IGUALDAD=74, 
		DIFERENTE=75, MAYOR=76, MENOR=77, MAIGUAL=78, MEIGUAL=79, AND=80, OR=81, 
		TRUE=82, FALSE=83, NEGACION=84, PAR_IZQ=85, PAR_DER=86, COR_IZQ=87, COR_DER=88, 
		LLAVE_IZQ=89, LLAVE_DER=90, ID=91, WS=92, LINECOMMENT=93, COMMENT=94;
	public static final int
		RULE_code = 0, RULE_setup = 1, RULE_animate = 2, RULE_main_commands = 3, 
		RULE_commands = 4, RULE_m_command = 5, RULE_command = 6, RULE_setCanvas = 7, 
		RULE_declarationG = 8, RULE_declarationL = 9, RULE_assignation = 10, RULE_assigUsual = 11, 
		RULE_assigPlPl = 12, RULE_assigPlEq = 13, RULE_assigMinEq = 14, RULE_console = 15, 
		RULE_setBackground = 16, RULE_draw = 17, RULE_text = 18, RULE_rgb = 19, 
		RULE_hideCursor = 20, RULE_ifStr = 21, RULE_ifPart = 22, RULE_elseIfPart = 23, 
		RULE_elsePart = 24, RULE_whileStr = 25, RULE_breakStr = 26, RULE_waitStr = 27, 
		RULE_forStr = 28, RULE_forDecl = 29, RULE_forExpr = 30, RULE_forAssig = 31, 
		RULE_switchStr = 32, RULE_switchCase = 33, RULE_switchDefault = 34, RULE_declarationImg = 35, 
		RULE_declarationAnim = 36, RULE_anim = 37, RULE_system_vars = 38, RULE_key_vars = 39, 
		RULE_dtype = 40, RULE_dt_numeric = 41, RULE_num_expr = 42, RULE_expr = 43, 
		RULE_oper_num = 44, RULE_oper_comp = 45, RULE_oper_log = 46, RULE_tf_log = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "setup", "animate", "main_commands", "commands", "m_command", 
			"command", "setCanvas", "declarationG", "declarationL", "assignation", 
			"assigUsual", "assigPlPl", "assigPlEq", "assigMinEq", "console", "setBackground", 
			"draw", "text", "rgb", "hideCursor", "ifStr", "ifPart", "elseIfPart", 
			"elsePart", "whileStr", "breakStr", "waitStr", "forStr", "forDecl", "forExpr", 
			"forAssig", "switchStr", "switchCase", "switchDefault", "declarationImg", 
			"declarationAnim", "anim", "system_vars", "key_vars", "dtype", "dt_numeric", 
			"num_expr", "expr", "oper_num", "oper_comp", "oper_log", "tf_log"
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
			"'case'", "'default'", "'animation'", "'Nanimation'", "'Anim'", "'Circle'", 
			"'FillCircle'", "'Rect'", "'FillRect'", "'Triangle'", "'FillTriangle'", 
			"'KEYRELEASED'", "'KEYPRESSED'", "'MOUSEX'", "'MOUSEY'", "'CLICK'", "'MOUSEXCLICK'", 
			"'MOUSEYCLICK'", "'FRAMES'", "'LEFT'", "'CANVAS_WIDTH'", "'CANVAS_HEIGHT'", 
			null, null, null, "','", "';'", "'='", "':'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'^'", "'Sin'", "'Cos'", "'PI'", "'Random'", "'IntRandom'", "'=='", 
			"'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'true'", "'false'", 
			"'!'", "'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "FUNCTION", "SETUP", "ANIMATE", "SETCANVAS", "CONSOLE", "SETBACKGROUND", 
			"RGB", "DRAW", "TEXT", "HIDECURSOR", "IF", "ELSE", "WHILE", "BREAK", 
			"WAIT", "FOR", "INT", "IMG", "SRC", "SWITCH", "CASE", "DEFAULT", "ANIMATION", 
			"NANIMATION", "ANIM", "CIRCLE", "FILLCIRCLE", "RECT", "FILLRECT", "TRIANGLE", 
			"FILLTRIANGLE", "KEYRELEASED", "KEYPRESSED", "MOUSEX", "MOUSEY", "CLICK", 
			"MOUSEXCLICK", "MOUSEYCLICK", "FRAMES", "LEFT", "CANVAS_WIDTH", "CANVAS_HEIGHT", 
			"DT_INT", "DT_FLOAT", "DT_STRING", "COMMA", "PYC", "EQU", "DOSP", "SUMA", 
			"RESTA", "MULTIPLICACION", "DIVISION", "MODULO", "POTENCIA", "SIN", "COS", 
			"PI", "RANDOM", "INTRANDOM", "IGUALDAD", "DIFERENTE", "MAYOR", "MENOR", 
			"MAIGUAL", "MEIGUAL", "AND", "OR", "TRUE", "FALSE", "NEGACION", "PAR_IZQ", 
			"PAR_DER", "COR_IZQ", "COR_DER", "LLAVE_IZQ", "LLAVE_DER", "ID", "WS", 
			"LINECOMMENT", "COMMENT"
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
			setState(96);
			setup();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(97);
				animate();
				}
			}

			setState(100);
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
			setState(102);
			match(FUNCTION);
			setState(103);
			match(SETUP);
			setState(104);
			match(PAR_IZQ);
			setState(105);
			match(PAR_DER);
			setState(106);
			match(LLAVE_IZQ);
			setState(107);
			main_commands();
			setState(108);
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
			setState(110);
			match(FUNCTION);
			setState(111);
			match(ANIMATE);
			setState(112);
			match(PAR_IZQ);
			setState(113);
			match(PAR_DER);
			setState(114);
			match(LLAVE_IZQ);
			setState(115);
			commands();
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
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << SETCANVAS) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << HIDECURSOR) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << IMG) | (1L << SWITCH) | (1L << ANIMATION))) != 0) || _la==ID) {
				{
				{
				setState(118);
				m_command();
				}
				}
				setState(123);
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
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << SWITCH) | (1L << ANIM))) != 0) || _la==ID) {
				{
				{
				setState(124);
				command();
				}
				}
				setState(129);
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
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SETCANVAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				setCanvas();
				}
				break;
			case T__10:
			case T__11:
			case T__12:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				declarationG();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				assignation();
				}
				break;
			case CONSOLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				console();
				}
				break;
			case SETBACKGROUND:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				setBackground();
				}
				break;
			case DRAW:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				draw();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				text();
				}
				break;
			case HIDECURSOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
				hideCursor();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 9);
				{
				setState(138);
				ifStr();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 10);
				{
				setState(139);
				whileStr();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 11);
				{
				setState(140);
				breakStr();
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 12);
				{
				setState(141);
				waitStr();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 13);
				{
				setState(142);
				forStr();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 14);
				{
				setState(143);
				switchStr();
				}
				break;
			case IMG:
				enterOuterAlt(_localctx, 15);
				{
				setState(144);
				declarationImg();
				}
				break;
			case ANIMATION:
				enterOuterAlt(_localctx, 16);
				{
				setState(145);
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
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case T__12:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				declarationL();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				assignation();
				}
				break;
			case CONSOLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				console();
				}
				break;
			case SETBACKGROUND:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				setBackground();
				}
				break;
			case DRAW:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				draw();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				text();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(154);
				ifStr();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(155);
				whileStr();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 9);
				{
				setState(156);
				breakStr();
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 10);
				{
				setState(157);
				waitStr();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 11);
				{
				setState(158);
				forStr();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 12);
				{
				setState(159);
				switchStr();
				}
				break;
			case ANIM:
				enterOuterAlt(_localctx, 13);
				{
				setState(160);
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
			setState(163);
			match(SETCANVAS);
			setState(164);
			match(PAR_IZQ);
			setState(165);
			match(DT_INT);
			setState(166);
			match(COMMA);
			setState(167);
			match(DT_INT);
			setState(168);
			match(PAR_DER);
			setState(169);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			dtype();
			setState(172);
			match(ID);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQU) {
				{
				setState(173);
				match(EQU);
				setState(174);
				expr(0);
				}
			}

			setState(177);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			dtype();
			setState(180);
			match(ID);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQU) {
				{
				setState(181);
				match(EQU);
				setState(182);
				expr(0);
				}
			}

			setState(185);
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
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				assigUsual();
				setState(188);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				assigPlPl();
				setState(191);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				assigPlEq();
				setState(194);
				match(PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				assigMinEq();
				setState(197);
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
			setState(201);
			match(ID);
			setState(202);
			match(EQU);
			setState(203);
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
			setState(205);
			match(ID);
			setState(206);
			match(SUMA);
			setState(207);
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
			setState(209);
			match(ID);
			setState(210);
			match(SUMA);
			setState(211);
			match(EQU);
			setState(212);
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
			setState(214);
			match(ID);
			setState(215);
			match(RESTA);
			setState(216);
			match(EQU);
			setState(217);
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
		enterRule(_localctx, 30, RULE_console);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(CONSOLE);
			setState(220);
			match(PAR_IZQ);
			setState(221);
			expr(0);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(222);
				match(COMMA);
				setState(223);
				expr(0);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(PAR_DER);
			setState(230);
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
		enterRule(_localctx, 32, RULE_setBackground);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(SETBACKGROUND);
			setState(233);
			match(PAR_IZQ);
			setState(234);
			rgb();
			setState(235);
			match(PAR_DER);
			setState(236);
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
		enterRule(_localctx, 34, RULE_draw);
		int _la;
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(DRAW);
				setState(239);
				match(PAR_IZQ);
				setState(240);
				match(CIRCLE);
				setState(241);
				match(COMMA);
				setState(242);
				num_expr(0);
				setState(243);
				match(COMMA);
				setState(244);
				num_expr(0);
				setState(245);
				match(COMMA);
				setState(246);
				num_expr(0);
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(247);
					match(COMMA);
					setState(248);
					num_expr(0);
					}
					break;
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(251);
					match(COMMA);
					setState(252);
					rgb();
					}
				}

				setState(255);
				match(PAR_DER);
				setState(256);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(DRAW);
				setState(259);
				match(PAR_IZQ);
				setState(260);
				match(FILLCIRCLE);
				setState(261);
				match(COMMA);
				setState(262);
				num_expr(0);
				setState(263);
				match(COMMA);
				setState(264);
				num_expr(0);
				setState(265);
				match(COMMA);
				setState(266);
				num_expr(0);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(267);
					match(COMMA);
					setState(268);
					rgb();
					}
				}

				setState(271);
				match(PAR_DER);
				setState(272);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(DRAW);
				setState(275);
				match(PAR_IZQ);
				setState(276);
				match(RECT);
				setState(277);
				match(COMMA);
				setState(278);
				num_expr(0);
				setState(279);
				match(COMMA);
				setState(280);
				num_expr(0);
				setState(281);
				match(COMMA);
				setState(282);
				num_expr(0);
				setState(283);
				match(COMMA);
				setState(284);
				num_expr(0);
				setState(287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(285);
					match(COMMA);
					setState(286);
					num_expr(0);
					}
					break;
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(289);
					match(COMMA);
					setState(290);
					rgb();
					}
				}

				setState(293);
				match(PAR_DER);
				setState(294);
				match(PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				match(DRAW);
				setState(297);
				match(PAR_IZQ);
				setState(298);
				match(FILLRECT);
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				match(DRAW);
				setState(315);
				match(PAR_IZQ);
				setState(316);
				match(TRIANGLE);
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
				setState(325);
				match(COMMA);
				setState(326);
				num_expr(0);
				setState(327);
				match(COMMA);
				setState(328);
				num_expr(0);
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(329);
					match(COMMA);
					setState(330);
					num_expr(0);
					}
					break;
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(333);
					match(COMMA);
					setState(334);
					rgb();
					}
				}

				setState(337);
				match(PAR_DER);
				setState(338);
				match(PYC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(340);
				match(DRAW);
				setState(341);
				match(PAR_IZQ);
				setState(342);
				match(FILLTRIANGLE);
				setState(343);
				match(COMMA);
				setState(344);
				num_expr(0);
				setState(345);
				match(COMMA);
				setState(346);
				num_expr(0);
				setState(347);
				match(COMMA);
				setState(348);
				num_expr(0);
				setState(349);
				match(COMMA);
				setState(350);
				num_expr(0);
				setState(351);
				match(COMMA);
				setState(352);
				num_expr(0);
				setState(353);
				match(COMMA);
				setState(354);
				num_expr(0);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(355);
					match(COMMA);
					setState(356);
					rgb();
					}
				}

				setState(359);
				match(PAR_DER);
				setState(360);
				match(PYC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(362);
				match(DRAW);
				setState(363);
				match(PAR_IZQ);
				setState(364);
				match(ID);
				setState(365);
				match(COMMA);
				setState(366);
				num_expr(0);
				setState(367);
				match(COMMA);
				setState(368);
				num_expr(0);
				setState(369);
				match(COMMA);
				setState(370);
				num_expr(0);
				setState(371);
				match(COMMA);
				setState(372);
				num_expr(0);
				setState(373);
				match(PAR_DER);
				setState(374);
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
		enterRule(_localctx, 36, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(TEXT);
			setState(379);
			match(PAR_IZQ);
			setState(380);
			expr(0);
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
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(391);
				match(COMMA);
				setState(392);
				rgb();
				}
				break;
			}
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(395);
				match(COMMA);
				setState(396);
				match(DT_STRING);
				}
			}

			setState(399);
			match(PAR_DER);
			setState(400);
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
		enterRule(_localctx, 38, RULE_rgb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(RGB);
			setState(403);
			match(PAR_IZQ);
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
		enterRule(_localctx, 40, RULE_hideCursor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(HIDECURSOR);
			setState(412);
			match(PAR_IZQ);
			setState(413);
			match(PAR_DER);
			setState(414);
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
		enterRule(_localctx, 42, RULE_ifStr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			ifPart();
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(417);
					elseIfPart();
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(423);
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
		enterRule(_localctx, 44, RULE_ifPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(IF);
			setState(427);
			match(PAR_IZQ);
			setState(428);
			expr(0);
			setState(429);
			match(PAR_DER);
			setState(430);
			match(LLAVE_IZQ);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << SWITCH) | (1L << ANIM))) != 0) || _la==ID) {
				{
				{
				setState(431);
				command();
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437);
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
		enterRule(_localctx, 46, RULE_elseIfPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(ELSE);
			setState(440);
			match(IF);
			setState(441);
			match(PAR_IZQ);
			setState(442);
			expr(0);
			setState(443);
			match(PAR_DER);
			setState(444);
			match(LLAVE_IZQ);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << SWITCH) | (1L << ANIM))) != 0) || _la==ID) {
				{
				{
				setState(445);
				command();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
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
		enterRule(_localctx, 48, RULE_elsePart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(ELSE);
			setState(454);
			match(LLAVE_IZQ);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << SWITCH) | (1L << ANIM))) != 0) || _la==ID) {
				{
				{
				setState(455);
				command();
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(461);
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
		enterRule(_localctx, 50, RULE_whileStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(WHILE);
			setState(464);
			match(PAR_IZQ);
			setState(465);
			expr(0);
			setState(466);
			match(PAR_DER);
			setState(467);
			match(LLAVE_IZQ);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << SWITCH) | (1L << ANIM))) != 0) || _la==ID) {
				{
				{
				setState(468);
				command();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
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
		enterRule(_localctx, 52, RULE_breakStr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(BREAK);
			setState(477);
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
		enterRule(_localctx, 54, RULE_waitStr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(WAIT);
			setState(480);
			match(PAR_IZQ);
			setState(481);
			num_expr(0);
			setState(482);
			match(PAR_DER);
			setState(483);
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
		enterRule(_localctx, 56, RULE_forStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(FOR);
			setState(486);
			match(PAR_IZQ);
			setState(487);
			forDecl();
			setState(488);
			match(PYC);
			setState(489);
			forExpr();
			setState(490);
			match(PYC);
			setState(491);
			forAssig();
			setState(492);
			match(PAR_DER);
			setState(493);
			match(LLAVE_IZQ);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << TEXT) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << WAIT) | (1L << FOR) | (1L << INT) | (1L << SWITCH) | (1L << ANIM))) != 0) || _la==ID) {
				{
				{
				setState(494);
				command();
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500);
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
		enterRule(_localctx, 58, RULE_forDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(ID);
			setState(503);
			match(EQU);
			setState(504);
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
		enterRule(_localctx, 60, RULE_forExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
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
		enterRule(_localctx, 62, RULE_forAssig);
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				assigUsual();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				assigPlPl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				assigPlEq();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(511);
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
		enterRule(_localctx, 64, RULE_switchStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(SWITCH);
			setState(515);
			match(PAR_IZQ);
			setState(516);
			expr(0);
			setState(517);
			match(PAR_DER);
			setState(518);
			match(LLAVE_IZQ);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(519);
				switchCase();
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(525);
				switchDefault();
				}
			}

			setState(528);
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
		enterRule(_localctx, 66, RULE_switchCase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(CASE);
			setState(531);
			expr(0);
			setState(532);
			match(DOSP);
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(533);
					command();
					}
					} 
				}
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(539);
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
		enterRule(_localctx, 68, RULE_switchDefault);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(DEFAULT);
			setState(542);
			match(DOSP);
			setState(546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(543);
					command();
					}
					} 
				}
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK) {
				{
				setState(549);
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
		enterRule(_localctx, 70, RULE_declarationImg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(IMG);
			setState(553);
			match(ID);
			setState(554);
			match(EQU);
			setState(555);
			match(SRC);
			setState(556);
			match(PAR_IZQ);
			setState(557);
			match(DT_STRING);
			setState(558);
			match(PAR_DER);
			setState(559);
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
		enterRule(_localctx, 72, RULE_declarationAnim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(ANIMATION);
			setState(562);
			match(ID);
			setState(563);
			match(EQU);
			setState(564);
			match(NANIMATION);
			setState(565);
			match(PAR_IZQ);
			setState(566);
			match(ID);
			setState(567);
			match(COMMA);
			setState(568);
			num_expr(0);
			setState(569);
			match(COMMA);
			setState(570);
			num_expr(0);
			setState(571);
			match(COMMA);
			setState(572);
			num_expr(0);
			setState(573);
			match(PAR_DER);
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
		enterRule(_localctx, 74, RULE_anim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(ANIM);
			setState(577);
			match(PAR_IZQ);
			setState(578);
			match(ID);
			setState(579);
			match(COMMA);
			setState(580);
			num_expr(0);
			setState(581);
			match(COMMA);
			setState(582);
			num_expr(0);
			setState(583);
			match(COMMA);
			setState(584);
			num_expr(0);
			setState(585);
			match(COMMA);
			setState(586);
			num_expr(0);
			setState(587);
			match(COMMA);
			setState(588);
			num_expr(0);
			setState(589);
			match(PAR_DER);
			setState(590);
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
		enterRule(_localctx, 76, RULE_system_vars);
		try {
			setState(603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYRELEASED:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				match(KEYRELEASED);
				}
				break;
			case KEYPRESSED:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				match(KEYPRESSED);
				}
				break;
			case MOUSEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(594);
				match(MOUSEX);
				}
				break;
			case MOUSEY:
				enterOuterAlt(_localctx, 4);
				{
				setState(595);
				match(MOUSEY);
				}
				break;
			case CLICK:
				enterOuterAlt(_localctx, 5);
				{
				setState(596);
				match(CLICK);
				}
				break;
			case MOUSEXCLICK:
				enterOuterAlt(_localctx, 6);
				{
				setState(597);
				match(MOUSEXCLICK);
				}
				break;
			case MOUSEYCLICK:
				enterOuterAlt(_localctx, 7);
				{
				setState(598);
				match(MOUSEYCLICK);
				}
				break;
			case FRAMES:
				enterOuterAlt(_localctx, 8);
				{
				setState(599);
				match(FRAMES);
				}
				break;
			case CANVAS_WIDTH:
				enterOuterAlt(_localctx, 9);
				{
				setState(600);
				match(CANVAS_WIDTH);
				}
				break;
			case CANVAS_HEIGHT:
				enterOuterAlt(_localctx, 10);
				{
				setState(601);
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
				setState(602);
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
		enterRule(_localctx, 78, RULE_key_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
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
		enterRule(_localctx, 80, RULE_dtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
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
		enterRule(_localctx, 82, RULE_dt_numeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_num_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(612);
				match(PAR_IZQ);
				setState(613);
				num_expr(0);
				setState(614);
				match(PAR_DER);
				}
				break;
			case 2:
				{
				setState(616);
				match(RESTA);
				setState(617);
				match(PAR_IZQ);
				setState(618);
				num_expr(0);
				setState(619);
				match(PAR_DER);
				}
				break;
			case 3:
				{
				setState(621);
				match(RESTA);
				setState(622);
				match(ID);
				}
				break;
			case 4:
				{
				setState(623);
				match(RESTA);
				setState(624);
				dt_numeric();
				}
				break;
			case 5:
				{
				setState(625);
				dt_numeric();
				}
				break;
			case 6:
				{
				setState(626);
				system_vars();
				}
				break;
			case 7:
				{
				setState(627);
				match(ID);
				}
				break;
			case 8:
				{
				setState(628);
				match(SIN);
				setState(629);
				match(PAR_IZQ);
				setState(630);
				num_expr(0);
				setState(631);
				match(PAR_DER);
				}
				break;
			case 9:
				{
				setState(633);
				match(COS);
				setState(634);
				match(PAR_IZQ);
				setState(635);
				num_expr(0);
				setState(636);
				match(PAR_DER);
				}
				break;
			case 10:
				{
				setState(638);
				match(PI);
				}
				break;
			case 11:
				{
				setState(639);
				match(RANDOM);
				setState(640);
				match(PAR_IZQ);
				setState(641);
				num_expr(0);
				setState(642);
				match(COMMA);
				setState(643);
				num_expr(0);
				setState(644);
				match(PAR_DER);
				}
				break;
			case 12:
				{
				setState(646);
				match(INTRANDOM);
				setState(647);
				match(PAR_IZQ);
				setState(648);
				num_expr(0);
				setState(649);
				match(COMMA);
				setState(650);
				num_expr(0);
				setState(651);
				match(PAR_DER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(661);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Num_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_num_expr);
					setState(655);
					if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
					setState(656);
					oper_num();
					setState(657);
					num_expr(14);
					}
					} 
				}
				setState(663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(665);
				match(PAR_IZQ);
				setState(666);
				expr(0);
				setState(667);
				match(PAR_DER);
				}
				break;
			case 2:
				{
				setState(669);
				match(RESTA);
				setState(670);
				match(PAR_IZQ);
				setState(671);
				expr(0);
				setState(672);
				match(PAR_DER);
				}
				break;
			case 3:
				{
				setState(674);
				match(NEGACION);
				setState(675);
				match(PAR_IZQ);
				setState(676);
				expr(0);
				setState(677);
				match(PAR_DER);
				}
				break;
			case 4:
				{
				setState(679);
				match(SIN);
				setState(680);
				match(PAR_IZQ);
				setState(681);
				num_expr(0);
				setState(682);
				match(PAR_DER);
				}
				break;
			case 5:
				{
				setState(684);
				match(COS);
				setState(685);
				match(PAR_IZQ);
				setState(686);
				num_expr(0);
				setState(687);
				match(PAR_DER);
				}
				break;
			case 6:
				{
				setState(689);
				match(PI);
				}
				break;
			case 7:
				{
				setState(690);
				match(ID);
				}
				break;
			case 8:
				{
				setState(691);
				system_vars();
				}
				break;
			case 9:
				{
				setState(692);
				dt_numeric();
				}
				break;
			case 10:
				{
				setState(693);
				match(DT_STRING);
				}
				break;
			case 11:
				{
				setState(694);
				match(RESTA);
				setState(695);
				match(ID);
				}
				break;
			case 12:
				{
				setState(696);
				match(RESTA);
				setState(697);
				dt_numeric();
				}
				break;
			case 13:
				{
				setState(698);
				match(NEGACION);
				setState(699);
				match(ID);
				}
				break;
			case 14:
				{
				setState(700);
				tf_log();
				}
				break;
			case 15:
				{
				setState(701);
				match(NEGACION);
				setState(702);
				tf_log();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(719);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(717);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(705);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(706);
						oper_num();
						setState(707);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(709);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(710);
						oper_comp();
						setState(711);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(713);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(714);
						oper_log();
						setState(715);
						expr(17);
						}
						break;
					}
					} 
				}
				setState(721);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		enterRule(_localctx, 88, RULE_oper_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (SUMA - 63)) | (1L << (RESTA - 63)) | (1L << (MULTIPLICACION - 63)) | (1L << (DIVISION - 63)) | (1L << (MODULO - 63)) | (1L << (POTENCIA - 63)))) != 0)) ) {
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
		enterRule(_localctx, 90, RULE_oper_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (IGUALDAD - 74)) | (1L << (DIFERENTE - 74)) | (1L << (MAYOR - 74)) | (1L << (MENOR - 74)) | (1L << (MAIGUAL - 74)) | (1L << (MEIGUAL - 74)))) != 0)) ) {
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
		enterRule(_localctx, 92, RULE_oper_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
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
		enterRule(_localctx, 94, RULE_tf_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
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
		case 42:
			return num_expr_sempred((Num_exprContext)_localctx, predIndex);
		case 43:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean num_expr_sempred(Num_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3`\u02dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\5\2e\n\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\7\5"+
		"z\n\5\f\5\16\5}\13\5\3\6\7\6\u0080\n\6\f\6\16\6\u0083\13\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0095\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a4\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00b2\n\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\5\13\u00ba\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00ca\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\7\21\u00e3\n\21\f\21\16\21\u00e6\13\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u00fc\n\23\3\23\3\23\5\23\u0100\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0110\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0122\n\23\3\23\3\23\5\23\u0126\n\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0138\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u014e\n\23\3\23\3\23\5\23\u0152\n"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0168\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u017b\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0188\n\24\3\24\3\24\5\24\u018c\n\24\3\24\3\24\5\24\u0190\n\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\7\27\u01a5\n\27\f\27\16\27\u01a8\13\27\3\27\5\27\u01ab"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u01b3\n\30\f\30\16\30\u01b6\13"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u01c1\n\31\f\31"+
		"\16\31\u01c4\13\31\3\31\3\31\3\32\3\32\3\32\7\32\u01cb\n\32\f\32\16\32"+
		"\u01ce\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u01d8\n\33\f"+
		"\33\16\33\u01db\13\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01f2\n\36"+
		"\f\36\16\36\u01f5\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\3"+
		"!\5!\u0203\n!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u020b\n\"\f\"\16\"\u020e\13"+
		"\"\3\"\5\"\u0211\n\"\3\"\3\"\3#\3#\3#\3#\7#\u0219\n#\f#\16#\u021c\13#"+
		"\3#\3#\3$\3$\3$\7$\u0223\n$\f$\16$\u0226\13$\3$\5$\u0229\n$\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\5(\u025e\n(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0290\n,\3,\3,\3,\3,\7,\u0296"+
		"\n,\f,\16,\u0299\13,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5"+
		"-\u02c2\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u02d0\n-\f-\16-\u02d3"+
		"\13-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\2\4VX\62\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\t\4\2"+
		"\3\f\67\67\4\2\r\17  \3\2:;\3\2AF\3\2LQ\3\2RS\3\2TU\2\u0318\2b\3\2\2\2"+
		"\4h\3\2\2\2\6p\3\2\2\2\b{\3\2\2\2\n\u0081\3\2\2\2\f\u0094\3\2\2\2\16\u00a3"+
		"\3\2\2\2\20\u00a5\3\2\2\2\22\u00ad\3\2\2\2\24\u00b5\3\2\2\2\26\u00c9\3"+
		"\2\2\2\30\u00cb\3\2\2\2\32\u00cf\3\2\2\2\34\u00d3\3\2\2\2\36\u00d8\3\2"+
		"\2\2 \u00dd\3\2\2\2\"\u00ea\3\2\2\2$\u017a\3\2\2\2&\u017c\3\2\2\2(\u0194"+
		"\3\2\2\2*\u019d\3\2\2\2,\u01a2\3\2\2\2.\u01ac\3\2\2\2\60\u01b9\3\2\2\2"+
		"\62\u01c7\3\2\2\2\64\u01d1\3\2\2\2\66\u01de\3\2\2\28\u01e1\3\2\2\2:\u01e7"+
		"\3\2\2\2<\u01f8\3\2\2\2>\u01fc\3\2\2\2@\u0202\3\2\2\2B\u0204\3\2\2\2D"+
		"\u0214\3\2\2\2F\u021f\3\2\2\2H\u022a\3\2\2\2J\u0233\3\2\2\2L\u0242\3\2"+
		"\2\2N\u025d\3\2\2\2P\u025f\3\2\2\2R\u0261\3\2\2\2T\u0263\3\2\2\2V\u028f"+
		"\3\2\2\2X\u02c1\3\2\2\2Z\u02d4\3\2\2\2\\\u02d6\3\2\2\2^\u02d8\3\2\2\2"+
		"`\u02da\3\2\2\2bd\5\4\3\2ce\5\6\4\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7"+
		"\2\2\3g\3\3\2\2\2hi\7\20\2\2ij\7\21\2\2jk\7W\2\2kl\7X\2\2lm\7[\2\2mn\5"+
		"\b\5\2no\7\\\2\2o\5\3\2\2\2pq\7\20\2\2qr\7\22\2\2rs\7W\2\2st\7X\2\2tu"+
		"\7[\2\2uv\5\n\6\2vw\7\\\2\2w\7\3\2\2\2xz\5\f\7\2yx\3\2\2\2z}\3\2\2\2{"+
		"y\3\2\2\2{|\3\2\2\2|\t\3\2\2\2}{\3\2\2\2~\u0080\5\16\b\2\177~\3\2\2\2"+
		"\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\13\3"+
		"\2\2\2\u0083\u0081\3\2\2\2\u0084\u0095\5\20\t\2\u0085\u0095\5\22\n\2\u0086"+
		"\u0095\5\26\f\2\u0087\u0095\5 \21\2\u0088\u0095\5\"\22\2\u0089\u0095\5"+
		"$\23\2\u008a\u0095\5&\24\2\u008b\u0095\5*\26\2\u008c\u0095\5,\27\2\u008d"+
		"\u0095\5\64\33\2\u008e\u0095\5\66\34\2\u008f\u0095\58\35\2\u0090\u0095"+
		"\5:\36\2\u0091\u0095\5B\"\2\u0092\u0095\5H%\2\u0093\u0095\5J&\2\u0094"+
		"\u0084\3\2\2\2\u0094\u0085\3\2\2\2\u0094\u0086\3\2\2\2\u0094\u0087\3\2"+
		"\2\2\u0094\u0088\3\2\2\2\u0094\u0089\3\2\2\2\u0094\u008a\3\2\2\2\u0094"+
		"\u008b\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008d\3\2\2\2\u0094\u008e\3\2"+
		"\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\r\3\2\2\2\u0096\u00a4\5\24\13"+
		"\2\u0097\u00a4\5\26\f\2\u0098\u00a4\5 \21\2\u0099\u00a4\5\"\22\2\u009a"+
		"\u00a4\5$\23\2\u009b\u00a4\5&\24\2\u009c\u00a4\5,\27\2\u009d\u00a4\5\64"+
		"\33\2\u009e\u00a4\5\66\34\2\u009f\u00a4\58\35\2\u00a0\u00a4\5:\36\2\u00a1"+
		"\u00a4\5B\"\2\u00a2\u00a4\5L\'\2\u00a3\u0096\3\2\2\2\u00a3\u0097\3\2\2"+
		"\2\u00a3\u0098\3\2\2\2\u00a3\u0099\3\2\2\2\u00a3\u009a\3\2\2\2\u00a3\u009b"+
		"\3\2\2\2\u00a3\u009c\3\2\2\2\u00a3\u009d\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3"+
		"\u009f\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4\17\3\2\2\2\u00a5\u00a6\7\23\2\2\u00a6\u00a7\7W\2\2\u00a7\u00a8"+
		"\7:\2\2\u00a8\u00a9\7=\2\2\u00a9\u00aa\7:\2\2\u00aa\u00ab\7X\2\2\u00ab"+
		"\u00ac\7>\2\2\u00ac\21\3\2\2\2\u00ad\u00ae\5R*\2\u00ae\u00b1\7]\2\2\u00af"+
		"\u00b0\7?\2\2\u00b0\u00b2\5X-\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2"+
		"\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4\23\3\2\2\2\u00b5\u00b6"+
		"\5R*\2\u00b6\u00b9\7]\2\2\u00b7\u00b8\7?\2\2\u00b8\u00ba\5X-\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7>\2\2\u00bc"+
		"\25\3\2\2\2\u00bd\u00be\5\30\r\2\u00be\u00bf\7>\2\2\u00bf\u00ca\3\2\2"+
		"\2\u00c0\u00c1\5\32\16\2\u00c1\u00c2\7>\2\2\u00c2\u00ca\3\2\2\2\u00c3"+
		"\u00c4\5\34\17\2\u00c4\u00c5\7>\2\2\u00c5\u00ca\3\2\2\2\u00c6\u00c7\5"+
		"\36\20\2\u00c7\u00c8\7>\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00bd\3\2\2\2\u00c9"+
		"\u00c0\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\27\3\2\2"+
		"\2\u00cb\u00cc\7]\2\2\u00cc\u00cd\7?\2\2\u00cd\u00ce\5X-\2\u00ce\31\3"+
		"\2\2\2\u00cf\u00d0\7]\2\2\u00d0\u00d1\7A\2\2\u00d1\u00d2\7A\2\2\u00d2"+
		"\33\3\2\2\2\u00d3\u00d4\7]\2\2\u00d4\u00d5\7A\2\2\u00d5\u00d6\7?\2\2\u00d6"+
		"\u00d7\5V,\2\u00d7\35\3\2\2\2\u00d8\u00d9\7]\2\2\u00d9\u00da\7B\2\2\u00da"+
		"\u00db\7?\2\2\u00db\u00dc\5V,\2\u00dc\37\3\2\2\2\u00dd\u00de\7\24\2\2"+
		"\u00de\u00df\7W\2\2\u00df\u00e4\5X-\2\u00e0\u00e1\7=\2\2\u00e1\u00e3\5"+
		"X-\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7X"+
		"\2\2\u00e8\u00e9\7>\2\2\u00e9!\3\2\2\2\u00ea\u00eb\7\25\2\2\u00eb\u00ec"+
		"\7W\2\2\u00ec\u00ed\5(\25\2\u00ed\u00ee\7X\2\2\u00ee\u00ef\7>\2\2\u00ef"+
		"#\3\2\2\2\u00f0\u00f1\7\27\2\2\u00f1\u00f2\7W\2\2\u00f2\u00f3\7)\2\2\u00f3"+
		"\u00f4\7=\2\2\u00f4\u00f5\5V,\2\u00f5\u00f6\7=\2\2\u00f6\u00f7\5V,\2\u00f7"+
		"\u00f8\7=\2\2\u00f8\u00fb\5V,\2\u00f9\u00fa\7=\2\2\u00fa\u00fc\5V,\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fe\7="+
		"\2\2\u00fe\u0100\5(\25\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0102\7X\2\2\u0102\u0103\7>\2\2\u0103\u017b\3\2\2"+
		"\2\u0104\u0105\7\27\2\2\u0105\u0106\7W\2\2\u0106\u0107\7*\2\2\u0107\u0108"+
		"\7=\2\2\u0108\u0109\5V,\2\u0109\u010a\7=\2\2\u010a\u010b\5V,\2\u010b\u010c"+
		"\7=\2\2\u010c\u010f\5V,\2\u010d\u010e\7=\2\2\u010e\u0110\5(\25\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7X"+
		"\2\2\u0112\u0113\7>\2\2\u0113\u017b\3\2\2\2\u0114\u0115\7\27\2\2\u0115"+
		"\u0116\7W\2\2\u0116\u0117\7+\2\2\u0117\u0118\7=\2\2\u0118\u0119\5V,\2"+
		"\u0119\u011a\7=\2\2\u011a\u011b\5V,\2\u011b\u011c\7=\2\2\u011c\u011d\5"+
		"V,\2\u011d\u011e\7=\2\2\u011e\u0121\5V,\2\u011f\u0120\7=\2\2\u0120\u0122"+
		"\5V,\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0124\7=\2\2\u0124\u0126\5(\25\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7X\2\2\u0128\u0129\7>\2\2\u0129\u017b"+
		"\3\2\2\2\u012a\u012b\7\27\2\2\u012b\u012c\7W\2\2\u012c\u012d\7,\2\2\u012d"+
		"\u012e\7=\2\2\u012e\u012f\5V,\2\u012f\u0130\7=\2\2\u0130\u0131\5V,\2\u0131"+
		"\u0132\7=\2\2\u0132\u0133\5V,\2\u0133\u0134\7=\2\2\u0134\u0137\5V,\2\u0135"+
		"\u0136\7=\2\2\u0136\u0138\5(\25\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7X\2\2\u013a\u013b\7>\2\2\u013b\u017b"+
		"\3\2\2\2\u013c\u013d\7\27\2\2\u013d\u013e\7W\2\2\u013e\u013f\7-\2\2\u013f"+
		"\u0140\7=\2\2\u0140\u0141\5V,\2\u0141\u0142\7=\2\2\u0142\u0143\5V,\2\u0143"+
		"\u0144\7=\2\2\u0144\u0145\5V,\2\u0145\u0146\7=\2\2\u0146\u0147\5V,\2\u0147"+
		"\u0148\7=\2\2\u0148\u0149\5V,\2\u0149\u014a\7=\2\2\u014a\u014d\5V,\2\u014b"+
		"\u014c\7=\2\2\u014c\u014e\5V,\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2"+
		"\2\u014e\u0151\3\2\2\2\u014f\u0150\7=\2\2\u0150\u0152\5(\25\2\u0151\u014f"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7X\2\2\u0154"+
		"\u0155\7>\2\2\u0155\u017b\3\2\2\2\u0156\u0157\7\27\2\2\u0157\u0158\7W"+
		"\2\2\u0158\u0159\7.\2\2\u0159\u015a\7=\2\2\u015a\u015b\5V,\2\u015b\u015c"+
		"\7=\2\2\u015c\u015d\5V,\2\u015d\u015e\7=\2\2\u015e\u015f\5V,\2\u015f\u0160"+
		"\7=\2\2\u0160\u0161\5V,\2\u0161\u0162\7=\2\2\u0162\u0163\5V,\2\u0163\u0164"+
		"\7=\2\2\u0164\u0167\5V,\2\u0165\u0166\7=\2\2\u0166\u0168\5(\25\2\u0167"+
		"\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\7X"+
		"\2\2\u016a\u016b\7>\2\2\u016b\u017b\3\2\2\2\u016c\u016d\7\27\2\2\u016d"+
		"\u016e\7W\2\2\u016e\u016f\7]\2\2\u016f\u0170\7=\2\2\u0170\u0171\5V,\2"+
		"\u0171\u0172\7=\2\2\u0172\u0173\5V,\2\u0173\u0174\7=\2\2\u0174\u0175\5"+
		"V,\2\u0175\u0176\7=\2\2\u0176\u0177\5V,\2\u0177\u0178\7X\2\2\u0178\u0179"+
		"\7>\2\2\u0179\u017b\3\2\2\2\u017a\u00f0\3\2\2\2\u017a\u0104\3\2\2\2\u017a"+
		"\u0114\3\2\2\2\u017a\u012a\3\2\2\2\u017a\u013c\3\2\2\2\u017a\u0156\3\2"+
		"\2\2\u017a\u016c\3\2\2\2\u017b%\3\2\2\2\u017c\u017d\7\30\2\2\u017d\u017e"+
		"\7W\2\2\u017e\u017f\5X-\2\u017f\u0180\7=\2\2\u0180\u0181\5V,\2\u0181\u0182"+
		"\7=\2\2\u0182\u0183\5V,\2\u0183\u0184\7=\2\2\u0184\u0187\5V,\2\u0185\u0186"+
		"\7=\2\2\u0186\u0188\5V,\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u018a\7=\2\2\u018a\u018c\5(\25\2\u018b\u0189\3\2"+
		"\2\2\u018b\u018c\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018e\7=\2\2\u018e"+
		"\u0190\7<\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u0192\7X\2\2\u0192\u0193\7>\2\2\u0193\'\3\2\2\2\u0194\u0195"+
		"\7\26\2\2\u0195\u0196\7W\2\2\u0196\u0197\5V,\2\u0197\u0198\7=\2\2\u0198"+
		"\u0199\5V,\2\u0199\u019a\7=\2\2\u019a\u019b\5V,\2\u019b\u019c\7X\2\2\u019c"+
		")\3\2\2\2\u019d\u019e\7\31\2\2\u019e\u019f\7W\2\2\u019f\u01a0\7X\2\2\u01a0"+
		"\u01a1\7>\2\2\u01a1+\3\2\2\2\u01a2\u01a6\5.\30\2\u01a3\u01a5\5\60\31\2"+
		"\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ab\5\62\32\2"+
		"\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab-\3\2\2\2\u01ac\u01ad\7"+
		"\32\2\2\u01ad\u01ae\7W\2\2\u01ae\u01af\5X-\2\u01af\u01b0\7X\2\2\u01b0"+
		"\u01b4\7[\2\2\u01b1\u01b3\5\16\b\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6\3\2"+
		"\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b7\u01b8\7\\\2\2\u01b8/\3\2\2\2\u01b9\u01ba\7\33\2\2"+
		"\u01ba\u01bb\7\32\2\2\u01bb\u01bc\7W\2\2\u01bc\u01bd\5X-\2\u01bd\u01be"+
		"\7X\2\2\u01be\u01c2\7[\2\2\u01bf\u01c1\5\16\b\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2"+
		"\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\7\\\2\2\u01c6\61\3\2\2\2\u01c7\u01c8"+
		"\7\33\2\2\u01c8\u01cc\7[\2\2\u01c9\u01cb\5\16\b\2\u01ca\u01c9\3\2\2\2"+
		"\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf"+
		"\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\7\\\2\2\u01d0\63\3\2\2\2\u01d1"+
		"\u01d2\7\34\2\2\u01d2\u01d3\7W\2\2\u01d3\u01d4\5X-\2\u01d4\u01d5\7X\2"+
		"\2\u01d5\u01d9\7[\2\2\u01d6\u01d8\5\16\b\2\u01d7\u01d6\3\2\2\2\u01d8\u01db"+
		"\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db"+
		"\u01d9\3\2\2\2\u01dc\u01dd\7\\\2\2\u01dd\65\3\2\2\2\u01de\u01df\7\35\2"+
		"\2\u01df\u01e0\7>\2\2\u01e0\67\3\2\2\2\u01e1\u01e2\7\36\2\2\u01e2\u01e3"+
		"\7W\2\2\u01e3\u01e4\5V,\2\u01e4\u01e5\7X\2\2\u01e5\u01e6\7>\2\2\u01e6"+
		"9\3\2\2\2\u01e7\u01e8\7\37\2\2\u01e8\u01e9\7W\2\2\u01e9\u01ea\5<\37\2"+
		"\u01ea\u01eb\7>\2\2\u01eb\u01ec\5> \2\u01ec\u01ed\7>\2\2\u01ed\u01ee\5"+
		"@!\2\u01ee\u01ef\7X\2\2\u01ef\u01f3\7[\2\2\u01f0\u01f2\5\16\b\2\u01f1"+
		"\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\7\\\2\2\u01f7"+
		";\3\2\2\2\u01f8\u01f9\7]\2\2\u01f9\u01fa\7?\2\2\u01fa\u01fb\5V,\2\u01fb"+
		"=\3\2\2\2\u01fc\u01fd\5X-\2\u01fd?\3\2\2\2\u01fe\u0203\5\30\r\2\u01ff"+
		"\u0203\5\32\16\2\u0200\u0203\5\34\17\2\u0201\u0203\5\36\20\2\u0202\u01fe"+
		"\3\2\2\2\u0202\u01ff\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203"+
		"A\3\2\2\2\u0204\u0205\7#\2\2\u0205\u0206\7W\2\2\u0206\u0207\5X-\2\u0207"+
		"\u0208\7X\2\2\u0208\u020c\7[\2\2\u0209\u020b\5D#\2\u020a\u0209\3\2\2\2"+
		"\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0210"+
		"\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0211\5F$\2\u0210\u020f\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\7\\\2\2\u0213C\3\2\2\2"+
		"\u0214\u0215\7$\2\2\u0215\u0216\5X-\2\u0216\u021a\7@\2\2\u0217\u0219\5"+
		"\16\b\2\u0218\u0217\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u021e\5\66"+
		"\34\2\u021eE\3\2\2\2\u021f\u0220\7%\2\2\u0220\u0224\7@\2\2\u0221\u0223"+
		"\5\16\b\2\u0222\u0221\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2"+
		"\u0224\u0225\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0229"+
		"\5\66\34\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229G\3\2\2\2\u022a"+
		"\u022b\7!\2\2\u022b\u022c\7]\2\2\u022c\u022d\7?\2\2\u022d\u022e\7\"\2"+
		"\2\u022e\u022f\7W\2\2\u022f\u0230\7<\2\2\u0230\u0231\7X\2\2\u0231\u0232"+
		"\7>\2\2\u0232I\3\2\2\2\u0233\u0234\7&\2\2\u0234\u0235\7]\2\2\u0235\u0236"+
		"\7?\2\2\u0236\u0237\7\'\2\2\u0237\u0238\7W\2\2\u0238\u0239\7]\2\2\u0239"+
		"\u023a\7=\2\2\u023a\u023b\5V,\2\u023b\u023c\7=\2\2\u023c\u023d\5V,\2\u023d"+
		"\u023e\7=\2\2\u023e\u023f\5V,\2\u023f\u0240\7X\2\2\u0240\u0241\7>\2\2"+
		"\u0241K\3\2\2\2\u0242\u0243\7(\2\2\u0243\u0244\7W\2\2\u0244\u0245\7]\2"+
		"\2\u0245\u0246\7=\2\2\u0246\u0247\5V,\2\u0247\u0248\7=\2\2\u0248\u0249"+
		"\5V,\2\u0249\u024a\7=\2\2\u024a\u024b\5V,\2\u024b\u024c\7=\2\2\u024c\u024d"+
		"\5V,\2\u024d\u024e\7=\2\2\u024e\u024f\5V,\2\u024f\u0250\7X\2\2\u0250\u0251"+
		"\7>\2\2\u0251M\3\2\2\2\u0252\u025e\7/\2\2\u0253\u025e\7\60\2\2\u0254\u025e"+
		"\7\61\2\2\u0255\u025e\7\62\2\2\u0256\u025e\7\63\2\2\u0257\u025e\7\64\2"+
		"\2\u0258\u025e\7\65\2\2\u0259\u025e\7\66\2\2\u025a\u025e\78\2\2\u025b"+
		"\u025e\79\2\2\u025c\u025e\5P)\2\u025d\u0252\3\2\2\2\u025d\u0253\3\2\2"+
		"\2\u025d\u0254\3\2\2\2\u025d\u0255\3\2\2\2\u025d\u0256\3\2\2\2\u025d\u0257"+
		"\3\2\2\2\u025d\u0258\3\2\2\2\u025d\u0259\3\2\2\2\u025d\u025a\3\2\2\2\u025d"+
		"\u025b\3\2\2\2\u025d\u025c\3\2\2\2\u025eO\3\2\2\2\u025f\u0260\t\2\2\2"+
		"\u0260Q\3\2\2\2\u0261\u0262\t\3\2\2\u0262S\3\2\2\2\u0263\u0264\t\4\2\2"+
		"\u0264U\3\2\2\2\u0265\u0266\b,\1\2\u0266\u0267\7W\2\2\u0267\u0268\5V,"+
		"\2\u0268\u0269\7X\2\2\u0269\u0290\3\2\2\2\u026a\u026b\7B\2\2\u026b\u026c"+
		"\7W\2\2\u026c\u026d\5V,\2\u026d\u026e\7X\2\2\u026e\u0290\3\2\2\2\u026f"+
		"\u0270\7B\2\2\u0270\u0290\7]\2\2\u0271\u0272\7B\2\2\u0272\u0290\5T+\2"+
		"\u0273\u0290\5T+\2\u0274\u0290\5N(\2\u0275\u0290\7]\2\2\u0276\u0277\7"+
		"G\2\2\u0277\u0278\7W\2\2\u0278\u0279\5V,\2\u0279\u027a\7X\2\2\u027a\u0290"+
		"\3\2\2\2\u027b\u027c\7H\2\2\u027c\u027d\7W\2\2\u027d\u027e\5V,\2\u027e"+
		"\u027f\7X\2\2\u027f\u0290\3\2\2\2\u0280\u0290\7I\2\2\u0281\u0282\7J\2"+
		"\2\u0282\u0283\7W\2\2\u0283\u0284\5V,\2\u0284\u0285\7=\2\2\u0285\u0286"+
		"\5V,\2\u0286\u0287\7X\2\2\u0287\u0290\3\2\2\2\u0288\u0289\7K\2\2\u0289"+
		"\u028a\7W\2\2\u028a\u028b\5V,\2\u028b\u028c\7=\2\2\u028c\u028d\5V,\2\u028d"+
		"\u028e\7X\2\2\u028e\u0290\3\2\2\2\u028f\u0265\3\2\2\2\u028f\u026a\3\2"+
		"\2\2\u028f\u026f\3\2\2\2\u028f\u0271\3\2\2\2\u028f\u0273\3\2\2\2\u028f"+
		"\u0274\3\2\2\2\u028f\u0275\3\2\2\2\u028f\u0276\3\2\2\2\u028f\u027b\3\2"+
		"\2\2\u028f\u0280\3\2\2\2\u028f\u0281\3\2\2\2\u028f\u0288\3\2\2\2\u0290"+
		"\u0297\3\2\2\2\u0291\u0292\f\17\2\2\u0292\u0293\5Z.\2\u0293\u0294\5V,"+
		"\20\u0294\u0296\3\2\2\2\u0295\u0291\3\2\2\2\u0296\u0299\3\2\2\2\u0297"+
		"\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298W\3\2\2\2\u0299\u0297\3\2\2\2"+
		"\u029a\u029b\b-\1\2\u029b\u029c\7W\2\2\u029c\u029d\5X-\2\u029d\u029e\7"+
		"X\2\2\u029e\u02c2\3\2\2\2\u029f\u02a0\7B\2\2\u02a0\u02a1\7W\2\2\u02a1"+
		"\u02a2\5X-\2\u02a2\u02a3\7X\2\2\u02a3\u02c2\3\2\2\2\u02a4\u02a5\7V\2\2"+
		"\u02a5\u02a6\7W\2\2\u02a6\u02a7\5X-\2\u02a7\u02a8\7X\2\2\u02a8\u02c2\3"+
		"\2\2\2\u02a9\u02aa\7G\2\2\u02aa\u02ab\7W\2\2\u02ab\u02ac\5V,\2\u02ac\u02ad"+
		"\7X\2\2\u02ad\u02c2\3\2\2\2\u02ae\u02af\7H\2\2\u02af\u02b0\7W\2\2\u02b0"+
		"\u02b1\5V,\2\u02b1\u02b2\7X\2\2\u02b2\u02c2\3\2\2\2\u02b3\u02c2\7I\2\2"+
		"\u02b4\u02c2\7]\2\2\u02b5\u02c2\5N(\2\u02b6\u02c2\5T+\2\u02b7\u02c2\7"+
		"<\2\2\u02b8\u02b9\7B\2\2\u02b9\u02c2\7]\2\2\u02ba\u02bb\7B\2\2\u02bb\u02c2"+
		"\5T+\2\u02bc\u02bd\7V\2\2\u02bd\u02c2\7]\2\2\u02be\u02c2\5`\61\2\u02bf"+
		"\u02c0\7V\2\2\u02c0\u02c2\5`\61\2\u02c1\u029a\3\2\2\2\u02c1\u029f\3\2"+
		"\2\2\u02c1\u02a4\3\2\2\2\u02c1\u02a9\3\2\2\2\u02c1\u02ae\3\2\2\2\u02c1"+
		"\u02b3\3\2\2\2\u02c1\u02b4\3\2\2\2\u02c1\u02b5\3\2\2\2\u02c1\u02b6\3\2"+
		"\2\2\u02c1\u02b7\3\2\2\2\u02c1\u02b8\3\2\2\2\u02c1\u02ba\3\2\2\2\u02c1"+
		"\u02bc\3\2\2\2\u02c1\u02be\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02d1\3\2"+
		"\2\2\u02c3\u02c4\f\24\2\2\u02c4\u02c5\5Z.\2\u02c5\u02c6\5X-\25\u02c6\u02d0"+
		"\3\2\2\2\u02c7\u02c8\f\23\2\2\u02c8\u02c9\5\\/\2\u02c9\u02ca\5X-\24\u02ca"+
		"\u02d0\3\2\2\2\u02cb\u02cc\f\22\2\2\u02cc\u02cd\5^\60\2\u02cd\u02ce\5"+
		"X-\23\u02ce\u02d0\3\2\2\2\u02cf\u02c3\3\2\2\2\u02cf\u02c7\3\2\2\2\u02cf"+
		"\u02cb\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2"+
		"\2\2\u02d2Y\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02d5\t\5\2\2\u02d5[\3\2"+
		"\2\2\u02d6\u02d7\t\6\2\2\u02d7]\3\2\2\2\u02d8\u02d9\t\7\2\2\u02d9_\3\2"+
		"\2\2\u02da\u02db\t\b\2\2\u02dba\3\2\2\2+d{\u0081\u0094\u00a3\u00b1\u00b9"+
		"\u00c9\u00e4\u00fb\u00ff\u010f\u0121\u0125\u0137\u014d\u0151\u0167\u017a"+
		"\u0187\u018b\u018f\u01a6\u01aa\u01b4\u01c2\u01cc\u01d9\u01f3\u0202\u020c"+
		"\u0210\u021a\u0224\u0228\u025d\u028f\u0297\u02c1\u02cf\u02d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}