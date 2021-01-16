package com.tec.turtle;

import com.tec.antlrturtle.LogoBaseVisitor;
import com.tec.antlrturtle.LogoParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;


public class LogoVisitor extends LogoBaseVisitor<Void> {

    private final HashMap<String, String> variables = new HashMap<>();

    private final TurtlePainter painter;

    public LogoVisitor(TurtlePainter painter) {
        this.painter = painter;
    }
/*
    @Override
    public Void visitAparecetortuga(LogoParser.AparecetortugaContext ctx) {
        this.painter.aparecer();
        return super.visitAparecetortuga(ctx);
    }*/

    @Override
    public Void visitAzar(LogoParser.AzarContext ctx) {
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.azar(Integer.parseInt(var));
        return super.visitAzar(ctx);
    }

    @Override
    public Void visitBack(LogoParser.BackContext ctx) {
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }
        this.painter.back(Integer.parseInt(var));
        return super.visitBack(ctx);
    }
/*
    @Override
    public Void visitCentro(LogoParser.CentroContext ctx) {
        this.painter.centro();
        return super.visitCentro(ctx);
    }
*/
    /*
    @Override
    public Void visitClearscreen(LogoParser.ClearscreenContext ctx) {
        this.painter.cls();
        return super.visitClearscreen(ctx);
    }*/

    @Override
    public Void visitCuenta(LogoParser.CuentaContext ctx) {
        List<Double> list = new ArrayList<>();

        for (LogoParser.IntExpressionContext x : ctx.lista().intExpression()){
            String data = x.getText();
            if(Objects.nonNull(variables.get(data))){
                data = variables.get(data);
            }
            list.add(Double.parseDouble(data));
        }

        this.painter.cuenta(list);
        return super.visitCuenta(ctx);
    }

    @Override
    public Void visitDiferencia(LogoParser.DiferenciaContext ctx) {
        int x = 0;
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
        return super.visitDiferencia(ctx);
    }

    @Override
    public Void visitDivision(LogoParser.DivisionContext ctx) {
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
        return super.visitDivision(ctx);

    }

    @Override
    public Void visitElegir(LogoParser.ElegirContext ctx) {
        List<Double> list = new ArrayList<>();

        for (LogoParser.IntExpressionContext x : ctx.lista().intExpression()){
            String data = x.getText();
            if(Objects.nonNull(variables.get(data))){
                data = variables.get(data);
            }
            list.add(Double.parseDouble(data));
        }

        this.painter.elegir(list);
        return super.visitElegir(ctx);
    }

    @Override
    public Void visitElemento(LogoParser.ElementoContext ctx) {
        List<Double> list = new ArrayList<>();

        for (LogoParser.IntExpressionContext x : ctx.lista().intExpression()){
            String data = x.getText();
            if(Objects.nonNull(variables.get(data))){
                data = variables.get(data);
            }
            list.add(Double.parseDouble(data));
        }

        int n = Integer.parseInt(ctx.intExpression().getText());

        this.painter.elemento(list, n);
        return super.visitElemento(ctx);
    }
/*
    @Override
    public Void visitEspera(LogoParser.EsperaContext ctx) {
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.espera(Integer.parseInt(var));
        return super.visitEspera(ctx);
    }*/

    @Override
    public Void visitForward(LogoParser.ForwardContext ctx) {
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }
        this.painter.forward(Integer.parseInt(var));
        return null;
    }

    @Override
    public Void visitGoma(LogoParser.GomaContext ctx) {
        this.painter.goma();
        return super.visitGoma(ctx);
    }
    @Override
    public Void visitHaz(LogoParser.HazContext ctx) {
        String value = ctx.variableExpression().getText();
        variables.put(ctx.ID().getText(), value);
        return super.visitHaz(ctx);
    }
    @Override
    public Void visitHaz2(LogoParser.Haz2Context ctx) {
        variables.put(ctx.ID().getText(), null);
        return super.visitHaz2(ctx);
    }
    @Override
    public Void visitIguales(LogoParser.IgualesContext ctx) {
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
        return super.visitIguales(ctx);
    }

    @Override
    public Void visitInc(LogoParser.IncContext ctx) {
        String var = ctx.intExpression().get(0).getText();
        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }
        String rep = ctx.intExpression().get(1).getText();
        if(Objects.nonNull(variables.get(rep))){
            rep = variables.get(rep);
        }

        this.painter.inc(Integer.parseInt(var), Integer.parseInt(rep));
        return super.visitInc(ctx);
    }

    @Override
    public Void visitInic(LogoParser.InicContext ctx) {
        String value = ctx.variableExpression().getText();

        variables.put(ctx.ID().getText(), value);

        System.out.println(variables.get(ctx.ID().getText()));
        return super.visitInic(ctx);
    }
    /**
     * Metodo que se encarga del comando left
     * @param ctx Contexto de uso
     */

    @Override
    public Void visitLeft(LogoParser.LeftContext ctx) {
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }
        this.painter.left(Integer.parseInt(var));
        return super.visitLeft(ctx);
    }

    /**
     * Metodo que se encarga del comando mayorque
     * @param ctx Contexto de uso
     */
    @Override
    public Void visitMayorque(LogoParser.MayorqueContext ctx) {
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
        return super.visitMayorque(ctx);
    }
    /**
     * Metodo que se encarga del comando menorque
     * @param ctx Contexto de uso
     */
    @Override
    public Void visitMenorque(LogoParser.MenorqueContext ctx) {
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
        return super.visitMenorque(ctx);
    }
    /**
     * Metodo que se encarga del comando menos
     * @param ctx Contexto de uso
     */
    @Override
    public Void visitMenos(LogoParser.MenosContext ctx) {
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.menos(Integer.parseInt(var));
        return super.visitMenos(ctx);
    }
    /**
     * Metodo que se encarga del comando o logico
     * @param ctx Contexto de uso
     */
    @Override
    public Void visitO(LogoParser.OContext ctx) {
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
        return super.visitO(ctx);
    }

    /**
     * Metodo que se encarga del comando Ocultatortuga
     * @param ctx Contexto de uso
     */
   /* @Override
    public Void visitOcultatortuga(LogoParser.OcultatortugaContext ctx) {
        this.painter.ocultar();
        return super.visitOcultatortuga(ctx);
    }*/
    /**
     * Metodo que se encarga del comando penDown
     * @param ctx Contexto de uso
     */
    @Override
    public Void visitPenDown(LogoParser.PenDownContext ctx) {
        this.painter.penDown();
        return super.visitPenDown(ctx);
    }
    /**
     * Metodo que se encarga del comando penUp
     * @param ctx Contexto de uso
     */
    @Override
    public Void visitPenUp(LogoParser.PenUpContext ctx) {
        this.painter.penUp();
        return super.visitPenUp(ctx);
    }
    /**
     * Metodo que se encarga del comando poncolorlapiz
     * @param ctx Contexto de uso
     *//*
    @Override
    public Void visitPoncolorlapiz(LogoParser.PoncolorlapizContext ctx) {
        this.painter.poncolorlapiz(ctx.colorExpression().getText());
        return super.visitPoncolorlapiz(ctx);
    }*/

    /**
     * Metodo que se encarga del comando ponx
     * @param ctx Contexto de uso
     *//*
    @Override
    public Void visitPonx(LogoParser.PonxContext ctx) {

        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.ponx(Integer.parseInt(var));
        return super.visitPonx(ctx);
    }
    /**
     * Metodo que se encarga del comando pony
     * @param ctx Contexto de uso
     *//*
    @Override
    public Void visitPony(LogoParser.PonyContext ctx) {
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }
        this.painter.pony(Integer.parseInt(var));
        return super.visitPony(ctx);
    }*/
    /**
     * Metodo que se encarga del comando potencia
     * @param ctx Contexto de uso
     */
    @Override
    public Void visitPotencia(LogoParser.PotenciaContext ctx) {
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
        return super.visitPotencia(ctx);
    }
    /**
     * Metodo que retorna el primer elemento de una lista
     * @param ctx Contexto de uso
     */
    @Override
    public Void visitPrimero(LogoParser.PrimeroContext ctx) {
        List<Double> list = new ArrayList<>();

        for (LogoParser.IntExpressionContext x : ctx.lista().intExpression()){
            String data = x.getText();
            if(Objects.nonNull(variables.get(data))){
                data = variables.get(data);
            }
            list.add(Double.parseDouble(data));
        }

        this.painter.primero(list);
        return super.visitPrimero(ctx);
    }
    /**
     * Metodo que se encarga del comando producto
     * @param ctx Contexto de uso
     */
    @Override
    public Void visitProducto(LogoParser.ProductoContext ctx) {
        List<Integer> numeros = new ArrayList<>();
        for (LogoParser.IntExpressionContext x: ctx.intExpression()){
            String var = x.getText();

            if(Objects.nonNull(variables.get(var))){
                var = variables.get(var);
            }

            numeros.add(Integer.parseInt(var));
        }
        this.painter.producto(numeros);

        return super.visitProducto(ctx);
    }
    /**
     * Metodo que se encarga del comando finish
     * @param ctx Contexto de uso
     */
    /*
    @Override
    public Void visitProg(LogoParser.ProgContext ctx) {
        this.painter.finish();
        return super.visitProg(ctx);
    }*/
    @Override
    public Void visitRedondea(LogoParser.RedondeaContext ctx) {
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.redondea(Double.parseDouble(var));
        System.out.println(this.painter.redondea(Double.parseDouble(var)));
        return super.visitRedondea(ctx);
    }
    /**
     * Metodo que se encarga del comando resetAngle
     * @param ctx Contexto de uso
     */
    /*
    @Override
    public Void visitResetAngle(LogoParser.ResetAngleContext ctx) {
        this.painter.resetAngle();
        return super.visitResetAngle(ctx);
    }*/
    /**
     * Metodo que se encarga del comando right
     * @param ctx Contexto de uso
     */

    @Override
    public Void visitRight(LogoParser.RightContext ctx) {
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.right(Integer.parseInt(var));
        return super.visitRight(ctx);
    }
    /**
     * Metodo que se encarga del comando Rumbo
     * @param ctx Contexto de uso
     */
    /*
    @Override
    public Void visitRumbo(LogoParser.RumboContext ctx) {
        this.painter.rumbo();
        return super.visitRumbo(ctx);
    }*/

    @Override
    public Void visitSi(LogoParser.SiContext ctx) {
       if(Boolean.parseBoolean(ctx.booleanExpression().getText())){
           int i =0;
           for (LogoParser.LogoExpressionContext x : ctx.logoExpression()) {
               this.visit(ctx.logoExpression(i));
               i++;
           }
           return null;
       }
       return visit(ctx.booleanExpression());
    }


    @Override
    public Void visitSisino(LogoParser.SisinoContext ctx) {
        if(Boolean.parseBoolean(ctx.booleanExpression().getText())){

            int i =0;

            for (LogoParser.LogoExpressionContext x : ctx.logoExpression()) {
                this.visit(ctx.logoExpression(i));
                i++;
            }
            return null;

        }
        else{

            int i =0;
            for (LogoParser.BloqExpressionContext x : ctx.bloqExpression()) {
                this.visit(ctx.bloqExpression(i).logoExpression());
                i++;
            }
            return null;//visit(ctx.logoExpression(1));


        }

        //return super.visitSisino(ctx);
    }

    /**
     * Metodo que se encarga del comando set
     * @param ctx Contexto de uso
     */

    @Override
    public Void visitSet(LogoParser.SetContext ctx) {
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
        return super.visitSet(ctx);
    }

    @Override
    public Void visitSuma(LogoParser.SumaContext ctx) {
        List<Integer> numeros = new ArrayList<>();
        for (LogoParser.IntExpressionContext x: ctx.intExpression()){
            String var = x.getText();

            if(Objects.nonNull(variables.get(var))){
                var = variables.get(var);
            }

            numeros.add(Integer.parseInt(var));
        }

        this.painter.suma(numeros);
        return super.visitSuma(ctx);
    }


    /**
     * Metodo para retornar el ultimo elemento de la lista
     * @param ctx Contexto de uso
     */
    @Override
    public Void visitUltimo(LogoParser.UltimoContext ctx) {
        List<Double> list = new ArrayList<>();

        for (LogoParser.IntExpressionContext x : ctx.lista().intExpression()){
            String data = x.getText();
            if(Objects.nonNull(variables.get(data))){
                data = variables.get(data);
            }
            list.add(Double.parseDouble(data));
        }
        this.painter.ultimo(list);
        return super.visitUltimo(ctx);
    }
    /**
     * Metodo que se encarga del comando y logico
     * @param ctx Contexto de uso
     */
    @Override
    public Void visitY(LogoParser.YContext ctx) {
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
        return super.visitY(ctx);
    }




}