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

    @Override
    public Integer visitPoncolorlapiz(LogoParser.PoncolorlapizContext ctx) {
        this.painter.poncolorlapiz(ctx.colorExpression().getText());
        return null;
    }

    @Override
    public Integer visitRumbo(LogoParser.RumboContext ctx) {
        return (int) this.painter.rumbo();
    }

    @Override
    public Integer visitResetAngle(LogoParser.ResetAngleContext ctx) {
        this.painter.resetAngle();
        return null;
    }

    @Override
    public Integer visitClearscreen(LogoParser.ClearscreenContext ctx) {
        this.painter.cls();
        return null;
    }

    @Override
    public Integer visitPonrumbo(LogoParser.PonrumboContext ctx) {
        this.painter.ponRumbo(visit(ctx.intExpression()));

        return null;
    }

    @Override
    public Integer visitPony(LogoParser.PonyContext ctx) {
        int var = visit(ctx.intExpression());

        this.painter.pony(var);

        return null;
    }

    @Override
    public Integer visitPonx(LogoParser.PonxContext ctx) {
        int var = visit(ctx.intExpression());

        this.painter.ponx(var);

        return null;
    }

    @Override
    public Integer visitEspera(LogoParser.EsperaContext ctx) {
        int var = visit(ctx.intExpression());

        painter.espera(var);

        return null;

    }

    @Override
    public Integer visitCentro(LogoParser.CentroContext ctx) {
        this.painter.centro();
        return null;
    }

    @Override
    public Integer visitAparecetortuga(LogoParser.AparecetortugaContext ctx) {
        painter.aparecer();
        return null;
    }

    @Override
    public Integer visitOcultatortuga(LogoParser.OcultatortugaContext ctx) {
        this.painter.ocultar();
        return null;
    }

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

        for (int x = visit(ctx.intExpression()); x > 0 ; x-- ){
            for (int i = 0; i < ctx.logoExpression().size(); i++) {
                this.visit(ctx.logoExpression(i));
                i++;
            }
        }
        return null;
    }

    @Override
    public Integer visitAzar(LogoParser.AzarContext ctx) {
        this.painter.azar(visit(ctx.intExpression()));
        return super.visitAzar(ctx);
    }

    @Override
    public Integer visitBack(LogoParser.BackContext ctx) {
        this.painter.back(visit(ctx.intExpression()));
        return null;
    }

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
        List<Integer> numeros = new ArrayList<>();

        for (int x = 0; x < ctx.intExpression().size() ; x++){

            int var = visit(ctx.intExpression().get(x));

            numeros.add(var);

        }

        return this.painter.diferencia(numeros);
    }

    @Override
    public Integer visitDivision(LogoParser.DivisionContext ctx) {

        int var = visit(ctx.intExpression().get(0));

        int var2 = visit(ctx.intExpression().get(1));

        return this.painter.division(var,
                var2);

    }

    @Override
    public Integer visitElegir(LogoParser.ElegirContext ctx) {
        List<Double> numeros = new ArrayList<>();
        for (int x = 0; x < ctx.lista().intExpression().size() ; x++){
            int var = visit(ctx.lista().intExpression().get(x));
            numeros.add((double)var);
        }
        return (int) painter.elegir(numeros);
    }

    @Override
    public Integer visitElemento(LogoParser.ElementoContext ctx) {
        List<Double> numeros = new ArrayList<>();
        for (int x = 0; x < ctx.lista().intExpression().size() ; x++){
            int var = visit(ctx.lista().intExpression().get(x));
            numeros.add((double)var);
        }
        return (int) painter.ultimo(numeros);
    }

    @Override
    public Integer visitForward(LogoParser.ForwardContext ctx) {
        this.painter.forward(visit(ctx.intExpression()));
        return null;
    }

    @Override
    public Integer visitGoma(LogoParser.GomaContext ctx) {
        this.painter.goma();
        return null;
    }
    @Override
    public Integer visitHaz(LogoParser.HazContext ctx) {
        Integer value = visit(ctx.intExpression());
        if(Objects.nonNull(value)){
            variables.put(ctx.ID().getText(), value + "");
        }
        return null;
    }
    @Override
    public Integer visitHaz2(LogoParser.Haz2Context ctx) {
        variables.put(ctx.ID().getText(), null);
        return null;
    }
    @Override
    public Integer visitIguales(LogoParser.IgualesContext ctx) {
        this.painter.iguales(visit(ctx.intExpression().get(0)),
                visit(ctx.intExpression().get(1)));
        return null;
    }

    @Override
    public Integer visitInc(LogoParser.IncContext ctx) {
        return painter.inc(visit(ctx.intExpression().get(0)),
                visit(ctx.intExpression().get(1)));
    }

    @Override
    public Integer visitInic(LogoParser.InicContext ctx) {

        Integer value = visit(ctx.intExpression());
        if(Objects.nonNull(value)){
            variables.put(ctx.ID().getText(), value + "");
        }

        return null;
    }


    /**
     * Metodo que se encarga del comando left
     * @param ctx Contexto de uso
     */
    @Override
    public Integer visitLeft(LogoParser.LeftContext ctx) {
        this.painter.left(visit(ctx.intExpression()));
        return super.visitLeft(ctx);
    }

    /**
     * Metodo que se encarga del comando mayorque
     * @param ctx Contexto de uso
     */
    @Override
    public Integer visitMayorque(LogoParser.MayorqueContext ctx) {
        this.painter.mayorque(visit(ctx.intExpression().get(0)),
                visit(ctx.intExpression().get(1)));
        return null;
    }
    /**
     * Metodo que se encarga del comando menorque
     * @param ctx Contexto de uso
     */
    @Override
    public Integer visitMenorque(LogoParser.MenorqueContext ctx) {
        this.painter.menorque(visit(ctx.intExpression().get(0)),
                visit(ctx.intExpression().get(1)));
        return null;
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

        return null;
    }

    /**
     * Metodo que se encarga del comando penDown
     * @param ctx Contexto de uso
     */
    @Override
    public Integer visitPenDown(LogoParser.PenDownContext ctx) {
        this.painter.penDown();
        return null;
    }
    /**
     * Metodo que se encarga del comando penUp
     * @param ctx Contexto de uso
     */
    @Override
    public Integer visitPenUp(LogoParser.PenUpContext ctx) {
        this.painter.penUp();
        return null;
    }

    /**
     * Metodo que se encarga del comando potencia
     * @param ctx Contexto de uso
     */
    @Override
    public Integer visitPotencia(LogoParser.PotenciaContext ctx) {
        return (int) painter.potencia(visit(ctx.intExpression().get(0)),
                visit(ctx.intExpression().get(1)));
    }
    /**
     * Metodo que retorna el primer elemento de una lista
     * @param ctx Contexto de uso
     */
    @Override
    public Integer visitPrimero(LogoParser.PrimeroContext ctx) {
        List<Double> numeros = new ArrayList<>();
        for (int x = 0; x < ctx.lista().intExpression().size() ; x++){
            int var = visit(ctx.lista().intExpression().get(x));
            numeros.add((double)var);
        }
        return (int) painter.primero(numeros);
    }
    /**
     * Metodo que se encarga del comando producto
     * @param ctx Contexto de uso
     */
    @Override
    public Integer visitProducto(LogoParser.ProductoContext ctx) {
        List<Integer> numeros = new ArrayList<>();

        for (int x = 0; x < ctx.intExpression().size() ; x++){

            int var = visit(ctx.intExpression().get(x));

            numeros.add(var);

        }

        return this.painter.producto(numeros);
    }

    @Override
    public Integer visitRedondea(LogoParser.RedondeaContext ctx) {
        return this.painter.redondea(visit(ctx.intExpression())).intValue();
    }
    /**
     * Metodo que se encarga del comando right
     * @param ctx Contexto de uso
     */

    @Override
    public Integer visitRight(LogoParser.RightContext ctx) {
        this.painter.right(visit(ctx.intExpression()));
        System.out.println("giraderecha " + visit(ctx.intExpression()));
        return null;
    }

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
            return null;


        }
    }

    /**
     * Metodo que se encarga del comando set
     * @param ctx Contexto de uso
     */

    @Override
    public Integer visitSet(LogoParser.SetContext ctx) {

        System.out.println(ctx.intExpression().get(0));
        System.out.println(ctx.intExpression().get(0));

        int x = visit(ctx.intExpression().get(0));
        int y = visit(ctx.intExpression().get(1));

        this.painter.set(x, y);
        return super.visitSet(ctx);
    }

    @Override
    public Integer visitSuma(LogoParser.SumaContext ctx) {
        List<Integer> numeros = new ArrayList<>();

        for (int x = 0; x < ctx.intExpression().size() ; x++){

            int var = visit(ctx.intExpression().get(x));

            numeros.add(var);

        }

        return this.painter.suma(numeros);
    }


    /**
     * Metodo para retornar el ultimo elemento de la lista
     * @param ctx Contexto de uso
     */
    @Override
    public Integer visitUltimo(LogoParser.UltimoContext ctx) {
        List<Double> list = new ArrayList<>();

        for (int x = 0; x < ctx.lista().intExpression().size(); x++){
            int var = visit(ctx.lista().intExpression().get(x));
            list.add((double)var);
        }
        return (int) this.painter.ultimo(list);
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