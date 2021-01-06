// Generated from C:/Users/danbg/IdeaProjects/antlr4-turtle/src/main/antlr4/com/tec/antlrturtle\Logo.g4 by ANTLR 4.9


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
		T__0=1, T__1=2, T__2=3, MAYORQUE=4, MENORQUE=5, IGUALES=6, Y=7, O=8, ESPERA=9, 
		CENTRO=10, BLANCO=11, AZUL=12, MARRON=13, CIAN=14, GRIS=15, AMARILLO=16, 
		NEGRO=17, ROJO=18, VERDE=19, RESTO=20, SUMA=21, DIVISION=22, AZAR=23, 
		MENOS=24, REDONDEA=25, PRODUCTO=26, DIFERENCIA=27, POTENCIA=28, PONCOLORLAPIZ=29, 
		GOMA=30, PONX=31, PONY=32, RUMBO=33, PONRUMBO=34, APARECETORTUGA=35, OCULTATORTUGA=36, 
		INC=37, INIC=38, HAZ=39, FORWARD=40, BACK=41, LEFT=42, RIGHT=43, CLEARSCREEN=44, 
		SET=45, PEN_UP=46, PEN_DOWN=47, TRUE=48, FALSE=49, RESET_ANGLE=50, ID=51, 
		INT=52, STRING=53, POINT=54, NEWLINE=55, WS=56, COMMENT=57;
	public static final int
		RULE_prog = 0, RULE_variableExpreson = 1, RULE_coloExpresion = 2, RULE_booleanExpresion = 3, 
		RULE_intExpression = 4, RULE_logoExpression = 5, RULE_mayorque = 6, RULE_menorque = 7, 
		RULE_iguales = 8, RULE_o = 9, RULE_y = 10, RULE_blanco = 11, RULE_azul = 12, 
		RULE_marron = 13, RULE_cian = 14, RULE_gris = 15, RULE_amarillo = 16, 
		RULE_negro = 17, RULE_verde = 18, RULE_rojo = 19, RULE_suma = 20, RULE_resto = 21, 
		RULE_division = 22, RULE_menos = 23, RULE_azar = 24, RULE_producto = 25, 
		RULE_diferencia = 26, RULE_potencia = 27, RULE_redondea = 28, RULE_espera = 29, 
		RULE_centro = 30, RULE_poncolorlapiz = 31, RULE_goma = 32, RULE_ponx = 33, 
		RULE_pony = 34, RULE_rumbo = 35, RULE_ponrumbo = 36, RULE_inc = 37, RULE_inic = 38, 
		RULE_haz = 39, RULE_ocultatortuga = 40, RULE_aparecetortuga = 41, RULE_forward = 42, 
		RULE_back = 43, RULE_right = 44, RULE_left = 45, RULE_clearscreen = 46, 
		RULE_set = 47, RULE_penUp = 48, RULE_penDown = 49, RULE_resetAngle = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "variableExpreson", "coloExpresion", "booleanExpresion", "intExpression", 
			"logoExpression", "mayorque", "menorque", "iguales", "o", "y", "blanco", 
			"azul", "marron", "cian", "gris", "amarillo", "negro", "verde", "rojo", 
			"suma", "resto", "division", "menos", "azar", "producto", "diferencia", 
			"potencia", "redondea", "espera", "centro", "poncolorlapiz", "goma", 
			"ponx", "pony", "rumbo", "ponrumbo", "inc", "inic", "haz", "ocultatortuga", 
			"aparecetortuga", "forward", "back", "right", "left", "clearscreen", 
			"set", "penUp", "penDown", "resetAngle"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'='", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'true'", "'false'", "'resetAngle'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "MAYORQUE", "MENORQUE", "IGUALES", "Y", "O", 
			"ESPERA", "CENTRO", "BLANCO", "AZUL", "MARRON", "CIAN", "GRIS", "AMARILLO", 
			"NEGRO", "ROJO", "VERDE", "RESTO", "SUMA", "DIVISION", "AZAR", "MENOS", 
			"REDONDEA", "PRODUCTO", "DIFERENCIA", "POTENCIA", "PONCOLORLAPIZ", "GOMA", 
			"PONX", "PONY", "RUMBO", "PONRUMBO", "APARECETORTUGA", "OCULTATORTUGA", 
			"INC", "INIC", "HAZ", "FORWARD", "BACK", "LEFT", "RIGHT", "CLEARSCREEN", 
			"SET", "PEN_UP", "PEN_DOWN", "TRUE", "FALSE", "RESET_ANGLE", "ID", "INT", 
			"STRING", "POINT", "NEWLINE", "WS", "COMMENT"
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
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				logoExpression();
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYORQUE) | (1L << MENORQUE) | (1L << IGUALES) | (1L << Y) | (1L << O) | (1L << ESPERA) | (1L << CENTRO) | (1L << BLANCO) | (1L << AZUL) | (1L << MARRON) | (1L << CIAN) | (1L << GRIS) | (1L << AMARILLO) | (1L << NEGRO) | (1L << ROJO) | (1L << VERDE) | (1L << RESTO) | (1L << SUMA) | (1L << DIVISION) | (1L << AZAR) | (1L << MENOS) | (1L << REDONDEA) | (1L << PRODUCTO) | (1L << DIFERENCIA) | (1L << POTENCIA) | (1L << PONCOLORLAPIZ) | (1L << GOMA) | (1L << PONX) | (1L << PONY) | (1L << RUMBO) | (1L << PONRUMBO) | (1L << APARECETORTUGA) | (1L << OCULTATORTUGA) | (1L << INC) | (1L << INIC) | (1L << HAZ) | (1L << FORWARD) | (1L << BACK) | (1L << LEFT) | (1L << RIGHT) | (1L << CLEARSCREEN) | (1L << SET) | (1L << PEN_UP) | (1L << PEN_DOWN) | (1L << TRUE) | (1L << FALSE) | (1L << RESET_ANGLE) | (1L << INT))) != 0) );
			setState(107);
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
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESTO:
			case SUMA:
			case DIVISION:
			case AZAR:
			case MENOS:
			case REDONDEA:
			case PRODUCTO:
			case DIFERENCIA:
			case POTENCIA:
			case RUMBO:
			case INC:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				intExpression();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
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
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLANCO:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				blanco();
				}
				break;
			case AZUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				azul();
				}
				break;
			case MARRON:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				marron();
				}
				break;
			case CIAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				cian();
				}
				break;
			case GRIS:
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				gris();
				}
				break;
			case AMARILLO:
				enterOuterAlt(_localctx, 6);
				{
				setState(118);
				amarillo();
				}
				break;
			case NEGRO:
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				negro();
				}
				break;
			case VERDE:
				enterOuterAlt(_localctx, 8);
				{
				setState(120);
				verde();
				}
				break;
			case ROJO:
				enterOuterAlt(_localctx, 9);
				{
				setState(121);
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

	public static class BooleanExpresionContext extends ParserRuleContext {
		public MayorqueContext mayorque() {
			return getRuleContext(MayorqueContext.class,0);
		}
		public MenorqueContext menorque() {
			return getRuleContext(MenorqueContext.class,0);
		}
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public IgualesContext iguales() {
			return getRuleContext(IgualesContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(LogoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LogoParser.FALSE, 0); }
		public BooleanExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterBooleanExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitBooleanExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitBooleanExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpresionContext booleanExpresion() throws RecognitionException {
		BooleanExpresionContext _localctx = new BooleanExpresionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_booleanExpresion);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAYORQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				mayorque();
				}
				break;
			case MENORQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				menorque();
				}
				break;
			case O:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				o();
				}
				break;
			case Y:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				y();
				}
				break;
			case IGUALES:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				iguales();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				match(FALSE);
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
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public RumboContext rumbo() {
			return getRuleContext(RumboContext.class,0);
		}
		public ProductoContext producto() {
			return getRuleContext(ProductoContext.class,0);
		}
		public DiferenciaContext diferencia() {
			return getRuleContext(DiferenciaContext.class,0);
		}
		public PotenciaContext potencia() {
			return getRuleContext(PotenciaContext.class,0);
		}
		public RedondeaContext redondea() {
			return getRuleContext(RedondeaContext.class,0);
		}
		public AzarContext azar() {
			return getRuleContext(AzarContext.class,0);
		}
		public MenosContext menos() {
			return getRuleContext(MenosContext.class,0);
		}
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public RestoContext resto() {
			return getRuleContext(RestoContext.class,0);
		}
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public TerminalNode INT() { return getToken(LogoParser.INT, 0); }
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
		enterRule(_localctx, 8, RULE_intExpression);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				inc();
				}
				break;
			case RUMBO:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				rumbo();
				}
				break;
			case PRODUCTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				producto();
				}
				break;
			case DIFERENCIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				diferencia();
				}
				break;
			case POTENCIA:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				potencia();
				}
				break;
			case REDONDEA:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				redondea();
				}
				break;
			case AZAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				azar();
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
				menos();
				}
				break;
			case DIVISION:
				enterOuterAlt(_localctx, 9);
				{
				setState(141);
				division();
				}
				break;
			case RESTO:
				enterOuterAlt(_localctx, 10);
				{
				setState(142);
				resto();
				}
				break;
			case SUMA:
				enterOuterAlt(_localctx, 11);
				{
				setState(143);
				suma();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 12);
				{
				setState(144);
				match(INT);
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
		public BooleanExpresionContext booleanExpresion() {
			return getRuleContext(BooleanExpresionContext.class,0);
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
		enterRule(_localctx, 10, RULE_logoExpression);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORWARD:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				forward();
				}
				break;
			case BACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				back();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				right();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				left();
				}
				break;
			case CLEARSCREEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				clearscreen();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				set();
				}
				break;
			case PEN_UP:
				enterOuterAlt(_localctx, 7);
				{
				setState(153);
				penUp();
				}
				break;
			case PEN_DOWN:
				enterOuterAlt(_localctx, 8);
				{
				setState(154);
				penDown();
				}
				break;
			case RESET_ANGLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(155);
				resetAngle();
				}
				break;
			case OCULTATORTUGA:
				enterOuterAlt(_localctx, 10);
				{
				setState(156);
				ocultatortuga();
				}
				break;
			case APARECETORTUGA:
				enterOuterAlt(_localctx, 11);
				{
				setState(157);
				aparecetortuga();
				}
				break;
			case HAZ:
				enterOuterAlt(_localctx, 12);
				{
				setState(158);
				haz();
				}
				break;
			case INIC:
				enterOuterAlt(_localctx, 13);
				{
				setState(159);
				inic();
				}
				break;
			case PONX:
				enterOuterAlt(_localctx, 14);
				{
				setState(160);
				ponx();
				}
				break;
			case PONY:
				enterOuterAlt(_localctx, 15);
				{
				setState(161);
				pony();
				}
				break;
			case GOMA:
				enterOuterAlt(_localctx, 16);
				{
				setState(162);
				goma();
				}
				break;
			case CENTRO:
				enterOuterAlt(_localctx, 17);
				{
				setState(163);
				centro();
				}
				break;
			case PONCOLORLAPIZ:
				enterOuterAlt(_localctx, 18);
				{
				setState(164);
				poncolorlapiz();
				}
				break;
			case ESPERA:
				enterOuterAlt(_localctx, 19);
				{
				setState(165);
				espera();
				}
				break;
			case PONRUMBO:
				enterOuterAlt(_localctx, 20);
				{
				setState(166);
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
				setState(167);
				coloExpresion();
				}
				break;
			case RESTO:
			case SUMA:
			case DIVISION:
			case AZAR:
			case MENOS:
			case REDONDEA:
			case PRODUCTO:
			case DIFERENCIA:
			case POTENCIA:
			case RUMBO:
			case INC:
			case INT:
				enterOuterAlt(_localctx, 22);
				{
				setState(168);
				intExpression();
				}
				break;
			case MAYORQUE:
			case MENORQUE:
			case IGUALES:
			case Y:
			case O:
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 23);
				{
				setState(169);
				booleanExpresion();
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

	public static class MayorqueContext extends ParserRuleContext {
		public TerminalNode MAYORQUE() { return getToken(LogoParser.MAYORQUE, 0); }
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public MayorqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayorque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterMayorque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitMayorque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitMayorque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MayorqueContext mayorque() throws RecognitionException {
		MayorqueContext _localctx = new MayorqueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mayorque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(MAYORQUE);
			setState(173);
			intExpression();
			setState(174);
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

	public static class MenorqueContext extends ParserRuleContext {
		public TerminalNode MENORQUE() { return getToken(LogoParser.MENORQUE, 0); }
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public MenorqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menorque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterMenorque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitMenorque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitMenorque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenorqueContext menorque() throws RecognitionException {
		MenorqueContext _localctx = new MenorqueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_menorque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(MENORQUE);
			setState(177);
			intExpression();
			setState(178);
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

	public static class IgualesContext extends ParserRuleContext {
		public TerminalNode IGUALES() { return getToken(LogoParser.IGUALES, 0); }
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public IgualesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iguales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterIguales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitIguales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitIguales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgualesContext iguales() throws RecognitionException {
		IgualesContext _localctx = new IgualesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_iguales);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IGUALES);
			setState(181);
			intExpression();
			setState(182);
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

	public static class OContext extends ParserRuleContext {
		public TerminalNode O() { return getToken(LogoParser.O, 0); }
		public List<BooleanExpresionContext> booleanExpresion() {
			return getRuleContexts(BooleanExpresionContext.class);
		}
		public BooleanExpresionContext booleanExpresion(int i) {
			return getRuleContext(BooleanExpresionContext.class,i);
		}
		public OContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_o; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OContext o() throws RecognitionException {
		OContext _localctx = new OContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_o);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(O);
			setState(185);
			booleanExpresion();
			setState(186);
			booleanExpresion();
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

	public static class YContext extends ParserRuleContext {
		public TerminalNode Y() { return getToken(LogoParser.Y, 0); }
		public List<BooleanExpresionContext> booleanExpresion() {
			return getRuleContexts(BooleanExpresionContext.class);
		}
		public BooleanExpresionContext booleanExpresion(int i) {
			return getRuleContext(BooleanExpresionContext.class,i);
		}
		public YContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitY(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YContext y() throws RecognitionException {
		YContext _localctx = new YContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(Y);
			setState(189);
			booleanExpresion();
			setState(190);
			booleanExpresion();
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
		enterRule(_localctx, 22, RULE_blanco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
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
		enterRule(_localctx, 24, RULE_azul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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
		enterRule(_localctx, 26, RULE_marron);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
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
		enterRule(_localctx, 28, RULE_cian);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
		enterRule(_localctx, 30, RULE_gris);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		enterRule(_localctx, 32, RULE_amarillo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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
		enterRule(_localctx, 34, RULE_negro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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
		enterRule(_localctx, 36, RULE_verde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
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
		enterRule(_localctx, 38, RULE_rojo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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

	public static class SumaContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(LogoParser.SUMA, 0); }
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitSuma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitSuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_suma);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(SUMA);
			setState(211);
			intExpression();
			setState(213); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(212);
					intExpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(215); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class RestoContext extends ParserRuleContext {
		public TerminalNode RESTO() { return getToken(LogoParser.RESTO, 0); }
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public RestoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterResto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitResto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitResto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestoContext resto() throws RecognitionException {
		RestoContext _localctx = new RestoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_resto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(RESTO);
			setState(218);
			intExpression();
			setState(219);
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

	public static class DivisionContext extends ParserRuleContext {
		public TerminalNode DIVISION() { return getToken(LogoParser.DIVISION, 0); }
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(DIVISION);
			setState(222);
			intExpression();
			setState(223);
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

	public static class MenosContext extends ParserRuleContext {
		public TerminalNode MENOS() { return getToken(LogoParser.MENOS, 0); }
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public MenosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterMenos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitMenos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitMenos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenosContext menos() throws RecognitionException {
		MenosContext _localctx = new MenosContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_menos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(MENOS);
			setState(226);
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

	public static class AzarContext extends ParserRuleContext {
		public TerminalNode AZAR() { return getToken(LogoParser.AZAR, 0); }
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public AzarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_azar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterAzar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitAzar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitAzar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AzarContext azar() throws RecognitionException {
		AzarContext _localctx = new AzarContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_azar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(AZAR);
			setState(229);
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
		enterRule(_localctx, 50, RULE_producto);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(PRODUCTO);
			setState(233); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(232);
					intExpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(235); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class DiferenciaContext extends ParserRuleContext {
		public TerminalNode DIFERENCIA() { return getToken(LogoParser.DIFERENCIA, 0); }
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public DiferenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diferencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterDiferencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitDiferencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitDiferencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiferenciaContext diferencia() throws RecognitionException {
		DiferenciaContext _localctx = new DiferenciaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_diferencia);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(DIFERENCIA);
			setState(239); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(238);
					intExpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(241); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class PotenciaContext extends ParserRuleContext {
		public TerminalNode POTENCIA() { return getToken(LogoParser.POTENCIA, 0); }
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public PotenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterPotencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitPotencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitPotencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PotenciaContext potencia() throws RecognitionException {
		PotenciaContext _localctx = new PotenciaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_potencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(POTENCIA);
			setState(244);
			intExpression();
			setState(245);
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

	public static class RedondeaContext extends ParserRuleContext {
		public TerminalNode REDONDEA() { return getToken(LogoParser.REDONDEA, 0); }
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public RedondeaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redondea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).enterRedondea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoListener ) ((LogoListener)listener).exitRedondea(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoVisitor ) return ((LogoVisitor<? extends T>)visitor).visitRedondea(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RedondeaContext redondea() throws RecognitionException {
		RedondeaContext _localctx = new RedondeaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_redondea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(REDONDEA);
			setState(248);
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
		enterRule(_localctx, 58, RULE_espera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(ESPERA);
			setState(251);
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
		enterRule(_localctx, 60, RULE_centro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		enterRule(_localctx, 62, RULE_poncolorlapiz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(PONCOLORLAPIZ);
			setState(256);
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
		enterRule(_localctx, 64, RULE_goma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
		enterRule(_localctx, 66, RULE_ponx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(PONX);
			setState(261);
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
		enterRule(_localctx, 68, RULE_pony);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(PONY);
			setState(264);
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
		enterRule(_localctx, 70, RULE_rumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
		enterRule(_localctx, 72, RULE_ponrumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(PONRUMBO);
			setState(269);
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
		enterRule(_localctx, 74, RULE_inc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(INC);
			setState(272);
			match(T__0);
			setState(274); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(273);
				intExpression();
				}
				}
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESTO) | (1L << SUMA) | (1L << DIVISION) | (1L << AZAR) | (1L << MENOS) | (1L << REDONDEA) | (1L << PRODUCTO) | (1L << DIFERENCIA) | (1L << POTENCIA) | (1L << RUMBO) | (1L << INC) | (1L << INT))) != 0) );
			setState(278);
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
		enterRule(_localctx, 76, RULE_inic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(INIC);
			setState(281);
			match(ID);
			setState(282);
			match(T__2);
			setState(283);
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
		enterRule(_localctx, 78, RULE_haz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(HAZ);
			setState(286);
			match(ID);
			setState(287);
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
		enterRule(_localctx, 80, RULE_ocultatortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
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
		enterRule(_localctx, 82, RULE_aparecetortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
		enterRule(_localctx, 84, RULE_forward);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(FORWARD);
			setState(294);
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
		enterRule(_localctx, 86, RULE_back);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(BACK);
			setState(297);
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
		enterRule(_localctx, 88, RULE_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(RIGHT);
			setState(300);
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
		enterRule(_localctx, 90, RULE_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(LEFT);
			setState(303);
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
		enterRule(_localctx, 92, RULE_clearscreen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
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
		enterRule(_localctx, 94, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(SET);
			setState(308);
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
		enterRule(_localctx, 96, RULE_penUp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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
		enterRule(_localctx, 98, RULE_penDown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
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
		enterRule(_localctx, 100, RULE_resetAngle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u013f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\6\2j\n\2\r\2\16\2k\3\2\3\2\3\3\3\3\5\3r\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4}\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0086\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0094\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u00ad\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\6\26\u00d8\n\26\r\26\16\26\u00d9\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\6\33\u00ec\n\33\r\33"+
		"\16\33\u00ed\3\34\3\34\6\34\u00f2\n\34\r\34\16\34\u00f3\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3"+
		"$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\6\'\u0115\n\'\r\'\16\'\u0116\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3"+
		"/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\2"+
		"\2\65\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFHJLNPRTVXZ\\^`bdf\2\2\2\u0140\2i\3\2\2\2\4q\3\2\2\2\6|\3\2\2\2\b\u0085"+
		"\3\2\2\2\n\u0093\3\2\2\2\f\u00ac\3\2\2\2\16\u00ae\3\2\2\2\20\u00b2\3\2"+
		"\2\2\22\u00b6\3\2\2\2\24\u00ba\3\2\2\2\26\u00be\3\2\2\2\30\u00c2\3\2\2"+
		"\2\32\u00c4\3\2\2\2\34\u00c6\3\2\2\2\36\u00c8\3\2\2\2 \u00ca\3\2\2\2\""+
		"\u00cc\3\2\2\2$\u00ce\3\2\2\2&\u00d0\3\2\2\2(\u00d2\3\2\2\2*\u00d4\3\2"+
		"\2\2,\u00db\3\2\2\2.\u00df\3\2\2\2\60\u00e3\3\2\2\2\62\u00e6\3\2\2\2\64"+
		"\u00e9\3\2\2\2\66\u00ef\3\2\2\28\u00f5\3\2\2\2:\u00f9\3\2\2\2<\u00fc\3"+
		"\2\2\2>\u00ff\3\2\2\2@\u0101\3\2\2\2B\u0104\3\2\2\2D\u0106\3\2\2\2F\u0109"+
		"\3\2\2\2H\u010c\3\2\2\2J\u010e\3\2\2\2L\u0111\3\2\2\2N\u011a\3\2\2\2P"+
		"\u011f\3\2\2\2R\u0123\3\2\2\2T\u0125\3\2\2\2V\u0127\3\2\2\2X\u012a\3\2"+
		"\2\2Z\u012d\3\2\2\2\\\u0130\3\2\2\2^\u0133\3\2\2\2`\u0135\3\2\2\2b\u0138"+
		"\3\2\2\2d\u013a\3\2\2\2f\u013c\3\2\2\2hj\5\f\7\2ih\3\2\2\2jk\3\2\2\2k"+
		"i\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\2\2\3n\3\3\2\2\2or\5\n\6\2pr\7\67\2"+
		"\2qo\3\2\2\2qp\3\2\2\2r\5\3\2\2\2s}\5\30\r\2t}\5\32\16\2u}\5\34\17\2v"+
		"}\5\36\20\2w}\5 \21\2x}\5\"\22\2y}\5$\23\2z}\5&\24\2{}\5(\25\2|s\3\2\2"+
		"\2|t\3\2\2\2|u\3\2\2\2|v\3\2\2\2|w\3\2\2\2|x\3\2\2\2|y\3\2\2\2|z\3\2\2"+
		"\2|{\3\2\2\2}\7\3\2\2\2~\u0086\5\16\b\2\177\u0086\5\20\t\2\u0080\u0086"+
		"\5\24\13\2\u0081\u0086\5\26\f\2\u0082\u0086\5\22\n\2\u0083\u0086\7\62"+
		"\2\2\u0084\u0086\7\63\2\2\u0085~\3\2\2\2\u0085\177\3\2\2\2\u0085\u0080"+
		"\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\t\3\2\2\2\u0087\u0094\5L\'\2\u0088\u0094\5H%\2\u0089"+
		"\u0094\5\64\33\2\u008a\u0094\5\66\34\2\u008b\u0094\58\35\2\u008c\u0094"+
		"\5:\36\2\u008d\u0094\5\62\32\2\u008e\u0094\5\60\31\2\u008f\u0094\5.\30"+
		"\2\u0090\u0094\5,\27\2\u0091\u0094\5*\26\2\u0092\u0094\7\66\2\2\u0093"+
		"\u0087\3\2\2\2\u0093\u0088\3\2\2\2\u0093\u0089\3\2\2\2\u0093\u008a\3\2"+
		"\2\2\u0093\u008b\3\2\2\2\u0093\u008c\3\2\2\2\u0093\u008d\3\2\2\2\u0093"+
		"\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0092\3\2\2\2\u0094\13\3\2\2\2\u0095\u00ad\5V,\2\u0096\u00ad"+
		"\5X-\2\u0097\u00ad\5Z.\2\u0098\u00ad\5\\/\2\u0099\u00ad\5^\60\2\u009a"+
		"\u00ad\5`\61\2\u009b\u00ad\5b\62\2\u009c\u00ad\5d\63\2\u009d\u00ad\5f"+
		"\64\2\u009e\u00ad\5R*\2\u009f\u00ad\5T+\2\u00a0\u00ad\5P)\2\u00a1\u00ad"+
		"\5N(\2\u00a2\u00ad\5D#\2\u00a3\u00ad\5F$\2\u00a4\u00ad\5B\"\2\u00a5\u00ad"+
		"\5> \2\u00a6\u00ad\5@!\2\u00a7\u00ad\5<\37\2\u00a8\u00ad\5J&\2\u00a9\u00ad"+
		"\5\6\4\2\u00aa\u00ad\5\n\6\2\u00ab\u00ad\5\b\5\2\u00ac\u0095\3\2\2\2\u00ac"+
		"\u0096\3\2\2\2\u00ac\u0097\3\2\2\2\u00ac\u0098\3\2\2\2\u00ac\u0099\3\2"+
		"\2\2\u00ac\u009a\3\2\2\2\u00ac\u009b\3\2\2\2\u00ac\u009c\3\2\2\2\u00ac"+
		"\u009d\3\2\2\2\u00ac\u009e\3\2\2\2\u00ac\u009f\3\2\2\2\u00ac\u00a0\3\2"+
		"\2\2\u00ac\u00a1\3\2\2\2\u00ac\u00a2\3\2\2\2\u00ac\u00a3\3\2\2\2\u00ac"+
		"\u00a4\3\2\2\2\u00ac\u00a5\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a7\3\2"+
		"\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\r\3\2\2\2\u00ae\u00af\7\6\2\2\u00af\u00b0\5\n\6\2"+
		"\u00b0\u00b1\5\n\6\2\u00b1\17\3\2\2\2\u00b2\u00b3\7\7\2\2\u00b3\u00b4"+
		"\5\n\6\2\u00b4\u00b5\5\n\6\2\u00b5\21\3\2\2\2\u00b6\u00b7\7\b\2\2\u00b7"+
		"\u00b8\5\n\6\2\u00b8\u00b9\5\n\6\2\u00b9\23\3\2\2\2\u00ba\u00bb\7\n\2"+
		"\2\u00bb\u00bc\5\b\5\2\u00bc\u00bd\5\b\5\2\u00bd\25\3\2\2\2\u00be\u00bf"+
		"\7\t\2\2\u00bf\u00c0\5\b\5\2\u00c0\u00c1\5\b\5\2\u00c1\27\3\2\2\2\u00c2"+
		"\u00c3\7\r\2\2\u00c3\31\3\2\2\2\u00c4\u00c5\7\16\2\2\u00c5\33\3\2\2\2"+
		"\u00c6\u00c7\7\17\2\2\u00c7\35\3\2\2\2\u00c8\u00c9\7\20\2\2\u00c9\37\3"+
		"\2\2\2\u00ca\u00cb\7\21\2\2\u00cb!\3\2\2\2\u00cc\u00cd\7\22\2\2\u00cd"+
		"#\3\2\2\2\u00ce\u00cf\7\23\2\2\u00cf%\3\2\2\2\u00d0\u00d1\7\25\2\2\u00d1"+
		"\'\3\2\2\2\u00d2\u00d3\7\24\2\2\u00d3)\3\2\2\2\u00d4\u00d5\7\27\2\2\u00d5"+
		"\u00d7\5\n\6\2\u00d6\u00d8\5\n\6\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da+\3\2\2\2\u00db\u00dc"+
		"\7\26\2\2\u00dc\u00dd\5\n\6\2\u00dd\u00de\5\n\6\2\u00de-\3\2\2\2\u00df"+
		"\u00e0\7\30\2\2\u00e0\u00e1\5\n\6\2\u00e1\u00e2\5\n\6\2\u00e2/\3\2\2\2"+
		"\u00e3\u00e4\7\32\2\2\u00e4\u00e5\5\n\6\2\u00e5\61\3\2\2\2\u00e6\u00e7"+
		"\7\31\2\2\u00e7\u00e8\5\n\6\2\u00e8\63\3\2\2\2\u00e9\u00eb\7\34\2\2\u00ea"+
		"\u00ec\5\n\6\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\65\3\2\2\2\u00ef\u00f1\7\35\2\2\u00f0\u00f2"+
		"\5\n\6\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\67\3\2\2\2\u00f5\u00f6\7\36\2\2\u00f6\u00f7\5\n\6"+
		"\2\u00f7\u00f8\5\n\6\2\u00f89\3\2\2\2\u00f9\u00fa\7\33\2\2\u00fa\u00fb"+
		"\5\n\6\2\u00fb;\3\2\2\2\u00fc\u00fd\7\13\2\2\u00fd\u00fe\5\n\6\2\u00fe"+
		"=\3\2\2\2\u00ff\u0100\7\f\2\2\u0100?\3\2\2\2\u0101\u0102\7\37\2\2\u0102"+
		"\u0103\5\6\4\2\u0103A\3\2\2\2\u0104\u0105\7 \2\2\u0105C\3\2\2\2\u0106"+
		"\u0107\7!\2\2\u0107\u0108\5\n\6\2\u0108E\3\2\2\2\u0109\u010a\7\"\2\2\u010a"+
		"\u010b\5\n\6\2\u010bG\3\2\2\2\u010c\u010d\7#\2\2\u010dI\3\2\2\2\u010e"+
		"\u010f\7$\2\2\u010f\u0110\5\n\6\2\u0110K\3\2\2\2\u0111\u0112\7\'\2\2\u0112"+
		"\u0114\7\3\2\2\u0113\u0115\5\n\6\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\7\4\2\2\u0119M\3\2\2\2\u011a\u011b\7(\2\2\u011b\u011c\7\65\2\2"+
		"\u011c\u011d\7\5\2\2\u011d\u011e\5\4\3\2\u011eO\3\2\2\2\u011f\u0120\7"+
		")\2\2\u0120\u0121\7\65\2\2\u0121\u0122\5\4\3\2\u0122Q\3\2\2\2\u0123\u0124"+
		"\7&\2\2\u0124S\3\2\2\2\u0125\u0126\7%\2\2\u0126U\3\2\2\2\u0127\u0128\7"+
		"*\2\2\u0128\u0129\5\n\6\2\u0129W\3\2\2\2\u012a\u012b\7+\2\2\u012b\u012c"+
		"\5\n\6\2\u012cY\3\2\2\2\u012d\u012e\7-\2\2\u012e\u012f\5\n\6\2\u012f["+
		"\3\2\2\2\u0130\u0131\7,\2\2\u0131\u0132\5\n\6\2\u0132]\3\2\2\2\u0133\u0134"+
		"\7.\2\2\u0134_\3\2\2\2\u0135\u0136\7/\2\2\u0136\u0137\78\2\2\u0137a\3"+
		"\2\2\2\u0138\u0139\7\60\2\2\u0139c\3\2\2\2\u013a\u013b\7\61\2\2\u013b"+
		"e\3\2\2\2\u013c\u013d\7\64\2\2\u013dg\3\2\2\2\fkq|\u0085\u0093\u00ac\u00d9"+
		"\u00ed\u00f3\u0116";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}