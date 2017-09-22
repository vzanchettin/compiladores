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
	 * Enter a parse tree produced by {@link DubemParser#exp_aritmetic}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetic(DubemParser.Exp_aritmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link DubemParser#exp_aritmetic}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetic(DubemParser.Exp_aritmeticContext ctx);
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