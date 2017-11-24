// Generated from Dubem.g by ANTLR 4.5.3

  import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DubemParser}.
 */
public interface DubemListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DubemParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DubemParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DubemParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DubemParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DubemParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DubemParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DubemParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DubemParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DubemParser#st_print}.
	 * @param ctx the parse tree
	 */
	void enterSt_print(DubemParser.St_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link DubemParser#st_print}.
	 * @param ctx the parse tree
	 */
	void exitSt_print(DubemParser.St_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link DubemParser#st_attrib}.
	 * @param ctx the parse tree
	 */
	void enterSt_attrib(DubemParser.St_attribContext ctx);
	/**
	 * Exit a parse tree produced by {@link DubemParser#st_attrib}.
	 * @param ctx the parse tree
	 */
	void exitSt_attrib(DubemParser.St_attribContext ctx);
	/**
	 * Enter a parse tree produced by {@link DubemParser#st_while}.
	 * @param ctx the parse tree
	 */
	void enterSt_while(DubemParser.St_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DubemParser#st_while}.
	 * @param ctx the parse tree
	 */
	void exitSt_while(DubemParser.St_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DubemParser#st_if}.
	 * @param ctx the parse tree
	 */
	void enterSt_if(DubemParser.St_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link DubemParser#st_if}.
	 * @param ctx the parse tree
	 */
	void exitSt_if(DubemParser.St_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link DubemParser#st_for}.
	 * @param ctx the parse tree
	 */
	void enterSt_for(DubemParser.St_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link DubemParser#st_for}.
	 * @param ctx the parse tree
	 */
	void exitSt_for(DubemParser.St_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link DubemParser#exp_comparison}.
	 * @param ctx the parse tree
	 */
	void enterExp_comparison(DubemParser.Exp_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DubemParser#exp_comparison}.
	 * @param ctx the parse tree
	 */
	void exitExp_comparison(DubemParser.Exp_comparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DubemParser#exp_arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterExp_arithmetic(DubemParser.Exp_arithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link DubemParser#exp_arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitExp_arithmetic(DubemParser.Exp_arithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link DubemParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(DubemParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link DubemParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(DubemParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link DubemParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(DubemParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DubemParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(DubemParser.FactorContext ctx);
}