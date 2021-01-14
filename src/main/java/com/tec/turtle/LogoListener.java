package com.tec.turtle;

import com.tec.antlrturtle.LogoBaseListener;
import com.tec.antlrturtle.LogoParser;
import com.tec.antlrturtle.LogoParser.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * Clase {@link LogoListener} que se encarga de recibir las llamadas del parser y delega
 * la ejecucion de los comandos al {@code painter}
 */

public class LogoListener extends LogoBaseListener {

    /**
     * Variable que almacena las variables del programa en ejecucion
     */
    private final HashMap<String, String> variables = new HashMap<>();

    /**
     * Variable que se encarga de dibujar en el canvas
     */
    private final TurtlePainter painter;

    /**
     * Constructor de la clase LogoListener
     * @param painter Variable que se encarga de dibujar en el canvas
     */
    public LogoListener(TurtlePainter painter) {
        this.painter = painter;
    }

    /**
     * Metodo que se encarga del comando haz
     * @param ctx Contexto de uso
     */
    @Override
    public void exitHaz(HazContext ctx) {
        String value = ctx.variableExpression().getText();
        variables.put(ctx.ID().getText(), value);
    }

    /**
     * Metodo que se encarga del comando haz
     * @param ctx Contexto de uso
     */
    @Override
    public void exitHaz2(Haz2Context ctx) {
        variables.put(ctx.ID().getText(), null);
    }

    /**
     * Metodo que se encarga del comando inic
     * @param ctx Contexto de uso
     */
    @Override
    public void exitInic(InicContext ctx) {

        String value = ctx.variableExpression().getText();

        variables.put(ctx.ID().getText(), value);

        System.out.println(variables.get(ctx.ID().getText()));

    }

    /**
     * Metodo que se encarga del comando si
     * @param ctx Contexto de uso
     */
    @Override
    public void exitSi(SiContext ctx) {}


    /**
     * Metodo para retornar el n elemento de una lista
     * @param ctx Contexto de uso
     */
    @Override
    public void exitElemento(ElementoContext ctx) {
        List<Double> list = new ArrayList<>();

        for (IntExpressionContext x : ctx.lista().intExpression()){
            String data = x.getText();
            if(Objects.nonNull(variables.get(data))){
                data = variables.get(data);
            }
            list.add(Double.parseDouble(data));
        }

        int n = Integer.parseInt(ctx.intExpression().getText());

        this.painter.elemento(list, n);
    }

    /**
     * Metodo para retornar el ultimo elemento de la lista
     * @param ctx Contexto de uso
     */
    @Override
    public void exitUltimo(UltimoContext ctx) {
        List<Double> list = new ArrayList<>();

        for (IntExpressionContext x : ctx.lista().intExpression()){
            String data = x.getText();
            if(Objects.nonNull(variables.get(data))){
                data = variables.get(data);
            }
            list.add(Double.parseDouble(data));
        }
        this.painter.ultimo(list);
    }

    /**
     * Cuenta la cantidad de elementos de una lista
     * @param ctx Contexto de uso
     */
    @Override
    public void exitCuenta(CuentaContext ctx) {
        List<Double> list = new ArrayList<>();

        for (IntExpressionContext x : ctx.lista().intExpression()){
            String data = x.getText();
            if(Objects.nonNull(variables.get(data))){
                data = variables.get(data);
            }
            list.add(Double.parseDouble(data));
        }

        this.painter.cuenta(list);
    }

    /**
     * Elige un numero al azar de una lista
     * @param ctx Contexto de uso
     */
    @Override
    public void exitElegir(ElegirContext ctx) {

        List<Double> list = new ArrayList<>();

        for (IntExpressionContext x : ctx.lista().intExpression()){
            String data = x.getText();
            if(Objects.nonNull(variables.get(data))){
                data = variables.get(data);
            }
            list.add(Double.parseDouble(data));
        }

        this.painter.elegir(list);
    }

    /**
     * Metodo que retorna el primer elemento de una lista
     * @param ctx Contexto de uso
     */
    @Override
    public void exitPrimero(PrimeroContext ctx) {

        List<Double> list = new ArrayList<>();

        for (IntExpressionContext x : ctx.lista().intExpression()){
            String data = x.getText();
            if(Objects.nonNull(variables.get(data))){
                data = variables.get(data);
            }
            list.add(Double.parseDouble(data));
        }

        this.painter.primero(list);

    }

    /**
     * Metodo que se encarga del comando Aparecetortuga
     * @param ctx Contexto de uso
     */
    @Override
    public void exitAparecetortuga(AparecetortugaContext ctx) {
        this.painter.aparecer();
    }

    /**
     * Metodo que se encarga del comando Ocultatortuga
     * @param ctx Contexto de uso
     */
    @Override
    public void exitOcultatortuga(OcultatortugaContext ctx) {
        this.painter.ocultar();
    }

    /**
     * Metodo que se encarga del comando Rumbo
     * @param ctx Contexto de uso
     */
    @Override
    public void exitRumbo(RumboContext ctx){
        this.painter.rumbo();
    }

    /**
     * Metodo que se encarga del comando centro
     * @param ctx Contexto de uso
     */
    @Override
    public void exitCentro(CentroContext ctx){
        this.painter.centro();
    }

    /**
     * Metodo que se encarga del comando espera
     * @param ctx Contexto de uso
     */
    @Override
    public void exitEspera(EsperaContext ctx){

        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.espera(Integer.parseInt(var));
    }

    /**
     * Metodo que se encarga del comando ponx
     * @param ctx Contexto de uso
     */
    @Override
    public void exitPonx(PonxContext ctx){

        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.ponx(Integer.parseInt(var));
    }

    /**
     * Metodo que se encarga del comando pony
     * @param ctx Contexto de uso
     */
    @Override
    public void exitPony(PonyContext ctx){
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }
        this.painter.pony(Integer.parseInt(var));
    }

    /**
     * Metodo que se encarga del comando poncolorlapiz
     * @param ctx Contexto de uso
     */
    @Override
    public void exitPoncolorlapiz(PoncolorlapizContext ctx){
        this.painter.poncolorlapiz(ctx.colorExpression().getText());
    }

    /**
     * Metodo que se encarga del comando goma
     * @param ctx Contexto de uso
     */
    @Override
    public void exitGoma(GomaContext ctx){
        this.painter.goma();
    }

    /**
     * Metodo que se encarga del comando azar
     * @param ctx Contexto de uso
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
     * Metodo que se encarga del comando inc
     * @param ctx Contexto de uso
     */
    @Override
    public void exitInc(IncContext ctx){
        String var = ctx.intExpression().get(0).getText();
        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }
        String rep = ctx.intExpression().get(1).getText();
        if(Objects.nonNull(variables.get(rep))){
            rep = variables.get(rep);
        }

        this.painter.inc(Integer.parseInt(var), Integer.parseInt(rep));
    }

    /**
     * Metodo que se encarga del comando suma
     * @param ctx Contexto de uso
     */
    @Override public void exitSuma(SumaContext ctx) {
        List<Integer> numeros = new ArrayList<>();
        for (IntExpressionContext x: ctx.intExpression()){
            String var = x.getText();

            if(Objects.nonNull(variables.get(var))){
                var = variables.get(var);
            }

            numeros.add(Integer.parseInt(var));
        }

        this.painter.suma(numeros);
    }

    /**
     * Metodo que se encarga del comando diferencia
     * @param ctx Contexto de uso
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
     * Metodo que se encarga del comando menos
     * @param ctx Contexto de uso
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
     * Metodo que se encarga del comando potencia
     * @param ctx Contexto de uso
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
     * Metodo que se encarga del comando producto
     * @param ctx Contexto de uso
     */
    @Override
    public void exitProducto(ProductoContext ctx){
        List<Integer> numeros = new ArrayList<>();
        for (IntExpressionContext x: ctx.intExpression()){
            String var = x.getText();

            if(Objects.nonNull(variables.get(var))){
                var = variables.get(var);
            }

            numeros.add(Integer.parseInt(var));
        }
        this.painter.producto(numeros);
    }

    /**
     * Metodo que se encarga del comando division
     * @param ctx Contexto de uso
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



    /*
    /**
     * Metodo que se encarga del comando redondea
     * @param ctx Contexto de uso
     */
    /*
    @Override
    public void exitRedondea(RedondeaContext ctx) {

        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.redondea(Double.parseDouble(var));

    }
    */



    /**
     * Metodo que se encarga del comando o logico
     * @param ctx Contexto de uso
     */
    @Override
    public void exitO(OContext ctx) {

        String var = ctx.booleanExpression().get(0).getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        String var2 = ctx.booleanExpression().get(1).getText();

        if(Objects.nonNull(variables.get(var2))){
            var2 = variables.get(var2);
        }

        this.painter.o(Boolean.parseBoolean(var),
                Boolean.parseBoolean(var2));
    }

    /**
     * Metodo que se encarga del comando y logico
     * @param ctx Contexto de uso
     */
    @Override
    public void exitY(YContext ctx) {

        String var = ctx.booleanExpression().get(0).getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        String var2 = ctx.booleanExpression().get(1).getText();

        if(Objects.nonNull(variables.get(var2))){
            var2 = variables.get(var2);
        }

        this.painter.y(Boolean.parseBoolean(var),
                Boolean.parseBoolean(var2));

    }

    /**
     * Metodo que se encarga del comando iguales
     * @param ctx Contexto de uso
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
     * Metodo que se encarga del comando menorque
     * @param ctx Contexto de uso
     */
    @Override
    public void exitMenorque(MenorqueContext ctx) {

        String var = ctx.intExpression().get(0).getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        String var2 = ctx.intExpression().get(1).getText();

        if(Objects.nonNull(variables.get(var2))){
            var2 = variables.get(var2);
        }

        this.painter.menorque(Integer.parseInt(var),
                Integer.parseInt(var2));
    }

    /**
     * Metodo que se encarga del comando mayorque
     * @param ctx Contexto de uso
     */
    @Override
    public void exitMayorque(MayorqueContext ctx) {

        String var = ctx.intExpression().get(0).getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        String var2 = ctx.intExpression().get(1).getText();

        if(Objects.nonNull(variables.get(var2))){
            var2 = variables.get(var2);
        }

        this.painter.mayorque(Integer.parseInt(var),
                Integer.parseInt(var2));
    }

    /**
     * Metodo que se encarga del comando forward
     * @param ctx Contexto de uso
     */
    @Override
    public void exitForward(final ForwardContext ctx) {
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }
        this.painter.forward(Integer.parseInt(var));
    }

    /**
     * Metodo que se encarga del comando back
     * @param ctx Contexto de uso
     */
    @Override
    public void exitBack(final BackContext ctx) {
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }
        this.painter.back(Integer.parseInt(var));
    }

    /**
     * Metodo que se encarga del comando right
     * @param ctx Contexto de uso
     */
    @Override
    public void exitRight(final RightContext ctx) {
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.right(Integer.parseInt(var));
    }

    /**
     * Metodo que se encarga del comando left
     * @param ctx Contexto de uso
     */
    @Override
    public void exitLeft(final LeftContext ctx){
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }
        this.painter.left(Integer.parseInt(var));
    }

    /**
     * Metodo que se encarga del comando set
     * @param ctx Contexto de uso
     */
    @Override
    public void exitSet(final SetContext ctx) {
        final String[] point = ctx.POINT().getText().split(",");
        String var = point[0];

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }
        String var2 = point[1];

        if(Objects.nonNull(variables.get(var2))){
            var2 = variables.get(var2);
        }

        System.out.println(var);
        System.out.println(var2);
        final int x = Integer.parseInt(var);
        final int y = Integer.parseInt(var2);

        this.painter.set(x, y);
    }

    /**
     * Metodo que se encarga del comando penUp
     * @param ctx Contexto de uso
     */
    @Override
    public void exitPenUp(final PenUpContext ctx) {
        this.painter.penUp();
    }

    /**
     * Metodo que se encarga del comando penDown
     * @param ctx Contexto de uso
     */
    @Override
    public void exitPenDown(final PenDownContext ctx) {
        this.painter.penDown();
    }

    /**
     * Metodo que se encarga del comando Clearscreen
     * @param ctx Contexto de uso
     */
    @Override
    public void exitClearscreen(ClearscreenContext ctx) {
        this.painter.cls();
    }

    /**
     * Metodo que se encarga del comando resetAngle
     * @param ctx Contexto de uso
     */
    @Override
    public void exitResetAngle(ResetAngleContext ctx) {
        this.painter.resetAngle();
    }

    /**
     * Metodo que se encarga del comando finish
     * @param ctx Contexto de uso
     */
    @Override
    public void exitProg(ProgContext ctx) {
        this.painter.finish();
    }
}