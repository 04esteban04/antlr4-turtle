// Generated from C:/Users/danbg/IdeaProjects/antlr4-turtle/src/main/antlr4/com/tec/antlrturtle\Logo.g4 by ANTLR 4.9
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
	 * Enter a parse tree produced by {@link LogoParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(LogoParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(LogoParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#colorExpression}.
	 * @param ctx the parse tree
	 */
	void enterColorExpression(LogoParser.ColorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#colorExpression}.
	 * @param ctx the parse tree
	 */
	void exitColorExpression(LogoParser.ColorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(LogoParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(LogoParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#intExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntExpression(LogoParser.IntExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#intExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntExpression(LogoParser.IntExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link LogoParser#cuenta}.
	 * @param ctx the parse tree
	 */
	void enterCuenta(LogoParser.CuentaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#cuenta}.
	 * @param ctx the parse tree
	 */
	void exitCuenta(LogoParser.CuentaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#elegir}.
	 * @param ctx the parse tree
	 */
	void enterElegir(LogoParser.ElegirContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#elegir}.
	 * @param ctx the parse tree
	 */
	void exitElegir(LogoParser.ElegirContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#primero}.
	 * @param ctx the parse tree
	 */
	void enterPrimero(LogoParser.PrimeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#primero}.
	 * @param ctx the parse tree
	 */
	void exitPrimero(LogoParser.PrimeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#ultimo}.
	 * @param ctx the parse tree
	 */
	void enterUltimo(LogoParser.UltimoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#ultimo}.
	 * @param ctx the parse tree
	 */
	void exitUltimo(LogoParser.UltimoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#elemento}.
	 * @param ctx the parse tree
	 */
	void enterElemento(LogoParser.ElementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#elemento}.
	 * @param ctx the parse tree
	 */
	void exitElemento(LogoParser.ElementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(LogoParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(LogoParser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(LogoParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(LogoParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#sisino}.
	 * @param ctx the parse tree
	 */
	void enterSisino(LogoParser.SisinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#sisino}.
	 * @param ctx the parse tree
	 */
	void exitSisino(LogoParser.SisinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#mayorque}.
	 * @param ctx the parse tree
	 */
	void enterMayorque(LogoParser.MayorqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#mayorque}.
	 * @param ctx the parse tree
	 */
	void exitMayorque(LogoParser.MayorqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#menorque}.
	 * @param ctx the parse tree
	 */
	void enterMenorque(LogoParser.MenorqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#menorque}.
	 * @param ctx the parse tree
	 */
	void exitMenorque(LogoParser.MenorqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#iguales}.
	 * @param ctx the parse tree
	 */
	void enterIguales(LogoParser.IgualesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#iguales}.
	 * @param ctx the parse tree
	 */
	void exitIguales(LogoParser.IgualesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#o}.
	 * @param ctx the parse tree
	 */
	void enterO(LogoParser.OContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#o}.
	 * @param ctx the parse tree
	 */
	void exitO(LogoParser.OContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#y}.
	 * @param ctx the parse tree
	 */
	void enterY(LogoParser.YContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#y}.
	 * @param ctx the parse tree
	 */
	void exitY(LogoParser.YContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#blanco}.
	 * @param ctx the parse tree
	 */
	void enterBlanco(LogoParser.BlancoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#blanco}.
	 * @param ctx the parse tree
	 */
	void exitBlanco(LogoParser.BlancoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#azul}.
	 * @param ctx the parse tree
	 */
	void enterAzul(LogoParser.AzulContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#azul}.
	 * @param ctx the parse tree
	 */
	void exitAzul(LogoParser.AzulContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#marron}.
	 * @param ctx the parse tree
	 */
	void enterMarron(LogoParser.MarronContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#marron}.
	 * @param ctx the parse tree
	 */
	void exitMarron(LogoParser.MarronContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#cian}.
	 * @param ctx the parse tree
	 */
	void enterCian(LogoParser.CianContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#cian}.
	 * @param ctx the parse tree
	 */
	void exitCian(LogoParser.CianContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#gris}.
	 * @param ctx the parse tree
	 */
	void enterGris(LogoParser.GrisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#gris}.
	 * @param ctx the parse tree
	 */
	void exitGris(LogoParser.GrisContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#amarillo}.
	 * @param ctx the parse tree
	 */
	void enterAmarillo(LogoParser.AmarilloContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#amarillo}.
	 * @param ctx the parse tree
	 */
	void exitAmarillo(LogoParser.AmarilloContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#negro}.
	 * @param ctx the parse tree
	 */
	void enterNegro(LogoParser.NegroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#negro}.
	 * @param ctx the parse tree
	 */
	void exitNegro(LogoParser.NegroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#verde}.
	 * @param ctx the parse tree
	 */
	void enterVerde(LogoParser.VerdeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#verde}.
	 * @param ctx the parse tree
	 */
	void exitVerde(LogoParser.VerdeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#rojo}.
	 * @param ctx the parse tree
	 */
	void enterRojo(LogoParser.RojoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#rojo}.
	 * @param ctx the parse tree
	 */
	void exitRojo(LogoParser.RojoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSuma(LogoParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSuma(LogoParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#resto}.
	 * @param ctx the parse tree
	 */
	void enterResto(LogoParser.RestoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#resto}.
	 * @param ctx the parse tree
	 */
	void exitResto(LogoParser.RestoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(LogoParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(LogoParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#menos}.
	 * @param ctx the parse tree
	 */
	void enterMenos(LogoParser.MenosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#menos}.
	 * @param ctx the parse tree
	 */
	void exitMenos(LogoParser.MenosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#azar}.
	 * @param ctx the parse tree
	 */
	void enterAzar(LogoParser.AzarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#azar}.
	 * @param ctx the parse tree
	 */
	void exitAzar(LogoParser.AzarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#producto}.
	 * @param ctx the parse tree
	 */
	void enterProducto(LogoParser.ProductoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#producto}.
	 * @param ctx the parse tree
	 */
	void exitProducto(LogoParser.ProductoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#diferencia}.
	 * @param ctx the parse tree
	 */
	void enterDiferencia(LogoParser.DiferenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#diferencia}.
	 * @param ctx the parse tree
	 */
	void exitDiferencia(LogoParser.DiferenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#potencia}.
	 * @param ctx the parse tree
	 */
	void enterPotencia(LogoParser.PotenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#potencia}.
	 * @param ctx the parse tree
	 */
	void exitPotencia(LogoParser.PotenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#redondea}.
	 * @param ctx the parse tree
	 */
	void enterRedondea(LogoParser.RedondeaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#redondea}.
	 * @param ctx the parse tree
	 */
	void exitRedondea(LogoParser.RedondeaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#inc}.
	 * @param ctx the parse tree
	 */
	void enterInc(LogoParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#inc}.
	 * @param ctx the parse tree
	 */
	void exitInc(LogoParser.IncContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#inic}.
	 * @param ctx the parse tree
	 */
	void enterInic(LogoParser.InicContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#inic}.
	 * @param ctx the parse tree
	 */
	void exitInic(LogoParser.InicContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#haz2}.
	 * @param ctx the parse tree
	 */
	void enterHaz2(LogoParser.Haz2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#haz2}.
	 * @param ctx the parse tree
	 */
	void exitHaz2(LogoParser.Haz2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#haz}.
	 * @param ctx the parse tree
	 */
	void enterHaz(LogoParser.HazContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#haz}.
	 * @param ctx the parse tree
	 */
	void exitHaz(LogoParser.HazContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#ocultatortuga}.
	 * @param ctx the parse tree
	 */
	void enterOcultatortuga(LogoParser.OcultatortugaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#ocultatortuga}.
	 * @param ctx the parse tree
	 */
	void exitOcultatortuga(LogoParser.OcultatortugaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#aparecetortuga}.
	 * @param ctx the parse tree
	 */
	void enterAparecetortuga(LogoParser.AparecetortugaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#aparecetortuga}.
	 * @param ctx the parse tree
	 */
	void exitAparecetortuga(LogoParser.AparecetortugaContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link LogoParser#espera}.
	 * @param ctx the parse tree
	 */
	void enterEspera(LogoParser.EsperaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#espera}.
	 * @param ctx the parse tree
	 */
	void exitEspera(LogoParser.EsperaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#centro}.
	 * @param ctx the parse tree
	 */
	void enterCentro(LogoParser.CentroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#centro}.
	 * @param ctx the parse tree
	 */
	void exitCentro(LogoParser.CentroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#poncolorlapiz}.
	 * @param ctx the parse tree
	 */
	void enterPoncolorlapiz(LogoParser.PoncolorlapizContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#poncolorlapiz}.
	 * @param ctx the parse tree
	 */
	void exitPoncolorlapiz(LogoParser.PoncolorlapizContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#goma}.
	 * @param ctx the parse tree
	 */
	void enterGoma(LogoParser.GomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#goma}.
	 * @param ctx the parse tree
	 */
	void exitGoma(LogoParser.GomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#ponx}.
	 * @param ctx the parse tree
	 */
	void enterPonx(LogoParser.PonxContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#ponx}.
	 * @param ctx the parse tree
	 */
	void exitPonx(LogoParser.PonxContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#pony}.
	 * @param ctx the parse tree
	 */
	void enterPony(LogoParser.PonyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#pony}.
	 * @param ctx the parse tree
	 */
	void exitPony(LogoParser.PonyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#rumbo}.
	 * @param ctx the parse tree
	 */
	void enterRumbo(LogoParser.RumboContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#rumbo}.
	 * @param ctx the parse tree
	 */
	void exitRumbo(LogoParser.RumboContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#ponrumbo}.
	 * @param ctx the parse tree
	 */
	void enterPonrumbo(LogoParser.PonrumboContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#ponrumbo}.
	 * @param ctx the parse tree
	 */
	void exitPonrumbo(LogoParser.PonrumboContext ctx);
}