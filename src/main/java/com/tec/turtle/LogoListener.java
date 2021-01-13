package com.tec.turtle;

import com.tec.antlrturtle.LogoBaseListener;
import com.tec.antlrturtle.LogoParser;
import com.tec.antlrturtle.LogoParser.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * Clase LogoListener que se encarga de manejar las llamadas del parser y delegar los comandos al painter
 */
public class LogoListener extends LogoBaseListener {
    /**
     * Variable de tipo HashMap para guardar las variables del programa en ejecucion
     */
    private final HashMap<String, String> variables = new HashMap<>();

    /**
     * Variable de tipo TurtlePainter que se encarga de dibujar en el canvas
     */
    private final TurtlePainter painter;

    /**
     * Constructor de la clase LogoListener
     * @param painter Variable painter
     */
    public LogoListener(TurtlePainter painter) {
        this.painter = painter;
    }

    /**
     * Metodo que se encarga de manejar la instruccion ApareceTortuga
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitAparecetortuga(AparecetortugaContext ctx) {
        this.painter.aparecer();
    }

    /**
     * Metodo que se encarga de manejar la instruccion OcultaTortuga
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitOcultatortuga(OcultatortugaContext ctx) {
        this.painter.ocultar();
    }

    /**
     * Metodo que se encarga de manejar la instruccion Rumbo
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitRumbo(RumboContext ctx){
        this.painter.rumbo();
    }

    /**
     * Metodo que se encarga de manejar la instruccion Centro
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitCentro(CentroContext ctx){
        this.painter.centro();
    }

    /**
     * Metodo que se encarga de manejar la instruccion Espera
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitEspera(EsperaContext ctx){
        this.painter.espera(Integer.parseInt(ctx.getChild(1).getText()));
    }

    /**
     * Metodo que se encarga de manejar la instruccion Ponx
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitPonx(PonxContext ctx){
        this.painter.ponx(Integer.parseInt(ctx.getChild(1).getText()));
    }

    /**
     * Metodo que se encarga de manejar la instruccion Pony
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitPony(PonyContext ctx){
        this.painter.pony(Integer.parseInt(ctx.getChild(1).getText()));
    }

    /**
     * Metodo que se encarga de manejar la instruccion Poncolorlapiz
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitPoncolorlapiz(PoncolorlapizContext ctx){
        this.painter.poncolorlapiz(ctx.getChild(1).getText());
    }

    /**
     * Metodo que se encarga de manejar la instruccion Goma
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitGoma(GomaContext ctx){
        this.painter.goma();
    }

    /**
     * Metodo que se encarga de manejar la instruccion Azar
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitAzar(AzarContext ctx) {

        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.azar(Integer.parseInt(var));
    }

    /**
     * Metodo que se encarga de manejar la instruccion Inic
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitInic(InicContext ctx) {
        String value = ctx.variableExpresion().getText();
        variables.put(ctx.ID().getText(), value);

        System.out.println(variables.get(ctx.ID().getText()));
    }

    /**
     * Metodo que se encarga de manejar la instruccion Inc
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitInc(IncContext ctx){
        String var = ctx.intExpression().get(0).getText();
        System.out.println(variables.get(var));
        String rep = ctx.intExpression().get(1).getText();
        System.out.println(variables.get(rep));

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }
        if(Objects.nonNull(variables.get(rep))){
            rep = variables.get(rep);
        }

        this.painter.inc(Integer.parseInt(var), Integer.parseInt(rep));
    }

    /**
     * Metodo que se encarga de manejar la instruccion Suma
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitSuma(SumaContext ctx) {
        int x = 1;
        List<Integer> numeros = new ArrayList<>();
        while(ctx.getChild(x) != null ){

            String var = ctx.intExpression().get(x).getText();

            if(Objects.nonNull(variables.get(var))){
                var = variables.get(var);
            }

            numeros.add(Integer.parseInt(var));
            x++;
        }
        this.painter.suma(numeros);
    }

    /**
     * Metodo que se encarga de manejar la instruccion Diferencia
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitDiferencia(DiferenciaContext ctx) {
        int x = 1;
        List<Integer> numeros = new ArrayList<>();
        while(ctx.intExpression().get(x) != null ){
            String var = ctx.intExpression().get(x).getText();

            if(Objects.nonNull(variables.get(var))){
                var = variables.get(var);
            }

            numeros.add(Integer.parseInt(var));
            x++;
        }
        this.painter.diferencia(numeros);
    }

    /**
     * Metodo que se encarga de manejar la instruccion Menos
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitMenos(LogoParser.MenosContext ctx) {

        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.menos(Integer.parseInt(var));

    }

    /**
     * Metodo que se encarga de manejar la instruccion Potencia
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitPotencia(PotenciaContext ctx) {

        String var = ctx.intExpression().get(0).getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        String var2 = ctx.intExpression().get(1).getText();

        if(Objects.nonNull(variables.get(var2))){
            var2 = variables.get(var2);
        }

        this.painter.potencia(Integer.parseInt(var),
                Integer.parseInt(var2));
    }

    /**
     * Metodo que se encarga de manejar la instruccion Producto
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitProducto(ProductoContext ctx){
        int x = 1;
        List<Integer> numeros = new ArrayList<>();
        while(ctx.getChild(x) != null ){
            System.out.println(ctx.getChild(x).getText());
            numeros.add(Integer.parseInt(ctx.getChild(x).getText()));
            x++;
        }
        this.painter.producto(numeros);
    }

    /**
     * Metodo que se encarga de manejar la instruccion Division
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitDivision(DivisionContext ctx) {

        String var = ctx.intExpression().get(0).getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        String var2 = ctx.intExpression().get(1).getText();

        if(Objects.nonNull(variables.get(var2))){
            var2 = variables.get(var2);
        }

        this.painter.division(Integer.parseInt(var),
                Integer.parseInt(var2));

    }

    /**
     * Metodo que se encarga de manejar la instruccion Redondea
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitRedondea(RedondeaContext ctx) {

        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.redondea(Double.parseDouble(var));

    }

    /**
     * Metodo que se encarga de manejar la instruccion O
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitO(OContext ctx) {

        String var = ctx.booleanExpresion().get(0).getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        String var2 = ctx.booleanExpresion().get(1).getText();

        if(Objects.nonNull(variables.get(var2))){
            var2 = variables.get(var2);
        }

        this.painter.o(Boolean.parseBoolean(var),
                Boolean.parseBoolean(var2));
    }

    /**
     * Metodo que se encarga de manejar la instruccion Y
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitY(YContext ctx) {

        String var = ctx.booleanExpresion().get(0).getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        String var2 = ctx.booleanExpresion().get(1).getText();

        if(Objects.nonNull(variables.get(var2))){
            var2 = variables.get(var2);
        }

        this.painter.y(Boolean.parseBoolean(var),
                Boolean.parseBoolean(var2));

    }

    /**
     * Metodo que se encarga de manejar la instruccion Iguales
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitIguales(IgualesContext ctx) {

        String var = ctx.intExpression().get(0).getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        String var2 = ctx.intExpression().get(1).getText();

        if(Objects.nonNull(variables.get(var2))){
            var2 = variables.get(var2);
        }

        this.painter.iguales(Integer.parseInt(var),
                Integer.parseInt(var2));
    }

    /**
     * Metodo que se encarga de manejar la instruccion Menorque
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitMenorque(MenorqueContext ctx) {
        this.painter.menorque(Integer.parseInt(ctx.getChild(1).getText()),
                Integer.parseInt(ctx.getChild(2).getText()));
    }

    /**
     * Metodo que se encarga de manejar la instruccion Mayorque
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitMayorque(MayorqueContext ctx) {
        this.painter.mayorque(Integer.parseInt(ctx.getChild(1).getText()),
                Integer.parseInt(ctx.getChild(2).getText()));
    }

    /**
     * Metodo que se encarga de manejar la instruccion Forward
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitForward(final ForwardContext ctx) {
        this.painter.forward(Integer.parseInt(ctx.getChild(1).getText()));
    }

    /**
     * Metodo que se encarga de manejar la instruccion Back
     * @param ctx Contexto de la instruccion
     */
    public void exitBack(final BackContext ctx) {
        this.painter.back(Integer.parseInt(ctx.getChild(1).getText()));
    }

    /**
     * Metodo que se encarga de manejar la instruccion Right
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitRight(final RightContext ctx) {
        this.painter.right(Integer.parseInt(ctx.getChild(1).getText()));
    }

    /**
     * Metodo que se encarga de manejar la instruccion Left
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitLeft(final LeftContext ctx) {
        this.painter.left(Integer.parseInt(ctx.getChild(1).getText()));
    }

    /**
     * Metodo que se encarga de manejar la instruccion Set
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitSet(final SetContext ctx) {
        final String[] point = ctx.POINT().getText().split(",");
        final int x = Integer.parseInt(point[0]);
        final int y = Integer.parseInt(point[1]);
        this.painter.set(x, y);
    }

    /**
     * Metodo que se encarga de manejar la instruccion PenUp
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitPenUp(final PenUpContext ctx) {
        this.painter.penUp();
    }

    /**
     * Metodo que se encarga de manejar la instruccion PenDown
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitPenDown(final PenDownContext ctx) {
        this.painter.penDown();
    }

    /**
     * Metodo que se encarga de manejar la instruccion Clearscreen
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitClearscreen(ClearscreenContext ctx) {
        this.painter.cls();
    }

    /**
     * Metodo que se encarga de manejar la instruccion ResetAngle
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitResetAngle(ResetAngleContext ctx) {
        this.painter.resetAngle();
    }

    /**
     * Metodo que se encarga de manejar la instruccion Prog
     * @param ctx Contexto de la instruccion
     */
    @Override
    public void exitProg(ProgContext ctx) {
        this.painter.finish();
    }
}
