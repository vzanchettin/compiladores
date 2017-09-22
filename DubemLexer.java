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
		COMMA=9, PRINT=10, READ_INT=11, COMMENT=12, NUMBER=13, NAME=14, SPACE=15, 
		NL=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OPEN_P", "CLOSE_P", "ATTRIB", 
		"COMMA", "PRINT", "READ_INT", "COMMENT", "NUMBER", "NAME", "SPACE", "NL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", "','", "'print'", 
		"'read_int'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OPEN_P", "CLOSE_P", 
		"ATTRIB", "COMMA", "PRINT", "READ_INT", "COMMENT", "NUMBER", "NAME", "SPACE", 
		"NL"
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
		case 11:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22c\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7"+
		"\rG\n\r\f\r\16\rJ\13\r\3\r\3\r\3\16\6\16O\n\16\r\16\16\16P\3\17\6\17T"+
		"\n\17\r\17\16\17U\3\20\6\20Y\n\20\r\20\16\20Z\3\20\3\20\3\21\5\21`\n\21"+
		"\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22\3\2\4\3\2\f\f\4\2\13\13\"\"g\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7"+
		"\'\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r-\3\2\2\2\17/\3\2\2\2\21\61\3\2\2\2"+
		"\23\63\3\2\2\2\25\65\3\2\2\2\27;\3\2\2\2\31D\3\2\2\2\33N\3\2\2\2\35S\3"+
		"\2\2\2\37X\3\2\2\2!_\3\2\2\2#$\7-\2\2$\4\3\2\2\2%&\7/\2\2&\6\3\2\2\2\'"+
		"(\7,\2\2(\b\3\2\2\2)*\7\61\2\2*\n\3\2\2\2+,\7\'\2\2,\f\3\2\2\2-.\7*\2"+
		"\2.\16\3\2\2\2/\60\7+\2\2\60\20\3\2\2\2\61\62\7?\2\2\62\22\3\2\2\2\63"+
		"\64\7.\2\2\64\24\3\2\2\2\65\66\7r\2\2\66\67\7t\2\2\678\7k\2\289\7p\2\2"+
		"9:\7v\2\2:\26\3\2\2\2;<\7t\2\2<=\7g\2\2=>\7c\2\2>?\7f\2\2?@\7a\2\2@A\7"+
		"k\2\2AB\7p\2\2BC\7v\2\2C\30\3\2\2\2DH\7%\2\2EG\n\2\2\2FE\3\2\2\2GJ\3\2"+
		"\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\b\r\2\2L\32\3\2\2\2MO\4"+
		"\62;\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\34\3\2\2\2RT\4c|\2SR\3"+
		"\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\36\3\2\2\2WY\t\3\2\2XW\3\2\2\2Y"+
		"Z\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\b\20\3\2] \3\2\2\2^`\7\17"+
		"\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\f\2\2b\"\3\2\2\2\b\2HPUZ_\4\3\r"+
		"\2\3\20\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}