package com.tec.turtle;

import com.tec.antlrturtle.LogoBaseVisitor;
import com.tec.antlrturtle.LogoParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;


public class LogoVisitor extends LogoBaseVisitor<Integer> {

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
    public Integer visitIncI(LogoParser.IncIContext ctx) {
        return painter.inc(visit(ctx.inc().intExpression().get(0)),
                visit(ctx.inc().intExpression().get(1)));
    }

    @Override
    public Integer visitElegirI(LogoParser.ElegirIContext ctx) {
        List<Double> numeros = new ArrayList<>();
        for (int x = 0; x < ctx.elegir().lista().intExpression().size() ; x++){
            int var = visit(ctx.elegir().lista().intExpression().get(x));
            numeros.add((double)var);
        }
        return (int) painter.elegir(numeros);
    }

    @Override
    public Integer visitPrimeroI(LogoParser.PrimeroIContext ctx) {
        List<Double> numeros = new ArrayList<>();
        for (int x = 0; x < ctx.primero().lista().intExpression().size() ; x++){
            int var = visit(ctx.primero().lista().intExpression().get(x));
            numeros.add((double)var);
        }
        return (int) painter.primero(numeros);
    }

    @Override
    public Integer visitElementoI(LogoParser.ElementoIContext ctx) {
        List<Double> numeros = new ArrayList<>();
        for (int x = 0; x < ctx.elemento().lista().intExpression().size() ; x++){
            int var = visit(ctx.elemento().lista().intExpression().get(x));
            numeros.add((double)var);
        }
        return (int) painter.ultimo(numeros);
    }

    @Override
    public Integer visitUltimoI(LogoParser.UltimoIContext ctx) {
        List<Double> numeros = new ArrayList<>();
        for (int x = 0; x < ctx.ultimo().lista().intExpression().size() ; x++){
            int var = visit(ctx.ultimo().lista().intExpression().get(x));
            numeros.add((double)var);
        }
        return (int) painter.ultimo(numeros);
    }

    @Override
    public Integer visitCuentaI(LogoParser.CuentaIContext ctx) {
        List<Double> numeros = new ArrayList<>();
        for (int x = 0; x < ctx.cuenta().lista().intExpression().size() ; x++){
            int var = visit(ctx.cuenta().lista().intExpression().get(x));
            numeros.add((double)var);
        }
        return this.painter.cuenta(numeros);
    }

    @Override
    public Integer visitSumaI(LogoParser.SumaIContext ctx) {
        List<Integer> numeros = new ArrayList<>();

        for (int x = 0; x < ctx.suma().intExpression().size() ; x++){

            int var = visit(ctx.suma().intExpression().get(x));

            numeros.add(var);

        }

        return this.painter.suma(numeros);
    }

    @Override
    public Integer visitRestoI(LogoParser.RestoIContext ctx) {
        return this.painter.resto(visit(ctx.resto().intExpression().get(0)),
                visit(ctx.resto().intExpression().get(1)));
    }

    @Override
    public Integer visitMenosI(LogoParser.MenosIContext ctx) {
        return painter.menos(visit(ctx.menos().intExpression()));
    }

    @Override
    public Integer visitAzarI(LogoParser.AzarIContext ctx) {
        return painter.azar(visit(ctx.azar().intExpression()));
    }

    @Override
    public Integer visitPotenciaI(LogoParser.PotenciaIContext ctx) {
        return (int) painter.potencia(visit(ctx.potencia().intExpression().get(0)),
                visit(ctx.potencia().intExpression().get(1)));
    }

    @Override
    public Integer visitDiferenciaI(LogoParser.DiferenciaIContext ctx) {
        List<Integer> numeros = new ArrayList<>();

        for (int x = 0; x < ctx.diferencia().intExpression().size() ; x++){

            int var = visit(ctx.diferencia().intExpression().get(x));

            numeros.add(var);

        }

        return this.painter.diferencia(numeros);
    }

    @Override
    public Integer visitProductoI(LogoParser.ProductoIContext ctx) {
        List<Integer> numeros = new ArrayList<>();

        for (int x = 0; x < ctx.producto().intExpression().size() ; x++){

            int var = visit(ctx.producto().intExpression().get(x));

            numeros.add(var);

        }

        return this.painter.producto(numeros);
    }

    @Override
    public Integer visitRumboI(LogoParser.RumboIContext ctx) {
        double res = this.painter.rumbo();
        return (int) res;
    }

    @Override
    public Integer visitVariableI(LogoParser.VariableIContext ctx) {
        if(variables.containsKey(ctx.ID().getText())){
            return Integer.parseInt(variables.get(ctx.ID().getText()));
        }
        return null;
    }

    @Override
    public Integer visitDivisionI(LogoParser.DivisionIContext ctx) {
        int var = visit(ctx.division().intExpression().get(0));

        int var2 = visit(ctx.division().intExpression().get(1));

        return this.painter.division(var,
                var2);
    }

    @Override
    public Integer visitRedondeaI(LogoParser.RedondeaIContext ctx) {
        return this.painter.redondea(visit(ctx.redondea().intExpression())).intValue();
    }

    @Override
    public Integer visitIntI(LogoParser.IntIContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }



    @Override
    public Integer visitRepite(LogoParser.RepiteContext ctx) {

        visit(ctx.intExpression());

        for (int x = Integer.parseInt(ctx.intExpression().getText()); x > 0 ; x-- ){
            int i =0;
            for (LogoParser.LogoExpressionContext y : ctx.logoExpression()) {
                this.visit(ctx.logoExpression(i));
                i++;
            }
        }
        return null;
    }

    @Override
    public Integer visitAzar(LogoParser.AzarContext ctx) {
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

        this.painter.azar(Integer.parseInt(var));
        return super.visitAzar(ctx);
    }

    @Override
    public Integer visitBack(LogoParser.BackContext ctx) {
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
    public Integer visitCuenta(LogoParser.CuentaContext ctx) {
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
    public Integer visitDiferencia(LogoParser.DiferenciaContext ctx) {
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
    public Integer visitDivision(LogoParser.DivisionContext ctx) {

        int var = visit(ctx.intExpression().get(0));

        int var2 = visit(ctx.intExpression().get(1));

        /*
        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }



        if(Objects.nonNull(variables.get(var2))){
            var2 = variables.get(var2);
        }

         */

        return this.painter.division(var,
                var2);

    }

    @Override
    public Integer visitElegir(LogoParser.ElegirContext ctx) {
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
    public Integer visitElemento(LogoParser.ElementoContext ctx) {
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
    public Integer visitForward(LogoParser.ForwardContext ctx) {
        String var = ctx.intExpression().getText();

        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }
        this.painter.forward(Integer.parseInt(var));
        return null;
    }

    @Override
    public Integer visitGoma(LogoParser.GomaContext ctx) {
        this.painter.goma();
        return super.visitGoma(ctx);
    }
    @Override
    public Integer visitHaz(LogoParser.HazContext ctx) {
        String value = ctx.variableExpression().getText();
        variables.put(ctx.ID().getText(), value);
        return super.visitHaz(ctx);
    }
    @Override
    public Integer visitHaz2(LogoParser.Haz2Context ctx) {
        variables.put(ctx.ID().getText(), null);
        return super.visitHaz2(ctx);
    }
    @Override
    public Integer visitIguales(LogoParser.IgualesContext ctx) {
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
    public Integer visitInc(LogoParser.IncContext ctx) {
        boolean variable = false;
        visit(ctx.intExpression().get(0));
        visit(ctx.intExpression().get(1));
        String var = ctx.intExpression().get(0).getText();
        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
            variable = true;
        }
        String rep = ctx.intExpression().get(1).getText();
        if(Objects.nonNull(variables.get(rep))){
            rep = variables.get(rep);
        }

        int res = this.painter.inc(Integer.parseInt(var), Integer.parseInt(rep));
        if(variable){
            variables.put(var, res + "");
        }

        return super.visitInc(ctx);
    }

    @Override
    public Integer visitInic(LogoParser.InicContext ctx) {
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
    public Integer visitLeft(LogoParser.LeftContext ctx) {
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
    public Integer visitMayorque(LogoParser.MayorqueContext ctx) {
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
    public Integer visitMenorque(LogoParser.MenorqueContext ctx) {
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
    public Integer visitMenos(LogoParser.MenosContext ctx) {
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
    public Integer visitO(LogoParser.OContext ctx) {
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
    public Integer visitPenDown(LogoParser.PenDownContext ctx) {
        this.painter.penDown();
        return super.visitPenDown(ctx);
    }
    /**
     * Metodo que se encarga del comando penUp
     * @param ctx Contexto de uso
     */
    @Override
    public Integer visitPenUp(LogoParser.PenUpContext ctx) {
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
    public Integer visitPotencia(LogoParser.PotenciaContext ctx) {
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
    public Integer visitPrimero(LogoParser.PrimeroContext ctx) {
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
    public Integer visitProducto(LogoParser.ProductoContext ctx) {
        List<Integer> numeros = new ArrayList<>();
        for (LogoParser.IntExpressionContext x: ctx.intExpression()){

            this.visit(x);

            String var = x.getText();

            if(Objects.nonNull(variables.get(var))){
                var = variables.get(var);
            }

            numeros.add(Integer.parseInt(var));
        }

        return this.painter.producto(numeros);
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
    public Integer visitRedondea(LogoParser.RedondeaContext ctx) {

        this.visit(ctx.intExpression());

        String var = ctx.intExpression().getText();

        /*
        if(Objects.nonNull(variables.get(var))){
            var = variables.get(var);
        }

         */

        return this.painter.redondea(Double.parseDouble(var)).intValue();
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
    public Integer visitRight(LogoParser.RightContext ctx) {
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
    public Integer visitSi(LogoParser.SiContext ctx) {
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
    public Integer visitSisino(LogoParser.SisinoContext ctx) {
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
    public Integer visitSet(LogoParser.SetContext ctx) {
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
    public Integer visitSuma(LogoParser.SumaContext ctx) {
        List<Integer> numeros = new ArrayList<>();
        for (LogoParser.IntExpressionContext x: ctx.intExpression()){
            this.visit(x);
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
    public Integer visitUltimo(LogoParser.UltimoContext ctx) {
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
    public Integer visitY(LogoParser.YContext ctx) {
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