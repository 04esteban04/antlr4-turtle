package com.tec.turtle;

import com.tec.antlrturtle.LogoBaseListener;
import com.tec.antlrturtle.LogoParser;
import com.tec.antlrturtle.LogoParser.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * A {@link LogoListener} is effectively a {@link LogoBaseListener}, receiving the callbacks from Antlr parser and delegating the commands to the corresponding {@code painter}
 */

public class LogoListener extends LogoBaseListener {

    private final HashMap<String, String> variables = new HashMap<>();

    private final TurtlePainter painter;

    public LogoListener(TurtlePainter painter) {
        this.painter = painter;
    }

    @Override
    public void exitSi(SiContext ctx) {

        if(Boolean.parseBoolean(ctx.booleanExpression().getText())){
            System.out.println("entrando si");
            for(LogoExpressionContext x : ctx.logoExpression()){
                System.out.println("entrando condicion");
            }
        }
    }

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

    @Override
    public void exitHaz2(Haz2Context ctx) {
        variables.put(ctx.ID().getText(), null);
    }

    @Override
    public void exitHaz(HazContext ctx) {
        String value = ctx.variableExpression().getText();
        variables.put(ctx.ID().getText(), value);
    }

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

    @Override
    public void exitInic(InicContext ctx) {

        String value = ctx.variableExpression().getText();

        variables.put(ctx.ID().getText(), value);

        System.out.println(variables.get(ctx.ID().getText()));

    }

    @Override
    public void exitAparecetortuga(AparecetortugaContext ctx) {
        this.painter.aparecer();
    }

    @Override
    public void exitOcultatortuga(OcultatortugaContext ctx) {
        this.painter.ocultar();
    }


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


    @Override
    public void exitAzar(AzarContext ctx) {

        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.azar(Integer.parseInt(var));
    }


    @Override
    public void exitMenos(LogoParser.MenosContext ctx) {

        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.menos(Integer.parseInt(var));

    }


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

    @Override
    public void exitRumbo(RumboContext ctx){
        this.painter.rumbo();
    }

    @Override
    public void exitCentro(CentroContext ctx){
        this.painter.centro();
    }

    @Override
    public void exitEspera(EsperaContext ctx){

        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.espera(Integer.parseInt(var));
    }

    @Override
    public void exitGoma(GomaContext ctx){
        this.painter.goma();
    }

    @Override
    public void exitPonx(PonxContext ctx){

        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.ponx(Integer.parseInt(var));
    }

    @Override
    public void exitPony(PonyContext ctx){
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }
        this.painter.pony(Integer.parseInt(var));
    }

    @Override
    public void exitPoncolorlapiz(PoncolorlapizContext ctx){
        this.painter.poncolorlapiz(ctx.colorExpression().getText());
    }

    @Override
    public void exitForward(final ForwardContext ctx) {
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }
        this.painter.forward(Integer.parseInt(var));
    }

    @Override
    public void exitBack(final BackContext ctx) {
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }
        this.painter.back(Integer.parseInt(var));
    }

    @Override
    public void exitRight(final RightContext ctx) {
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.right(Integer.parseInt(var));
    }

    @Override
    public void exitLeft(final LeftContext ctx){
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }
        this.painter.left(Integer.parseInt(var));
    }

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

    @Override
    public void exitPenUp(final PenUpContext ctx) {
        this.painter.penUp();
    }

    @Override
    public void exitPenDown(final PenDownContext ctx) {
        this.painter.penDown();
    }

    @Override
    public void exitClearscreen(ClearscreenContext ctx) {
        this.painter.cls();
    }

    @Override
    public void exitResetAngle(ResetAngleContext ctx) {
        this.painter.resetAngle();
    }

    @Override
    public void exitProg(ProgContext ctx) {
        this.painter.finish();
    }
}