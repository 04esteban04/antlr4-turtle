// Generated from C:/Users/Daniel Brenes/Desktop/antlr4-turtle-master/antlr4-turtle-master/src/main/antlr4/com/nikoskatsanos/antlrturtle\Logo.g4 by ANTLR 4.9
package com.nikoskatsanos.antlrturtle;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogoParser}.
 */
public interface LogoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LogoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LogoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#logoExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogoExpression(LogoParser.LogoExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#logoExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogoExpression(LogoParser.LogoExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#forward}.
	 * @param ctx the parse tree
	 */
	void enterForward(LogoParser.ForwardContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#forward}.
	 * @param ctx the parse tree
	 */
	void exitForward(LogoParser.ForwardContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#back}.
	 * @param ctx the parse tree
	 */
	void enterBack(LogoParser.BackContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#back}.
	 * @param ctx the parse tree
	 */
	void exitBack(LogoParser.BackContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#right}.
	 * @param ctx the parse tree
	 */
	void enterRight(LogoParser.RightContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#right}.
	 * @param ctx the parse tree
	 */
	void exitRight(LogoParser.RightContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#left}.
	 * @param ctx the parse tree
	 */
	void enterLeft(LogoParser.LeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#left}.
	 * @param ctx the parse tree
	 */
	void exitLeft(LogoParser.LeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#clearscreen}.
	 * @param ctx the parse tree
	 */
	void enterClearscreen(LogoParser.ClearscreenContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#clearscreen}.
	 * @param ctx the parse tree
	 */
	void exitClearscreen(LogoParser.ClearscreenContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(LogoParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(LogoParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#penUp}.
	 * @param ctx the parse tree
	 */
	void enterPenUp(LogoParser.PenUpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#penUp}.
	 * @param ctx the parse tree
	 */
	void exitPenUp(LogoParser.PenUpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#penDown}.
	 * @param ctx the parse tree
	 */
	void enterPenDown(LogoParser.PenDownContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#penDown}.
	 * @param ctx the parse tree
	 */
	void exitPenDown(LogoParser.PenDownContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#resetAngle}.
	 * @param ctx the parse tree
	 */
	void enterResetAngle(LogoParser.ResetAngleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#resetAngle}.
	 * @param ctx the parse tree
	 */
	void exitResetAngle(LogoParser.ResetAngleContext ctx);
}