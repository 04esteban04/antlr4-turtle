// Generated from C:/Users/danbg/IdeaProjects/antlr4-turtle/src/main/antlr4/com/tec/antlrturtle\Logo.g4 by ANTLR 4.9


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
	 * Visit a parse tree produced by {@link LogoParser#variableExpreson}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpreson(LogoParser.VariableExpresonContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#coloExpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColoExpresion(LogoParser.ColoExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#booleanExpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpresion(LogoParser.BooleanExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#intExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpression(LogoParser.IntExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#logoExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogoExpression(LogoParser.LogoExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#mayorque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorque(LogoParser.MayorqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#menorque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorque(LogoParser.MenorqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#iguales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIguales(LogoParser.IgualesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#o}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitO(LogoParser.OContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitY(LogoParser.YContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#blanco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlanco(LogoParser.BlancoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#azul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAzul(LogoParser.AzulContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#marron}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarron(LogoParser.MarronContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#cian}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCian(LogoParser.CianContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#gris}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGris(LogoParser.GrisContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#amarillo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmarillo(LogoParser.AmarilloContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#negro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegro(LogoParser.NegroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#verde}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerde(LogoParser.VerdeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#rojo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRojo(LogoParser.RojoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(LogoParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#resto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResto(LogoParser.RestoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(LogoParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#menos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenos(LogoParser.MenosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#azar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAzar(LogoParser.AzarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#producto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProducto(LogoParser.ProductoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#diferencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiferencia(LogoParser.DiferenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#potencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotencia(LogoParser.PotenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#redondea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedondea(LogoParser.RedondeaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#espera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspera(LogoParser.EsperaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#centro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCentro(LogoParser.CentroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#poncolorlapiz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoncolorlapiz(LogoParser.PoncolorlapizContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#goma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoma(LogoParser.GomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#ponx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPonx(LogoParser.PonxContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#pony}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPony(LogoParser.PonyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#rumbo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRumbo(LogoParser.RumboContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#ponrumbo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPonrumbo(LogoParser.PonrumboContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#inc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(LogoParser.IncContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#inic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInic(LogoParser.InicContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#haz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaz(LogoParser.HazContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#ocultatortuga}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOcultatortuga(LogoParser.OcultatortugaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#aparecetortuga}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAparecetortuga(LogoParser.AparecetortugaContext ctx);
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