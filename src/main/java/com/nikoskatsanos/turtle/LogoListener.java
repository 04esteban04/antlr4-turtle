package com.nikoskatsanos.turtle;

import com.nikoskatsanos.antlrturtle.LogoBaseListener;
import com.nikoskatsanos.antlrturtle.LogoParser;
import com.nikoskatsanos.antlrturtle.LogoParser.*;

import java.util.ArrayList;
import java.util.List;

/**
 * A {@link LogoListener} is effectively a {@link LogoBaseListener}, receiving the callbacks from Antlr parser and delegating the commands to the corresponding {@code painter}
 */
public class LogoListener extends LogoBaseListener {

    private final TurtlePainter painter;

    public LogoListener(TurtlePainter painter) {
        this.painter = painter;
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
