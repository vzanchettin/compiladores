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
		SEMICOLON=9, COMMA=10, PROCEDURE=11, EQ=12, NE=13, LT=14, LE=15, GT=16, 
		GE=17, OPEN_B=18, CLOSE_B=19, PRINT=20, READ_INT=21, READ_STRING=22, STRING=23, 
		ARRAY=24, LENGTH=25, IF=26, ELSE=27, END=28, WHILE=29, FOR=30, NUMBER=31, 
		NAME=32, SPACE=33, NL=34, COMMENT=35;
	public static final int
		RULE_program = 0, RULE_procedure = 1, RULE_main = 2, RULE_statement = 3, 
		RULE_st_print = 4, RULE_st_attrib = 5, RULE_st_while = 6, RULE_st_if = 7, 
		RULE_st_for = 8, RULE_st_call = 9, RULE_exp_comparison = 10, RULE_exp_arithmetic = 11, 
		RULE_term = 12, RULE_factor = 13;
	public static final String[] ruleNames = {
		"program", "procedure", "main", "statement", "st_print", "st_attrib", 
		"st_while", "st_if", "st_for", "st_call", "exp_comparison", "exp_arithmetic", 
		"term", "factor"
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

	@Override
	public String getGrammarFileName() { return "Dubem.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

			  symbol_table.add("args");
			  symbol_type.add('-');

			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
				{
				{
				setState(29);
				statement();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
			  for(int i = 0; i < symbol_table_not_used.size(); i++)
			  {

			    System.err.println("WARNING: did not use "+symbol_table_not_used.get(i));
			    errors++;

			  }
			  
			  System.out.println("  return"); 
			  System.out.println(".limit stack"+ " " + stack_max + 1); 
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

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(DubemParser.PROCEDURE, 0); }
		public TerminalNode NAME() { return getToken(DubemParser.NAME, 0); }
		public TerminalNode OPEN_P() { return getToken(DubemParser.OPEN_P, 0); }
		public TerminalNode CLOSE_P() { return getToken(DubemParser.CLOSE_P, 0); }
		public List<TerminalNode> NL() { return getTokens(DubemParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(DubemParser.NL, i);
		}
		public TerminalNode END() { return getToken(DubemParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitProcedure(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(PROCEDURE);
			setState(38);
			match(NAME);
			setState(39);
			match(OPEN_P);
			setState(40);
			match(CLOSE_P);
			setState(41);
			match(NL);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
				{
				{
				setState(42);
				statement();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(END);
			setState(49);
			match(NL);
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

	public static class MainContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
				{
				{
				setState(51);
				statement();
				}
				}
				setState(56);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(DubemParser.NL, 0); }
		public St_printContext st_print() {
			return getRuleContext(St_printContext.class,0);
		}
		public St_attribContext st_attrib() {
			return getRuleContext(St_attribContext.class,0);
		}
		public St_whileContext st_while() {
			return getRuleContext(St_whileContext.class,0);
		}
		public St_forContext st_for() {
			return getRuleContext(St_forContext.class,0);
		}
		public St_ifContext st_if() {
			return getRuleContext(St_ifContext.class,0);
		}
		public St_callContext st_call() {
			return getRuleContext(St_callContext.class,0);
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
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				st_print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				st_attrib();
				setState(60);
				match(NL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				st_while();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				st_for();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				st_if();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				st_for();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(66);
				st_call();
				}
				break;
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
		public Exp_arithmeticContext e1;
		public Exp_arithmeticContext e2;
		public TerminalNode PRINT() { return getToken(DubemParser.PRINT, 0); }
		public TerminalNode NL() { return getToken(DubemParser.NL, 0); }
		public List<Exp_arithmeticContext> exp_arithmetic() {
			return getRuleContexts(Exp_arithmeticContext.class);
		}
		public Exp_arithmeticContext exp_arithmetic(int i) {
			return getRuleContext(Exp_arithmeticContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DubemParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DubemParser.COMMA, i);
		}
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
		enterRule(_localctx, 8, RULE_st_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(PRINT);


			  emit("getstatic java/lang/System/out Ljava/io/PrintStream;", +1);


			setState(71);
			((St_printContext)_localctx).e1 = exp_arithmetic();


			  if( ((St_printContext)_localctx).e1.type == 'i')
			    emit(" invokevirtual java/io/PrintStream/print(I)V\n", -2);
			  else
			    emit(" invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);


			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(73);
				match(COMMA);
				 emit("getstatic java/lang/System/out Ljava/io/PrintStream;", +1); 
				setState(75);
				((St_printContext)_localctx).e2 = exp_arithmetic();
				 

				    if(((St_printContext)_localctx).e2.type == 'i')
				      emit(" invokevirtual java/io/PrintStream/print(I)V\n", -2);
				    else
				      emit(" invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
				    
				  
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(NL);

			  emit("getstatic java/lang/System/out Ljava/io/PrintStream;", +1);
			  emit(" invokevirtual java/io/PrintStream/println()V\n", -1);

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
		public Exp_arithmeticContext e2;
		public Exp_arithmeticContext e1;
		public TerminalNode NAME() { return getToken(DubemParser.NAME, 0); }
		public TerminalNode ATTRIB() { return getToken(DubemParser.ATTRIB, 0); }
		public TerminalNode ARRAY() { return getToken(DubemParser.ARRAY, 0); }
		public List<Exp_arithmeticContext> exp_arithmetic() {
			return getRuleContexts(Exp_arithmeticContext.class);
		}
		public Exp_arithmeticContext exp_arithmetic(int i) {
			return getRuleContext(Exp_arithmeticContext.class,i);
		}
		public TerminalNode OPEN_B() { return getToken(DubemParser.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(DubemParser.CLOSE_B, 0); }
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
		enterRule(_localctx, 10, RULE_st_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			((St_attribContext)_localctx).NAME = match(NAME);
			setState(92);
			_la = _input.LA(1);
			if (_la==OPEN_B) {
				{
				setState(87);
				match(OPEN_B);

				     if (symbol_table.indexOf((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null)) == -1) {
				       System.err.println("Undefined variable:" + (((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null) );
				       System.exit(1);
				     }

				     int end = symbol_table.indexOf((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null));

				     if (symbol_type.get(end) != 'v' ) {
				      System.err.println("is not a vector");
				      System.exit('1');
				     }

				      emit("aload " + end, -1);
				  
				setState(89);
				((St_attribContext)_localctx).e2 = exp_arithmetic();
				setState(90);
				match(CLOSE_B);
				}
			}

			setState(94);
			match(ATTRIB);
			setState(102);
			switch (_input.LA(1)) {
			case OPEN_P:
			case READ_INT:
			case READ_STRING:
			case STRING:
			case LENGTH:
			case NUMBER:
			case NAME:
				{
				setState(95);
				((St_attribContext)_localctx).e1 = exp_arithmetic();


				      if(symbol_table.indexOf((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null)) == -1){
				        symbol_table.add((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null));
				        symbol_table_not_used.add((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null));

				        if(((St_attribContext)_localctx).e1.type == 'i')
				          symbol_type.add('i');
				        else if (((St_attribContext)_localctx).e1.type == 'a')
				          symbol_type.add('a');
				        
				      }
				    
				    int end = symbol_table.indexOf((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null));
				    if (symbol_type.get(end) == 'i') {
				      emit("istore " + end, -1);
				    } else if (symbol_type.get(end) == 'a') {
				      emit("astore " + end, -1);
				    } else {
				      emit ("iastore", -3);
				    }
				   System.out.println();
				  
				}
				break;
			case ARRAY:
				{
				setState(98);
				match(ARRAY);
				setState(99);
				exp_arithmetic();
				       
				        emit("newarray int", 0);
				        symbol_table.add((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null));
				        symbol_type.add('v');
				        emit("astore " + symbol_table.indexOf((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null)), -1);
				        System.out.println(); 
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class St_whileContext extends ParserRuleContext {
		public Exp_comparisonContext s;
		public TerminalNode WHILE() { return getToken(DubemParser.WHILE, 0); }
		public List<TerminalNode> NL() { return getTokens(DubemParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(DubemParser.NL, i);
		}
		public TerminalNode END() { return getToken(DubemParser.END, 0); }
		public Exp_comparisonContext exp_comparison() {
			return getRuleContext(Exp_comparisonContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public St_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterSt_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitSt_while(this);
		}
	}

	public final St_whileContext st_while() throws RecognitionException {
		St_whileContext _localctx = new St_whileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_st_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(WHILE);

			  int local = ++count_while;
			  System.out.println("BEGIN_WHILE_"+local+":");

			setState(106);
			((St_whileContext)_localctx).s = exp_comparison();
			setState(107);
			match(NL);

			  emit(((St_whileContext)_localctx).s.bytecode + " END_WHILE_" +local, -2);

			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
				{
				{
				setState(109);
				statement();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 emit("goto BEGIN_WHILE_"+local, 0); 
			setState(116);
			match(END);
			setState(117);
			match(NL);
			 System.out.println("END_WHILE_"+local+":"); 
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

	public static class St_ifContext extends ParserRuleContext {
		public Exp_comparisonContext s;
		public TerminalNode IF() { return getToken(DubemParser.IF, 0); }
		public List<TerminalNode> NL() { return getTokens(DubemParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(DubemParser.NL, i);
		}
		public TerminalNode END() { return getToken(DubemParser.END, 0); }
		public Exp_comparisonContext exp_comparison() {
			return getRuleContext(Exp_comparisonContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DubemParser.ELSE, 0); }
		public St_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterSt_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitSt_if(this);
		}
	}

	public final St_ifContext st_if() throws RecognitionException {
		St_ifContext _localctx = new St_ifContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_st_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(IF);
			 int local = ++count_if; 
			setState(122);
			((St_ifContext)_localctx).s = exp_comparison();
			setState(123);
			match(NL);
			 emit(((St_ifContext)_localctx).s.bytecode + " NOT_IF"+local, -2); 
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
				{
				{
				setState(125);
				statement();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
			  emit("goto END_ELSE"+local, 0);
			  System.out.println("NOT_IF"+local+":");

			setState(140);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(132);
				match(ELSE);
				setState(133);
				match(NL);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
					{
					{
					setState(134);
					statement();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			 System.out.println("END_ELSE"+local+":"); 
			setState(143);
			match(END);
			setState(144);
			match(NL);
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

	public static class St_forContext extends ParserRuleContext {
		public Exp_comparisonContext s;
		public TerminalNode FOR() { return getToken(DubemParser.FOR, 0); }
		public List<St_attribContext> st_attrib() {
			return getRuleContexts(St_attribContext.class);
		}
		public St_attribContext st_attrib(int i) {
			return getRuleContext(St_attribContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(DubemParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(DubemParser.SEMICOLON, i);
		}
		public List<TerminalNode> NL() { return getTokens(DubemParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(DubemParser.NL, i);
		}
		public TerminalNode END() { return getToken(DubemParser.END, 0); }
		public Exp_comparisonContext exp_comparison() {
			return getRuleContext(Exp_comparisonContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public St_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterSt_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitSt_for(this);
		}
	}

	public final St_forContext st_for() throws RecognitionException {
		St_forContext _localctx = new St_forContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_st_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(FOR);
			 int local = ++count_for; 
			setState(148);
			st_attrib();
			setState(149);
			match(SEMICOLON);
			 System.out.println("FOR_COMP_"+local+":"); 
			setState(151);
			((St_forContext)_localctx).s = exp_comparison();
			setState(152);
			match(SEMICOLON);
			 
			  emit(((St_forContext)_localctx).s.bytecode + " END_FOR_"+local, -2);
			  emit("goto FOR_"+local, 0);
			  System.out.println("FOR_INC_"+local+":");

			setState(154);
			st_attrib();
			setState(155);
			match(NL);
			 
			  emit("goto FOR_COMP_"+local, 0);
			  System.out.println("FOR_"+local+":"); 

			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
				{
				{
				setState(157);
				statement();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
			  emit("goto FOR_INC_"+local, 0);
			  System.out.println("END_FOR_"+local+":"); 

			setState(164);
			match(END);
			setState(165);
			match(NL);
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

	public static class St_callContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DubemParser.NAME, 0); }
		public TerminalNode OPEN_P() { return getToken(DubemParser.OPEN_P, 0); }
		public TerminalNode CLOSE_P() { return getToken(DubemParser.CLOSE_P, 0); }
		public TerminalNode NL() { return getToken(DubemParser.NL, 0); }
		public St_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterSt_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitSt_call(this);
		}
	}

	public final St_callContext st_call() throws RecognitionException {
		St_callContext _localctx = new St_callContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_st_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(NAME);
			setState(168);
			match(OPEN_P);
			setState(169);
			match(CLOSE_P);
			setState(170);
			match(NL);


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

	public static class Exp_comparisonContext extends ParserRuleContext {
		public String bytecode;
		public Exp_arithmeticContext e1;
		public Token op;
		public Exp_arithmeticContext e2;
		public List<Exp_arithmeticContext> exp_arithmetic() {
			return getRuleContexts(Exp_arithmeticContext.class);
		}
		public Exp_arithmeticContext exp_arithmetic(int i) {
			return getRuleContext(Exp_arithmeticContext.class,i);
		}
		public TerminalNode EQ() { return getToken(DubemParser.EQ, 0); }
		public TerminalNode NE() { return getToken(DubemParser.NE, 0); }
		public TerminalNode LT() { return getToken(DubemParser.LT, 0); }
		public TerminalNode LE() { return getToken(DubemParser.LE, 0); }
		public TerminalNode GT() { return getToken(DubemParser.GT, 0); }
		public TerminalNode GE() { return getToken(DubemParser.GE, 0); }
		public Exp_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterExp_comparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitExp_comparison(this);
		}
	}

	public final Exp_comparisonContext exp_comparison() throws RecognitionException {
		Exp_comparisonContext _localctx = new Exp_comparisonContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exp_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			((Exp_comparisonContext)_localctx).e1 = exp_arithmetic();
			setState(174);
			((Exp_comparisonContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE))) != 0)) ) {
				((Exp_comparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(175);
			((Exp_comparisonContext)_localctx).e2 = exp_arithmetic();

			  if(((Exp_comparisonContext)_localctx).e1.type != ((Exp_comparisonContext)_localctx).e2.type)
			  {
			    System.err.println("ERROR: can not mix types");
			    errors++;
			  }

			  if((((Exp_comparisonContext)_localctx).op!=null?((Exp_comparisonContext)_localctx).op.getType():0) == EQ)      ((Exp_comparisonContext)_localctx).bytecode =  "if_icmpne"; 
			  else if((((Exp_comparisonContext)_localctx).op!=null?((Exp_comparisonContext)_localctx).op.getType():0) == NE) ((Exp_comparisonContext)_localctx).bytecode =  "if_icmpeq";
			  else if((((Exp_comparisonContext)_localctx).op!=null?((Exp_comparisonContext)_localctx).op.getType():0) == LT) ((Exp_comparisonContext)_localctx).bytecode =  "if_icmpge";
			  else if((((Exp_comparisonContext)_localctx).op!=null?((Exp_comparisonContext)_localctx).op.getType():0) == LE) ((Exp_comparisonContext)_localctx).bytecode =  "if_icmpgt";
			  else if((((Exp_comparisonContext)_localctx).op!=null?((Exp_comparisonContext)_localctx).op.getType():0) == GT) ((Exp_comparisonContext)_localctx).bytecode =  "if_icmple";
			  else if((((Exp_comparisonContext)_localctx).op!=null?((Exp_comparisonContext)_localctx).op.getType():0) == GE) ((Exp_comparisonContext)_localctx).bytecode =  "if_icmplt";  

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

	public static class Exp_arithmeticContext extends ParserRuleContext {
		public char type;
		public TermContext t1;
		public Token op;
		public TermContext t2;
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
		public Exp_arithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterExp_arithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitExp_arithmetic(this);
		}
	}

	public final Exp_arithmeticContext exp_arithmetic() throws RecognitionException {
		Exp_arithmeticContext _localctx = new Exp_arithmeticContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exp_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			((Exp_arithmeticContext)_localctx).t1 = term();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(179);
				((Exp_arithmeticContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Exp_arithmeticContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(180);
				((Exp_arithmeticContext)_localctx).t2 = term();
				 
				  if(((Exp_arithmeticContext)_localctx).t1.type != ((Exp_arithmeticContext)_localctx).t2.type)
				  {
				    System.err.println("ERROR: cannot mix types");
				    errors++;
				  }

				  emit((((Exp_arithmeticContext)_localctx).op!=null?((Exp_arithmeticContext)_localctx).op.getType():0) == PLUS ? "iadd" : "isub", -1);

				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((Exp_arithmeticContext)_localctx).type =  ((Exp_arithmeticContext)_localctx).t1.type; 
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
		public char type;
		public FactorContext f1;
		public Token op;
		public FactorContext f2;
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
		enterRule(_localctx, 24, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			((TermContext)_localctx).f1 = factor();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) {
				{
				{
				setState(191);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(192);
				((TermContext)_localctx).f2 = factor();
				 
				  if(((TermContext)_localctx).f1.type == 'a' || ((TermContext)_localctx).f2.type == 'a')
				  {
				    System.err.println("ERROR: cannot mix types");
				    errors++;
				  }

				  emit((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == TIMES ? "imul" :
				    ((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getType():0) == OVER ? "idiv": "irem"), -1);

				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((TermContext)_localctx).type =  ((TermContext)_localctx).f1.type; 
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
		public char type;
		public Token NUMBER;
		public Exp_arithmeticContext exp_arithmetic;
		public Token NAME;
		public Token STRING;
		public TerminalNode NUMBER() { return getToken(DubemParser.NUMBER, 0); }
		public TerminalNode OPEN_P() { return getToken(DubemParser.OPEN_P, 0); }
		public Exp_arithmeticContext exp_arithmetic() {
			return getRuleContext(Exp_arithmeticContext.class,0);
		}
		public TerminalNode CLOSE_P() { return getToken(DubemParser.CLOSE_P, 0); }
		public TerminalNode NAME() { return getToken(DubemParser.NAME, 0); }
		public TerminalNode OPEN_B() { return getToken(DubemParser.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(DubemParser.CLOSE_B, 0); }
		public TerminalNode READ_INT() { return getToken(DubemParser.READ_INT, 0); }
		public TerminalNode READ_STRING() { return getToken(DubemParser.READ_STRING, 0); }
		public TerminalNode STRING() { return getToken(DubemParser.STRING, 0); }
		public TerminalNode LENGTH() { return getToken(DubemParser.LENGTH, 0); }
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
		enterRule(_localctx, 26, RULE_factor);
		int _la;
		try {
			setState(227);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				 
				  emit(" ldc " + (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), +1);
				  ((FactorContext)_localctx).type =  'i';

				}
				break;
			case OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(OPEN_P);
				setState(205);
				((FactorContext)_localctx).exp_arithmetic = exp_arithmetic();
				setState(206);
				match(CLOSE_P);

				  ((FactorContext)_localctx).type =  ((FactorContext)_localctx).exp_arithmetic.type;

				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				((FactorContext)_localctx).NAME = match(NAME);
				setState(215);
				_la = _input.LA(1);
				if (_la==OPEN_B) {
					{
					setState(210);
					match(OPEN_B);

					     int end = symbol_table.indexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null));

					     if (symbol_type.get(end) != 'v' ) {
					      System.err.println("is not a vector");
					      System.exit('1');
					     }

					      emit("aload " + end, -1);

					setState(212);
					exp_arithmetic();
					setState(213);
					match(CLOSE_B);
					}
				}


				  if(symbol_table.indexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null)) >= 0){
				    
				    if ((symbol_type.get(symbol_table.indexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))) == 'v')) {
				      emit(" iaload ", -1);      
				      ((FactorContext)_localctx).type =  'i';
				    } else {
				       emit(" " + symbol_type.get(symbol_table.indexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))) + "load " + symbol_table.indexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null)), +1);
				       symbol_table_not_used.remove((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null));
				       ((FactorContext)_localctx).type =  symbol_type.get(symbol_table.indexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null)));
				   }
				  }
				  else
				  { 
				    System.err.println("WARNING: Used non declared variable "+(((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null));
				    errors++;
				  }

				}
				break;
			case READ_INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(READ_INT);
				 
				  emit(" invokestatic Runtime/readInt()I", +1);
				  ((FactorContext)_localctx).type =  'i';

				}
				break;
			case READ_STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				match(READ_STRING);

				  ((FactorContext)_localctx).type =  'a';

				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				((FactorContext)_localctx).STRING = match(STRING);

				  emit(" ldc " + (((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null), +1); 
				  ((FactorContext)_localctx).type =  'a';

				}
				break;
			case LENGTH:
				enterOuterAlt(_localctx, 7);
				{
				setState(224);
				match(LENGTH);
				setState(225);
				((FactorContext)_localctx).NAME = match(NAME);

				  //ver se esta na tabela de simbolos
				  int end = symbol_table.indexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null));

				  emit("aload " +  end, +1);
				  emit("arraylength", +0); 
				  ((FactorContext)_localctx).type =  'i';

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\7\2!\n\2\f\2\16\2$\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3\3\3"+
		"\3\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5F\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6Q\n\6\f\6\16\6T\13"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7_\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7i\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bq\n\b\f\b\16\bt\13\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0081\n\t\f\t\16\t\u0084"+
		"\13\t\3\t\3\t\3\t\3\t\7\t\u008a\n\t\f\t\16\t\u008d\13\t\5\t\u008f\n\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a1"+
		"\n\n\f\n\16\n\u00a4\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u00ba\n\r\f\r\16\r\u00bd"+
		"\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u00c6\n\16\f\16\16\16\u00c9"+
		"\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00da\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00e6\n\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\2\5\3\2\16\23\3\2\3\4\3\2\5\7\u00f4\2\36\3\2\2\2\4\'\3\2\2\2\68\3\2\2"+
		"\2\bE\3\2\2\2\nG\3\2\2\2\fX\3\2\2\2\16j\3\2\2\2\20z\3\2\2\2\22\u0094\3"+
		"\2\2\2\24\u00a9\3\2\2\2\26\u00af\3\2\2\2\30\u00b4\3\2\2\2\32\u00c0\3\2"+
		"\2\2\34\u00e5\3\2\2\2\36\"\b\2\1\2\37!\5\b\5\2 \37\3\2\2\2!$\3\2\2\2\""+
		" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\b\2\1\2&\3\3\2\2\2\'(\7\r"+
		"\2\2()\7\"\2\2)*\7\b\2\2*+\7\t\2\2+/\7$\2\2,.\5\b\5\2-,\3\2\2\2.\61\3"+
		"\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\36\2\2"+
		"\63\64\7$\2\2\64\5\3\2\2\2\65\67\5\b\5\2\66\65\3\2\2\2\67:\3\2\2\28\66"+
		"\3\2\2\289\3\2\2\29\7\3\2\2\2:8\3\2\2\2;F\7$\2\2<F\5\n\6\2=>\5\f\7\2>"+
		"?\7$\2\2?F\3\2\2\2@F\5\16\b\2AF\5\22\n\2BF\5\20\t\2CF\5\22\n\2DF\5\24"+
		"\13\2E;\3\2\2\2E<\3\2\2\2E=\3\2\2\2E@\3\2\2\2EA\3\2\2\2EB\3\2\2\2EC\3"+
		"\2\2\2ED\3\2\2\2F\t\3\2\2\2GH\7\26\2\2HI\b\6\1\2IJ\5\30\r\2JR\b\6\1\2"+
		"KL\7\f\2\2LM\b\6\1\2MN\5\30\r\2NO\b\6\1\2OQ\3\2\2\2PK\3\2\2\2QT\3\2\2"+
		"\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7$\2\2VW\b\6\1\2W\13\3\2"+
		"\2\2X^\7\"\2\2YZ\7\24\2\2Z[\b\7\1\2[\\\5\30\r\2\\]\7\25\2\2]_\3\2\2\2"+
		"^Y\3\2\2\2^_\3\2\2\2_`\3\2\2\2`h\7\n\2\2ab\5\30\r\2bc\b\7\1\2ci\3\2\2"+
		"\2de\7\32\2\2ef\5\30\r\2fg\b\7\1\2gi\3\2\2\2ha\3\2\2\2hd\3\2\2\2i\r\3"+
		"\2\2\2jk\7\37\2\2kl\b\b\1\2lm\5\26\f\2mn\7$\2\2nr\b\b\1\2oq\5\b\5\2po"+
		"\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\b\b\1\2v"+
		"w\7\36\2\2wx\7$\2\2xy\b\b\1\2y\17\3\2\2\2z{\7\34\2\2{|\b\t\1\2|}\5\26"+
		"\f\2}~\7$\2\2~\u0082\b\t\1\2\177\u0081\5\b\5\2\u0080\177\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u008e\b\t\1\2\u0086\u0087\7\35\2\2\u0087"+
		"\u008b\7$\2\2\u0088\u008a\5\b\5\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\b\t\1\2\u0091\u0092\7\36\2\2\u0092\u0093\7$\2\2\u0093"+
		"\21\3\2\2\2\u0094\u0095\7 \2\2\u0095\u0096\b\n\1\2\u0096\u0097\5\f\7\2"+
		"\u0097\u0098\7\13\2\2\u0098\u0099\b\n\1\2\u0099\u009a\5\26\f\2\u009a\u009b"+
		"\7\13\2\2\u009b\u009c\b\n\1\2\u009c\u009d\5\f\7\2\u009d\u009e\7$\2\2\u009e"+
		"\u00a2\b\n\1\2\u009f\u00a1\5\b\5\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a6\b\n\1\2\u00a6\u00a7\7\36\2\2\u00a7\u00a8\7"+
		"$\2\2\u00a8\23\3\2\2\2\u00a9\u00aa\7\"\2\2\u00aa\u00ab\7\b\2\2\u00ab\u00ac"+
		"\7\t\2\2\u00ac\u00ad\7$\2\2\u00ad\u00ae\b\13\1\2\u00ae\25\3\2\2\2\u00af"+
		"\u00b0\5\30\r\2\u00b0\u00b1\t\2\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3\b"+
		"\f\1\2\u00b3\27\3\2\2\2\u00b4\u00bb\5\32\16\2\u00b5\u00b6\t\3\2\2\u00b6"+
		"\u00b7\5\32\16\2\u00b7\u00b8\b\r\1\2\u00b8\u00ba\3\2\2\2\u00b9\u00b5\3"+
		"\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\b\r\1\2\u00bf\31\3\2\2"+
		"\2\u00c0\u00c7\5\34\17\2\u00c1\u00c2\t\4\2\2\u00c2\u00c3\5\34\17\2\u00c3"+
		"\u00c4\b\16\1\2\u00c4\u00c6\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\u00c9\3"+
		"\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cb\b\16\1\2\u00cb\33\3\2\2\2\u00cc\u00cd\7!\2"+
		"\2\u00cd\u00e6\b\17\1\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0\5\30\r\2\u00d0"+
		"\u00d1\7\t\2\2\u00d1\u00d2\b\17\1\2\u00d2\u00e6\3\2\2\2\u00d3\u00d9\7"+
		"\"\2\2\u00d4\u00d5\7\24\2\2\u00d5\u00d6\b\17\1\2\u00d6\u00d7\5\30\r\2"+
		"\u00d7\u00d8\7\25\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e6\b\17\1\2\u00dc\u00dd\7\27\2\2"+
		"\u00dd\u00e6\b\17\1\2\u00de\u00df\7\30\2\2\u00df\u00e6\b\17\1\2\u00e0"+
		"\u00e1\7\31\2\2\u00e1\u00e6\b\17\1\2\u00e2\u00e3\7\33\2\2\u00e3\u00e4"+
		"\7\"\2\2\u00e4\u00e6\b\17\1\2\u00e5\u00cc\3\2\2\2\u00e5\u00ce\3\2\2\2"+
		"\u00e5\u00d3\3\2\2\2\u00e5\u00dc\3\2\2\2\u00e5\u00de\3\2\2\2\u00e5\u00e0"+
		"\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e6\35\3\2\2\2\22\"/8ER^hr\u0082\u008b"+
		"\u008e\u00a2\u00bb\u00c7\u00d9\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}