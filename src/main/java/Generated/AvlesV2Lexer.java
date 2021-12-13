package Generated;// Generated from AvlesV2.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AvlesV2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		BOOLEAN=25, MUL=26, DIV=27, ADD=28, SUB=29, EQ=30, NEQ=31, BIG=32, SMALL=33, 
		EQBIG=34, EQSMALL=35, AND=36, OR=37, ID=38, NUMBER=39, DIGIT=40, COMMENT=41, 
		SPACE=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "BOOLEAN", 
			"MUL", "DIV", "ADD", "SUB", "EQ", "NEQ", "BIG", "SMALL", "EQBIG", "EQSMALL", 
			"AND", "OR", "ID", "NUMBER", "DIGIT", "COMMENT", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'start:'", "'slutt.'", "'funksjon '", "'('", "','", "')'", "'gjor:'", 
			"'.'", "'saa lenge'", "'fra'", "'til'", "'hvis'", "'ellers:'", "'ikke'", 
			"'%'", "'storrelsen til'", "'er'", "'er listen:'", "'skriv ut'", "'skriv ut listen'", 
			"'skriv ut tekst'", "'\"'", "'['", "']'", null, "'*'", "'/'", "'+'", 
			"'-'", "'er lik'", "'er ulik'", "'er storre enn'", "'er mindre enn'", 
			"'er storre eller lik'", "'er mindre eller lik'", "'og'", "'eller'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "BOOLEAN", "MUL", "DIV", "ADD", "SUB", "EQ", "NEQ", "BIG", "SMALL", 
			"EQBIG", "EQSMALL", "AND", "OR", "ID", "NUMBER", "DIGIT", "COMMENT", 
			"SPACE"
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


	public AvlesV2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AvlesV2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0184\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f8\n\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\7\'\u0160"+
		"\n\'\f\'\16\'\u0163\13\'\3(\5(\u0166\n(\3(\6(\u0169\n(\r(\16(\u016a\3"+
		"(\3(\6(\u016f\n(\r(\16(\u0170\5(\u0173\n(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3"+
		"+\6+\u017f\n+\r+\16+\u0180\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\7"+
		"\3\2c|\5\2\62;C\\c|\3\2\62;\5\2\f\f\17\17aa\5\2\13\f\17\17\"\"\2\u018a"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\3W\3\2\2\2\5^\3\2\2\2\7e\3\2\2\2\to\3\2\2\2\13q\3\2\2\2\rs\3"+
		"\2\2\2\17u\3\2\2\2\21{\3\2\2\2\23}\3\2\2\2\25\u0087\3\2\2\2\27\u008b\3"+
		"\2\2\2\31\u008f\3\2\2\2\33\u0094\3\2\2\2\35\u009c\3\2\2\2\37\u00a1\3\2"+
		"\2\2!\u00a3\3\2\2\2#\u00b2\3\2\2\2%\u00b5\3\2\2\2\'\u00c0\3\2\2\2)\u00c9"+
		"\3\2\2\2+\u00d9\3\2\2\2-\u00e8\3\2\2\2/\u00ea\3\2\2\2\61\u00ec\3\2\2\2"+
		"\63\u00f7\3\2\2\2\65\u00f9\3\2\2\2\67\u00fb\3\2\2\29\u00fd\3\2\2\2;\u00ff"+
		"\3\2\2\2=\u0101\3\2\2\2?\u0108\3\2\2\2A\u0110\3\2\2\2C\u011e\3\2\2\2E"+
		"\u012c\3\2\2\2G\u0140\3\2\2\2I\u0154\3\2\2\2K\u0157\3\2\2\2M\u015d\3\2"+
		"\2\2O\u0165\3\2\2\2Q\u0174\3\2\2\2S\u0176\3\2\2\2U\u017e\3\2\2\2WX\7u"+
		"\2\2XY\7v\2\2YZ\7c\2\2Z[\7t\2\2[\\\7v\2\2\\]\7<\2\2]\4\3\2\2\2^_\7u\2"+
		"\2_`\7n\2\2`a\7w\2\2ab\7v\2\2bc\7v\2\2cd\7\60\2\2d\6\3\2\2\2ef\7h\2\2"+
		"fg\7w\2\2gh\7p\2\2hi\7m\2\2ij\7u\2\2jk\7l\2\2kl\7q\2\2lm\7p\2\2mn\7\""+
		"\2\2n\b\3\2\2\2op\7*\2\2p\n\3\2\2\2qr\7.\2\2r\f\3\2\2\2st\7+\2\2t\16\3"+
		"\2\2\2uv\7i\2\2vw\7l\2\2wx\7q\2\2xy\7t\2\2yz\7<\2\2z\20\3\2\2\2{|\7\60"+
		"\2\2|\22\3\2\2\2}~\7u\2\2~\177\7c\2\2\177\u0080\7c\2\2\u0080\u0081\7\""+
		"\2\2\u0081\u0082\7n\2\2\u0082\u0083\7g\2\2\u0083\u0084\7p\2\2\u0084\u0085"+
		"\7i\2\2\u0085\u0086\7g\2\2\u0086\24\3\2\2\2\u0087\u0088\7h\2\2\u0088\u0089"+
		"\7t\2\2\u0089\u008a\7c\2\2\u008a\26\3\2\2\2\u008b\u008c\7v\2\2\u008c\u008d"+
		"\7k\2\2\u008d\u008e\7n\2\2\u008e\30\3\2\2\2\u008f\u0090\7j\2\2\u0090\u0091"+
		"\7x\2\2\u0091\u0092\7k\2\2\u0092\u0093\7u\2\2\u0093\32\3\2\2\2\u0094\u0095"+
		"\7g\2\2\u0095\u0096\7n\2\2\u0096\u0097\7n\2\2\u0097\u0098\7g\2\2\u0098"+
		"\u0099\7t\2\2\u0099\u009a\7u\2\2\u009a\u009b\7<\2\2\u009b\34\3\2\2\2\u009c"+
		"\u009d\7k\2\2\u009d\u009e\7m\2\2\u009e\u009f\7m\2\2\u009f\u00a0\7g\2\2"+
		"\u00a0\36\3\2\2\2\u00a1\u00a2\7\'\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7u\2"+
		"\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8"+
		"\7t\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7u\2\2\u00ab"+
		"\u00ac\7g\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af\7v\2"+
		"\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7n\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7"+
		"g\2\2\u00b3\u00b4\7t\2\2\u00b4$\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7"+
		"\7t\2\2\u00b7\u00b8\7\"\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7k\2\2\u00ba"+
		"\u00bb\7u\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7p\2\2"+
		"\u00be\u00bf\7<\2\2\u00bf&\3\2\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7m\2"+
		"\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7x\2\2\u00c5\u00c6"+
		"\7\"\2\2\u00c6\u00c7\7w\2\2\u00c7\u00c8\7v\2\2\u00c8(\3\2\2\2\u00c9\u00ca"+
		"\7u\2\2\u00ca\u00cb\7m\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7k\2\2\u00cd"+
		"\u00ce\7x\2\2\u00ce\u00cf\7\"\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7v\2"+
		"\2\u00d1\u00d2\7\"\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5"+
		"\7u\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7p\2\2\u00d8"+
		"*\3\2\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7m\2\2\u00db\u00dc\7t\2\2\u00dc"+
		"\u00dd\7k\2\2\u00dd\u00de\7x\2\2\u00de\u00df\7\"\2\2\u00df\u00e0\7w\2"+
		"\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7\"\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4"+
		"\7g\2\2\u00e4\u00e5\7m\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7v\2\2\u00e7"+
		",\3\2\2\2\u00e8\u00e9\7$\2\2\u00e9.\3\2\2\2\u00ea\u00eb\7]\2\2\u00eb\60"+
		"\3\2\2\2\u00ec\u00ed\7_\2\2\u00ed\62\3\2\2\2\u00ee\u00ef\7u\2\2\u00ef"+
		"\u00f0\7c\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f8\7v\2\2\u00f2\u00f3\7w\2\2"+
		"\u00f3\u00f4\7u\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f8"+
		"\7v\2\2\u00f7\u00ee\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f8\64\3\2\2\2\u00f9"+
		"\u00fa\7,\2\2\u00fa\66\3\2\2\2\u00fb\u00fc\7\61\2\2\u00fc8\3\2\2\2\u00fd"+
		"\u00fe\7-\2\2\u00fe:\3\2\2\2\u00ff\u0100\7/\2\2\u0100<\3\2\2\2\u0101\u0102"+
		"\7g\2\2\u0102\u0103\7t\2\2\u0103\u0104\7\"\2\2\u0104\u0105\7n\2\2\u0105"+
		"\u0106\7k\2\2\u0106\u0107\7m\2\2\u0107>\3\2\2\2\u0108\u0109\7g\2\2\u0109"+
		"\u010a\7t\2\2\u010a\u010b\7\"\2\2\u010b\u010c\7w\2\2\u010c\u010d\7n\2"+
		"\2\u010d\u010e\7k\2\2\u010e\u010f\7m\2\2\u010f@\3\2\2\2\u0110\u0111\7"+
		"g\2\2\u0111\u0112\7t\2\2\u0112\u0113\7\"\2\2\u0113\u0114\7u\2\2\u0114"+
		"\u0115\7v\2\2\u0115\u0116\7q\2\2\u0116\u0117\7t\2\2\u0117\u0118\7t\2\2"+
		"\u0118\u0119\7g\2\2\u0119\u011a\7\"\2\2\u011a\u011b\7g\2\2\u011b\u011c"+
		"\7p\2\2\u011c\u011d\7p\2\2\u011dB\3\2\2\2\u011e\u011f\7g\2\2\u011f\u0120"+
		"\7t\2\2\u0120\u0121\7\"\2\2\u0121\u0122\7o\2\2\u0122\u0123\7k\2\2\u0123"+
		"\u0124\7p\2\2\u0124\u0125\7f\2\2\u0125\u0126\7t\2\2\u0126\u0127\7g\2\2"+
		"\u0127\u0128\7\"\2\2\u0128\u0129\7g\2\2\u0129\u012a\7p\2\2\u012a\u012b"+
		"\7p\2\2\u012bD\3\2\2\2\u012c\u012d\7g\2\2\u012d\u012e\7t\2\2\u012e\u012f"+
		"\7\"\2\2\u012f\u0130\7u\2\2\u0130\u0131\7v\2\2\u0131\u0132\7q\2\2\u0132"+
		"\u0133\7t\2\2\u0133\u0134\7t\2\2\u0134\u0135\7g\2\2\u0135\u0136\7\"\2"+
		"\2\u0136\u0137\7g\2\2\u0137\u0138\7n\2\2\u0138\u0139\7n\2\2\u0139\u013a"+
		"\7g\2\2\u013a\u013b\7t\2\2\u013b\u013c\7\"\2\2\u013c\u013d\7n\2\2\u013d"+
		"\u013e\7k\2\2\u013e\u013f\7m\2\2\u013fF\3\2\2\2\u0140\u0141\7g\2\2\u0141"+
		"\u0142\7t\2\2\u0142\u0143\7\"\2\2\u0143\u0144\7o\2\2\u0144\u0145\7k\2"+
		"\2\u0145\u0146\7p\2\2\u0146\u0147\7f\2\2\u0147\u0148\7t\2\2\u0148\u0149"+
		"\7g\2\2\u0149\u014a\7\"\2\2\u014a\u014b\7g\2\2\u014b\u014c\7n\2\2\u014c"+
		"\u014d\7n\2\2\u014d\u014e\7g\2\2\u014e\u014f\7t\2\2\u014f\u0150\7\"\2"+
		"\2\u0150\u0151\7n\2\2\u0151\u0152\7k\2\2\u0152\u0153\7m\2\2\u0153H\3\2"+
		"\2\2\u0154\u0155\7q\2\2\u0155\u0156\7i\2\2\u0156J\3\2\2\2\u0157\u0158"+
		"\7g\2\2\u0158\u0159\7n\2\2\u0159\u015a\7n\2\2\u015a\u015b\7g\2\2\u015b"+
		"\u015c\7t\2\2\u015cL\3\2\2\2\u015d\u0161\t\2\2\2\u015e\u0160\t\3\2\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162N\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\7/\2\2\u0165\u0164"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0169\5Q)\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u0172\3\2\2\2\u016c\u016e\7\60\2\2\u016d\u016f\5Q)\2\u016e"+
		"\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0173\3\2\2\2\u0172\u016c\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"P\3\2\2\2\u0174\u0175\t\4\2\2\u0175R\3\2\2\2\u0176\u0177\7\61\2\2\u0177"+
		"\u0178\7\61\2\2\u0178\u0179\3\2\2\2\u0179\u017a\n\5\2\2\u017a\u017b\3"+
		"\2\2\2\u017b\u017c\b*\2\2\u017cT\3\2\2\2\u017d\u017f\t\6\2\2\u017e\u017d"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0183\b+\2\2\u0183V\3\2\2\2\n\2\u00f7\u0161\u0165"+
		"\u016a\u0170\u0172\u0180\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}