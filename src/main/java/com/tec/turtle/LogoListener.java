package com.tec.turtle;

import com.tec.antlrturtle.LogoBaseListener;
import com.tec.antlrturtle.LogoParser;
import com.tec.antlrturtle.LogoParser.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    public void exitInc(IncContext ctx){
        String var = ctx.getChild(2).getText();
        String rep = ctx.getChild(3).getText();

        this.painter.inc(Integer.parseInt(variables.get(var)), Integer.parseInt(rep));
    }

    @Override
    public void exitInic(InicContext ctx) {
        String value = ctx.getChild(3).getText();
        variables.put(ctx.getChild(1).getText(), value);
    }

    @Override
    public void exitAparecetortuga(AparecetortugaContext ctx) {
        this.painter.aparecer();
    }

    @Override
    public void exitOcultatortuga(OcultatortugaContext ctx) {
        this.painter.ocultar();
    }


    @Override
    public void exitRedondea(RedondeaContext ctx) {
        this.painter.redondea(Double.parseDouble(ctx.getChild(1).getText()));
    }

    @Override
    public void exitPotencia(PotenciaContext ctx) {
        this.painter.potencia(Integer.parseInt(ctx.getChild(1).getText()),
                Integer.parseInt(ctx.getChild(2).getText()));
    }


    @Override
    public void exitDiferencia(DiferenciaContext ctx) {
        int x = 1;
        List<Integer> numeros = new ArrayList<>();
        while(ctx.getChild(x) != null ){
            numeros.add(Integer.parseInt(ctx.getChild(x).getText()));
            x++;
        }
        this.painter.diferencia(numeros);
    }


    @Override
    public void exitAzar(AzarContext ctx) {
        this.painter.azar(Integer.parseInt(ctx.getChild(1).getText()));
    }


    @Override
    public void exitMenos(LogoParser.MenosContext ctx) {
        this.painter.menos(Integer.parseInt(ctx.getChild(1).getText()));
    }


    @Override
    public void exitDivision(DivisionContext ctx) {
        this.painter.division(Integer.parseInt(ctx.getChild(1).getText()),
                Integer.parseInt(ctx.getChild(2).getText()));
    }


    @Override public void exitSuma(SumaContext ctx) {
        int x = 1;
        List<Integer> numeros = new ArrayList<>();
        while(ctx.getChild(x) != null ){
            numeros.add(Integer.parseInt(ctx.getChild(x).getText()));
            x++;
        }
        this.painter.suma(numeros);
    }

    @Override
    public void exitY(YContext ctx) {
        this.painter.y(Boolean.parseBoolean(ctx.getChild(1).getText()),
                Boolean.parseBoolean(ctx.getChild(2).getText()));
    }


    @Override
    public void exitO(OContext ctx) {
        this.painter.o(Boolean.parseBoolean(ctx.getChild(1).getText()),
                Boolean.parseBoolean(ctx.getChild(2).getText()));
    }


    @Override
    public void exitIguales(IgualesContext ctx) {
        this.painter.iguales(Integer.parseInt(ctx.getChild(1).getText()),
                Integer.parseInt(ctx.getChild(2).getText()));
    }


    @Override
    public void exitMenorque(MenorqueContext ctx) {
        this.painter.menorque(Integer.parseInt(ctx.getChild(1).getText()),
                Integer.parseInt(ctx.getChild(2).getText()));
    }


    @Override
    public void exitMayorque(MayorqueContext ctx) {
        this.painter.mayorque(Integer.parseInt(ctx.getChild(1).getText()),
                Integer.parseInt(ctx.getChild(2).getText()));
    }


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
        this.painter.espera(Integer.parseInt(ctx.getChild(1).getText()));
    }

    @Override
    public void exitGoma(GomaContext ctx){
        this.painter.goma();
    }

    @Override
    public void exitPonx(PonxContext ctx){
        this.painter.ponx(Integer.parseInt(ctx.getChild(1).getText()));
    }

    @Override
    public void exitPony(PonyContext ctx){
        this.painter.pony(Integer.parseInt(ctx.getChild(1).getText()));
    }

    @Override
    public void exitPoncolorlapiz(PoncolorlapizContext ctx){
        this.painter.poncolorlapiz(ctx.getChild(1).getText());
    }

    @Override
    public void exitForward(final ForwardContext ctx) {
        this.painter.forward(Integer.parseInt(ctx.getChild(1).getText()));
    }

    @Override
    public void exitBack(final BackContext ctx) {
        this.painter.back(Integer.parseInt(ctx.getChild(1).getText()));
    }

    @Override
    public void exitRight(final RightContext ctx) {
        this.painter.right(Integer.parseInt(ctx.getChild(1).getText()));
    }

    @Override
    public void exitLeft(final LeftContext ctx) {
        this.painter.left(Integer.parseInt(ctx.getChild(1).getText()));
    }

    @Override
    public void exitSet(final SetContext ctx) {
        final String[] point = ctx.POINT().getText().split(",");
        final int x = Integer.parseInt(point[0]);
        final int y = Integer.parseInt(point[1]);
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
