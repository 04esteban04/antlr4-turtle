// Generated from C:/Users/Daniel Brenes/Desktop/antlr4-turtle-master/antlr4-turtle-master/src/main/antlr4/com/nikoskatsanos/antlrturtle\Logo.g4 by ANTLR 4.9


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ESPERA=4, CENTRO=5, BLANCO=6, AZUL=7, MARRON=8, 
		CIAN=9, GRIS=10, AMARILLO=11, NEGRO=12, ROJO=13, VERDE=14, PRODUCTO=15, 
		PONCOLORLAPIZ=16, GOMA=17, PONX=18, PONY=19, RUMBO=20, PONRUMBO=21, APARECETORTUGA=22, 
		OCULTATORTUGA=23, INC=24, INIC=25, HAZ=26, FORWARD=27, BACK=28, LEFT=29, 
		RIGHT=30, CLEARSCREEN=31, SET=32, PEN_UP=33, PEN_DOWN=34, RESET_ANGLE=35, 
		ID=36, INT=37, STRING=38, POINT=39, NEWLINE=40, WS=41, COMMENT=42;
	public static final int
		RULE_prog = 0, RULE_variableExpreson = 1, RULE_coloExpresion = 2, RULE_intExpression = 3, 
		RULE_logoExpression = 4, RULE_blanco = 5, RULE_azul = 6, RULE_marron = 7, 
		RULE_cian = 8, RULE_gris = 9, RULE_amarillo = 10, RULE_negro = 11, RULE_verde = 12, 
		RULE_rojo = 13, RULE_producto = 14, RULE_espera = 15, RULE_centro = 16, 
		RULE_poncolorlapiz = 17, RULE_goma = 18, RULE_ponx = 19, RULE_pony = 20, 
		RULE_rumbo = 21, RULE_ponrumbo = 22, RULE_inc = 23, RULE_inic = 24, RULE_haz = 25, 
		RULE_ocultatortuga = 26, RULE_aparecetortuga = 27, RULE_forward = 28, 
		RULE_back = 29, RULE_right = 30, RULE_left = 31, RULE_clearscreen = 32, 
		RULE_set = 33, RULE_penUp = 34, RULE_penDown = 35, RULE_resetAngle = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "variableExpreson", "coloExpresion", "intExpression", "logoExpression", 
			"blanco", "azul", "marron", "cian", "gris", "amarillo", "negro", "verde", 
			"rojo", "producto", "espera", "centro", "poncolorlapiz", "goma", "ponx", 
			"pony", "rumbo", "ponrumbo", "inc", "inic", "haz", "ocultatortuga", "aparecetortuga", 
			"forward", "back", "right", "left", "clearscreen", "set", "penUp", "penDown", 
			"resetAngle"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'='", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'resetAngle'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ESPERA", "CENTRO", "BLANCO", "AZUL", "MARRON", 
			"CIAN", "GRIS", "AMARILLO", "NEGRO", "ROJO", "VERDE", "PRODUCTO", "PONCOLORLAPIZ", 
			"GOMA", "PONX", "PONY", "RUMBO", "PONRUMBO", "APARECETORTUGA", "OCULTATORTUGA", 
			"INC", "INIC", "HAZ", "FORWARD", "BACK", "LEFT", "RIGHT", "CLEARSCREEN", 
			"SET", "PEN_UP", "PEN_DOWN", "RESET_ANGLE", "ID", "INT", "STRING", "POINT", 
			"NEWLINE", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LogoParser.EOF, 0); }
		public List<LogoExpressionContext> logoExpression() {
			return getRuleContexts(LogoExpressionContext.class);
		}
		public LogoExpressionContext logoExpression(int i) {
			return getRuleContext(LogoExpressionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				logoExpression();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESPERA) | (1L << CENTRO) | (1L << BLANCO) | (1L << AZUL) | (1L << MARRON) | (1L << CIAN) | (1L << GRIS) | (1L << AMARILLO) | (1L << NEGRO) | (1L << ROJO) | (1L << VERDE) | (1L << PRODUCTO) | (1L << PONCOLORLAPIZ) | (1L << GOMA) | (1L << PONX) | (1L << PONY) | (1L << RUMBO) | (1L << PONRUMBO) | (1L << APARECETORTUGA) | (1L << OCULTATORTUGA) | (1L << INC) | (1L << INIC) | (1L << HAZ) | (1L << FORWARD) | (1L << BACK) | (1L << LEFT) | (1L << RIGHT) | (1L << CLEARSCREEN) | (1L << SET) | (1L << PEN_UP) | (1L << PEN_DOWN) | (1L << RESET_ANGLE) | (1L << INT))) != 0) );
			setState(79);
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

	public static class VariableExpresonContext extends ParserRuleContext {
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(LogoParser.STRING, 0); }
		public VariableExpresonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableExpreson; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterVariableExpreson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitVariableExpreson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitVariableExpreson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableExpresonContext variableExpreson() throws RecognitionException {
		VariableExpresonContext _localctx = new VariableExpresonContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableExpreson);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRODUCTO:
			case RUMBO:
			case INC:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				intExpression();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(STRING);
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

	public static class ColoExpresionContext extends ParserRuleContext {
		public BlancoContext blanco() {
			return getRuleContext(BlancoContext.class,0);
		}
		public AzulContext azul() {
			return getRuleContext(AzulContext.class,0);
		}
		public MarronContext marron() {
			return getRuleContext(MarronContext.class,0);
		}
		public CianContext cian() {
			return getRuleContext(CianContext.class,0);
		}
		public GrisContext gris() {
			return getRuleContext(GrisContext.class,0);
		}
		public AmarilloContext amarillo() {
			return getRuleContext(AmarilloContext.class,0);
		}
		public NegroContext negro() {
			return getRuleContext(NegroContext.class,0);
		}
		public VerdeContext verde() {
			return getRuleContext(VerdeContext.class,0);
		}
		public RojoContext rojo() {
			return getRuleContext(RojoContext.class,0);
		}
		public ColoExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coloExpresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterColoExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitColoExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitColoExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColoExpresionContext coloExpresion() throws RecognitionException {
		ColoExpresionContext _localctx = new ColoExpresionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_coloExpresion);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLANCO:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				blanco();
				}
				break;
			case AZUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				azul();
				}
				break;
			case MARRON:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				marron();
				}
				break;
			case CIAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				cian();
				}
				break;
			case GRIS:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				gris();
				}
				break;
			case AMARILLO:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				amarillo();
				}
				break;
			case NEGRO:
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				negro();
				}
				break;
			case VERDE:
				enterOuterAlt(_localctx, 8);
				{
				setState(92);
				verde();
				}
				break;
			case ROJO:
				enterOuterAlt(_localctx, 9);
				{
				setState(93);
				rojo();
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

	public static class IntExpressionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LogoParser.INT, 0); }
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public RumboContext rumbo() {
			return getRuleContext(RumboContext.class,0);
		}
		public ProductoContext producto() {
			return getRuleContext(ProductoContext.class,0);
		}
		public IntExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterIntExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitIntExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitIntExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntExpressionContext intExpression() throws RecognitionException {
		IntExpressionContext _localctx = new IntExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_intExpression);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(INT);
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				inc();
				}
				break;
			case RUMBO:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				rumbo();
				}
				break;
			case PRODUCTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				producto();
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

	public static class LogoExpressionContext extends ParserRuleContext {
		public ForwardContext forward() {
			return getRuleContext(ForwardContext.class,0);
		}
		public BackContext back() {
			return getRuleContext(BackContext.class,0);
		}
		public RightContext right() {
			return getRuleContext(RightContext.class,0);
		}
		public LeftContext left() {
			return getRuleContext(LeftContext.class,0);
		}
		public ClearscreenContext clearscreen() {
			return getRuleContext(ClearscreenContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public PenUpContext penUp() {
			return getRuleContext(PenUpContext.class,0);
		}
		public PenDownContext penDown() {
			return getRuleContext(PenDownContext.class,0);
		}
		public ResetAngleContext resetAngle() {
			return getRuleContext(ResetAngleContext.class,0);
		}
		public OcultatortugaContext ocultatortuga() {
			return getRuleContext(OcultatortugaContext.class,0);
		}
		public AparecetortugaContext aparecetortuga() {
			return getRuleContext(AparecetortugaContext.class,0);
		}
		public HazContext haz() {
			return getRuleContext(HazContext.class,0);
		}
		public InicContext inic() {
			return getRuleContext(InicContext.class,0);
		}
		public PonxContext ponx() {
			return getRuleContext(PonxContext.class,0);
		}
		public PonyContext pony() {
			return getRuleContext(PonyContext.class,0);
		}
		public GomaContext goma() {
			return getRuleContext(GomaContext.class,0);
		}
		public CentroContext centro() {
			return getRuleContext(CentroContext.class,0);
		}
		public PoncolorlapizContext poncolorlapiz() {
			return getRuleContext(PoncolorlapizContext.class,0);
		}
		public EsperaContext espera() {
			return getRuleContext(EsperaContext.class,0);
		}
		public PonrumboContext ponrumbo() {
			return getRuleContext(PonrumboContext.class,0);
		}
		public ColoExpresionContext coloExpresion() {
			return getRuleContext(ColoExpresionContext.class,0);
		}
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public LogoExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logoExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterLogoExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitLogoExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitLogoExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogoExpressionContext logoExpression() throws RecognitionException {
		LogoExpressionContext _localctx = new LogoExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_logoExpression);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORWARD:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				forward();
				}
				break;
			case BACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				back();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				right();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				left();
				}
				break;
			case CLEARSCREEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				clearscreen();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				set();
				}
				break;
			case PEN_UP:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				penUp();
				}
				break;
			case PEN_DOWN:
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				penDown();
				}
				break;
			case RESET_ANGLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(110);
				resetAngle();
				}
				break;
			case OCULTATORTUGA:
				enterOuterAlt(_localctx, 10);
				{
				setState(111);
				ocultatortuga();
				}
				break;
			case APARECETORTUGA:
				enterOuterAlt(_localctx, 11);
				{
				setState(112);
				aparecetortuga();
				}
				break;
			case HAZ:
				enterOuterAlt(_localctx, 12);
				{
				setState(113);
				haz();
				}
				break;
			case INIC:
				enterOuterAlt(_localctx, 13);
				{
				setState(114);
				inic();
				}
				break;
			case PONX:
				enterOuterAlt(_localctx, 14);
				{
				setState(115);
				ponx();
				}
				break;
			case PONY:
				enterOuterAlt(_localctx, 15);
				{
				setState(116);
				pony();
				}
				break;
			case GOMA:
				enterOuterAlt(_localctx, 16);
				{
				setState(117);
				goma();
				}
				break;
			case CENTRO:
				enterOuterAlt(_localctx, 17);
				{
				setState(118);
				centro();
				}
				break;
			case PONCOLORLAPIZ:
				enterOuterAlt(_localctx, 18);
				{
				setState(119);
				poncolorlapiz();
				}
				break;
			case ESPERA:
				enterOuterAlt(_localctx, 19);
				{
				setState(120);
				espera();
				}
				break;
			case PONRUMBO:
				enterOuterAlt(_localctx, 20);
				{
				setState(121);
				ponrumbo();
				}
				break;
			case BLANCO:
			case AZUL:
			case MARRON:
			case CIAN:
			case GRIS:
			case AMARILLO:
			case NEGRO:
			case ROJO:
			case VERDE:
				enterOuterAlt(_localctx, 21);
				{
				setState(122);
				coloExpresion();
				}
				break;
			case PRODUCTO:
			case RUMBO:
			case INC:
			case INT:
				enterOuterAlt(_localctx, 22);
				{
				setState(123);
				intExpression();
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

	public static class BlancoContext extends ParserRuleContext {
		public TerminalNode BLANCO() { return getToken(LogoParser.BLANCO, 0); }
		public BlancoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blanco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBlanco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBlanco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBlanco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlancoContext blanco() throws RecognitionException {
		BlancoContext _localctx = new BlancoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blanco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(BLANCO);
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

	public static class AzulContext extends ParserRuleContext {
		public TerminalNode AZUL() { return getToken(LogoParser.AZUL, 0); }
		public AzulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_azul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAzul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAzul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAzul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AzulContext azul() throws RecognitionException {
		AzulContext _localctx = new AzulContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_azul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(AZUL);
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

	public static class MarronContext extends ParserRuleContext {
		public TerminalNode MARRON() { return getToken(LogoParser.MARRON, 0); }
		public MarronContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marron; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterMarron(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitMarron(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitMarron(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarronContext marron() throws RecognitionException {
		MarronContext _localctx = new MarronContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_marron);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(MARRON);
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

	public static class CianContext extends ParserRuleContext {
		public TerminalNode CIAN() { return getToken(LogoParser.CIAN, 0); }
		public CianContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cian; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterCian(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitCian(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitCian(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CianContext cian() throws RecognitionException {
		CianContext _localctx = new CianContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cian);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(CIAN);
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

	public static class GrisContext extends ParserRuleContext {
		public TerminalNode GRIS() { return getToken(LogoParser.GRIS, 0); }
		public GrisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gris; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterGris(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitGris(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitGris(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrisContext gris() throws RecognitionException {
		GrisContext _localctx = new GrisContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_gris);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(GRIS);
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

	public static class AmarilloContext extends ParserRuleContext {
		public TerminalNode AMARILLO() { return getToken(LogoParser.AMARILLO, 0); }
		public AmarilloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amarillo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAmarillo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAmarillo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAmarillo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmarilloContext amarillo() throws RecognitionException {
		AmarilloContext _localctx = new AmarilloContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_amarillo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(AMARILLO);
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

	public static class NegroContext extends ParserRuleContext {
		public TerminalNode NEGRO() { return getToken(LogoParser.NEGRO, 0); }
		public NegroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterNegro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitNegro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitNegro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegroContext negro() throws RecognitionException {
		NegroContext _localctx = new NegroContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_negro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(NEGRO);
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

	public static class VerdeContext extends ParserRuleContext {
		public TerminalNode VERDE() { return getToken(LogoParser.VERDE, 0); }
		public VerdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterVerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitVerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitVerde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerdeContext verde() throws RecognitionException {
		VerdeContext _localctx = new VerdeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_verde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(VERDE);
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

	public static class RojoContext extends ParserRuleContext {
		public TerminalNode ROJO() { return getToken(LogoParser.ROJO, 0); }
		public RojoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rojo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRojo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRojo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitRojo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RojoContext rojo() throws RecognitionException {
		RojoContext _localctx = new RojoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rojo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ROJO);
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

	public static class ProductoContext extends ParserRuleContext {
		public TerminalNode PRODUCTO() { return getToken(LogoParser.PRODUCTO, 0); }
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public ProductoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_producto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterProducto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitProducto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitProducto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductoContext producto() throws RecognitionException {
		ProductoContext _localctx = new ProductoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_producto);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(PRODUCTO);
			setState(146); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(145);
					intExpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(148); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class EsperaContext extends ParserRuleContext {
		public TerminalNode ESPERA() { return getToken(LogoParser.ESPERA, 0); }
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public EsperaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterEspera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitEspera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitEspera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EsperaContext espera() throws RecognitionException {
		EsperaContext _localctx = new EsperaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_espera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ESPERA);
			setState(151);
			intExpression();
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

	public static class CentroContext extends ParserRuleContext {
		public TerminalNode CENTRO() { return getToken(LogoParser.CENTRO, 0); }
		public CentroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_centro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterCentro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitCentro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitCentro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CentroContext centro() throws RecognitionException {
		CentroContext _localctx = new CentroContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_centro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(CENTRO);
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

	public static class PoncolorlapizContext extends ParserRuleContext {
		public TerminalNode PONCOLORLAPIZ() { return getToken(LogoParser.PONCOLORLAPIZ, 0); }
		public ColoExpresionContext coloExpresion() {
			return getRuleContext(ColoExpresionContext.class,0);
		}
		public PoncolorlapizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poncolorlapiz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPoncolorlapiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPoncolorlapiz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitPoncolorlapiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PoncolorlapizContext poncolorlapiz() throws RecognitionException {
		PoncolorlapizContext _localctx = new PoncolorlapizContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_poncolorlapiz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(PONCOLORLAPIZ);
			setState(156);
			coloExpresion();
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

	public static class GomaContext extends ParserRuleContext {
		public TerminalNode GOMA() { return getToken(LogoParser.GOMA, 0); }
		public GomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterGoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitGoma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitGoma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GomaContext goma() throws RecognitionException {
		GomaContext _localctx = new GomaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_goma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(GOMA);
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

	public static class PonxContext extends ParserRuleContext {
		public TerminalNode PONX() { return getToken(LogoParser.PONX, 0); }
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public PonxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPonx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPonx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitPonx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PonxContext ponx() throws RecognitionException {
		PonxContext _localctx = new PonxContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ponx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(PONX);
			setState(161);
			intExpression();
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

	public static class PonyContext extends ParserRuleContext {
		public TerminalNode PONY() { return getToken(LogoParser.PONY, 0); }
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public PonyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pony; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPony(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPony(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitPony(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PonyContext pony() throws RecognitionException {
		PonyContext _localctx = new PonyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pony);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(PONY);
			setState(164);
			intExpression();
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

	public static class RumboContext extends ParserRuleContext {
		public TerminalNode RUMBO() { return getToken(LogoParser.RUMBO, 0); }
		public RumboContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rumbo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRumbo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRumbo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitRumbo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RumboContext rumbo() throws RecognitionException {
		RumboContext _localctx = new RumboContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(RUMBO);
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

	public static class PonrumboContext extends ParserRuleContext {
		public TerminalNode PONRUMBO() { return getToken(LogoParser.PONRUMBO, 0); }
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public PonrumboContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponrumbo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPonrumbo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPonrumbo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitPonrumbo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PonrumboContext ponrumbo() throws RecognitionException {
		PonrumboContext _localctx = new PonrumboContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ponrumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(PONRUMBO);
			setState(169);
			intExpression();
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

	public static class IncContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(LogoParser.INC, 0); }
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_inc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(INC);
			setState(172);
			match(T__0);
			setState(174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173);
				intExpression();
				}
				}
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRODUCTO) | (1L << RUMBO) | (1L << INC) | (1L << INT))) != 0) );
			setState(178);
			match(T__1);
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

	public static class InicContext extends ParserRuleContext {
		public TerminalNode INIC() { return getToken(LogoParser.INIC, 0); }
		public TerminalNode ID() { return getToken(LogoParser.ID, 0); }
		public VariableExpresonContext variableExpreson() {
			return getRuleContext(VariableExpresonContext.class,0);
		}
		public InicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterInic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitInic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitInic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicContext inic() throws RecognitionException {
		InicContext _localctx = new InicContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_inic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(INIC);
			setState(181);
			match(ID);
			setState(182);
			match(T__2);
			setState(183);
			variableExpreson();
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

	public static class HazContext extends ParserRuleContext {
		public TerminalNode HAZ() { return getToken(LogoParser.HAZ, 0); }
		public TerminalNode ID() { return getToken(LogoParser.ID, 0); }
		public VariableExpresonContext variableExpreson() {
			return getRuleContext(VariableExpresonContext.class,0);
		}
		public HazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterHaz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitHaz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitHaz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HazContext haz() throws RecognitionException {
		HazContext _localctx = new HazContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_haz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(HAZ);
			setState(186);
			match(ID);
			setState(187);
			variableExpreson();
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

	public static class OcultatortugaContext extends ParserRuleContext {
		public TerminalNode OCULTATORTUGA() { return getToken(LogoParser.OCULTATORTUGA, 0); }
		public OcultatortugaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ocultatortuga; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterOcultatortuga(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitOcultatortuga(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitOcultatortuga(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OcultatortugaContext ocultatortuga() throws RecognitionException {
		OcultatortugaContext _localctx = new OcultatortugaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ocultatortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(OCULTATORTUGA);
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

	public static class AparecetortugaContext extends ParserRuleContext {
		public TerminalNode APARECETORTUGA() { return getToken(LogoParser.APARECETORTUGA, 0); }
		public AparecetortugaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aparecetortuga; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAparecetortuga(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAparecetortuga(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAparecetortuga(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AparecetortugaContext aparecetortuga() throws RecognitionException {
		AparecetortugaContext _localctx = new AparecetortugaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_aparecetortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(APARECETORTUGA);
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

	public static class ForwardContext extends ParserRuleContext {
		public TerminalNode FORWARD() { return getToken(LogoParser.FORWARD, 0); }
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public ForwardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forward; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterForward(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitForward(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitForward(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForwardContext forward() throws RecognitionException {
		ForwardContext _localctx = new ForwardContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_forward);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(FORWARD);
			setState(194);
			intExpression();
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

	public static class BackContext extends ParserRuleContext {
		public TerminalNode BACK() { return getToken(LogoParser.BACK, 0); }
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public BackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_back; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackContext back() throws RecognitionException {
		BackContext _localctx = new BackContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_back);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(BACK);
			setState(197);
			intExpression();
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

	public static class RightContext extends ParserRuleContext {
		public TerminalNode RIGHT() { return getToken(LogoParser.RIGHT, 0); }
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public RightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightContext right() throws RecognitionException {
		RightContext _localctx = new RightContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(RIGHT);
			setState(200);
			intExpression();
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

	public static class LeftContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(LogoParser.LEFT, 0); }
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public LeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftContext left() throws RecognitionException {
		LeftContext _localctx = new LeftContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(LEFT);
			setState(203);
			intExpression();
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

	public static class ClearscreenContext extends ParserRuleContext {
		public TerminalNode CLEARSCREEN() { return getToken(LogoParser.CLEARSCREEN, 0); }
		public ClearscreenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clearscreen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterClearscreen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitClearscreen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitClearscreen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClearscreenContext clearscreen() throws RecognitionException {
		ClearscreenContext _localctx = new ClearscreenContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_clearscreen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(CLEARSCREEN);
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

	public static class SetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(LogoParser.SET, 0); }
		public TerminalNode POINT() { return getToken(LogoParser.POINT, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(SET);
			setState(208);
			match(POINT);
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

	public static class PenUpContext extends ParserRuleContext {
		public TerminalNode PEN_UP() { return getToken(LogoParser.PEN_UP, 0); }
		public PenUpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penUp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPenUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPenUp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitPenUp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PenUpContext penUp() throws RecognitionException {
		PenUpContext _localctx = new PenUpContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_penUp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(PEN_UP);
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

	public static class PenDownContext extends ParserRuleContext {
		public TerminalNode PEN_DOWN() { return getToken(LogoParser.PEN_DOWN, 0); }
		public PenDownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penDown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPenDown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPenDown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitPenDown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PenDownContext penDown() throws RecognitionException {
		PenDownContext _localctx = new PenDownContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_penDown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(PEN_DOWN);
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

	public static class ResetAngleContext extends ParserRuleContext {
		public TerminalNode RESET_ANGLE() { return getToken(LogoParser.RESET_ANGLE, 0); }
		public ResetAngleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resetAngle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterResetAngle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitResetAngle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitResetAngle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResetAngleContext resetAngle() throws RecognitionException {
		ResetAngleContext _localctx = new ResetAngleContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_resetAngle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(RESET_ANGLE);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\6\2N\n\2\r\2\16\2O\3\2\3\2\3\3"+
		"\3\3\5\3V\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4a\n\4\3\5\3\5\3\5"+
		"\3\5\5\5g\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\177\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\6\20\u0095"+
		"\n\20\r\20\16\20\u0096\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\6\31\u00b1\n\31\r\31\16\31\u00b2\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\2\2\'\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\2\2\u00d9"+
		"\2M\3\2\2\2\4U\3\2\2\2\6`\3\2\2\2\bf\3\2\2\2\n~\3\2\2\2\f\u0080\3\2\2"+
		"\2\16\u0082\3\2\2\2\20\u0084\3\2\2\2\22\u0086\3\2\2\2\24\u0088\3\2\2\2"+
		"\26\u008a\3\2\2\2\30\u008c\3\2\2\2\32\u008e\3\2\2\2\34\u0090\3\2\2\2\36"+
		"\u0092\3\2\2\2 \u0098\3\2\2\2\"\u009b\3\2\2\2$\u009d\3\2\2\2&\u00a0\3"+
		"\2\2\2(\u00a2\3\2\2\2*\u00a5\3\2\2\2,\u00a8\3\2\2\2.\u00aa\3\2\2\2\60"+
		"\u00ad\3\2\2\2\62\u00b6\3\2\2\2\64\u00bb\3\2\2\2\66\u00bf\3\2\2\28\u00c1"+
		"\3\2\2\2:\u00c3\3\2\2\2<\u00c6\3\2\2\2>\u00c9\3\2\2\2@\u00cc\3\2\2\2B"+
		"\u00cf\3\2\2\2D\u00d1\3\2\2\2F\u00d4\3\2\2\2H\u00d6\3\2\2\2J\u00d8\3\2"+
		"\2\2LN\5\n\6\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\2"+
		"\2\3R\3\3\2\2\2SV\5\b\5\2TV\7(\2\2US\3\2\2\2UT\3\2\2\2V\5\3\2\2\2Wa\5"+
		"\f\7\2Xa\5\16\b\2Ya\5\20\t\2Za\5\22\n\2[a\5\24\13\2\\a\5\26\f\2]a\5\30"+
		"\r\2^a\5\32\16\2_a\5\34\17\2`W\3\2\2\2`X\3\2\2\2`Y\3\2\2\2`Z\3\2\2\2`"+
		"[\3\2\2\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\7\3\2\2\2bg\7\'\2"+
		"\2cg\5\60\31\2dg\5,\27\2eg\5\36\20\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3"+
		"\2\2\2g\t\3\2\2\2h\177\5:\36\2i\177\5<\37\2j\177\5> \2k\177\5@!\2l\177"+
		"\5B\"\2m\177\5D#\2n\177\5F$\2o\177\5H%\2p\177\5J&\2q\177\5\66\34\2r\177"+
		"\58\35\2s\177\5\64\33\2t\177\5\62\32\2u\177\5(\25\2v\177\5*\26\2w\177"+
		"\5&\24\2x\177\5\"\22\2y\177\5$\23\2z\177\5 \21\2{\177\5.\30\2|\177\5\6"+
		"\4\2}\177\5\b\5\2~h\3\2\2\2~i\3\2\2\2~j\3\2\2\2~k\3\2\2\2~l\3\2\2\2~m"+
		"\3\2\2\2~n\3\2\2\2~o\3\2\2\2~p\3\2\2\2~q\3\2\2\2~r\3\2\2\2~s\3\2\2\2~"+
		"t\3\2\2\2~u\3\2\2\2~v\3\2\2\2~w\3\2\2\2~x\3\2\2\2~y\3\2\2\2~z\3\2\2\2"+
		"~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\13\3\2\2\2\u0080\u0081\7\b\2\2\u0081"+
		"\r\3\2\2\2\u0082\u0083\7\t\2\2\u0083\17\3\2\2\2\u0084\u0085\7\n\2\2\u0085"+
		"\21\3\2\2\2\u0086\u0087\7\13\2\2\u0087\23\3\2\2\2\u0088\u0089\7\f\2\2"+
		"\u0089\25\3\2\2\2\u008a\u008b\7\r\2\2\u008b\27\3\2\2\2\u008c\u008d\7\16"+
		"\2\2\u008d\31\3\2\2\2\u008e\u008f\7\20\2\2\u008f\33\3\2\2\2\u0090\u0091"+
		"\7\17\2\2\u0091\35\3\2\2\2\u0092\u0094\7\21\2\2\u0093\u0095\5\b\5\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\37\3\2\2\2\u0098\u0099\7\6\2\2\u0099\u009a\5\b\5\2\u009a!\3"+
		"\2\2\2\u009b\u009c\7\7\2\2\u009c#\3\2\2\2\u009d\u009e\7\22\2\2\u009e\u009f"+
		"\5\6\4\2\u009f%\3\2\2\2\u00a0\u00a1\7\23\2\2\u00a1\'\3\2\2\2\u00a2\u00a3"+
		"\7\24\2\2\u00a3\u00a4\5\b\5\2\u00a4)\3\2\2\2\u00a5\u00a6\7\25\2\2\u00a6"+
		"\u00a7\5\b\5\2\u00a7+\3\2\2\2\u00a8\u00a9\7\26\2\2\u00a9-\3\2\2\2\u00aa"+
		"\u00ab\7\27\2\2\u00ab\u00ac\5\b\5\2\u00ac/\3\2\2\2\u00ad\u00ae\7\32\2"+
		"\2\u00ae\u00b0\7\3\2\2\u00af\u00b1\5\b\5\2\u00b0\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\7\4\2\2\u00b5\61\3\2\2\2\u00b6\u00b7\7\33\2\2\u00b7\u00b8\7&\2"+
		"\2\u00b8\u00b9\7\5\2\2\u00b9\u00ba\5\4\3\2\u00ba\63\3\2\2\2\u00bb\u00bc"+
		"\7\34\2\2\u00bc\u00bd\7&\2\2\u00bd\u00be\5\4\3\2\u00be\65\3\2\2\2\u00bf"+
		"\u00c0\7\31\2\2\u00c0\67\3\2\2\2\u00c1\u00c2\7\30\2\2\u00c29\3\2\2\2\u00c3"+
		"\u00c4\7\35\2\2\u00c4\u00c5\5\b\5\2\u00c5;\3\2\2\2\u00c6\u00c7\7\36\2"+
		"\2\u00c7\u00c8\5\b\5\2\u00c8=\3\2\2\2\u00c9\u00ca\7 \2\2\u00ca\u00cb\5"+
		"\b\5\2\u00cb?\3\2\2\2\u00cc\u00cd\7\37\2\2\u00cd\u00ce\5\b\5\2\u00ceA"+
		"\3\2\2\2\u00cf\u00d0\7!\2\2\u00d0C\3\2\2\2\u00d1\u00d2\7\"\2\2\u00d2\u00d3"+
		"\7)\2\2\u00d3E\3\2\2\2\u00d4\u00d5\7#\2\2\u00d5G\3\2\2\2\u00d6\u00d7\7"+
		"$\2\2\u00d7I\3\2\2\2\u00d8\u00d9\7%\2\2\u00d9K\3\2\2\2\tOU`f~\u0096\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}