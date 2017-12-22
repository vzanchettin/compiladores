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
		SEMICOLON=9, COMMA=10, PROCEDURE=11, FUNCTION=12, RETURN=13, EQ=14, NE=15, 
		LT=16, LE=17, GT=18, GE=19, OPEN_B=20, CLOSE_B=21, PRINT=22, READ_INT=23, 
		READ_STRING=24, STRING=25, ARRAY=26, LENGTH=27, IF=28, ELSE=29, END=30, 
		WHILE=31, FOR=32, NUMBER=33, NAME=34, SPACE=35, NL=36, COMMENT=37;
	public static final int
		RULE_program = 0, RULE_procedure = 1, RULE_function = 2, RULE_parameters = 3, 
		RULE_main = 4, RULE_statement = 5, RULE_st_print = 6, RULE_st_attrib = 7, 
		RULE_st_while = 8, RULE_st_if = 9, RULE_st_for = 10, RULE_st_call = 11, 
		RULE_st_return = 12, RULE_arguments = 13, RULE_exp_comparison = 14, RULE_exp_arithmetic = 15, 
		RULE_term = 16, RULE_factor = 17;
	public static final String[] ruleNames = {
		"program", "procedure", "function", "parameters", "main", "statement", 
		"st_print", "st_attrib", "st_while", "st_if", "st_for", "st_call", "st_return", 
		"arguments", "exp_comparison", "exp_arithmetic", "term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'='", "';'", "','", 
		"'procedure'", "'function'", "'return'", "'=='", "'!='", "'<'", "'<='", 
		"'>'", "'>='", "'['", "']'", "'print'", "'read_int'", "'read_string'", 
		null, "'array'", "'length'", "'if'", "'else'", "'end'", "'while'", "'for'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "MINUS", "TIMES", "OVER", "REMAINDER", "OPEN_P", "CLOSE_P", 
		"ATTRIB", "SEMICOLON", "COMMA", "PROCEDURE", "FUNCTION", "RETURN", "EQ", 
		"NE", "LT", "LE", "GT", "GE", "OPEN_B", "CLOSE_B", "PRINT", "READ_INT", 
		"READ_STRING", "STRING", "ARRAY", "LENGTH", "IF", "ELSE", "END", "WHILE", 
		"FOR", "NUMBER", "NAME", "SPACE", "NL", "COMMENT"
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

	  private static ArrayList<Boolean> symbol_used;
	  
	  private static ArrayList<String> symbol_functions;
	  
	  private static ArrayList<String> symbol_name;
	  
	  private static int count_while = 0;

	  private static int count_if = 0;

	  private static int count_for = 0;

	  private static int stack_cur, stack_max, errors;

	  private static boolean isArray = false;

	  private static void emit(String bytecode, int delta) {

	    System.out.println("   " + bytecode + "   ;  " + delta);
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
	    symbol_used = new ArrayList<Boolean>();
	    symbol_functions = new ArrayList<String>();
	    symbol_name = new ArrayList<String>();

	    parser.program();

	    if(errors > 0)
	      System.exit(1);

	  }

	public DubemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(DubemParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(DubemParser.NL, i);
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
		try {
			int _alt;
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

			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(40);
					switch (_input.LA(1)) {
					case PROCEDURE:
						{
						setState(37);
						procedure();
						}
						break;
					case FUNCTION:
						{
						setState(38);
						function();
						}
						break;
					case NL:
						{
						setState(39);
						match(NL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(45);
			main();
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
		public Token NAME;
		public TerminalNode PROCEDURE() { return getToken(DubemParser.PROCEDURE, 0); }
		public TerminalNode NAME() { return getToken(DubemParser.NAME, 0); }
		public TerminalNode OPEN_P() { return getToken(DubemParser.OPEN_P, 0); }
		public TerminalNode CLOSE_P() { return getToken(DubemParser.CLOSE_P, 0); }
		public List<TerminalNode> NL() { return getTokens(DubemParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(DubemParser.NL, i);
		}
		public TerminalNode END() { return getToken(DubemParser.END, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
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
			setState(47);
			match(PROCEDURE);
			setState(48);
			((ProcedureContext)_localctx).NAME = match(NAME);
			setState(49);
			match(OPEN_P);
			setState(51);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(50);
				parameters();
				}
			}

			setState(53);
			match(CLOSE_P);
			setState(54);
			match(NL);
			 
			  String tmpI = "";

			  if( symbol_table.size() > 0 )
			  {   
			    for( int i = 0; i < symbol_table.size(); i++ )
			    {
			      tmpI = "I" + tmpI;
			    }

			    System.out.println(".method public static " + (((ProcedureContext)_localctx).NAME!=null?((ProcedureContext)_localctx).NAME.getText():null) + "(" + tmpI + ")V");
			    System.out.println("");

			    symbol_functions.add( tmpI );
			    symbol_name.add( (((ProcedureContext)_localctx).NAME!=null?((ProcedureContext)_localctx).NAME.getText():null) );
			  }
			  else
			  {
			    System.out.println(".method public static " + (((ProcedureContext)_localctx).NAME!=null?((ProcedureContext)_localctx).NAME.getText():null) + "()V");
			    System.out.println("");

			    symbol_functions.add( tmpI );
			    symbol_name.add( (((ProcedureContext)_localctx).NAME!=null?((ProcedureContext)_localctx).NAME.getText():null) );
			  }

			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
				{
				{
				setState(56);
				statement();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			  System.out.println("");
			  System.out.println("  return");
			  System.out.println("");
			  System.out.println(".limit locals " + symbol_table.size());
			  System.out.println(".limit stack " + stack_max);
			  System.out.println(".end method");
			  System.out.println(""); 

			  symbol_table.clear();
			  symbol_used.clear();
			  symbol_type.clear();

			  stack_cur = 0;
			  stack_max = 0;


			setState(63);
			match(END);
			setState(64);
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

	public static class FunctionContext extends ParserRuleContext {
		public Token NAME;
		public TerminalNode FUNCTION() { return getToken(DubemParser.FUNCTION, 0); }
		public TerminalNode NAME() { return getToken(DubemParser.NAME, 0); }
		public TerminalNode OPEN_P() { return getToken(DubemParser.OPEN_P, 0); }
		public TerminalNode CLOSE_P() { return getToken(DubemParser.CLOSE_P, 0); }
		public List<TerminalNode> NL() { return getTokens(DubemParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(DubemParser.NL, i);
		}
		public TerminalNode END() { return getToken(DubemParser.END, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(FUNCTION);
			setState(67);
			((FunctionContext)_localctx).NAME = match(NAME);
			setState(68);
			match(OPEN_P);
			setState(70);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(69);
				parameters();
				}
			}

			setState(72);
			match(CLOSE_P);
			setState(73);
			match(NL);
			 
			  String tmpI = "";

			  if( symbol_table.size() > 0 )
			  {   
			    for( int i = 0; i < symbol_table.size(); i++ )
			    {
			      tmpI = "I" + tmpI;
			    }

			    System.out.println(".method public static " + (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) + "(" + tmpI + ")I");
			    System.out.println("");

			    symbol_functions.add( tmpI );
			    symbol_name.add( (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) );
			  }
			  else
			  {
			    System.out.println(".method public static " + (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) + "()I");
			    System.out.println("");

			    symbol_functions.add( tmpI );
			    symbol_name.add( (((FunctionContext)_localctx).NAME!=null?((FunctionContext)_localctx).NAME.getText():null) );
			  }

			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
				{
				{
				setState(75);
				statement();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			  System.out.println("");
			  System.out.println("  return");
			  System.out.println(".limit locals " + symbol_table.size());
			  System.out.println(".limit stack " + stack_max);
			  System.out.println(".end method");
			  System.out.println(""); 

			  symbol_table.clear();
			  symbol_used.clear();
			  symbol_type.clear();

			  stack_cur = 0;
			  stack_max = 0;

			setState(82);
			match(END);
			setState(83);
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

	public static class ParametersContext extends ParserRuleContext {
		public Token NAME;
		public List<TerminalNode> NAME() { return getTokens(DubemParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(DubemParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DubemParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DubemParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			((ParametersContext)_localctx).NAME = match(NAME);
			   
			  symbol_table.add( (((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getText():null) );
			  symbol_used.add( false );
			  symbol_type.add( 'i' );     

			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(87);
				match(COMMA);
				setState(88);
				((ParametersContext)_localctx).NAME = match(NAME);
				   
				  symbol_table.add( (((ParametersContext)_localctx).NAME!=null?((ParametersContext)_localctx).NAME.getText():null) );
				  symbol_used.add( false );
				  symbol_type.add( 'i' );     

				}
				}
				setState(94);
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
		enterRule(_localctx, 8, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			  symbol_table.add("args");
			  symbol_type.add('-');
			  System.out.println(".method public static main([Ljava/lang/String;)V");

			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
				{
				{
				setState(96);
				statement();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			  for(int i = 0; i < symbol_table_not_used.size(); i++)
			  {

			    System.err.println("WARNING: did not use "+symbol_table_not_used.get(i));
			    errors++;

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
		public St_returnContext st_return() {
			return getRuleContext(St_returnContext.class,0);
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
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				st_print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				st_attrib();
				setState(107);
				match(NL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				st_while();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				st_for();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				st_if();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(112);
				st_for();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(113);
				st_call();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(114);
				st_return();
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
		enterRule(_localctx, 12, RULE_st_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(PRINT);


			  emit("getstatic java/lang/System/out Ljava/io/PrintStream;", +1);


			setState(119);
			((St_printContext)_localctx).e1 = exp_arithmetic();


			  if( ((St_printContext)_localctx).e1.type == 'i')
			    emit(" invokevirtual java/io/PrintStream/print(I)V\n", -2);
			  else
			    emit(" invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);


			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(121);
				match(COMMA);
				 emit("getstatic java/lang/System/out Ljava/io/PrintStream;", +1); 
				setState(123);
				((St_printContext)_localctx).e2 = exp_arithmetic();
				 

				    if(((St_printContext)_localctx).e2.type == 'i')
				      emit(" invokevirtual java/io/PrintStream/print(I)V\n", -2);
				    else
				      emit(" invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
				    
				  
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
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
		enterRule(_localctx, 14, RULE_st_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			((St_attribContext)_localctx).NAME = match(NAME);
			setState(140);
			_la = _input.LA(1);
			if (_la==OPEN_B) {
				{
				setState(135);
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

				setState(137);
				((St_attribContext)_localctx).e2 = exp_arithmetic();
				setState(138);
				match(CLOSE_B);
				}
			}

			setState(142);
			match(ATTRIB);
			setState(150);
			switch (_input.LA(1)) {
			case OPEN_P:
			case READ_INT:
			case READ_STRING:
			case STRING:
			case LENGTH:
			case NUMBER:
			case NAME:
				{
				setState(143);
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
				setState(146);
				match(ARRAY);
				setState(147);
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
		enterRule(_localctx, 16, RULE_st_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(WHILE);

			  int local = ++count_while;
			  System.out.println("BEGIN_WHILE_"+local+":");

			setState(154);
			((St_whileContext)_localctx).s = exp_comparison();
			setState(155);
			match(NL);

			  emit(((St_whileContext)_localctx).s.bytecode + " END_WHILE_" +local, -2);

			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
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
			 emit("goto BEGIN_WHILE_"+local, 0); 
			setState(164);
			match(END);
			setState(165);
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
		enterRule(_localctx, 18, RULE_st_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IF);
			 int local = ++count_if; 
			setState(170);
			((St_ifContext)_localctx).s = exp_comparison();
			setState(171);
			match(NL);
			 emit(((St_ifContext)_localctx).s.bytecode + " NOT_IF"+local, -2); 
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
				{
				{
				setState(173);
				statement();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
			  emit("goto END_ELSE"+local, 0);
			  System.out.println("NOT_IF"+local+":");

			setState(188);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(180);
				match(ELSE);
				setState(181);
				match(NL);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
					{
					{
					setState(182);
					statement();
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			 System.out.println("END_ELSE"+local+":"); 
			setState(191);
			match(END);
			setState(192);
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
		enterRule(_localctx, 20, RULE_st_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(FOR);
			 int local = ++count_for; 
			setState(196);
			st_attrib();
			setState(197);
			match(SEMICOLON);
			 System.out.println("FOR_COMP_"+local+":"); 
			setState(199);
			((St_forContext)_localctx).s = exp_comparison();
			setState(200);
			match(SEMICOLON);
			 
			  emit(((St_forContext)_localctx).s.bytecode + " END_FOR_"+local, -2);
			  emit("goto FOR_"+local, 0);
			  System.out.println("FOR_INC_"+local+":");

			setState(202);
			st_attrib();
			setState(203);
			match(NL);
			 
			  emit("goto FOR_COMP_"+local, 0);
			  System.out.println("FOR_"+local+":"); 

			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
				{
				{
				setState(205);
				statement();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
			  emit("goto FOR_INC_"+local, 0);
			  System.out.println("END_FOR_"+local+":"); 

			setState(212);
			match(END);
			setState(213);
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
		public Token NAME;
		public TerminalNode NAME() { return getToken(DubemParser.NAME, 0); }
		public TerminalNode OPEN_P() { return getToken(DubemParser.OPEN_P, 0); }
		public TerminalNode CLOSE_P() { return getToken(DubemParser.CLOSE_P, 0); }
		public TerminalNode NL() { return getToken(DubemParser.NL, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_st_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			((St_callContext)_localctx).NAME = match(NAME);
			setState(216);
			match(OPEN_P);
			setState(218);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_P) | (1L << READ_INT) | (1L << READ_STRING) | (1L << STRING) | (1L << LENGTH) | (1L << NUMBER) | (1L << NAME))) != 0)) {
				{
				setState(217);
				arguments();
				}
			}

			setState(220);
			match(CLOSE_P);
			setState(221);
			match(NL);
			   
			    int position = symbol_name.indexOf( (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null) );
			    
			    System.out.println( "invokestatic Test/" + (((St_callContext)_localctx).NAME!=null?((St_callContext)_localctx).NAME.getText():null) + "(" + symbol_functions.get(position) + ")V" );
			  
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

	public static class St_returnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(DubemParser.RETURN, 0); }
		public Exp_arithmeticContext exp_arithmetic() {
			return getRuleContext(Exp_arithmeticContext.class,0);
		}
		public TerminalNode NL() { return getToken(DubemParser.NL, 0); }
		public St_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterSt_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitSt_return(this);
		}
	}

	public final St_returnContext st_return() throws RecognitionException {
		St_returnContext _localctx = new St_returnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_st_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(RETURN);
			setState(225);
			exp_arithmetic();
			setState(226);
			match(NL);

			  emit("  ireturn", -1);
			  
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

	public static class ArgumentsContext extends ParserRuleContext {
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
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DubemListener ) ((DubemListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			exp_arithmetic();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(230);
				match(COMMA);
				setState(231);
				exp_arithmetic();
				}
				}
				setState(236);
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
		enterRule(_localctx, 28, RULE_exp_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			((Exp_comparisonContext)_localctx).e1 = exp_arithmetic();
			setState(238);
			((Exp_comparisonContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE))) != 0)) ) {
				((Exp_comparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(239);
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
		enterRule(_localctx, 30, RULE_exp_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			((Exp_arithmeticContext)_localctx).t1 = term();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(243);
				((Exp_arithmeticContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Exp_arithmeticContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(244);
				((Exp_arithmeticContext)_localctx).t2 = term();
				 
				  if(((Exp_arithmeticContext)_localctx).t1.type != ((Exp_arithmeticContext)_localctx).t2.type)
				  {
				    System.err.println("ERROR: cannot mix types");
				    errors++;
				  }

				  emit((((Exp_arithmeticContext)_localctx).op!=null?((Exp_arithmeticContext)_localctx).op.getType():0) == PLUS ? "iadd" : "isub", -1);

				}
				}
				setState(251);
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
		enterRule(_localctx, 32, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			((TermContext)_localctx).f1 = factor();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) {
				{
				{
				setState(255);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(256);
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
				setState(263);
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
		public Token t2;
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_factor);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				 
				  emit(" ldc " + (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), +1);
				  ((FactorContext)_localctx).type =  'i';

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(OPEN_P);
				setState(269);
				((FactorContext)_localctx).exp_arithmetic = exp_arithmetic();
				setState(270);
				match(CLOSE_P);

				  ((FactorContext)_localctx).type =  ((FactorContext)_localctx).exp_arithmetic.type;

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				((FactorContext)_localctx).NAME = match(NAME);
				setState(279);
				_la = _input.LA(1);
				if (_la==OPEN_B) {
					{
					setState(274);
					match(OPEN_B);

					 int end = symbol_table.indexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null));

					 if (symbol_type.get(end) != 'v' ) {
					  System.err.println("is not a vector");
					  System.exit('1');
					}

					emit("aload " + end, -1);

					setState(276);
					exp_arithmetic();
					setState(277);
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
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				match(READ_INT);
				 
				  emit(" invokestatic Runtime/readInt()I", +1);
				  ((FactorContext)_localctx).type =  'i';

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				match(READ_STRING);

				  ((FactorContext)_localctx).type =  'a';

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
				((FactorContext)_localctx).STRING = match(STRING);

				  emit(" ldc " + (((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null), +1); 
				  ((FactorContext)_localctx).type =  'a';

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				match(LENGTH);
				setState(289);
				((FactorContext)_localctx).NAME = match(NAME);

				  //ver se esta na tabela de simbolos
				  int end = symbol_table.indexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null));

				  emit("aload " +  end, +1);
				  emit("arraylength", +0); 
				  ((FactorContext)_localctx).type =  'i';

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(291);
				((FactorContext)_localctx).t2 = match(NAME);
				setState(292);
				match(OPEN_P);
				setState(294);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_P) | (1L << READ_INT) | (1L << READ_STRING) | (1L << STRING) | (1L << LENGTH) | (1L << NUMBER) | (1L << NAME))) != 0)) {
					{
					setState(293);
					arguments();
					}
				}

				setState(296);
				match(CLOSE_P);

				  int end = symbol_name.indexOf( (((FactorContext)_localctx).t2!=null?((FactorContext)_localctx).t2.getText():null) );

				  System.out.println( "invokestatic Test/" + (((FactorContext)_localctx).t2!=null?((FactorContext)_localctx).t2.getText():null) + "(" + symbol_functions.get(end) + ")I" );
				  ((FactorContext)_localctx).type =  'i';

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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u012f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\5\3\66\n\3\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\5\4I\n\4\3\4\3\4\3\4\3\4\7\4O\n\4\f\4\16\4R\13\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5]\n\5\f\5\16\5`\13\5\3\6\3\6\7\6"+
		"d\n\6\f\6\16\6g\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7v\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0081\n\b\f\b\16\b"+
		"\u0084\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0099\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a1"+
		"\n\n\f\n\16\n\u00a4\13\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u00b1\n\13\f\13\16\13\u00b4\13\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00ba\n\13\f\13\16\13\u00bd\13\13\5\13\u00bf\n\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00d1\n\f\f\f\16"+
		"\f\u00d4\13\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00dd\n\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00eb\n\17\f\17\16\17"+
		"\u00ee\13\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u00fa"+
		"\n\21\f\21\16\21\u00fd\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u0106"+
		"\n\22\f\22\16\22\u0109\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011a\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0129\n\23\3\23\3\23"+
		"\5\23\u012d\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$\2\5\3\2\20\25\3\2\3\4\3\2\5\7\u0142\2&\3\2\2\2\4\61\3\2\2\2\6D\3\2\2"+
		"\2\bW\3\2\2\2\na\3\2\2\2\fu\3\2\2\2\16w\3\2\2\2\20\u0088\3\2\2\2\22\u009a"+
		"\3\2\2\2\24\u00aa\3\2\2\2\26\u00c4\3\2\2\2\30\u00d9\3\2\2\2\32\u00e2\3"+
		"\2\2\2\34\u00e7\3\2\2\2\36\u00ef\3\2\2\2 \u00f4\3\2\2\2\"\u0100\3\2\2"+
		"\2$\u012c\3\2\2\2&,\b\2\1\2\'+\5\4\3\2(+\5\6\4\2)+\7&\2\2*\'\3\2\2\2*"+
		"(\3\2\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2"+
		"/\60\5\n\6\2\60\3\3\2\2\2\61\62\7\r\2\2\62\63\7$\2\2\63\65\7\b\2\2\64"+
		"\66\5\b\5\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7\t\2\289\7"+
		"&\2\29=\b\3\1\2:<\5\f\7\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3"+
		"\2\2\2?=\3\2\2\2@A\b\3\1\2AB\7 \2\2BC\7&\2\2C\5\3\2\2\2DE\7\16\2\2EF\7"+
		"$\2\2FH\7\b\2\2GI\5\b\5\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\t\2\2KL\7"+
		"&\2\2LP\b\4\1\2MO\5\f\7\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3"+
		"\2\2\2RP\3\2\2\2ST\b\4\1\2TU\7 \2\2UV\7&\2\2V\7\3\2\2\2WX\7$\2\2X^\b\5"+
		"\1\2YZ\7\f\2\2Z[\7$\2\2[]\b\5\1\2\\Y\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3"+
		"\2\2\2_\t\3\2\2\2`^\3\2\2\2ae\b\6\1\2bd\5\f\7\2cb\3\2\2\2dg\3\2\2\2ec"+
		"\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\b\6\1\2i\13\3\2\2\2jv\7&\2\2"+
		"kv\5\16\b\2lm\5\20\t\2mn\7&\2\2nv\3\2\2\2ov\5\22\n\2pv\5\26\f\2qv\5\24"+
		"\13\2rv\5\26\f\2sv\5\30\r\2tv\5\32\16\2uj\3\2\2\2uk\3\2\2\2ul\3\2\2\2"+
		"uo\3\2\2\2up\3\2\2\2uq\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\r\3\2\2"+
		"\2wx\7\30\2\2xy\b\b\1\2yz\5 \21\2z\u0082\b\b\1\2{|\7\f\2\2|}\b\b\1\2}"+
		"~\5 \21\2~\177\b\b\1\2\177\u0081\3\2\2\2\u0080{\3\2\2\2\u0081\u0084\3"+
		"\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0086\7&\2\2\u0086\u0087\b\b\1\2\u0087\17\3\2\2\2"+
		"\u0088\u008e\7$\2\2\u0089\u008a\7\26\2\2\u008a\u008b\b\t\1\2\u008b\u008c"+
		"\5 \21\2\u008c\u008d\7\27\2\2\u008d\u008f\3\2\2\2\u008e\u0089\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0098\7\n\2\2\u0091\u0092"+
		"\5 \21\2\u0092\u0093\b\t\1\2\u0093\u0099\3\2\2\2\u0094\u0095\7\34\2\2"+
		"\u0095\u0096\5 \21\2\u0096\u0097\b\t\1\2\u0097\u0099\3\2\2\2\u0098\u0091"+
		"\3\2\2\2\u0098\u0094\3\2\2\2\u0099\21\3\2\2\2\u009a\u009b\7!\2\2\u009b"+
		"\u009c\b\n\1\2\u009c\u009d\5\36\20\2\u009d\u009e\7&\2\2\u009e\u00a2\b"+
		"\n\1\2\u009f\u00a1\5\f\7\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a5\u00a6\b\n\1\2\u00a6\u00a7\7 \2\2\u00a7\u00a8\7&\2\2\u00a8\u00a9"+
		"\b\n\1\2\u00a9\23\3\2\2\2\u00aa\u00ab\7\36\2\2\u00ab\u00ac\b\13\1\2\u00ac"+
		"\u00ad\5\36\20\2\u00ad\u00ae\7&\2\2\u00ae\u00b2\b\13\1\2\u00af\u00b1\5"+
		"\f\7\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00be\b\13"+
		"\1\2\u00b6\u00b7\7\37\2\2\u00b7\u00bb\7&\2\2\u00b8\u00ba\5\f\7\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00b6\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b\13\1\2\u00c1\u00c2\7"+
		" \2\2\u00c2\u00c3\7&\2\2\u00c3\25\3\2\2\2\u00c4\u00c5\7\"\2\2\u00c5\u00c6"+
		"\b\f\1\2\u00c6\u00c7\5\20\t\2\u00c7\u00c8\7\13\2\2\u00c8\u00c9\b\f\1\2"+
		"\u00c9\u00ca\5\36\20\2\u00ca\u00cb\7\13\2\2\u00cb\u00cc\b\f\1\2\u00cc"+
		"\u00cd\5\20\t\2\u00cd\u00ce\7&\2\2\u00ce\u00d2\b\f\1\2\u00cf\u00d1\5\f"+
		"\7\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\b\f"+
		"\1\2\u00d6\u00d7\7 \2\2\u00d7\u00d8\7&\2\2\u00d8\27\3\2\2\2\u00d9\u00da"+
		"\7$\2\2\u00da\u00dc\7\b\2\2\u00db\u00dd\5\34\17\2\u00dc\u00db\3\2\2\2"+
		"\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\t\2\2\u00df\u00e0"+
		"\7&\2\2\u00e0\u00e1\b\r\1\2\u00e1\31\3\2\2\2\u00e2\u00e3\7\17\2\2\u00e3"+
		"\u00e4\5 \21\2\u00e4\u00e5\7&\2\2\u00e5\u00e6\b\16\1\2\u00e6\33\3\2\2"+
		"\2\u00e7\u00ec\5 \21\2\u00e8\u00e9\7\f\2\2\u00e9\u00eb\5 \21\2\u00ea\u00e8"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\35\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\5 \21\2\u00f0\u00f1\t\2\2"+
		"\2\u00f1\u00f2\5 \21\2\u00f2\u00f3\b\20\1\2\u00f3\37\3\2\2\2\u00f4\u00fb"+
		"\5\"\22\2\u00f5\u00f6\t\3\2\2\u00f6\u00f7\5\"\22\2\u00f7\u00f8\b\21\1"+
		"\2\u00f8\u00fa\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u00ff\b\21\1\2\u00ff!\3\2\2\2\u0100\u0107\5$\23\2\u0101\u0102\t\4\2\2"+
		"\u0102\u0103\5$\23\2\u0103\u0104\b\22\1\2\u0104\u0106\3\2\2\2\u0105\u0101"+
		"\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\b\22\1\2\u010b#\3\2\2\2"+
		"\u010c\u010d\7#\2\2\u010d\u012d\b\23\1\2\u010e\u010f\7\b\2\2\u010f\u0110"+
		"\5 \21\2\u0110\u0111\7\t\2\2\u0111\u0112\b\23\1\2\u0112\u012d\3\2\2\2"+
		"\u0113\u0119\7$\2\2\u0114\u0115\7\26\2\2\u0115\u0116\b\23\1\2\u0116\u0117"+
		"\5 \21\2\u0117\u0118\7\27\2\2\u0118\u011a\3\2\2\2\u0119\u0114\3\2\2\2"+
		"\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u012d\b\23\1\2\u011c\u011d"+
		"\7\31\2\2\u011d\u012d\b\23\1\2\u011e\u011f\7\32\2\2\u011f\u012d\b\23\1"+
		"\2\u0120\u0121\7\33\2\2\u0121\u012d\b\23\1\2\u0122\u0123\7\35\2\2\u0123"+
		"\u0124\7$\2\2\u0124\u012d\b\23\1\2\u0125\u0126\7$\2\2\u0126\u0128\7\b"+
		"\2\2\u0127\u0129\5\34\17\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012b\7\t\2\2\u012b\u012d\b\23\1\2\u012c\u010c\3"+
		"\2\2\2\u012c\u010e\3\2\2\2\u012c\u0113\3\2\2\2\u012c\u011c\3\2\2\2\u012c"+
		"\u011e\3\2\2\2\u012c\u0120\3\2\2\2\u012c\u0122\3\2\2\2\u012c\u0125\3\2"+
		"\2\2\u012d%\3\2\2\2\32*,\65=HP^eu\u0082\u008e\u0098\u00a2\u00b2\u00bb"+
		"\u00be\u00d2\u00dc\u00ec\u00fb\u0107\u0119\u0128\u012c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}