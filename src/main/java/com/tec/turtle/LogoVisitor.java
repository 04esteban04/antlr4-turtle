package com.tec.turtle;

import com.tec.antlrturtle.LogoBaseVisitor;
import java.util.HashMap;



public class LogoVisitor extends LogoBaseVisitor<Void> {

    private final HashMap<String, String> variables = new HashMap<>();

    private final TurtlePainter painter;

    public LogoVisitor(TurtlePainter painter) {
        this.painter = painter;
    }

}