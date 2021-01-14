package com.tec.turtle;

import com.tec.antlrturtle.LogoBaseListener;
import com.tec.antlrturtle.LogoBaseVisitor;
import com.tec.antlrturtle.LogoParser;

import java.util.HashMap;
import java.util.Objects;


public class LogoVisitor extends LogoBaseVisitor<Double> {

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
    public Double visitRedondea(LogoParser.RedondeaContext ctx) {

        double var = visit(ctx.intExpression());

        this.painter.redondea(var);

        return visit(ctx.intExpression());
    }
}
