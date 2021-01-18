package com.tec.turtle;

import com.tec.antlrturtle.LogoBaseVisitor;
import com.tec.antlrturtle.LogoParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * Clase {@link LogoVisitor} que se encarga de recibir las llamadas del parser y delega
 * la ejecucion de los comandos al {@code painter}
 */
public class LogoVisitor extends LogoBaseVisitor<Integer> {

    /**
     * Variable usada para mantener las variables del programa
     */
    private final HashMap<String, String> variables = new HashMap<>();

    /**
     * Variable que se encarga de dibujar en el canvas
     */
    private final TurtlePainter painter;

    /**
     * Constructor de la clase LogoVisitor
     * @param painter Variable que se encarga de dibujar en el canvas
     */
    public LogoVisitor(TurtlePainter painter) {
        this.painter = painter;
    }

    /**
     * Metodo que se encarga del comando visitTrueB
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitTrueB
     */
    @Override
    public Integer visitTrueB(LogoParser.TrueBContext ctx) {
        return 1;
    }

    /**
     * Metodo que se encarga del comando visitFalseB
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitFalseB
     */
    @Override
    public Integer visitFalseB(LogoParser.FalseBContext ctx) {
        return 0;
    }

    /**
     * Metodo que se encarga del comando visitO
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitO
     */
    @Override
    public Integer visitO(LogoParser.OContext ctx) {
        int value = visit(ctx.booleanExpression().get(0));
        int value2 = visit(ctx.booleanExpression().get(1));

        boolean valueB = false;

        boolean valueB2 = false;

        if(value == 1){
            valueB = true;
        }
        if(value2 == 1){
            valueB2 = true;
        }

        boolean res = this.painter.o(valueB, valueB2);
        int resB = 0;
        if(res){
            resB = 1;
        }
        return resB;
    }

    /**
     * Metodo que se encarga del comando visitY
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitY
     */
    @Override
    public Integer visitY(LogoParser.YContext ctx) {
        int value = visit(ctx.booleanExpression().get(0));
        int value2 = visit(ctx.booleanExpression().get(1));

        boolean valueB = false;

        boolean valueB2 = false;

        if(value == 1){
            valueB = true;
        }
        if(value2 == 1){
            valueB2 = true;
        }

        boolean res = this.painter.y(valueB, valueB2);
        int resB = 0;
        if(res){
            resB = 1;
        }
        return resB;
    }

    /**
     * Metodo que se encarga del comando visitOB
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitOB
     */
    @Override
    public Integer visitOB(LogoParser.OBContext ctx) {
        int value = visit(ctx.o().booleanExpression().get(0));
        int value2 = visit(ctx.o().booleanExpression().get(1));

        boolean valueB = false;

        boolean valueB2 = false;

        if(value == 1){
            valueB = true;
        }
        if(value2 == 1){
            valueB2 = true;
        }

        boolean res = this.painter.o(valueB, valueB2);
        int resB = 0;
        if(res){
            resB = 1;
        }
        return resB;
    }

    /**
     * Metodo que se encarga del comando visitYB
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitYB
     */
    @Override
    public Integer visitYB(LogoParser.YBContext ctx) {
        int value = visit(ctx.y().booleanExpression().get(0));
        int value2 = visit(ctx.y().booleanExpression().get(1));

        boolean valueB = false;

        boolean valueB2 = false;

        if(value == 1){
            valueB = true;
        }
        if(value2 == 1){
            valueB2 = true;
        }

        boolean res = this.painter.y(valueB, valueB2);
        int resB = 0;
        if(res){
            resB = 1;
        }
        return resB;
    }

    /**
     * Metodo que se encarga del comando visitMayorQueB
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitMayorQueB
     */
    @Override
    public Integer visitMayorQueB(LogoParser.MayorQueBContext ctx) {
        boolean value = this.painter.mayorque(visit(ctx.mayorque().intExpression().get(0)),
                visit(ctx.mayorque().intExpression().get(1)));
        if(value){
            return 1;
        }else{
            return 0;
        }
    }

    /**
     * Metodo que se encarga del comando visitMenorQueB
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitMenorQueB
     */
    @Override
    public Integer visitMenorQueB(LogoParser.MenorQueBContext ctx) {
        boolean value = this.painter.menorque(visit(ctx.menorque().intExpression().get(0)),
                visit(ctx.menorque().intExpression().get(1)));
        if(value){
            return 1;
        }else{
            return 0;
        }
    }

    /**
     * Metodo que se encarga del comando visitMayorque
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitMayorque
     */
    @Override
    public Integer visitMayorque(LogoParser.MayorqueContext ctx) {
        boolean value = this.painter.mayorque(visit(ctx.intExpression().get(0)),
                visit(ctx.intExpression().get(1)));
        if(value){
            return 1;
        }else{
            return 0;
        }
    }

    /**
     * Metodo que se encarga del comando visitMenorque
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitMenorque
     */
    @Override
    public Integer visitMenorque(LogoParser.MenorqueContext ctx) {
        boolean value = this.painter.menorque(visit(ctx.intExpression().get(0)),
                visit(ctx.intExpression().get(1)));
        if(value){
            return 1;
        }else{
            return 0;
        }
    }

    /**
     * Metodo que se encarga del comando visitPoncolorlapiz
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitPoncolorlapiz
     */
    @Override
    public Integer visitPoncolorlapiz(LogoParser.PoncolorlapizContext ctx) {
        this.painter.poncolorlapiz(ctx.colorExpression().getText());
        return null;
    }

    /**
     * Metodo que se encarga del comando visitRumbo
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitRumbo
     */
    @Override
    public Integer visitRumbo(LogoParser.RumboContext ctx) {
        return (int) this.painter.rumbo();
    }

    /**
     * Metodo que se encarga del comando visitResetAngle
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitResetAngle
     */
    @Override
    public Integer visitResetAngle(LogoParser.ResetAngleContext ctx) {
        this.painter.resetAngle();
        return null;
    }

    /**
     * Metodo que se encarga del comando visitBorrapantalla
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitBorrapantalla
     */
    @Override
    public Integer visitBorrapantalla(LogoParser.BorrapantallaContext ctx) {
        this.painter.borrapantalla();
        return null;
    }

    /**
     * Metodo que se encarga del comando visitPonrumbo
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitPonrumbo
     */
    @Override
    public Integer visitPonrumbo(LogoParser.PonrumboContext ctx) {
        this.painter.ponRumbo(visit(ctx.intExpression()));
        return null;
    }

    /**
     * Metodo que se encarga del comando visitPony
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitPony
     */
    @Override
    public Integer visitPony(LogoParser.PonyContext ctx) {
        int var = visit(ctx.intExpression());

        this.painter.pony(var);

        return null;
    }

    /**
     * Metodo que se encarga del comando visitPonx
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitPonx
     */
    @Override
    public Integer visitPonx(LogoParser.PonxContext ctx) {
        int var = visit(ctx.intExpression());

        this.painter.ponx(var);

        return null;
    }

    /**
     * Metodo que se encarga del comando visitEspera
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitEspera
     */
    @Override
    public Integer visitEspera(LogoParser.EsperaContext ctx) {
        int var = visit(ctx.intExpression());

        painter.espera(var);

        return null;

    }

    /**
     * Metodo que se encarga del comando visitCentro
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitCentro
     */
    @Override
    public Integer visitCentro(LogoParser.CentroContext ctx) {
        this.painter.centro();
        return null;
    }

    /**
     * Metodo que se encarga del comando visitAparecetortuga
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitAparecetortuga
     */
    @Override
    public Integer visitAparecetortuga(LogoParser.AparecetortugaContext ctx) {
        painter.aparecer();
        return null;
    }

    /**
     * Metodo que se encarga del comando visitOcultatortuga
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitOcultatortuga
     */
    @Override
    public Integer visitOcultatortuga(LogoParser.OcultatortugaContext ctx) {
        this.painter.ocultar();
        return null;
    }

    /**
     * Metodo que se encarga del comando visitIncI
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitIncI
     */
    @Override
    public Integer visitIncI(LogoParser.IncIContext ctx) {
        return painter.inc(visit(ctx.inc().intExpression().get(0)),
                visit(ctx.inc().intExpression().get(1)));
    }

    /**
     * Metodo que se encarga del comando visitElegirI
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitElegirI
     */
    @Override
    public Integer visitElegirI(LogoParser.ElegirIContext ctx) {
        List<Double> numeros = new ArrayList<>();
        for (int x = 0; x < ctx.elegir().lista().intExpression().size() ; x++){
            int var = visit(ctx.elegir().lista().intExpression().get(x));
            numeros.add((double)var);
        }
        return (int) painter.elegir(numeros);
    }

    /**
     * Metodo que se encarga del comando visitPrimeroI
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitPrimeroI
     */
    @Override
    public Integer visitPrimeroI(LogoParser.PrimeroIContext ctx) {
        List<Double> numeros = new ArrayList<>();
        for (int x = 0; x < ctx.primero().lista().intExpression().size() ; x++){
            int var = visit(ctx.primero().lista().intExpression().get(x));
            numeros.add((double)var);
        }
        return (int) painter.primero(numeros);
    }

    /**
     * Metodo que se encarga del comando visitElementoI
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitElementoI
     */
    @Override
    public Integer visitElementoI(LogoParser.ElementoIContext ctx) {
        List<Double> numeros = new ArrayList<>();
        for (int x = 0; x < ctx.elemento().lista().intExpression().size() ; x++){
            int var = visit(ctx.elemento().lista().intExpression().get(x));
            numeros.add((double)var);
        }
        return (int) painter.elemento(numeros, visit(ctx.elemento().intExpression()));
    }

    /**
     * Metodo que se encarga del comando visitUltimoI
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitUltimoI
     */
    @Override
    public Integer visitUltimoI(LogoParser.UltimoIContext ctx) {
        List<Double> numeros = new ArrayList<>();
        for (int x = 0; x < ctx.ultimo().lista().intExpression().size() ; x++){
            int var = visit(ctx.ultimo().lista().intExpression().get(x));
            numeros.add((double)var);
        }
        return (int) painter.ultimo(numeros);
    }

    /**
     * Metodo que se encarga del comando visitCuentaI
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitCuentaI
     */
    @Override
    public Integer visitCuentaI(LogoParser.CuentaIContext ctx) {
        List<Double> numeros = new ArrayList<>();
        for (int x = 0; x < ctx.cuenta().lista().intExpression().size() ; x++){
            int var = visit(ctx.cuenta().lista().intExpression().get(x));
            numeros.add((double)var);
        }
        return this.painter.cuenta(numeros);
    }

    /**
     * Metodo que se encarga del comando visitSumaI
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitSumaI
     */
    @Override
    public Integer visitSumaI(LogoParser.SumaIContext ctx) {
        List<Integer> numeros = new ArrayList<>();

        for (int x = 0; x < ctx.suma().intExpression().size() ; x++){
            int var = visit(ctx.suma().intExpression().get(x));
            numeros.add(var);
        }

        return this.painter.suma(numeros);
    }

    /**
     * Metodo que se encarga del comando visitRestoI
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitRestoI
     */
    @Override
    public Integer visitRestoI(LogoParser.RestoIContext ctx) {
        return this.painter.resto(visit(ctx.resto().intExpression().get(0)),
                visit(ctx.resto().intExpression().get(1)));
    }

    /**
     * Metodo que se encarga del comando visitMenosI
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitMenosI
     */
    @Override
    public Integer visitMenosI(LogoParser.MenosIContext ctx) {
        return painter.menos(visit(ctx.menos().intExpression()));
    }

    /**
     * Metodo que se encarga del comando visitAzarI
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitAzarI
     */
    @Override
    public Integer visitAzarI(LogoParser.AzarIContext ctx) {
        return painter.azar(visit(ctx.azar().intExpression()));
    }

    /**
     * Metodo que se encarga del comando visitPotenciaI
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitPotenciaI
     */
    @Override
    public Integer visitPotenciaI(LogoParser.PotenciaIContext ctx) {
        return (int) painter.potencia(visit(ctx.potencia().intExpression().get(0)),
                visit(ctx.potencia().intExpression().get(1)));
    }

    /**
     * Metodo que se encarga del comando visitDiferenciaI
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitDiferenciaI
     */
    @Override
    public Integer visitDiferenciaI(LogoParser.DiferenciaIContext ctx) {
        List<Integer> numeros = new ArrayList<>();

        for (int x = 0; x < ctx.diferencia().intExpression().size() ; x++){
            int var = visit(ctx.diferencia().intExpression().get(x));
            numeros.add(var);
        }

        return this.painter.diferencia(numeros);
    }

    /**
     * Metodo que se encarga del comando visitProductoI
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitProductoI
     */
    @Override
    public Integer visitProductoI(LogoParser.ProductoIContext ctx) {
        List<Integer> numeros = new ArrayList<>();

        for (int x = 0; x < ctx.producto().intExpression().size() ; x++){
            int var = visit(ctx.producto().intExpression().get(x));
            numeros.add(var);
        }

        return this.painter.producto(numeros);
    }

    /**
     * Metodo que se encarga del comando visitRumboI
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitRumboI
     */
    @Override
    public Integer visitRumboI(LogoParser.RumboIContext ctx) {
        double res = this.painter.rumbo();
        return (int) res;
    }

    /**
     * Metodo que se encarga del comando visitVariableI
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitVariableI
     */
    @Override
    public Integer visitVariableI(LogoParser.VariableIContext ctx) {
        if(variables.containsKey(ctx.ID().getText())){
            return Integer.parseInt(variables.get(ctx.ID().getText()));
        }
        return null;
    }

    /**
     * Metodo que se encarga del comando visitDivisionI
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitDivisionI
     */
    @Override
    public Integer visitDivisionI(LogoParser.DivisionIContext ctx) {
        int var = visit(ctx.division().intExpression().get(0));
        int var2 = visit(ctx.division().intExpression().get(1));

        return this.painter.division(var, var2);
    }

    /**
     * Metodo que se encarga del comando visitRedondeaI
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitRedondeaI
     */
    @Override
    public Integer visitRedondeaI(LogoParser.RedondeaIContext ctx) {
        return this.painter.redondea(visit(ctx.redondea().intExpression())).intValue();
    }

    /**
     * Metodo que se encarga del comando visitIntI
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitIntI
     */
    @Override
    public Integer visitIntI(LogoParser.IntIContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    /**
     * Metodo que se encarga del comando visitRepite
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitRepite
     */
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

    /**
     * Metodo que se encarga del comando visitAzar
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitAzar
     */
    @Override
    public Integer visitAzar(LogoParser.AzarContext ctx) {
        this.painter.azar(visit(ctx.intExpression()));
        return super.visitAzar(ctx);
    }

    /**
     * Metodo que se encarga del comando visitRetrocede
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitRetrocede
     */
    @Override
    public Integer visitRetrocede(LogoParser.RetrocedeContext ctx) {
        this.painter.retrocede(visit(ctx.intExpression()));
        return null;
    }

    /**
     * Metodo que se encarga del comando visitCuenta
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitCuenta
     */
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

    /**
     * Metodo que se encarga del comando visitDiferencia
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitDiferencia
     */
    @Override
    public Integer visitDiferencia(LogoParser.DiferenciaContext ctx) {
        List<Integer> numeros = new ArrayList<>();

        for (int x = 0; x < ctx.intExpression().size() ; x++){
            int var = visit(ctx.intExpression().get(x));
            numeros.add(var);
        }

        return this.painter.diferencia(numeros);
    }

    /**
     * Metodo que se encarga del comando visitDivision
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitDivision
     */
    @Override
    public Integer visitDivision(LogoParser.DivisionContext ctx) {
        int var = visit(ctx.intExpression().get(0));
        int var2 = visit(ctx.intExpression().get(1));

        return this.painter.division(var, var2);
    }

    /**
     * Metodo que se encarga del comando visitElegir
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitElegir
     */
    @Override
    public Integer visitElegir(LogoParser.ElegirContext ctx) {
        List<Double> numeros = new ArrayList<>();

        for (int x = 0; x < ctx.lista().intExpression().size() ; x++){
            int var = visit(ctx.lista().intExpression().get(x));
            numeros.add((double)var);
        }
        return (int) painter.elegir(numeros);
    }

    /**
     * Metodo que se encarga del comando visitElemento
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitElemento
     */
    @Override
    public Integer visitElemento(LogoParser.ElementoContext ctx) {
        List<Double> numeros = new ArrayList<>();

        for (int x = 0; x < ctx.lista().intExpression().size() ; x++){
            int var = visit(ctx.lista().intExpression().get(x));
            numeros.add((double)var);
        }
        return (int) painter.elemento(numeros, visit(ctx.intExpression()));
    }

    /**
     * Metodo que se encarga del comando visitAvanza
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitAvanza
     */
    @Override
    public Integer visitAvanza(LogoParser.AvanzaContext ctx) {
        this.painter.avanza(visit(ctx.intExpression()));
        return null;
    }

    /**
     * Metodo que se encarga del comando visitGoma
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitGoma
     */
    @Override
    public Integer visitGoma(LogoParser.GomaContext ctx) {
        this.painter.goma();
        return null;
    }

    /**
     * Metodo que se encarga del comando visitHaz
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitHaz
     */
    @Override
    public Integer visitHaz(LogoParser.HazContext ctx) {
        Integer value = visit(ctx.intExpression());

        if(Objects.nonNull(value)){
            variables.put(ctx.ID().getText(), value + "");
        }
        return null;
    }

    /**
     * Metodo que se encarga del comando visitHaz2
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitHaz2
     */
    @Override
    public Integer visitHaz2(LogoParser.Haz2Context ctx) {
        variables.put(ctx.ID().getText(), null);
        return null;
    }

    /**
     * Metodo que se encarga del comando visitIguales
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitIguales
     */
    @Override
    public Integer visitIguales(LogoParser.IgualesContext ctx) {
        int result;

        if(this.painter.iguales(visit(ctx.intExpression().get(0)),
                visit(ctx.intExpression().get(1)))){
            result = 1;
        }else{
            result = 0;
        }
        return result;
    }

    /**
     * Metodo que se encarga del comando visitInc
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitInc
     */
    @Override
    public Integer visitInc(LogoParser.IncContext ctx) {
        return painter.inc(visit(ctx.intExpression().get(0)),
                visit(ctx.intExpression().get(1)));
    }

    /**
     * Metodo que se encarga del comando visitInic
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitInic
     */
    @Override
    public Integer visitInic(LogoParser.InicContext ctx) {
        Integer value = visit(ctx.intExpression());

        if(Objects.nonNull(value)){
            variables.put(ctx.ID().getText(), value + "");
        }
        return null;
    }

    /**
     * Metodo que se encarga del comando visitGiraIzquierda
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitGiraIzquierda
     */
    @Override
    public Integer visitGiraizquierda(LogoParser.GiraizquierdaContext ctx) {
        this.painter.giraizquierda(visit(ctx.intExpression()));
        return super.visitGiraizquierda(ctx);
    }

    /**
     * Metodo que se encarga del comando visitMenos
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitMenos
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
     * Metodo que se encarga del comando visitBajalapiz
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitBajalapiz
     */
    @Override
    public Integer visitBajalapiz(LogoParser.BajalapizContext ctx) {
        this.painter.bajalapiz();
        return null;
    }

    /**
     * Metodo que se encarga del comando visitSubelapiz
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitSubelapiz
     */
    @Override
    public Integer visitSubelapiz(LogoParser.SubelapizContext ctx) {
        this.painter.subelapiz();
        return null;
    }

    /**
     * Metodo que se encarga del comando visitPotencia
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitPotencia
     */
    @Override
    public Integer visitPotencia(LogoParser.PotenciaContext ctx) {
        return (int) painter.potencia(visit(ctx.intExpression().get(0)),
                visit(ctx.intExpression().get(1)));
    }

    /**
     * Metodo que se encarga del comando visitPrimero
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitPrimero
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
     * Metodo que se encarga del comando visitProducto
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitProducto
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

    /**
     * Metodo que se encarga del comando visitRedondea
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitRedondea
     */
    @Override
    public Integer visitRedondea(LogoParser.RedondeaContext ctx) {
        return this.painter.redondea(visit(ctx.intExpression())).intValue();
    }

    /**
     * Metodo que se encarga del comando visitGiraDerecha
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitGiraDerecha
     */
    @Override
    public Integer visitGiraderecha(LogoParser.GiraderechaContext ctx) {
        this.painter.giraderecha(visit(ctx.intExpression()));
        return null;
    }

    /**
     * Metodo que se encarga del comando visitSi
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitSi
     */
    @Override
    public Integer visitSi(LogoParser.SiContext ctx) {
        //Obtener el booleando a partir de enteros (0 == false; 1 == true)
        int boolI = visit(ctx.booleanExpression());
        boolean bool = false;
        if(boolI == 1){
            bool = true;
        }
        //Realizar condicional u operaciones iteradas
       if(bool){
           for (int i = 0; i < ctx.logoExpression().size() ; i ++) {
               this.visit(ctx.logoExpression().get(i));
           }
       }
       return null;
    }

    /**
     * Metodo que se encarga del comando visitSisino
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitSisino
     */
    @Override
    public Integer visitSisino(LogoParser.SisinoContext ctx) {
        int boolI = visit(ctx.booleanExpression());
        boolean bool = false;
        if(boolI == 1){
            bool = true;
        }
        //Realizar condicional u operaciones iteradas
        if(bool){
            for (int i = 0; i < ctx.logoExpression().size() ; i ++) {
                this.visit(ctx.logoExpression().get(i));
            }
        }
        else{
            int i =0;
            for (LogoParser.BloqExpressionContext x : ctx.bloqExpression()) {
                this.visit(ctx.bloqExpression(i).logoExpression());
                i++;
            }
        }
        return null;
    }

    /**
     * Metodo que se encarga del comando visitPonxy
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitPonxy
     */
    @Override
    public Integer visitPonxy(LogoParser.PonxyContext ctx) {
        int x = visit(ctx.intExpression().get(0));
        int y = visit(ctx.intExpression().get(1));

        this.painter.ponxy(x, y);
        return super.visitPonxy(ctx);
    }

    /**
     * Metodo que se encarga del comando visitSuma
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitSuma
     */
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
     * Metodo que se encarga del comando visitUltimo
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitUltimo
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
     * Metodo que se encarga del comando visitHasta
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitHasta
     */
    @Override
    public Integer visitHasta(LogoParser.HastaContext ctx) {
        //Obtener el booleando a partir de enteros (0 == false; 1 == true)
        boolean bool = true;
        while(bool){
            int boolI = visit(ctx.booleanExpression());
            if(boolI == 0){
                bool = true;
                if(bool){
                    for(int i = 0 ; i < ctx.logoExpression().size(); i++){
                        this.visit(ctx.logoExpression().get(i));
                    }
                }
            }else{
                bool = false;
            }
        }
        return null;
    }

    /**
     * Metodo que se encarga del comando visitMientras
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitMientras
     */
    @Override
    public Integer visitMientras(LogoParser.MientrasContext ctx) {
        boolean bool = true;
        while(bool){
            int boolI = visit(ctx.booleanExpression());
            if(boolI == 1){
                bool = true;
                if(bool){
                    for(int i = 0 ; i < ctx.logoExpression().size(); i++){
                        this.visit(ctx.logoExpression().get(i));
                    }
                }
            }else{
                bool = false;
            }
        }
        return null;
    }

    /**
     * Metodo que se encarga del comando visitHazhasta
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitHazhasta
     */
    @Override
    public Integer visitHazhasta(LogoParser.HazhastaContext ctx) {
        boolean bool = true;
        for(int i = 0 ; i < ctx.logoExpression().size(); i++){
            this.visit(ctx.logoExpression().get(i));
        }
        while(bool){
            int boolI = visit(ctx.booleanExpression());
            if(boolI == 0){
                bool = true;
                if(bool){
                    for(int i = 0 ; i < ctx.logoExpression().size(); i++){
                        this.visit(ctx.logoExpression().get(i));}
                    }
            }else{
                bool = false;
            }
        }
        return null;
    }

    /**
     * Metodo que se encarga del comando visitHazmientras
     * @param ctx Contexto de uso
     * @return Resultado de ejecución del metodo visitHazmientras
     */
    @Override
    public Integer visitHazmientras(LogoParser.HazmientrasContext ctx) {
        boolean bool = true;
        for(int i = 0 ; i < ctx.logoExpression().size(); i++){
            this.visit(ctx.logoExpression().get(i));
        }
        while(bool){
            int boolI = visit(ctx.booleanExpression());
            if(boolI == 1){
                bool = true;
                for(int i = 0 ; i < ctx.logoExpression().size(); i++){
                    this.visit(ctx.logoExpression().get(i));}
            }else{
                bool = false;
            }
        }
        return null;
    }
}