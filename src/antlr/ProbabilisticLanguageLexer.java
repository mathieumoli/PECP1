// Generated from /home/user/Documents/EPU/SI5/PreuvesCrypto/Projet/Projet1/resources/antlr/ProbabilisticLanguage.g4 by ANTLR 4.5.3
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProbabilisticLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		WS=18, ADD=19, SUB=20, MULT=21, DIV=22, POW=23, EQ=24, NEQ=25, GT=26, 
		GE=27, LT=28, LE=29, ZQ=30, IDENT=31, NUMBER=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"ESC", "UNICODE", "HEX", "WS", "ADD", "SUB", "MULT", "DIV", "POW", "EQ", 
		"NEQ", "GT", "GE", "LT", "LE", "ZQ", "IDENT", "NUMBER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'initial_state'", "':'", "'['", "']'", "','", "';'", "':='", "'skip'", 
		"'if'", "'('", "')'", "'then'", "'{'", "'}'", "'else'", "'while'", "'do'", 
		null, "'+'", "'-'", "'*'", "'/'", "'^'", "'='", "'!='", "'>'", "'>='", 
		"'<'", "'<='", "'ZQ'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "WS", "ADD", "SUB", "MULT", "DIV", 
		"POW", "EQ", "NEQ", "GT", "GE", "LT", "LE", "ZQ", "IDENT", "NUMBER"
	};
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


	public ProbabilisticLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ProbabilisticLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u00c6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\5\23\u008b\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\6\26\u0096\n\26\r\26\16\26\u0097\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\7#\u00ba\n#\f"+
		"#\16#\u00bd\13#\3$\5$\u00c0\n$\3$\6$\u00c3\n$\r$\16$\u00c4\2\2%\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\2\'\2)\2+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36"+
		"A\37C E!G\"\3\2\t\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2\13\f\17\17\""+
		"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2//\3\2\62;\u00c7\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2\t[\3\2\2\2\13]\3\2"+
		"\2\2\r_\3\2\2\2\17a\3\2\2\2\21d\3\2\2\2\23i\3\2\2\2\25l\3\2\2\2\27n\3"+
		"\2\2\2\31p\3\2\2\2\33u\3\2\2\2\35w\3\2\2\2\37y\3\2\2\2!~\3\2\2\2#\u0084"+
		"\3\2\2\2%\u0087\3\2\2\2\'\u008c\3\2\2\2)\u0092\3\2\2\2+\u0095\3\2\2\2"+
		"-\u009b\3\2\2\2/\u009d\3\2\2\2\61\u009f\3\2\2\2\63\u00a1\3\2\2\2\65\u00a3"+
		"\3\2\2\2\67\u00a5\3\2\2\29\u00a7\3\2\2\2;\u00aa\3\2\2\2=\u00ac\3\2\2\2"+
		"?\u00af\3\2\2\2A\u00b1\3\2\2\2C\u00b4\3\2\2\2E\u00b7\3\2\2\2G\u00bf\3"+
		"\2\2\2IJ\7k\2\2JK\7p\2\2KL\7k\2\2LM\7v\2\2MN\7k\2\2NO\7c\2\2OP\7n\2\2"+
		"PQ\7a\2\2QR\7u\2\2RS\7v\2\2ST\7c\2\2TU\7v\2\2UV\7g\2\2V\4\3\2\2\2WX\7"+
		"<\2\2X\6\3\2\2\2YZ\7]\2\2Z\b\3\2\2\2[\\\7_\2\2\\\n\3\2\2\2]^\7.\2\2^\f"+
		"\3\2\2\2_`\7=\2\2`\16\3\2\2\2ab\7<\2\2bc\7?\2\2c\20\3\2\2\2de\7u\2\2e"+
		"f\7m\2\2fg\7k\2\2gh\7r\2\2h\22\3\2\2\2ij\7k\2\2jk\7h\2\2k\24\3\2\2\2l"+
		"m\7*\2\2m\26\3\2\2\2no\7+\2\2o\30\3\2\2\2pq\7v\2\2qr\7j\2\2rs\7g\2\2s"+
		"t\7p\2\2t\32\3\2\2\2uv\7}\2\2v\34\3\2\2\2wx\7\177\2\2x\36\3\2\2\2yz\7"+
		"g\2\2z{\7n\2\2{|\7u\2\2|}\7g\2\2} \3\2\2\2~\177\7y\2\2\177\u0080\7j\2"+
		"\2\u0080\u0081\7k\2\2\u0081\u0082\7n\2\2\u0082\u0083\7g\2\2\u0083\"\3"+
		"\2\2\2\u0084\u0085\7f\2\2\u0085\u0086\7q\2\2\u0086$\3\2\2\2\u0087\u008a"+
		"\7^\2\2\u0088\u008b\t\2\2\2\u0089\u008b\5\'\24\2\u008a\u0088\3\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b&\3\2\2\2\u008c\u008d\7w\2\2\u008d\u008e\5)\25\2\u008e"+
		"\u008f\5)\25\2\u008f\u0090\5)\25\2\u0090\u0091\5)\25\2\u0091(\3\2\2\2"+
		"\u0092\u0093\t\3\2\2\u0093*\3\2\2\2\u0094\u0096\t\4\2\2\u0095\u0094\3"+
		"\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\b\26\2\2\u009a,\3\2\2\2\u009b\u009c\7-\2\2"+
		"\u009c.\3\2\2\2\u009d\u009e\7/\2\2\u009e\60\3\2\2\2\u009f\u00a0\7,\2\2"+
		"\u00a0\62\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2\64\3\2\2\2\u00a3\u00a4\7"+
		"`\2\2\u00a4\66\3\2\2\2\u00a5\u00a6\7?\2\2\u00a68\3\2\2\2\u00a7\u00a8\7"+
		"#\2\2\u00a8\u00a9\7?\2\2\u00a9:\3\2\2\2\u00aa\u00ab\7@\2\2\u00ab<\3\2"+
		"\2\2\u00ac\u00ad\7@\2\2\u00ad\u00ae\7?\2\2\u00ae>\3\2\2\2\u00af\u00b0"+
		"\7>\2\2\u00b0@\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2\u00b3\7?\2\2\u00b3B\3"+
		"\2\2\2\u00b4\u00b5\7\\\2\2\u00b5\u00b6\7S\2\2\u00b6D\3\2\2\2\u00b7\u00bb"+
		"\t\5\2\2\u00b8\u00ba\t\6\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bcF\3\2\2\2\u00bd\u00bb\3\2\2\2"+
		"\u00be\u00c0\t\7\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2"+
		"\3\2\2\2\u00c1\u00c3\t\b\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5H\3\2\2\2\b\2\u008a\u0097\u00bb"+
		"\u00bf\u00c4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}