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
		COMMA=9, EQ=10, NE=11, LT=12, LE=13, GT=14, GE=15, PRINT=16, READ_INT=17, 
		WHILE=18, END=19, IF=20, ELSE=21, COMMENT=22, NUMBER=23, NAME=24, SPACE=25, 
		NL=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OPEN_P", "CLOSE_P", "ATTRIB", 
		"COMMA", "EQ", "NE", "LT", "LE", "GT", "GE", "PRINT", "READ_INT", "WHILE", 
		"END", "IF", "ELSE", "COMMENT", "NUMBER", "NAME", "SPACE", "NL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", "','", "'=='", 
		"'!='", "'<'", "'<='", "'>'", "'>='", "'print'", "'read_int'", "'while'", 
		"'end'", "'if'", "'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OPEN_P", "CLOSE_P", 
		"ATTRIB", "COMMA", "EQ", "NE", "LT", "LE", "GT", "GE", "PRINT", "READ_INT", 
		"WHILE", "END", "IF", "ELSE", "COMMENT", "NUMBER", "NAME", "SPACE", "NL"
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
	    private static ArrayList<Boolean> symbol_table_used;

	    private static int stack_cur, stack_max;

	    private static int count_while = 0;

	    private static int count_if = 0;

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
	        symbol_table_used = new ArrayList<Boolean>();
	        symbol_table.add("args");
	        symbol_table_used.add(true);
	        parser.program();
	        System.out.println("; symbols: " + symbol_table);
	        System.out.println("; symbols: " + symbol_table_used);
	        
	        for(int i = 0; i < symbol_table_used.size(); i++)
			{
				if (symbol_table_used.get(i) == false) {
	        		System.err.println("; WARNING : variables not used: " + symbol_table.get(i));
	 	       	}
			} 
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
		case 21:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\7"+
		"\27}\n\27\f\27\16\27\u0080\13\27\3\27\3\27\3\30\6\30\u0085\n\30\r\30\16"+
		"\30\u0086\3\31\6\31\u008a\n\31\r\31\16\31\u008b\3\32\6\32\u008f\n\32\r"+
		"\32\16\32\u0090\3\32\3\32\3\33\5\33\u0096\n\33\3\33\3\33\2\2\34\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\4\3\2\f\f\4\2"+
		"\13\13\"\"\u009d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2"+
		"\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21"+
		"E\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27L\3\2\2\2\31O\3\2\2\2\33Q\3\2\2\2"+
		"\35T\3\2\2\2\37V\3\2\2\2!Y\3\2\2\2#_\3\2\2\2%h\3\2\2\2\'n\3\2\2\2)r\3"+
		"\2\2\2+u\3\2\2\2-z\3\2\2\2/\u0084\3\2\2\2\61\u0089\3\2\2\2\63\u008e\3"+
		"\2\2\2\65\u0095\3\2\2\2\678\7-\2\28\4\3\2\2\29:\7/\2\2:\6\3\2\2\2;<\7"+
		",\2\2<\b\3\2\2\2=>\7\61\2\2>\n\3\2\2\2?@\7\'\2\2@\f\3\2\2\2AB\7*\2\2B"+
		"\16\3\2\2\2CD\7+\2\2D\20\3\2\2\2EF\7?\2\2F\22\3\2\2\2GH\7.\2\2H\24\3\2"+
		"\2\2IJ\7?\2\2JK\7?\2\2K\26\3\2\2\2LM\7#\2\2MN\7?\2\2N\30\3\2\2\2OP\7>"+
		"\2\2P\32\3\2\2\2QR\7>\2\2RS\7?\2\2S\34\3\2\2\2TU\7@\2\2U\36\3\2\2\2VW"+
		"\7@\2\2WX\7?\2\2X \3\2\2\2YZ\7r\2\2Z[\7t\2\2[\\\7k\2\2\\]\7p\2\2]^\7v"+
		"\2\2^\"\3\2\2\2_`\7t\2\2`a\7g\2\2ab\7c\2\2bc\7f\2\2cd\7a\2\2de\7k\2\2"+
		"ef\7p\2\2fg\7v\2\2g$\3\2\2\2hi\7y\2\2ij\7j\2\2jk\7k\2\2kl\7n\2\2lm\7g"+
		"\2\2m&\3\2\2\2no\7g\2\2op\7p\2\2pq\7f\2\2q(\3\2\2\2rs\7k\2\2st\7h\2\2"+
		"t*\3\2\2\2uv\7g\2\2vw\7n\2\2wx\7u\2\2xy\7g\2\2y,\3\2\2\2z~\7%\2\2{}\n"+
		"\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2"+
		"\2\u0080~\3\2\2\2\u0081\u0082\b\27\2\2\u0082.\3\2\2\2\u0083\u0085\4\62"+
		";\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\60\3\2\2\2\u0088\u008a\4c|\2\u0089\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\62"+
		"\3\2\2\2\u008d\u008f\t\3\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\32"+
		"\3\2\u0093\64\3\2\2\2\u0094\u0096\7\17\2\2\u0095\u0094\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\f\2\2\u0098\66\3\2\2\2\b\2"+
		"~\u0086\u008b\u0090\u0095\4\3\27\2\3\32\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}