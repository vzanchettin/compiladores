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
		SEMICOLON=9, COMMA=10, EQ=11, NE=12, LT=13, LE=14, GT=15, GE=16, PRINT=17, 
		READ_INT=18, READ_STRING=19, STRING=20, IF=21, ELSE=22, END=23, WHILE=24, 
		FOR=25, NUMBER=26, NAME=27, SPACE=28, NL=29, COMMENT=30;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_st_print = 2, RULE_st_attrib = 3, 
		RULE_st_while = 4, RULE_st_if = 5, RULE_st_for = 6, RULE_exp_comparison = 7, 
		RULE_exp_arithmetic = 8, RULE_term = 9, RULE_factor = 10;
	public static final String[] ruleNames = {
		"program", "statement", "st_print", "st_attrib", "st_while", "st_if", 
		"st_for", "exp_comparison", "exp_arithmetic", "term", "factor"
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


			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
				{
				{
				setState(23);
				statement();
				}
				}
				setState(28);
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
			  System.out.println(".limit locals"+ " " + symbol_table.size()+1); 
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
			setState(39);
			switch (_input.LA(1)) {
			case NL:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(NL);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				st_print();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				st_attrib();
				setState(34);
				match(NL);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				st_while();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				st_for();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(38);
				st_if();
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
		enterRule(_localctx, 4, RULE_st_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(PRINT);


			  emit("getstatic java/lang/System/out Ljava/io/PrintStream;", +1);


			setState(43);
			((St_printContext)_localctx).e1 = exp_arithmetic();


			  if( ((St_printContext)_localctx).e1.type == 'i')
			    emit(" invokevirtual java/io/PrintStream/print(I)V\n", -2);
			  else
			    emit(" invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);


			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(45);
				match(COMMA);
				 emit("getstatic java/lang/System/out Ljava/io/PrintStream;", +1); 
				setState(47);
				((St_printContext)_localctx).e2 = exp_arithmetic();
				 
				    
				    if(((St_printContext)_localctx).e2.type == 'i')
				      emit(" invokevirtual java/io/PrintStream/print(I)V\n", -2);
				    else
				      emit(" invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
				    
				  
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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
		public Exp_arithmeticContext e1;
		public TerminalNode NAME() { return getToken(DubemParser.NAME, 0); }
		public TerminalNode ATTRIB() { return getToken(DubemParser.ATTRIB, 0); }
		public Exp_arithmeticContext exp_arithmetic() {
			return getRuleContext(Exp_arithmeticContext.class,0);
		}
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
			setState(58);
			((St_attribContext)_localctx).NAME = match(NAME);
			setState(59);
			match(ATTRIB);
			setState(60);
			((St_attribContext)_localctx).e1 = exp_arithmetic();

			  
			  if(symbol_table.indexOf((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null)) == -1){
			    symbol_table.add((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null));
			    symbol_table_not_used.add((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null));

			    if(((St_attribContext)_localctx).e1.type == 'i')
			      symbol_type.add('i');
			    else
			      symbol_type.add('a');
			    
			  }
			  else
			  {
			    
			    if(symbol_type.get(symbol_table.indexOf((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))) != ((St_attribContext)_localctx).e1.type)
			      
			    {
			      if(((St_attribContext)_localctx).e1.type == 'i')
			      {
			        
			        System.err.println("ERROR: "+(((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null)+" is an string");
			        errors++;
			        
			      }
			      else
			      {
			        
			        System.err.println("ERROR: "+(((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null)+" is an integer");
			        errors++;
			        
			      }
			    }
			  }

			  emit(symbol_type.get(symbol_table.indexOf((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null))) + "store " + symbol_table.indexOf((((St_attribContext)_localctx).NAME!=null?((St_attribContext)_localctx).NAME.getText():null)), -1);

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
		enterRule(_localctx, 8, RULE_st_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(WHILE);

			  int local = ++count_while;
			  System.out.println("BEGIN_WHILE_"+local+":");

			setState(65);
			((St_whileContext)_localctx).s = exp_comparison();
			setState(66);
			match(NL);

			  emit(((St_whileContext)_localctx).s.bytecode + " END_WHILE_" +local, -2);

			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
				{
				{
				setState(68);
				statement();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 emit("goto BEGIN_WHILE_"+local, 0); 
			setState(75);
			match(END);
			setState(76);
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
		enterRule(_localctx, 10, RULE_st_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(IF);
			 int local = ++count_if; 
			setState(81);
			((St_ifContext)_localctx).s = exp_comparison();
			setState(82);
			match(NL);
			 emit(((St_ifContext)_localctx).s.bytecode + " NOT_IF"+local, -2); 
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
				{
				{
				setState(84);
				statement();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
			  emit("goto END_ELSE"+local, 0);
			  System.out.println("NOT_IF"+local+":");

			setState(99);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(91);
				match(ELSE);
				setState(92);
				match(NL);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
					{
					{
					setState(93);
					statement();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			 System.out.println("END_ELSE"+local+":"); 
			setState(102);
			match(END);
			setState(103);
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
		enterRule(_localctx, 12, RULE_st_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(FOR);
			 int local = ++count_for; 
			setState(107);
			st_attrib();
			setState(108);
			match(SEMICOLON);
			 System.out.println("FOR_COMP_"+local+":"); 
			setState(110);
			((St_forContext)_localctx).s = exp_comparison();
			setState(111);
			match(SEMICOLON);
			 
			  emit(((St_forContext)_localctx).s.bytecode + " END_FOR_"+local, -2);
			  emit("goto FOR_"+local, 0);
			  System.out.println("FOR_INC_"+local+":");

			setState(113);
			st_attrib();
			setState(114);
			match(NL);
			 
			  emit("goto FOR_COMP_"+local, 0);
			  System.out.println("FOR_"+local+":"); 

			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NAME) | (1L << NL))) != 0)) {
				{
				{
				setState(116);
				statement();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 
			  emit("goto FOR_INC_"+local, 0);
			  System.out.println("END_FOR_"+local+":"); 

			setState(123);
			match(END);
			setState(124);
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
		enterRule(_localctx, 14, RULE_exp_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((Exp_comparisonContext)_localctx).e1 = exp_arithmetic();
			setState(127);
			((Exp_comparisonContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LT) | (1L << LE) | (1L << GT) | (1L << GE))) != 0)) ) {
				((Exp_comparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(128);
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
		enterRule(_localctx, 16, RULE_exp_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((Exp_arithmeticContext)_localctx).t1 = term();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(132);
				((Exp_arithmeticContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Exp_arithmeticContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(133);
				((Exp_arithmeticContext)_localctx).t2 = term();
				 
				  if(((Exp_arithmeticContext)_localctx).t1.type != ((Exp_arithmeticContext)_localctx).t2.type)
				  {
				    System.err.println("ERROR: cannot mix types");
				    errors++;
				  }
				  
				  emit((((Exp_arithmeticContext)_localctx).op!=null?((Exp_arithmeticContext)_localctx).op.getType():0) == PLUS ? "iadd" : "isub", -1);

				}
				}
				setState(140);
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
		enterRule(_localctx, 18, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			((TermContext)_localctx).f1 = factor();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) {
				{
				{
				setState(144);
				((TermContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << OVER) | (1L << REMAINDER))) != 0)) ) {
					((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(145);
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
				setState(152);
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
		public TerminalNode READ_INT() { return getToken(DubemParser.READ_INT, 0); }
		public TerminalNode READ_STRING() { return getToken(DubemParser.READ_STRING, 0); }
		public TerminalNode STRING() { return getToken(DubemParser.STRING, 0); }
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
		enterRule(_localctx, 20, RULE_factor);
		try {
			setState(170);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				 
				  emit(" ldc " + (((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null), +1);
				  ((FactorContext)_localctx).type =  'i';

				}
				break;
			case OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(OPEN_P);
				setState(158);
				((FactorContext)_localctx).exp_arithmetic = exp_arithmetic();
				setState(159);
				match(CLOSE_P);

				  ((FactorContext)_localctx).type =  ((FactorContext)_localctx).exp_arithmetic.type;

				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				((FactorContext)_localctx).NAME = match(NAME);

				  if(symbol_table.indexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null)) >= 0){
				    emit(" " + symbol_type.get(symbol_table.indexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null))) + "load " + symbol_table.indexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null)), +1);
				    symbol_table_not_used.remove((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null));
				    ((FactorContext)_localctx).type =  symbol_type.get(symbol_table.indexOf((((FactorContext)_localctx).NAME!=null?((FactorContext)_localctx).NAME.getText():null)));
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
				setState(164);
				match(READ_INT);
				 
				  emit(" invokestatic Runtime/readInt()I", +1);
				  ((FactorContext)_localctx).type =  'i';

				}
				break;
			case READ_STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(READ_STRING);

				  ((FactorContext)_localctx).type =  'a';

				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				((FactorContext)_localctx).STRING = match(STRING);

				  emit(" ldc " + (((FactorContext)_localctx).STRING!=null?((FactorContext)_localctx).STRING.getText():null), +1); 
				  ((FactorContext)_localctx).type =  'a';

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\65"+
		"\n\4\f\4\16\48\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7X\n\7\f\7\16\7[\13\7\3\7\3\7\3\7\3\7\7\7a\n\7\f\7\16\7d\13\7\5"+
		"\7f\n\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\bx\n\b\f\b\16\b{\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u008b\n\n\f\n\16\n\u008e\13\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u0097\n\13\f\13\16\13\u009a\13\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ad\n\f\3\f\2"+
		"\2\r\2\4\6\b\n\f\16\20\22\24\26\2\5\3\2\r\22\3\2\3\4\3\2\5\7\u00b6\2\30"+
		"\3\2\2\2\4)\3\2\2\2\6+\3\2\2\2\b<\3\2\2\2\nA\3\2\2\2\fQ\3\2\2\2\16k\3"+
		"\2\2\2\20\u0080\3\2\2\2\22\u0085\3\2\2\2\24\u0091\3\2\2\2\26\u00ac\3\2"+
		"\2\2\30\34\b\2\1\2\31\33\5\4\3\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2"+
		"\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \b\2\1\2 \3\3\2\2\2"+
		"!*\7\37\2\2\"*\5\6\4\2#$\5\b\5\2$%\7\37\2\2%*\3\2\2\2&*\5\n\6\2\'*\5\16"+
		"\b\2(*\5\f\7\2)!\3\2\2\2)\"\3\2\2\2)#\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3"+
		"\2\2\2*\5\3\2\2\2+,\7\23\2\2,-\b\4\1\2-.\5\22\n\2.\66\b\4\1\2/\60\7\f"+
		"\2\2\60\61\b\4\1\2\61\62\5\22\n\2\62\63\b\4\1\2\63\65\3\2\2\2\64/\3\2"+
		"\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29"+
		":\7\37\2\2:;\b\4\1\2;\7\3\2\2\2<=\7\35\2\2=>\7\n\2\2>?\5\22\n\2?@\b\5"+
		"\1\2@\t\3\2\2\2AB\7\32\2\2BC\b\6\1\2CD\5\20\t\2DE\7\37\2\2EI\b\6\1\2F"+
		"H\5\4\3\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2"+
		"LM\b\6\1\2MN\7\31\2\2NO\7\37\2\2OP\b\6\1\2P\13\3\2\2\2QR\7\27\2\2RS\b"+
		"\7\1\2ST\5\20\t\2TU\7\37\2\2UY\b\7\1\2VX\5\4\3\2WV\3\2\2\2X[\3\2\2\2Y"+
		"W\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\e\b\7\1\2]^\7\30\2\2^b\7\37"+
		"\2\2_a\5\4\3\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cf\3\2\2\2db\3\2"+
		"\2\2e]\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\b\7\1\2hi\7\31\2\2ij\7\37\2\2j\r"+
		"\3\2\2\2kl\7\33\2\2lm\b\b\1\2mn\5\b\5\2no\7\13\2\2op\b\b\1\2pq\5\20\t"+
		"\2qr\7\13\2\2rs\b\b\1\2st\5\b\5\2tu\7\37\2\2uy\b\b\1\2vx\5\4\3\2wv\3\2"+
		"\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\b\b\1\2}~\7\31"+
		"\2\2~\177\7\37\2\2\177\17\3\2\2\2\u0080\u0081\5\22\n\2\u0081\u0082\t\2"+
		"\2\2\u0082\u0083\5\22\n\2\u0083\u0084\b\t\1\2\u0084\21\3\2\2\2\u0085\u008c"+
		"\5\24\13\2\u0086\u0087\t\3\2\2\u0087\u0088\5\24\13\2\u0088\u0089\b\n\1"+
		"\2\u0089\u008b\3\2\2\2\u008a\u0086\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0090\b\n\1\2\u0090\23\3\2\2\2\u0091\u0098\5\26\f\2\u0092\u0093\t\4\2"+
		"\2\u0093\u0094\5\26\f\2\u0094\u0095\b\13\1\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0092\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\b\13\1\2\u009c"+
		"\25\3\2\2\2\u009d\u009e\7\34\2\2\u009e\u00ad\b\f\1\2\u009f\u00a0\7\b\2"+
		"\2\u00a0\u00a1\5\22\n\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\b\f\1\2\u00a3"+
		"\u00ad\3\2\2\2\u00a4\u00a5\7\35\2\2\u00a5\u00ad\b\f\1\2\u00a6\u00a7\7"+
		"\24\2\2\u00a7\u00ad\b\f\1\2\u00a8\u00a9\7\25\2\2\u00a9\u00ad\b\f\1\2\u00aa"+
		"\u00ab\7\26\2\2\u00ab\u00ad\b\f\1\2\u00ac\u009d\3\2\2\2\u00ac\u009f\3"+
		"\2\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\27\3\2\2\2\r\34)\66IYbey\u008c\u0098\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}