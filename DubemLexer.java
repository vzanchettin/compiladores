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
		SEMICOLON=9, COMMA=10, PROCEDURE=11, EQ=12, NE=13, LT=14, LE=15, GT=16, 
		GE=17, OPEN_B=18, CLOSE_B=19, PRINT=20, READ_INT=21, READ_STRING=22, STRING=23, 
		ARRAY=24, LENGTH=25, IF=26, ELSE=27, END=28, WHILE=29, FOR=30, NUMBER=31, 
		NAME=32, SPACE=33, NL=34, COMMENT=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OPEN_P", "CLOSE_P", "ATTRIB", 
		"SEMICOLON", "COMMA", "PROCEDURE", "EQ", "NE", "LT", "LE", "GT", "GE", 
		"OPEN_B", "CLOSE_B", "PRINT", "READ_INT", "READ_STRING", "STRING", "ARRAY", 
		"LENGTH", "IF", "ELSE", "END", "WHILE", "FOR", "NUMBER", "NAME", "SPACE", 
		"NL", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", "';'", "','", 
		"'procedure'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'['", "']'", 
		"'print'", "'read_int'", "'read_string'", null, "'array'", "'length'", 
		"'if'", "'else'", "'end'", "'while'", "'for'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OPEN_P", "CLOSE_P", 
		"ATTRIB", "SEMICOLON", "COMMA", "PROCEDURE", "EQ", "NE", "LT", "LE", "GT", 
		"GE", "OPEN_B", "CLOSE_B", "PRINT", "READ_INT", "READ_STRING", "STRING", 
		"ARRAY", "LENGTH", "IF", "ELSE", "END", "WHILE", "FOR", "NUMBER", "NAME", 
		"SPACE", "NL", "COMMENT"
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
		case 32:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00e1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\7\30\u0099\n\30\f\30\16\30\u009c"+
		"\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \6 \u00c4\n \r \16"+
		" \u00c5\3!\6!\u00c9\n!\r!\16!\u00ca\3\"\6\"\u00ce\n\"\r\"\16\"\u00cf\3"+
		"\"\3\"\3#\5#\u00d5\n#\3#\3#\3$\3$\7$\u00db\n$\f$\16$\u00de\13$\3$\3$\2"+
		"\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%\3\2\5\3\2$$\4\2\13\13\"\"\3\2\f\f\u00e6\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2"+
		"\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21"+
		"W\3\2\2\2\23Y\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31g\3\2\2\2\33j\3\2\2\2"+
		"\35m\3\2\2\2\37o\3\2\2\2!r\3\2\2\2#t\3\2\2\2%w\3\2\2\2\'y\3\2\2\2){\3"+
		"\2\2\2+\u0081\3\2\2\2-\u008a\3\2\2\2/\u0096\3\2\2\2\61\u009f\3\2\2\2\63"+
		"\u00a5\3\2\2\2\65\u00ac\3\2\2\2\67\u00af\3\2\2\29\u00b4\3\2\2\2;\u00b8"+
		"\3\2\2\2=\u00be\3\2\2\2?\u00c3\3\2\2\2A\u00c8\3\2\2\2C\u00cd\3\2\2\2E"+
		"\u00d4\3\2\2\2G\u00d8\3\2\2\2IJ\7-\2\2J\4\3\2\2\2KL\7/\2\2L\6\3\2\2\2"+
		"MN\7,\2\2N\b\3\2\2\2OP\7\61\2\2P\n\3\2\2\2QR\7\'\2\2R\f\3\2\2\2ST\7*\2"+
		"\2T\16\3\2\2\2UV\7+\2\2V\20\3\2\2\2WX\7?\2\2X\22\3\2\2\2YZ\7=\2\2Z\24"+
		"\3\2\2\2[\\\7.\2\2\\\26\3\2\2\2]^\7r\2\2^_\7t\2\2_`\7q\2\2`a\7e\2\2ab"+
		"\7g\2\2bc\7f\2\2cd\7w\2\2de\7t\2\2ef\7g\2\2f\30\3\2\2\2gh\7?\2\2hi\7?"+
		"\2\2i\32\3\2\2\2jk\7#\2\2kl\7?\2\2l\34\3\2\2\2mn\7>\2\2n\36\3\2\2\2op"+
		"\7>\2\2pq\7?\2\2q \3\2\2\2rs\7@\2\2s\"\3\2\2\2tu\7@\2\2uv\7?\2\2v$\3\2"+
		"\2\2wx\7]\2\2x&\3\2\2\2yz\7_\2\2z(\3\2\2\2{|\7r\2\2|}\7t\2\2}~\7k\2\2"+
		"~\177\7p\2\2\177\u0080\7v\2\2\u0080*\3\2\2\2\u0081\u0082\7t\2\2\u0082"+
		"\u0083\7g\2\2\u0083\u0084\7c\2\2\u0084\u0085\7f\2\2\u0085\u0086\7a\2\2"+
		"\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2\u0088\u0089\7v\2\2\u0089,\3\2\2"+
		"\2\u008a\u008b\7t\2\2\u008b\u008c\7g\2\2\u008c\u008d\7c\2\2\u008d\u008e"+
		"\7f\2\2\u008e\u008f\7a\2\2\u008f\u0090\7u\2\2\u0090\u0091\7v\2\2\u0091"+
		"\u0092\7t\2\2\u0092\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094\u0095\7i\2\2"+
		"\u0095.\3\2\2\2\u0096\u009a\7$\2\2\u0097\u0099\n\2\2\2\u0098\u0097\3\2"+
		"\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7$\2\2\u009e\60\3\2\2\2"+
		"\u009f\u00a0\7c\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3"+
		"\7c\2\2\u00a3\u00a4\7{\2\2\u00a4\62\3\2\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7"+
		"\7g\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7i\2\2\u00a9\u00aa\7v\2\2\u00aa"+
		"\u00ab\7j\2\2\u00ab\64\3\2\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7h\2\2\u00ae"+
		"\66\3\2\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7u\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b38\3\2\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7p\2\2\u00b6"+
		"\u00b7\7f\2\2\u00b7:\3\2\2\2\u00b8\u00b9\7y\2\2\u00b9\u00ba\7j\2\2\u00ba"+
		"\u00bb\7k\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7g\2\2\u00bd<\3\2\2\2\u00be"+
		"\u00bf\7h\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7t\2\2\u00c1>\3\2\2\2\u00c2"+
		"\u00c4\4\62;\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6@\3\2\2\2\u00c7\u00c9\4c|\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"B\3\2\2\2\u00cc\u00ce\t\3\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2"+
		"\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2"+
		"\b\"\2\2\u00d2D\3\2\2\2\u00d3\u00d5\7\17\2\2\u00d4\u00d3\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\f\2\2\u00d7F\3\2\2\2"+
		"\u00d8\u00dc\7%\2\2\u00d9\u00db\n\4\2\2\u00da\u00d9\3\2\2\2\u00db\u00de"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e0\b$\3\2\u00e0H\3\2\2\2\t\2\u009a\u00c5\u00ca"+
		"\u00cf\u00d4\u00dc\4\3\"\2\3$\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}