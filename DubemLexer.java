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
		SEMICOLON=9, COMMA=10, EQ=11, NE=12, LT=13, LE=14, GT=15, GE=16, PRINT=17, 
		READ_INT=18, READ_STRING=19, STRING=20, IF=21, ELSE=22, END=23, WHILE=24, 
		FOR=25, NUMBER=26, NAME=27, SPACE=28, NL=29, COMMENT=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OPEN_P", "CLOSE_P", "ATTRIB", 
		"SEMICOLON", "COMMA", "EQ", "NE", "LT", "LE", "GT", "GE", "PRINT", "READ_INT", 
		"READ_STRING", "STRING", "IF", "ELSE", "END", "WHILE", "FOR", "NUMBER", 
		"NAME", "SPACE", "NL", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", "';'", "','", 
		"'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'print'", "'read_int'", 
		"'read_string'", null, "'if'", "'else'", "'end'", "'while'", "'for'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OPEN_P", "CLOSE_P", 
		"ATTRIB", "SEMICOLON", "COMMA", "EQ", "NE", "LT", "LE", "GT", "GE", "PRINT", 
		"READ_INT", "READ_STRING", "STRING", "IF", "ELSE", "END", "WHILE", "FOR", 
		"NUMBER", "NAME", "SPACE", "NL", "COMMENT"
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
		case 27:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00bc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\7\25\u0081\n\25\f\25\16\25\u0084\13\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\6\33\u009f\n\33\r\33\16\33\u00a0"+
		"\3\34\6\34\u00a4\n\34\r\34\16\34\u00a5\3\35\6\35\u00a9\n\35\r\35\16\35"+
		"\u00aa\3\35\3\35\3\36\5\36\u00b0\n\36\3\36\3\36\3\37\3\37\7\37\u00b6\n"+
		"\37\f\37\16\37\u00b9\13\37\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\5\3\2$$\4\2\13\13\""+
		"\"\3\2\f\f\u00c1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tE"+
		"\3\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25"+
		"Q\3\2\2\2\27S\3\2\2\2\31V\3\2\2\2\33Y\3\2\2\2\35[\3\2\2\2\37^\3\2\2\2"+
		"!`\3\2\2\2#c\3\2\2\2%i\3\2\2\2\'r\3\2\2\2)~\3\2\2\2+\u0087\3\2\2\2-\u008a"+
		"\3\2\2\2/\u008f\3\2\2\2\61\u0093\3\2\2\2\63\u0099\3\2\2\2\65\u009e\3\2"+
		"\2\2\67\u00a3\3\2\2\29\u00a8\3\2\2\2;\u00af\3\2\2\2=\u00b3\3\2\2\2?@\7"+
		"-\2\2@\4\3\2\2\2AB\7/\2\2B\6\3\2\2\2CD\7,\2\2D\b\3\2\2\2EF\7\61\2\2F\n"+
		"\3\2\2\2GH\7\'\2\2H\f\3\2\2\2IJ\7*\2\2J\16\3\2\2\2KL\7+\2\2L\20\3\2\2"+
		"\2MN\7?\2\2N\22\3\2\2\2OP\7=\2\2P\24\3\2\2\2QR\7.\2\2R\26\3\2\2\2ST\7"+
		"?\2\2TU\7?\2\2U\30\3\2\2\2VW\7#\2\2WX\7?\2\2X\32\3\2\2\2YZ\7>\2\2Z\34"+
		"\3\2\2\2[\\\7>\2\2\\]\7?\2\2]\36\3\2\2\2^_\7@\2\2_ \3\2\2\2`a\7@\2\2a"+
		"b\7?\2\2b\"\3\2\2\2cd\7r\2\2de\7t\2\2ef\7k\2\2fg\7p\2\2gh\7v\2\2h$\3\2"+
		"\2\2ij\7t\2\2jk\7g\2\2kl\7c\2\2lm\7f\2\2mn\7a\2\2no\7k\2\2op\7p\2\2pq"+
		"\7v\2\2q&\3\2\2\2rs\7t\2\2st\7g\2\2tu\7c\2\2uv\7f\2\2vw\7a\2\2wx\7u\2"+
		"\2xy\7v\2\2yz\7t\2\2z{\7k\2\2{|\7p\2\2|}\7i\2\2}(\3\2\2\2~\u0082\7$\2"+
		"\2\177\u0081\n\2\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\7$\2\2\u0086*\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089\7h\2\2\u0089"+
		",\3\2\2\2\u008a\u008b\7g\2\2\u008b\u008c\7n\2\2\u008c\u008d\7u\2\2\u008d"+
		"\u008e\7g\2\2\u008e.\3\2\2\2\u008f\u0090\7g\2\2\u0090\u0091\7p\2\2\u0091"+
		"\u0092\7f\2\2\u0092\60\3\2\2\2\u0093\u0094\7y\2\2\u0094\u0095\7j\2\2\u0095"+
		"\u0096\7k\2\2\u0096\u0097\7n\2\2\u0097\u0098\7g\2\2\u0098\62\3\2\2\2\u0099"+
		"\u009a\7h\2\2\u009a\u009b\7q\2\2\u009b\u009c\7t\2\2\u009c\64\3\2\2\2\u009d"+
		"\u009f\4\62;\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\66\3\2\2\2\u00a2\u00a4\4c|\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"8\3\2\2\2\u00a7\u00a9\t\3\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2"+
		"\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad"+
		"\b\35\2\2\u00ad:\3\2\2\2\u00ae\u00b0\7\17\2\2\u00af\u00ae\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\f\2\2\u00b2<\3\2\2\2"+
		"\u00b3\u00b7\7%\2\2\u00b4\u00b6\n\4\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bb\b\37\3\2\u00bb>\3\2\2\2\t\2\u0082\u00a0\u00a5"+
		"\u00aa\u00af\u00b7\4\3\35\2\3\37\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}