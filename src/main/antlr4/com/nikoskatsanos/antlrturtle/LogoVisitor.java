// Generated from C:/Users/Daniel Brenes/Desktop/antlr4-turtle-master/antlr4-turtle-master/src/main/antlr4/com/nikoskatsanos/antlrturtle\Logo.g4 by ANTLR 4.9
package com.nikoskatsanos.antlrturtle;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LogoParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#logoExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogoExpression(LogoParser.LogoExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#forward}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward(LogoParser.ForwardContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#back}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBack(LogoParser.BackContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#right}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight(LogoParser.RightContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#left}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft(LogoParser.LeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#clearscreen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearscreen(LogoParser.ClearscreenContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(LogoParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#penUp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenUp(LogoParser.PenUpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#penDown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenDown(LogoParser.PenDownContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#resetAngle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetAngle(LogoParser.ResetAngleContext ctx);
}