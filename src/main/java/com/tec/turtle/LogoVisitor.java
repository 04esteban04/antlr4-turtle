package com.tec.turtle;

import com.tec.antlrturtle.LogoBaseListener;
import com.tec.antlrturtle.LogoBaseVisitor;
import com.tec.antlrturtle.LogoParser;
import com.tec.turtle.Value;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;


public class LogoVisitor extends LogoBaseVisitor<Value> {

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
    public Value visitRedondea(LogoParser.RedondeaContext ctx) {

        double var = Double.parseDouble(ctx.intExpression().getText());

        this.painter.redondea(var);

        return visit(ctx.intExpression());
}



    @Override
    public Value visitSi(LogoParser.SiContext ctx) {

        //List<LogoParser.BooleanExpressionContext> conditions =  ctx.booleanExpression();

        boolean evaluatedBlock = false;
        Value evaluated = this.visit(ctx.booleanExpression());

        if(evaluated.asBoolean()) {
            evaluatedBlock = true;
            // evaluate this block whose expr==true
            int i=0;
            for (LogoParser.LogoExpressionContext x : ctx.logoExpression()) {
                this.visit(ctx.logoExpression(i));
                i++;
            }
            //this.visit(ctx.logoExpression(1));
           
        }
        
        return Value.VOID;

        /*if (Boolean.parseBoolean(ctx.booleanExpression().getText())) {
            System.out.println("entrando si");
            for (LogoParser.LogoExpressionContext x : ctx.logoExpression()) {
                System.out.println("entrando condicion");
            }
        }
        return Value.VOID;*/
    }

}