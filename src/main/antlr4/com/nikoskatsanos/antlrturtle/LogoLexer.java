// Generated from C:/Users/Daniel Brenes/Desktop/antlr4-turtle-master/antlr4-turtle-master/src/main/antlr4/com/nikoskatsanos/antlrturtle\Logo.g4 by ANTLR 4.9
package com.nikoskatsanos.antlrturtle;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FORWARD=1, BACK=2, LEFT=3, RIGHT=4, CLEARSCREEN=5, SET=6, PEN_UP=7, PEN_DOWN=8, 
		RESET_ANGLE=9, INT=10, POINT=11, NEWLINE=12, WS=13, COMMENT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FD", "BK", "LT", "RT", "CLS", "ST", "PU", "PD", "FORWARD", "BACK", "LEFT", 
			"RIGHT", "CLEARSCREEN", "SET", "PEN_UP", "PEN_DOWN", "RESET_ANGLE", "INT", 
			"POINT", "NEWLINE", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'resetAngle'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FORWARD", "BACK", "LEFT", "RIGHT", "CLEARSCREEN", "SET", "PEN_UP", 
			"PEN_DOWN", "RESET_ANGLE", "INT", "POINT", "NEWLINE", "WS", "COMMENT"
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


	public LogoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u00bb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\5\29\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3A\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6b\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\5\7i\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\br\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t}\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\6\23\u009b\n\23\r\23\16\23\u009c\3\24\3\24\3"+
		"\24\3\24\3\25\5\25\u00a4\n\25\3\25\3\25\3\25\3\25\3\26\6\26\u00ab\n\26"+
		"\r\26\16\26\u00ac\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00b5\n\27\f\27\16"+
		"\27\u00b8\13\27\3\27\3\27\2\2\30\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23"+
		"\3\25\4\27\5\31\6\33\7\35\b\37\t!\n#\13%\f\'\r)\16+\17-\20\3\2\4\3\2\62"+
		";\3\2\f\f\2\u00be\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\38\3\2\2\2\5@\3\2\2\2"+
		"\7H\3\2\2\2\tQ\3\2\2\2\13a\3\2\2\2\rh\3\2\2\2\17q\3\2\2\2\21|\3\2\2\2"+
		"\23~\3\2\2\2\25\u0080\3\2\2\2\27\u0082\3\2\2\2\31\u0084\3\2\2\2\33\u0086"+
		"\3\2\2\2\35\u0088\3\2\2\2\37\u008a\3\2\2\2!\u008c\3\2\2\2#\u008e\3\2\2"+
		"\2%\u009a\3\2\2\2\'\u009e\3\2\2\2)\u00a3\3\2\2\2+\u00aa\3\2\2\2-\u00b0"+
		"\3\2\2\2/\60\7h\2\2\60\61\7q\2\2\61\62\7t\2\2\62\63\7y\2\2\63\64\7c\2"+
		"\2\64\65\7t\2\2\659\7f\2\2\66\67\7h\2\2\679\7f\2\28/\3\2\2\28\66\3\2\2"+
		"\29\4\3\2\2\2:;\7d\2\2;<\7c\2\2<=\7e\2\2=A\7m\2\2>?\7d\2\2?A\7m\2\2@:"+
		"\3\2\2\2@>\3\2\2\2A\6\3\2\2\2BC\7n\2\2CD\7g\2\2DE\7h\2\2EI\7v\2\2FG\7"+
		"n\2\2GI\7v\2\2HB\3\2\2\2HF\3\2\2\2I\b\3\2\2\2JK\7t\2\2KL\7k\2\2LM\7i\2"+
		"\2MN\7j\2\2NR\7v\2\2OP\7t\2\2PR\7v\2\2QJ\3\2\2\2QO\3\2\2\2R\n\3\2\2\2"+
		"ST\7e\2\2TU\7n\2\2UV\7g\2\2VW\7c\2\2WX\7t\2\2XY\7u\2\2YZ\7e\2\2Z[\7t\2"+
		"\2[\\\7g\2\2\\]\7g\2\2]b\7p\2\2^_\7e\2\2_`\7n\2\2`b\7u\2\2aS\3\2\2\2a"+
		"^\3\2\2\2b\f\3\2\2\2cd\7u\2\2de\7g\2\2ei\7v\2\2fg\7u\2\2gi\7v\2\2hc\3"+
		"\2\2\2hf\3\2\2\2i\16\3\2\2\2jk\7r\2\2kl\7g\2\2lm\7p\2\2mn\7W\2\2nr\7r"+
		"\2\2op\7r\2\2pr\7w\2\2qj\3\2\2\2qo\3\2\2\2r\20\3\2\2\2st\7r\2\2tu\7g\2"+
		"\2uv\7p\2\2vw\7F\2\2wx\7q\2\2xy\7y\2\2y}\7p\2\2z{\7r\2\2{}\7f\2\2|s\3"+
		"\2\2\2|z\3\2\2\2}\22\3\2\2\2~\177\5\3\2\2\177\24\3\2\2\2\u0080\u0081\5"+
		"\5\3\2\u0081\26\3\2\2\2\u0082\u0083\5\7\4\2\u0083\30\3\2\2\2\u0084\u0085"+
		"\5\t\5\2\u0085\32\3\2\2\2\u0086\u0087\5\13\6\2\u0087\34\3\2\2\2\u0088"+
		"\u0089\5\r\7\2\u0089\36\3\2\2\2\u008a\u008b\5\17\b\2\u008b \3\2\2\2\u008c"+
		"\u008d\5\21\t\2\u008d\"\3\2\2\2\u008e\u008f\7t\2\2\u008f\u0090\7g\2\2"+
		"\u0090\u0091\7u\2\2\u0091\u0092\7g\2\2\u0092\u0093\7v\2\2\u0093\u0094"+
		"\7C\2\2\u0094\u0095\7p\2\2\u0095\u0096\7i\2\2\u0096\u0097\7n\2\2\u0097"+
		"\u0098\7g\2\2\u0098$\3\2\2\2\u0099\u009b\t\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d&\3\2\2\2"+
		"\u009e\u009f\5%\23\2\u009f\u00a0\7.\2\2\u00a0\u00a1\5%\23\2\u00a1(\3\2"+
		"\2\2\u00a2\u00a4\7\17\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\7\f\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\25"+
		"\2\2\u00a8*\3\2\2\2\u00a9\u00ab\7\"\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\b\26\2\2\u00af,\3\2\2\2\u00b0\u00b1\7\61\2\2\u00b1\u00b2\7\61\2"+
		"\2\u00b2\u00b6\3\2\2\2\u00b3\u00b5\n\3\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00ba\b\27\2\2\u00ba.\3\2\2\2\17\28@HQahq|\u009c"+
		"\u00a3\u00ac\u00b6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}