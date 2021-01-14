package com.tec.turtle;

import com.tec.antlrturtle.LogoBaseListener;
import com.tec.antlrturtle.LogoBaseVisitor;
import com.tec.antlrturtle.LogoParser;
import com.tec.turtle.Value;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;


public class LogoVisitor extends LogoBaseVisitor<Void> {

    private final HashMap<String, String> variables = new HashMap<>();

    private final TurtlePainter painter;

    public LogoVisitor(TurtlePainter painter) {
        this.painter = painter;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Void visitRedondea(LogoParser.RedondeaContext ctx) {

        double var = Double.parseDouble(ctx.intExpression().getText());

        this.painter.redondea(var);

        return visit(ctx.intExpression());
}



    @Override
    public Void visitSi(LogoParser.SiContext ctx) {



        if(Boolean.parseBoolean(ctx.booleanExpression().getText())) {


            System.out.println(ctx.logoExpression(0).getText());
               return this.visit(ctx.logoExpression(0));


            //this.visit(ctx.logoExpression(1));
           
        }

        return null;

        /*if (Boolean.parseBoolean(ctx.booleanExpression().getText())) {
            System.out.println("entrando si");
            for (LogoParser.LogoExpressionContext x : ctx.logoExpression()) {
                System.out.println("entrando condicion");
            }
        }
        return Value.VOID;*/
    }

    @Override
    public Void visitSisino(LogoParser.SisinoContext ctx) {
        if(Boolean.parseBoolean(ctx.booleanExpression().getText())) {


            //System.out.println(ctx.logoExpression(0).getText());
            System.out.println(ctx.logoExpression(1).toString());
            ctx.logoExpression(1).removeLastChild();

            System.out.println(ctx.logoExpression(1).toString());
            return this.visit(ctx.logoExpression(0));

        }
        else{
            System.out.println(ctx.logoExpression(1).getText());
            return this.visit(ctx.logoExpression(1));
        }




    }
}