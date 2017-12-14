// Generated from Dubem.g by ANTLR 4.5.3

  import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DubemLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, TIMES=3, OVER=4, REMAINDER=5, OPEN_P=6, CLOSE_P=7, ATTRIB=8, 
		SEMICOLON=9, COMMA=10, PROCEDURE=11, ARRAY=12, EQ=13, NE=14, LT=15, LE=16, 
		GT=17, GE=18, OPEN_B=19, CLOSE_B=20, PRINT=21, READ_INT=22, READ_STRING=23, 
		STRING=24, IF=25, ELSE=26, END=27, WHILE=28, FOR=29, NUMBER=30, NAME=31, 
		SPACE=32, NL=33, COMMENT=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OPEN_P", "CLOSE_P", "ATTRIB", 
		"SEMICOLON", "COMMA", "PROCEDURE", "ARRAY", "EQ", "NE", "LT", "LE", "GT", 
		"GE", "OPEN_B", "CLOSE_B", "PRINT", "READ_INT", "READ_STRING", "STRING", 
		"IF", "ELSE", "END", "WHILE", "FOR", "NUMBER", "NAME", "SPACE", "NL", 
		"COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", "';'", "','", 
		"'procedure'", "'array'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", 
		"'['", "']'", "'print'", "'read_int'", "'read_string'", null, "'if'", 
		"'else'", "'end'", "'while'", "'for'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OPEN_P", "CLOSE_P", 
		"ATTRIB", "SEMICOLON", "COMMA", "PROCEDURE", "ARRAY", "EQ", "NE", "LT", 
		"LE", "GT", "GE", "OPEN_B", "CLOSE_B", "PRINT", "READ_INT", "READ_STRING", 
		"STRING", "IF", "ELSE", "END", "WHILE", "FOR", "NUMBER", "NAME", "SPACE", 
		"NL", "COMMENT"
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


	  private static ArrayList<String> symbol_table;

	  private static ArrayList<String> symbol_table_not_used;

	  private static ArrayList<Character> symbol_type;

	  private static int count_while = 0;

	  private static int count_if = 0;

	  private static int count_for = 0;

	  private static int stack_cur, stack_max, errors;

	  private static boolean isArray = false;

	  private static void emit(String bytecode, int delta) {

	    System.out.println("   " + bytecode);
	    stack_cur += delta;
	    if (stack_max < stack_cur ) {stack_max  = stack_cur; }

	  }
	  
	  public static void main(String[] args) throws Exception
	  {

	    ANTLRInputStream input = new ANTLRInputStream(System.in);
	    DubemLexer lexer = new DubemLexer(input);
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    DubemParser parser = new DubemParser(tokens);

	    symbol_table = new ArrayList<String>();
	    symbol_table_not_used = new ArrayList<String>();
	    symbol_type = new ArrayList<Character>();
	    parser.program();

	    if(errors > 0)
	      System.exit(1);

	  }


	public DubemLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Dubem.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 31:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u00d8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\7\31\u009d"+
		"\n\31\f\31\16\31\u00a0\13\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\37\6\37\u00bb\n\37\r\37\16\37\u00bc\3 \6 \u00c0\n \r \16 \u00c1"+
		"\3!\6!\u00c5\n!\r!\16!\u00c6\3!\3!\3\"\5\"\u00cc\n\"\3\"\3\"\3#\3#\7#"+
		"\u00d2\n#\f#\16#\u00d5\13#\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3\2\5\3\2$$\4\2\13\13"+
		"\"\"\3\2\f\f\u00dd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\3G\3\2\2\2\5I\3\2\2\2\7K\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rQ\3"+
		"\2\2\2\17S\3\2\2\2\21U\3\2\2\2\23W\3\2\2\2\25Y\3\2\2\2\27[\3\2\2\2\31"+
		"e\3\2\2\2\33k\3\2\2\2\35n\3\2\2\2\37q\3\2\2\2!s\3\2\2\2#v\3\2\2\2%x\3"+
		"\2\2\2\'{\3\2\2\2)}\3\2\2\2+\177\3\2\2\2-\u0085\3\2\2\2/\u008e\3\2\2\2"+
		"\61\u009a\3\2\2\2\63\u00a3\3\2\2\2\65\u00a6\3\2\2\2\67\u00ab\3\2\2\29"+
		"\u00af\3\2\2\2;\u00b5\3\2\2\2=\u00ba\3\2\2\2?\u00bf\3\2\2\2A\u00c4\3\2"+
		"\2\2C\u00cb\3\2\2\2E\u00cf\3\2\2\2GH\7-\2\2H\4\3\2\2\2IJ\7/\2\2J\6\3\2"+
		"\2\2KL\7,\2\2L\b\3\2\2\2MN\7\61\2\2N\n\3\2\2\2OP\7\'\2\2P\f\3\2\2\2QR"+
		"\7*\2\2R\16\3\2\2\2ST\7+\2\2T\20\3\2\2\2UV\7?\2\2V\22\3\2\2\2WX\7=\2\2"+
		"X\24\3\2\2\2YZ\7.\2\2Z\26\3\2\2\2[\\\7r\2\2\\]\7t\2\2]^\7q\2\2^_\7e\2"+
		"\2_`\7g\2\2`a\7f\2\2ab\7w\2\2bc\7t\2\2cd\7g\2\2d\30\3\2\2\2ef\7c\2\2f"+
		"g\7t\2\2gh\7t\2\2hi\7c\2\2ij\7{\2\2j\32\3\2\2\2kl\7?\2\2lm\7?\2\2m\34"+
		"\3\2\2\2no\7#\2\2op\7?\2\2p\36\3\2\2\2qr\7>\2\2r \3\2\2\2st\7>\2\2tu\7"+
		"?\2\2u\"\3\2\2\2vw\7@\2\2w$\3\2\2\2xy\7@\2\2yz\7?\2\2z&\3\2\2\2{|\7]\2"+
		"\2|(\3\2\2\2}~\7_\2\2~*\3\2\2\2\177\u0080\7r\2\2\u0080\u0081\7t\2\2\u0081"+
		"\u0082\7k\2\2\u0082\u0083\7p\2\2\u0083\u0084\7v\2\2\u0084,\3\2\2\2\u0085"+
		"\u0086\7t\2\2\u0086\u0087\7g\2\2\u0087\u0088\7c\2\2\u0088\u0089\7f\2\2"+
		"\u0089\u008a\7a\2\2\u008a\u008b\7k\2\2\u008b\u008c\7p\2\2\u008c\u008d"+
		"\7v\2\2\u008d.\3\2\2\2\u008e\u008f\7t\2\2\u008f\u0090\7g\2\2\u0090\u0091"+
		"\7c\2\2\u0091\u0092\7f\2\2\u0092\u0093\7a\2\2\u0093\u0094\7u\2\2\u0094"+
		"\u0095\7v\2\2\u0095\u0096\7t\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2"+
		"\u0098\u0099\7i\2\2\u0099\60\3\2\2\2\u009a\u009e\7$\2\2\u009b\u009d\n"+
		"\2\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7$"+
		"\2\2\u00a2\62\3\2\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7h\2\2\u00a5\64\3"+
		"\2\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7u\2\2\u00a9"+
		"\u00aa\7g\2\2\u00aa\66\3\2\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7p\2\2\u00ad"+
		"\u00ae\7f\2\2\u00ae8\3\2\2\2\u00af\u00b0\7y\2\2\u00b0\u00b1\7j\2\2\u00b1"+
		"\u00b2\7k\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7g\2\2\u00b4:\3\2\2\2\u00b5"+
		"\u00b6\7h\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7t\2\2\u00b8<\3\2\2\2\u00b9"+
		"\u00bb\4\62;\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd>\3\2\2\2\u00be\u00c0\4c|\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"@\3\2\2\2\u00c3\u00c5\t\3\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2"+
		"\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9"+
		"\b!\2\2\u00c9B\3\2\2\2\u00ca\u00cc\7\17\2\2\u00cb\u00ca\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\f\2\2\u00ceD\3\2\2\2"+
		"\u00cf\u00d3\7%\2\2\u00d0\u00d2\n\4\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d7\b#\3\2\u00d7F\3\2\2\2\t\2\u009e\u00bc\u00c1"+
		"\u00c6\u00cb\u00d3\4\3!\2\3#\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}