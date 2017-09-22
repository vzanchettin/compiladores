// Generated from Dubem.g by ANTLR 4.5.3

    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DubemParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, TIMES=3, OVER=4, REMAINDER=5, OPEN_P=6, CLOSE_P=7, ATTRIB=8, 
		COMMA=9, PRINT=10, READ_INT=11, COMMENT=12, NUMBER=13, NAME=14, SPACE=15, 
		NL=16;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_st_print = 2, RULE_st_attrib = 3, 
		RULE_exp_aritmetic = 4, RULE_term = 5, RULE_factor = 6;
	public static final String[] ruleNames = {
		"program", "statement", "st_print", "st_attrib", "exp_aritmetic", "term", 
		"factor"
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

	@Override
	public String getGrammarFileName() { return "Dubem.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public DubemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
					System.out.println(".source Test.j");
					System.out.println(".class public Test"); 
					System.out.println(".super  java/lang/Object"); 
					System.out.println(".method public <init>()V");  
					System.out.println("aload_0");
					System.out.println("invokenonvirtual java/lang/Object/<init>()V");
					System.out.println("return");
					System.out.println(".end method");
					System.out.println(".method public static main([Ljava/lang/String;)V");
					


				
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NAME) | (1L << NL))) != 0)) {
				{
				{
				setState(15);
				statement();
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
					System.out.println("  return"); 
					System.out.println(".limit stack"+ " " + stack_max); 
					System.out.println(".limit locals"+ " " + symbol_table.size()); 
					System.out.println(".end method");
				
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(DubemParser.NL, 0); }
		public St_printContext st_print() {
			return getRuleContext(St_printContext.class,0);
		}
		public St_attribContext st_attrib() {
			return getRuleContext(St_attribContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(26);
			switch (_input.LA(1)) {
			case NL:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				match(NL);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				st_print();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				st_attrib();
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

	public static class St_printContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(DubemParser.PRINT, 0); }
		public Exp_aritmeticContext exp_aritmetic() {
			return getRuleContext(Exp_aritmeticContext.class,0);
		}
		public TerminalNode NL() { return getToken(DubemParser.NL, 0); }
		public St_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterSt_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitSt_print(this);
		}
	}

	public final St_printContext st_print() throws RecognitionException {
		St_printContext _localctx = new St_printContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_st_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(PRINT);

					emit("getstatic java/lang/System/out Ljava/io/PrintStream;", +1);
				
			setState(30);
			exp_aritmetic();
			setState(31);
			match(NL);

					emit("invokevirtual java/io/PrintStream/println(I)V\n", -2);
				
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

	public static class St_attribContext extends ParserRuleContext {
		public Token NAME;
		public TerminalNode NAME() { return getToken(DubemParser.NAME, 0); }
		public TerminalNode ATTRIB() { return getToken(DubemParser.ATTRIB, 0); }
		public Exp_aritmeticContext exp_aritmetic() {
			return getRuleContext(Exp_aritmeticContext.class,0);
		}
		public TerminalNode NL() { return getToken(DubemParser.NL, 0); }
		public St_attribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterSt_attrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitSt_attrib(this);
		}
	}

	public final St_attribContext st_attrib() throws RecognitionException {
		St_attribContext _localctx = new St_attribContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_st_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			((St_attribContext)_localctx).NAME = match(NAME);
			setState(35);
			match(ATTRIB);
			setState(36);
			exp_aritmetic();
			setState(37);
			match(NL);

			  		if(symbol_table.indexOf((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null)) == -1){
			  			symbol_table.add((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null));
			  			symbol_table_used.add(false);
			  		}

			  		emit("istore "+symbol_table.indexOf((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null)), -1);
			  	
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

	public static class Exp_aritmeticContext extends ParserRuleContext {
		public Token op;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(DubemParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(DubemParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(DubemParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(DubemParser.MINUS, i);
		}
		public Exp_aritmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterExp_aritmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitExp_aritmetic(this);
		}
	}

	public final Exp_aritmeticContext exp_aritmetic() throws RecognitionException {
		Exp_aritmeticContext _localctx = new Exp_aritmeticContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exp_aritmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			term();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(41);
				((Exp_aritmeticContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Exp_aritmeticContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(42);
				term();
				 emit((((Exp_aritmeticContext)_localctx).op!=null?((Exp_aritmeticContext)_localctx).op.getType():0) == PLUS ? "iadd" : "isub", -1); 
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class TermContext extends ParserRuleContext {
		public Token op;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(DubemParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(DubemParser.TIMES, i);
		}
		public List<TerminalNode> OVER() { return getTokens(DubemParser.OVER); }
		public TerminalNode OVER(int i) {
			return getToken(DubemParser.OVER, i);
		}
		public List<TerminalNode> REMAINDER() { return getTokens(DubemParser.REMAINDER); }
		public TerminalNode REMAINDER(int i) {
			return getToken(DubemParser.REMAINDER, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			factor();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) {
				{
				{
				setState(51);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(52);
				factor();
				 emit((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == TIMES ? "imul" :
							((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == OVER ? "idiv": "irem"), -1); 
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FactorContext extends ParserRuleContext {
		public Token NUMBER;
		public Token NAME;
		public TerminalNode NUMBER() { return getToken(DubemParser.NUMBER, 0); }
		public TerminalNode OPEN_P() { return getToken(DubemParser.OPEN_P, 0); }
		public Exp_aritmeticContext exp_aritmetic() {
			return getRuleContext(Exp_aritmeticContext.class,0);
		}
		public TerminalNode CLOSE_P() { return getToken(DubemParser.CLOSE_P, 0); }
		public TerminalNode NAME() { return getToken(DubemParser.NAME, 0); }
		public TerminalNode READ_INT() { return getToken(DubemParser.READ_INT, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		try {
			setState(70);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				 emit(" ldc " + (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), +1); 
				}
				break;
			case OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(OPEN_P);
				setState(63);
				exp_aritmetic();
				setState(64);
				match(CLOSE_P);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				((FactorContext)_localctx).NAME = match(NAME);
				  if(symbol_table.indexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null)) >= 0) {
				    				emit(" iload "+symbol_table.indexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null)), +1);
				  				
				    				symbol_table_used.set(symbol_table.indexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null)), true);
				    			}
				    			else
				    			{
				    				System.err.println("Variable " + (((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null) + " undefined");
				    				System.exit(1);
				    			}
				    		
				}
				break;
			case READ_INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(READ_INT);

				    		emit("invokestatic Runtime/readInt()I", +1);

				        
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22K\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\7\2\23\n\2\f\2\16\2"+
		"\26\13\2\3\2\3\2\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6\60\n\6\f\6\16\6\63\13\6\3\7"+
		"\3\7\3\7\3\7\3\7\7\7:\n\7\f\7\16\7=\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\bI\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\4\3\2\3\4\3\2\5\7K\2\20"+
		"\3\2\2\2\4\34\3\2\2\2\6\36\3\2\2\2\b$\3\2\2\2\n*\3\2\2\2\f\64\3\2\2\2"+
		"\16H\3\2\2\2\20\24\b\2\1\2\21\23\5\4\3\2\22\21\3\2\2\2\23\26\3\2\2\2\24"+
		"\22\3\2\2\2\24\25\3\2\2\2\25\27\3\2\2\2\26\24\3\2\2\2\27\30\b\2\1\2\30"+
		"\3\3\2\2\2\31\35\7\22\2\2\32\35\5\6\4\2\33\35\5\b\5\2\34\31\3\2\2\2\34"+
		"\32\3\2\2\2\34\33\3\2\2\2\35\5\3\2\2\2\36\37\7\f\2\2\37 \b\4\1\2 !\5\n"+
		"\6\2!\"\7\22\2\2\"#\b\4\1\2#\7\3\2\2\2$%\7\20\2\2%&\7\n\2\2&\'\5\n\6\2"+
		"\'(\7\22\2\2()\b\5\1\2)\t\3\2\2\2*\61\5\f\7\2+,\t\2\2\2,-\5\f\7\2-.\b"+
		"\6\1\2.\60\3\2\2\2/+\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
		"\13\3\2\2\2\63\61\3\2\2\2\64;\5\16\b\2\65\66\t\3\2\2\66\67\5\16\b\2\67"+
		"8\b\7\1\28:\3\2\2\29\65\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\r\3\2\2"+
		"\2=;\3\2\2\2>?\7\17\2\2?I\b\b\1\2@A\7\b\2\2AB\5\n\6\2BC\7\t\2\2CI\3\2"+
		"\2\2DE\7\20\2\2EI\b\b\1\2FG\7\r\2\2GI\b\b\1\2H>\3\2\2\2H@\3\2\2\2HD\3"+
		"\2\2\2HF\3\2\2\2I\17\3\2\2\2\7\24\34\61;H";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}