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
		FUNCTION=1, SETUP=2, ANIMATE=3, SETCANVAS=4, CONSOLE=5, SETBACKGROUND=6, 
		RGB=7, DRAW=8, CIRCLE=9, FILLCIRCLE=10, RECT=11, FILLRECT=12, TRIANGLE=13, 
		FILLTRIANGLE=14, DTYPE=15, DT_INT=16, DT_FLOAT=17, COMMA=18, PYC=19, EQU=20, 
		SUMA=21, RESTA=22, MULTIPLICACION=23, DIVISION=24, MODULO=25, POTENCIA=26, 
		SIN=27, COS=28, PI=29, PAR_IZQ=30, PAR_DER=31, COR_IZQ=32, COR_DER=33, 
		LLAVE_IZQ=34, LLAVE_DER=35, ID=36, WS=37, LINECOMMENT=38, COMMENT=39;
	public static final int
		RULE_code = 0, RULE_setup = 1, RULE_animate = 2, RULE_main_commands = 3, 
		RULE_commands = 4, RULE_m_command = 5, RULE_setCanvas = 6, RULE_declaration = 7, 
		RULE_asignation = 8, RULE_console = 9, RULE_setBackground = 10, RULE_draw = 11, 
		RULE_rgb = 12, RULE_dt_numeric = 13, RULE_num_expr = 14, RULE_oper_num = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "setup", "animate", "main_commands", "commands", "m_command", 
			"setCanvas", "declaration", "asignation", "console", "setBackground", 
			"draw", "rgb", "dt_numeric", "num_expr", "oper_num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'setup'", "'animate'", "'SetCanvas'", "'Console'", 
			"'SetBackground'", "'rgb'", "'Draw'", "'Circle'", "'FillCircle'", "'Rect'", 
			"'FillRect'", "'Triangle'", "'FillTriangle'", null, null, null, "','", 
			"';'", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'Sin'", "'Cos'", 
			"'PI'", "'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTION", "SETUP", "ANIMATE", "SETCANVAS", "CONSOLE", "SETBACKGROUND", 
			"RGB", "DRAW", "CIRCLE", "FILLCIRCLE", "RECT", "FILLRECT", "TRIANGLE", 
			"FILLTRIANGLE", "DTYPE", "DT_INT", "DT_FLOAT", "COMMA", "PYC", "EQU", 
			"SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "MODULO", "POTENCIA", 
			"SIN", "COS", "PI", "PAR_IZQ", "PAR_DER", "COR_IZQ", "COR_DER", "LLAVE_IZQ", 
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
			setState(32);
			setup();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(33);
				animate();
				}
			}

			setState(36);
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
			setState(38);
			match(FUNCTION);
			setState(39);
			match(SETUP);
			setState(40);
			match(PAR_IZQ);
			setState(41);
			match(PAR_DER);
			setState(42);
			match(LLAVE_IZQ);
			setState(43);
			main_commands();
			setState(44);
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
			setState(46);
			match(FUNCTION);
			setState(47);
			match(ANIMATE);
			setState(48);
			match(PAR_IZQ);
			setState(49);
			match(PAR_DER);
			setState(50);
			match(LLAVE_IZQ);
			setState(51);
			commands();
			setState(52);
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SETCANVAS) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << DTYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(54);
				m_command();
				}
				}
				setState(59);
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
		public List<M_commandContext> m_command() {
			return getRuleContexts(M_commandContext.class);
		}
		public M_commandContext m_command(int i) {
			return getRuleContext(M_commandContext.class,i);
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SETCANVAS) | (1L << CONSOLE) | (1L << SETBACKGROUND) | (1L << DRAW) | (1L << DTYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(60);
				m_command();
				}
				}
				setState(65);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AsignationContext asignation() {
			return getRuleContext(AsignationContext.class,0);
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
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SETCANVAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				setCanvas();
				}
				break;
			case DTYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				declaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				asignation();
				}
				break;
			case CONSOLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				console();
				}
				break;
			case SETBACKGROUND:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				setBackground();
				}
				break;
			case DRAW:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				draw();
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
		enterRule(_localctx, 12, RULE_setCanvas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(SETCANVAS);
			setState(75);
			match(PAR_IZQ);
			setState(76);
			match(DT_INT);
			setState(77);
			match(COMMA);
			setState(78);
			match(DT_INT);
			setState(79);
			match(PAR_DER);
			setState(80);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode DTYPE() { return getToken(AnimationJSParser.DTYPE, 0); }
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
		public TerminalNode PYC() { return getToken(AnimationJSParser.PYC, 0); }
		public TerminalNode EQU() { return getToken(AnimationJSParser.EQU, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(DTYPE);
			setState(83);
			match(ID);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQU) {
				{
				setState(84);
				match(EQU);
				setState(85);
				num_expr(0);
				}
			}

			setState(88);
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

	public static class AsignationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AnimationJSParser.ID, 0); }
		public TerminalNode EQU() { return getToken(AnimationJSParser.EQU, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public TerminalNode PYC() { return getToken(AnimationJSParser.PYC, 0); }
		public AsignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).enterAsignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnimationJSListener ) ((AnimationJSListener)listener).exitAsignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnimationJSVisitor ) return ((AnimationJSVisitor<? extends T>)visitor).visitAsignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignationContext asignation() throws RecognitionException {
		AsignationContext _localctx = new AsignationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ID);
			setState(91);
			match(EQU);
			setState(92);
			num_expr(0);
			setState(93);
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
		public List<Num_exprContext> num_expr() {
			return getRuleContexts(Num_exprContext.class);
		}
		public Num_exprContext num_expr(int i) {
			return getRuleContext(Num_exprContext.class,i);
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
		enterRule(_localctx, 18, RULE_console);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(CONSOLE);
			setState(96);
			match(PAR_IZQ);
			setState(97);
			num_expr(0);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(98);
				match(COMMA);
				setState(99);
				num_expr(0);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(PAR_DER);
			setState(106);
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
		enterRule(_localctx, 20, RULE_setBackground);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(SETBACKGROUND);
			setState(109);
			match(PAR_IZQ);
			setState(110);
			rgb();
			setState(111);
			match(PAR_DER);
			setState(112);
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
		enterRule(_localctx, 22, RULE_draw);
		int _la;
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(DRAW);
				setState(115);
				match(PAR_IZQ);
				setState(116);
				match(CIRCLE);
				setState(117);
				match(COMMA);
				setState(118);
				num_expr(0);
				setState(119);
				match(COMMA);
				setState(120);
				num_expr(0);
				setState(121);
				match(COMMA);
				setState(122);
				num_expr(0);
				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(123);
					match(COMMA);
					setState(124);
					num_expr(0);
					}
					break;
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(127);
					match(COMMA);
					setState(128);
					rgb();
					}
				}

				setState(131);
				match(PAR_DER);
				setState(132);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(DRAW);
				setState(135);
				match(PAR_IZQ);
				setState(136);
				match(FILLCIRCLE);
				setState(137);
				match(COMMA);
				setState(138);
				num_expr(0);
				setState(139);
				match(COMMA);
				setState(140);
				num_expr(0);
				setState(141);
				match(COMMA);
				setState(142);
				num_expr(0);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(143);
					match(COMMA);
					setState(144);
					rgb();
					}
				}

				setState(147);
				match(PAR_DER);
				setState(148);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(DRAW);
				setState(151);
				match(PAR_IZQ);
				setState(152);
				match(RECT);
				setState(153);
				match(COMMA);
				setState(154);
				num_expr(0);
				setState(155);
				match(COMMA);
				setState(156);
				num_expr(0);
				setState(157);
				match(COMMA);
				setState(158);
				num_expr(0);
				setState(159);
				match(COMMA);
				setState(160);
				num_expr(0);
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(161);
					match(COMMA);
					setState(162);
					num_expr(0);
					}
					break;
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(165);
					match(COMMA);
					setState(166);
					rgb();
					}
				}

				setState(169);
				match(PAR_DER);
				setState(170);
				match(PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(DRAW);
				setState(173);
				match(PAR_IZQ);
				setState(174);
				match(FILLRECT);
				setState(175);
				match(COMMA);
				setState(176);
				num_expr(0);
				setState(177);
				match(COMMA);
				setState(178);
				num_expr(0);
				setState(179);
				match(COMMA);
				setState(180);
				num_expr(0);
				setState(181);
				match(COMMA);
				setState(182);
				num_expr(0);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(183);
					match(COMMA);
					setState(184);
					rgb();
					}
				}

				setState(187);
				match(PAR_DER);
				setState(188);
				match(PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				match(DRAW);
				setState(191);
				match(PAR_IZQ);
				setState(192);
				match(TRIANGLE);
				setState(193);
				match(COMMA);
				setState(194);
				num_expr(0);
				setState(195);
				match(COMMA);
				setState(196);
				num_expr(0);
				setState(197);
				match(COMMA);
				setState(198);
				num_expr(0);
				setState(199);
				match(COMMA);
				setState(200);
				num_expr(0);
				setState(201);
				match(COMMA);
				setState(202);
				num_expr(0);
				setState(203);
				match(COMMA);
				setState(204);
				num_expr(0);
				setState(207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(205);
					match(COMMA);
					setState(206);
					num_expr(0);
					}
					break;
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(209);
					match(COMMA);
					setState(210);
					rgb();
					}
				}

				setState(213);
				match(PAR_DER);
				setState(214);
				match(PYC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				match(DRAW);
				setState(217);
				match(PAR_IZQ);
				setState(218);
				match(FILLTRIANGLE);
				setState(219);
				match(COMMA);
				setState(220);
				num_expr(0);
				setState(221);
				match(COMMA);
				setState(222);
				num_expr(0);
				setState(223);
				match(COMMA);
				setState(224);
				num_expr(0);
				setState(225);
				match(COMMA);
				setState(226);
				num_expr(0);
				setState(227);
				match(COMMA);
				setState(228);
				num_expr(0);
				setState(229);
				match(COMMA);
				setState(230);
				num_expr(0);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(231);
					match(COMMA);
					setState(232);
					rgb();
					}
				}

				setState(235);
				match(PAR_DER);
				setState(236);
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
		enterRule(_localctx, 24, RULE_rgb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(RGB);
			setState(241);
			match(PAR_IZQ);
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
			setState(247);
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
		enterRule(_localctx, 26, RULE_dt_numeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		public TerminalNode SIN() { return getToken(AnimationJSParser.SIN, 0); }
		public TerminalNode COS() { return getToken(AnimationJSParser.COS, 0); }
		public TerminalNode PI() { return getToken(AnimationJSParser.PI, 0); }
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_num_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(252);
				match(PAR_IZQ);
				setState(253);
				num_expr(0);
				setState(254);
				match(PAR_DER);
				}
				break;
			case 2:
				{
				setState(256);
				match(RESTA);
				setState(257);
				match(PAR_IZQ);
				setState(258);
				num_expr(0);
				setState(259);
				match(PAR_DER);
				}
				break;
			case 3:
				{
				setState(261);
				match(RESTA);
				setState(262);
				match(ID);
				}
				break;
			case 4:
				{
				setState(263);
				match(RESTA);
				setState(264);
				dt_numeric();
				}
				break;
			case 5:
				{
				setState(265);
				dt_numeric();
				}
				break;
			case 6:
				{
				setState(266);
				match(ID);
				}
				break;
			case 7:
				{
				setState(267);
				match(SIN);
				setState(268);
				match(PAR_IZQ);
				setState(269);
				num_expr(0);
				setState(270);
				match(PAR_DER);
				}
				break;
			case 8:
				{
				setState(272);
				match(COS);
				setState(273);
				match(PAR_IZQ);
				setState(274);
				num_expr(0);
				setState(275);
				match(PAR_DER);
				}
				break;
			case 9:
				{
				setState(277);
				match(PI);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Num_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_num_expr);
					setState(280);
					if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
					setState(281);
					oper_num();
					setState(282);
					num_expr(11);
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 30, RULE_oper_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESTA) | (1L << MULTIPLICACION) | (1L << DIVISION) | (1L << MODULO) | (1L << POTENCIA))) != 0)) ) {
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
		case 14:
			return num_expr_sempred((Num_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean num_expr_sempred(Num_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0126\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\5"+
		"\2%\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\7\5:\n\5\f\5\16\5=\13\5\3\6\7\6@\n\6\f\6\16\6C\13\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7K\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\5\tY\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\7\13g\n\13\f\13\16\13j\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0080\n\r\3\r\3\r\5\r\u0084"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0094"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00a6\n\r\3\r\3\r\5\r\u00aa\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00bc\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d2\n\r\3\r"+
		"\3\r\5\r\u00d6\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ec\n\r\3\r\3\r\3\r\5\r\u00f1\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0119\n\20\3\20"+
		"\3\20\3\20\3\20\7\20\u011f\n\20\f\20\16\20\u0122\13\20\3\21\3\21\3\21"+
		"\2\3\36\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\3\2\22\23\3\2\27"+
		"\34\2\u0136\2\"\3\2\2\2\4(\3\2\2\2\6\60\3\2\2\2\b;\3\2\2\2\nA\3\2\2\2"+
		"\fJ\3\2\2\2\16L\3\2\2\2\20T\3\2\2\2\22\\\3\2\2\2\24a\3\2\2\2\26n\3\2\2"+
		"\2\30\u00f0\3\2\2\2\32\u00f2\3\2\2\2\34\u00fb\3\2\2\2\36\u0118\3\2\2\2"+
		" \u0123\3\2\2\2\"$\5\4\3\2#%\5\6\4\2$#\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'"+
		"\7\2\2\3\'\3\3\2\2\2()\7\3\2\2)*\7\4\2\2*+\7 \2\2+,\7!\2\2,-\7$\2\2-."+
		"\5\b\5\2./\7%\2\2/\5\3\2\2\2\60\61\7\3\2\2\61\62\7\5\2\2\62\63\7 \2\2"+
		"\63\64\7!\2\2\64\65\7$\2\2\65\66\5\n\6\2\66\67\7%\2\2\67\7\3\2\2\28:\5"+
		"\f\7\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\t\3\2\2\2=;\3\2\2\2>@"+
		"\5\f\7\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\13\3\2\2\2CA\3\2\2\2"+
		"DK\5\16\b\2EK\5\20\t\2FK\5\22\n\2GK\5\24\13\2HK\5\26\f\2IK\5\30\r\2JD"+
		"\3\2\2\2JE\3\2\2\2JF\3\2\2\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\r\3\2\2\2"+
		"LM\7\6\2\2MN\7 \2\2NO\7\22\2\2OP\7\24\2\2PQ\7\22\2\2QR\7!\2\2RS\7\25\2"+
		"\2S\17\3\2\2\2TU\7\21\2\2UX\7&\2\2VW\7\26\2\2WY\5\36\20\2XV\3\2\2\2XY"+
		"\3\2\2\2YZ\3\2\2\2Z[\7\25\2\2[\21\3\2\2\2\\]\7&\2\2]^\7\26\2\2^_\5\36"+
		"\20\2_`\7\25\2\2`\23\3\2\2\2ab\7\7\2\2bc\7 \2\2ch\5\36\20\2de\7\24\2\2"+
		"eg\5\36\20\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2"+
		"\2kl\7!\2\2lm\7\25\2\2m\25\3\2\2\2no\7\b\2\2op\7 \2\2pq\5\32\16\2qr\7"+
		"!\2\2rs\7\25\2\2s\27\3\2\2\2tu\7\n\2\2uv\7 \2\2vw\7\13\2\2wx\7\24\2\2"+
		"xy\5\36\20\2yz\7\24\2\2z{\5\36\20\2{|\7\24\2\2|\177\5\36\20\2}~\7\24\2"+
		"\2~\u0080\5\36\20\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2\2"+
		"\u0081\u0082\7\24\2\2\u0082\u0084\5\32\16\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7!\2\2\u0086\u0087\7\25"+
		"\2\2\u0087\u00f1\3\2\2\2\u0088\u0089\7\n\2\2\u0089\u008a\7 \2\2\u008a"+
		"\u008b\7\f\2\2\u008b\u008c\7\24\2\2\u008c\u008d\5\36\20\2\u008d\u008e"+
		"\7\24\2\2\u008e\u008f\5\36\20\2\u008f\u0090\7\24\2\2\u0090\u0093\5\36"+
		"\20\2\u0091\u0092\7\24\2\2\u0092\u0094\5\32\16\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7!\2\2\u0096\u0097\7\25"+
		"\2\2\u0097\u00f1\3\2\2\2\u0098\u0099\7\n\2\2\u0099\u009a\7 \2\2\u009a"+
		"\u009b\7\r\2\2\u009b\u009c\7\24\2\2\u009c\u009d\5\36\20\2\u009d\u009e"+
		"\7\24\2\2\u009e\u009f\5\36\20\2\u009f\u00a0\7\24\2\2\u00a0\u00a1\5\36"+
		"\20\2\u00a1\u00a2\7\24\2\2\u00a2\u00a5\5\36\20\2\u00a3\u00a4\7\24\2\2"+
		"\u00a4\u00a6\5\36\20\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9"+
		"\3\2\2\2\u00a7\u00a8\7\24\2\2\u00a8\u00aa\5\32\16\2\u00a9\u00a7\3\2\2"+
		"\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7!\2\2\u00ac\u00ad"+
		"\7\25\2\2\u00ad\u00f1\3\2\2\2\u00ae\u00af\7\n\2\2\u00af\u00b0\7 \2\2\u00b0"+
		"\u00b1\7\16\2\2\u00b1\u00b2\7\24\2\2\u00b2\u00b3\5\36\20\2\u00b3\u00b4"+
		"\7\24\2\2\u00b4\u00b5\5\36\20\2\u00b5\u00b6\7\24\2\2\u00b6\u00b7\5\36"+
		"\20\2\u00b7\u00b8\7\24\2\2\u00b8\u00bb\5\36\20\2\u00b9\u00ba\7\24\2\2"+
		"\u00ba\u00bc\5\32\16\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00be\7!\2\2\u00be\u00bf\7\25\2\2\u00bf\u00f1\3\2\2\2\u00c0"+
		"\u00c1\7\n\2\2\u00c1\u00c2\7 \2\2\u00c2\u00c3\7\17\2\2\u00c3\u00c4\7\24"+
		"\2\2\u00c4\u00c5\5\36\20\2\u00c5\u00c6\7\24\2\2\u00c6\u00c7\5\36\20\2"+
		"\u00c7\u00c8\7\24\2\2\u00c8\u00c9\5\36\20\2\u00c9\u00ca\7\24\2\2\u00ca"+
		"\u00cb\5\36\20\2\u00cb\u00cc\7\24\2\2\u00cc\u00cd\5\36\20\2\u00cd\u00ce"+
		"\7\24\2\2\u00ce\u00d1\5\36\20\2\u00cf\u00d0\7\24\2\2\u00d0\u00d2\5\36"+
		"\20\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d4\7\24\2\2\u00d4\u00d6\5\32\16\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7!\2\2\u00d8\u00d9\7\25\2\2\u00d9"+
		"\u00f1\3\2\2\2\u00da\u00db\7\n\2\2\u00db\u00dc\7 \2\2\u00dc\u00dd\7\20"+
		"\2\2\u00dd\u00de\7\24\2\2\u00de\u00df\5\36\20\2\u00df\u00e0\7\24\2\2\u00e0"+
		"\u00e1\5\36\20\2\u00e1\u00e2\7\24\2\2\u00e2\u00e3\5\36\20\2\u00e3\u00e4"+
		"\7\24\2\2\u00e4\u00e5\5\36\20\2\u00e5\u00e6\7\24\2\2\u00e6\u00e7\5\36"+
		"\20\2\u00e7\u00e8\7\24\2\2\u00e8\u00eb\5\36\20\2\u00e9\u00ea\7\24\2\2"+
		"\u00ea\u00ec\5\32\16\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ee\7!\2\2\u00ee\u00ef\7\25\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"t\3\2\2\2\u00f0\u0088\3\2\2\2\u00f0\u0098\3\2\2\2\u00f0\u00ae\3\2\2\2"+
		"\u00f0\u00c0\3\2\2\2\u00f0\u00da\3\2\2\2\u00f1\31\3\2\2\2\u00f2\u00f3"+
		"\7\t\2\2\u00f3\u00f4\7 \2\2\u00f4\u00f5\5\36\20\2\u00f5\u00f6\7\24\2\2"+
		"\u00f6\u00f7\5\36\20\2\u00f7\u00f8\7\24\2\2\u00f8\u00f9\5\36\20\2\u00f9"+
		"\u00fa\7!\2\2\u00fa\33\3\2\2\2\u00fb\u00fc\t\2\2\2\u00fc\35\3\2\2\2\u00fd"+
		"\u00fe\b\20\1\2\u00fe\u00ff\7 \2\2\u00ff\u0100\5\36\20\2\u0100\u0101\7"+
		"!\2\2\u0101\u0119\3\2\2\2\u0102\u0103\7\30\2\2\u0103\u0104\7 \2\2\u0104"+
		"\u0105\5\36\20\2\u0105\u0106\7!\2\2\u0106\u0119\3\2\2\2\u0107\u0108\7"+
		"\30\2\2\u0108\u0119\7&\2\2\u0109\u010a\7\30\2\2\u010a\u0119\5\34\17\2"+
		"\u010b\u0119\5\34\17\2\u010c\u0119\7&\2\2\u010d\u010e\7\35\2\2\u010e\u010f"+
		"\7 \2\2\u010f\u0110\5\36\20\2\u0110\u0111\7!\2\2\u0111\u0119\3\2\2\2\u0112"+
		"\u0113\7\36\2\2\u0113\u0114\7 \2\2\u0114\u0115\5\36\20\2\u0115\u0116\7"+
		"!\2\2\u0116\u0119\3\2\2\2\u0117\u0119\7\37\2\2\u0118\u00fd\3\2\2\2\u0118"+
		"\u0102\3\2\2\2\u0118\u0107\3\2\2\2\u0118\u0109\3\2\2\2\u0118\u010b\3\2"+
		"\2\2\u0118\u010c\3\2\2\2\u0118\u010d\3\2\2\2\u0118\u0112\3\2\2\2\u0118"+
		"\u0117\3\2\2\2\u0119\u0120\3\2\2\2\u011a\u011b\f\f\2\2\u011b\u011c\5 "+
		"\21\2\u011c\u011d\5\36\20\r\u011d\u011f\3\2\2\2\u011e\u011a\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\37\3\2\2"+
		"\2\u0122\u0120\3\2\2\2\u0123\u0124\t\3\2\2\u0124!\3\2\2\2\24$;AJXh\177"+
		"\u0083\u0093\u00a5\u00a9\u00bb\u00d1\u00d5\u00eb\u00f0\u0118\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}