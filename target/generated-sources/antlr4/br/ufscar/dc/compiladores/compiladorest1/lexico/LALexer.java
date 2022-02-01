// Generated from br\u005Cufscar\dc\compiladores\compiladorest1\lexico\LALexer.g4 by ANTLR 4.9.3
package br.ufscar.dc.compiladores.compiladorest1.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LALexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CHAVE=1, NUM_INT=2, NUM_REAL=3, IDENT=4, CADEIA=5, COMENTARIO=6, 
		WS=7, COMENTARIO_ERRADO=8, CADEIA_ERRADA=9, ERROR=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUM_INT", "NUM", "NUM_REAL", "IDENT", "LITERAL", "CADEIA", 
			"ESC_SEQ", "COMENTARIO", "WS", "COMENTARIO_ERRADO", "CADEIA_ERRADA", 
			"ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "IDENT", "CADEIA", "COMENTARIO", 
			"WS", "COMENTARIO_ERRADO", "CADEIA_ERRADA", "ERROR"
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


	public LALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LALexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 8:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u0197\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\5\2\u0122\n\2\3\3\6\3\u0125\n\3\r\3\16\3\u0126"+
		"\3\4\3\4\3\5\6\5\u012c\n\5\r\5\16\5\u012d\3\5\3\5\6\5\u0132\n\5\r\5\16"+
		"\5\u0133\5\5\u0136\n\5\3\6\3\6\3\6\7\6\u013b\n\6\f\6\16\6\u013e\13\6\3"+
		"\6\7\6\u0141\n\6\f\6\16\6\u0144\13\6\3\6\3\6\7\6\u0148\n\6\f\6\16\6\u014b"+
		"\13\6\3\7\3\7\3\b\3\b\3\b\7\b\u0152\n\b\f\b\16\b\u0155\13\b\3\b\3\b\3"+
		"\b\3\b\7\b\u015b\n\b\f\b\16\b\u015e\13\b\3\b\5\b\u0161\n\b\3\t\3\t\3\t"+
		"\3\t\5\t\u0167\n\t\3\n\3\n\7\n\u016b\n\n\f\n\16\n\u016e\13\n\3\n\5\n\u0171"+
		"\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\7\f\u017b\n\f\f\f\16\f\u017e\13"+
		"\f\3\f\3\f\3\r\3\r\3\r\7\r\u0185\n\r\f\r\16\r\u0188\13\r\3\r\3\r\3\r\3"+
		"\r\7\r\u018e\n\r\f\r\16\r\u0191\13\r\3\r\5\r\u0194\n\r\3\16\3\16\7\u0153"+
		"\u015c\u017c\u0186\u018f\2\17\3\3\5\4\7\2\t\5\13\6\r\2\17\7\21\2\23\b"+
		"\25\t\27\n\31\13\33\f\3\2\t\b\2\'\'*\61<<]]__gg\4\2C\\c|\5\2\f\f))^^\5"+
		"\2\f\f\17\17\177\177\5\2\13\f\17\17\"\"\3\2\177\177\6\2\f\f$$))^^\2\u01d8"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\17\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\u0121\3\2"+
		"\2\2\5\u0124\3\2\2\2\7\u0128\3\2\2\2\t\u012b\3\2\2\2\13\u0137\3\2\2\2"+
		"\r\u014c\3\2\2\2\17\u0160\3\2\2\2\21\u0166\3\2\2\2\23\u0168\3\2\2\2\25"+
		"\u0175\3\2\2\2\27\u0178\3\2\2\2\31\u0193\3\2\2\2\33\u0195\3\2\2\2\35\36"+
		"\7f\2\2\36\37\7g\2\2\37 \7e\2\2 !\7n\2\2!\"\7c\2\2\"#\7t\2\2#\u0122\7"+
		"g\2\2$%\7c\2\2%&\7n\2\2&\'\7i\2\2\'(\7q\2\2()\7t\2\2)*\7k\2\2*+\7v\2\2"+
		"+,\7o\2\2,\u0122\7q\2\2-.\7k\2\2./\7p\2\2/\60\7v\2\2\60\61\7g\2\2\61\62"+
		"\7k\2\2\62\63\7t\2\2\63\u0122\7q\2\2\64\65\7t\2\2\65\66\7g\2\2\66\67\7"+
		"c\2\2\67\u0122\7n\2\289\7n\2\29:\7k\2\2:;\7v\2\2;<\7g\2\2<=\7t\2\2=>\7"+
		"c\2\2>\u0122\7n\2\2?@\7v\2\2@A\7k\2\2AB\7r\2\2B\u0122\7q\2\2CD\7x\2\2"+
		"DE\7c\2\2E\u0122\7t\2\2FG\7n\2\2GH\7q\2\2HI\7i\2\2IJ\7k\2\2JK\7e\2\2K"+
		"\u0122\7q\2\2LM\7n\2\2MN\7g\2\2NO\7k\2\2O\u0122\7c\2\2PQ\7g\2\2QR\7u\2"+
		"\2RS\7e\2\2ST\7t\2\2TU\7g\2\2UV\7x\2\2V\u0122\7c\2\2WX\7e\2\2XY\7q\2\2"+
		"YZ\7p\2\2Z[\7u\2\2[\\\7v\2\2\\]\7c\2\2]^\7p\2\2^_\7v\2\2_\u0122\7g\2\2"+
		"`a\7t\2\2ab\7g\2\2bc\7i\2\2cd\7k\2\2de\7u\2\2ef\7v\2\2fg\7t\2\2g\u0122"+
		"\7q\2\2hi\7h\2\2ij\7k\2\2jk\7o\2\2kl\7a\2\2lm\7t\2\2mn\7g\2\2no\7i\2\2"+
		"op\7k\2\2pq\7u\2\2qr\7v\2\2rs\7t\2\2s\u0122\7q\2\2tu\7r\2\2uv\7t\2\2v"+
		"w\7q\2\2wx\7e\2\2xy\7g\2\2yz\7f\2\2z{\7k\2\2{|\7o\2\2|}\7g\2\2}~\7p\2"+
		"\2~\177\7v\2\2\177\u0122\7q\2\2\u0080\u0081\7h\2\2\u0081\u0082\7k\2\2"+
		"\u0082\u0083\7o\2\2\u0083\u0084\7a\2\2\u0084\u0085\7r\2\2\u0085\u0086"+
		"\7t\2\2\u0086\u0087\7q\2\2\u0087\u0088\7e\2\2\u0088\u0089\7g\2\2\u0089"+
		"\u008a\7f\2\2\u008a\u008b\7k\2\2\u008b\u008c\7o\2\2\u008c\u008d\7g\2\2"+
		"\u008d\u008e\7p\2\2\u008e\u008f\7v\2\2\u008f\u0122\7q\2\2\u0090\u0091"+
		"\7h\2\2\u0091\u0092\7w\2\2\u0092\u0093\7p\2\2\u0093\u0094\7e\2\2\u0094"+
		"\u0095\7c\2\2\u0095\u0122\7q\2\2\u0096\u0097\7h\2\2\u0097\u0098\7k\2\2"+
		"\u0098\u0099\7o\2\2\u0099\u009a\7a\2\2\u009a\u009b\7h\2\2\u009b\u009c"+
		"\7w\2\2\u009c\u009d\7p\2\2\u009d\u009e\7e\2\2\u009e\u009f\7c\2\2\u009f"+
		"\u0122\7q\2\2\u00a0\u00a1\7r\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7t\2\2"+
		"\u00a3\u0122\7c\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7v\2\2\u00a6\u0122"+
		"\7g\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7e\2\2\u00aa"+
		"\u0122\7c\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7o\2\2"+
		"\u00ae\u00af\7a\2\2\u00af\u00b0\7r\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2"+
		"\7t\2\2\u00b2\u0122\7c\2\2\u00b3\u00b4\7u\2\2\u00b4\u0122\7g\2\2\u00b5"+
		"\u00b6\7g\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7c\2\2"+
		"\u00b9\u0122\7q\2\2\u00ba\u00bb\7h\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd"+
		"\7o\2\2\u00bd\u00be\7a\2\2\u00be\u00bf\7u\2\2\u00bf\u0122\7g\2\2\u00c0"+
		"\u00c1\7h\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7o\2\2\u00c3\u00c4\7a\2\2"+
		"\u00c4\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7i\2\2\u00c7\u00c8"+
		"\7q\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7v\2\2\u00cb"+
		"\u00cc\7o\2\2\u00cc\u0122\7q\2\2\u00cd\u00ce\7q\2\2\u00ce\u0122\7w\2\2"+
		"\u00cf\u0122\t\2\2\2\u00d0\u00d1\7>\2\2\u00d1\u0122\7/\2\2\u00d2\u0122"+
		"\7@\2\2\u00d3\u00d4\7@\2\2\u00d4\u0122\7?\2\2\u00d5\u0122\7>\2\2\u00d6"+
		"\u00d7\7>\2\2\u00d7\u0122\7?\2\2\u00d8\u00d9\7>\2\2\u00d9\u0122\7@\2\2"+
		"\u00da\u0122\7?\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de"+
		"\7v\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7p\2\2\u00e1"+
		"\u0122\7g\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7u\2\2"+
		"\u00e5\u0122\7q\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9"+
		"\7l\2\2\u00e9\u0122\7c\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7g\2\2\u00ec"+
		"\u00ed\7p\2\2\u00ed\u00ee\7c\2\2\u00ee\u0122\7q\2\2\u00ef\u00f0\7h\2\2"+
		"\u00f0\u00f1\7k\2\2\u00f1\u00f2\7o\2\2\u00f2\u00f3\7a\2\2\u00f3\u00f4"+
		"\7e\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7u\2\2\u00f6\u0122\7q\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7s\2\2\u00fa\u00fb\7w\2\2"+
		"\u00fb\u00fc\7c\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7v\2\2\u00fe\u0122"+
		"\7q\2\2\u00ff\u0100\7h\2\2\u0100\u0101\7k\2\2\u0101\u0102\7o\2\2\u0102"+
		"\u0103\7a\2\2\u0103\u0104\7g\2\2\u0104\u0105\7p\2\2\u0105\u0106\7s\2\2"+
		"\u0106\u0107\7w\2\2\u0107\u0108\7c\2\2\u0108\u0109\7p\2\2\u0109\u010a"+
		"\7v\2\2\u010a\u0122\7q\2\2\u010b\u0122\7(\2\2\u010c\u010d\7p\2\2\u010d"+
		"\u010e\7c\2\2\u010e\u0122\7q\2\2\u010f\u0110\7x\2\2\u0110\u0111\7g\2\2"+
		"\u0111\u0112\7t\2\2\u0112\u0113\7f\2\2\u0113\u0114\7c\2\2\u0114\u0115"+
		"\7f\2\2\u0115\u0116\7g\2\2\u0116\u0117\7k\2\2\u0117\u0118\7t\2\2\u0118"+
		"\u0122\7q\2\2\u0119\u011a\7h\2\2\u011a\u011b\7c\2\2\u011b\u011c\7n\2\2"+
		"\u011c\u011d\7u\2\2\u011d\u0122\7q\2\2\u011e\u0122\7`\2\2\u011f\u0120"+
		"\7\60\2\2\u0120\u0122\7\60\2\2\u0121\35\3\2\2\2\u0121$\3\2\2\2\u0121-"+
		"\3\2\2\2\u0121\64\3\2\2\2\u01218\3\2\2\2\u0121?\3\2\2\2\u0121C\3\2\2\2"+
		"\u0121F\3\2\2\2\u0121L\3\2\2\2\u0121P\3\2\2\2\u0121W\3\2\2\2\u0121`\3"+
		"\2\2\2\u0121h\3\2\2\2\u0121t\3\2\2\2\u0121\u0080\3\2\2\2\u0121\u0090\3"+
		"\2\2\2\u0121\u0096\3\2\2\2\u0121\u00a0\3\2\2\2\u0121\u00a4\3\2\2\2\u0121"+
		"\u00a7\3\2\2\2\u0121\u00ab\3\2\2\2\u0121\u00b3\3\2\2\2\u0121\u00b5\3\2"+
		"\2\2\u0121\u00ba\3\2\2\2\u0121\u00c0\3\2\2\2\u0121\u00cd\3\2\2\2\u0121"+
		"\u00cf\3\2\2\2\u0121\u00d0\3\2\2\2\u0121\u00d2\3\2\2\2\u0121\u00d3\3\2"+
		"\2\2\u0121\u00d5\3\2\2\2\u0121\u00d6\3\2\2\2\u0121\u00d8\3\2\2\2\u0121"+
		"\u00da\3\2\2\2\u0121\u00db\3\2\2\2\u0121\u00e2\3\2\2\2\u0121\u00e6\3\2"+
		"\2\2\u0121\u00ea\3\2\2\2\u0121\u00ef\3\2\2\2\u0121\u00f7\3\2\2\2\u0121"+
		"\u00ff\3\2\2\2\u0121\u010b\3\2\2\2\u0121\u010c\3\2\2\2\u0121\u010f\3\2"+
		"\2\2\u0121\u0119\3\2\2\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\4\3\2\2\2\u0123\u0125\5\7\4\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2"+
		"\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\6\3\2\2\2\u0128\u0129\4"+
		"\62;\2\u0129\b\3\2\2\2\u012a\u012c\5\7\4\2\u012b\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0135\3\2\2\2\u012f"+
		"\u0131\7\60\2\2\u0130\u0132\5\7\4\2\u0131\u0130\3\2\2\2\u0132\u0133\3"+
		"\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135"+
		"\u012f\3\2\2\2\u0135\u0136\3\2\2\2\u0136\n\3\2\2\2\u0137\u013c\5\r\7\2"+
		"\u0138\u013b\5\r\7\2\u0139\u013b\5\7\4\2\u013a\u0138\3\2\2\2\u013a\u0139"+
		"\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u0142\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0141\7a\2\2\u0140\u013f\3\2"+
		"\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0149\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0148\5\r\7\2\u0146\u0148\5\7"+
		"\4\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\f\3\2\2\2\u014b\u0149\3\2\2\2"+
		"\u014c\u014d\t\3\2\2\u014d\16\3\2\2\2\u014e\u0153\7)\2\2\u014f\u0152\5"+
		"\21\t\2\u0150\u0152\n\4\2\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0156\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0156\u0161\7)\2\2\u0157\u015c\7$\2\2\u0158\u015b"+
		"\5\21\t\2\u0159\u015b\n\4\2\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2"+
		"\u015b\u015e\3\2\2\2\u015c\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015f"+
		"\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0161\7$\2\2\u0160\u014e\3\2\2\2\u0160"+
		"\u0157\3\2\2\2\u0161\20\3\2\2\2\u0162\u0163\7^\2\2\u0163\u0167\7)\2\2"+
		"\u0164\u0165\7^\2\2\u0165\u0167\7$\2\2\u0166\u0162\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0167\22\3\2\2\2\u0168\u016c\7}\2\2\u0169\u016b\n\5\2\2\u016a"+
		"\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171\7\17\2\2\u0170"+
		"\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7\177"+
		"\2\2\u0173\u0174\b\n\2\2\u0174\24\3\2\2\2\u0175\u0176\t\6\2\2\u0176\u0177"+
		"\b\13\3\2\u0177\26\3\2\2\2\u0178\u017c\7}\2\2\u0179\u017b\n\7\2\2\u017a"+
		"\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017d\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7\f\2\2\u0180"+
		"\30\3\2\2\2\u0181\u0186\7)\2\2\u0182\u0185\5\21\t\2\u0183\u0185\n\b\2"+
		"\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0187"+
		"\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189"+
		"\u0194\7\f\2\2\u018a\u018f\7$\2\2\u018b\u018e\5\21\t\2\u018c\u018e\n\b"+
		"\2\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0192\u0194\7\f\2\2\u0193\u0181\3\2\2\2\u0193\u018a\3\2\2\2\u0194"+
		"\32\3\2\2\2\u0195\u0196\13\2\2\2\u0196\34\3\2\2\2\33\2\u0121\u0126\u012d"+
		"\u0133\u0135\u013a\u013c\u0142\u0147\u0149\u0151\u0153\u015a\u015c\u0160"+
		"\u0166\u016c\u0170\u017c\u0184\u0186\u018d\u018f\u0193\4\3\n\2\3\13\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}