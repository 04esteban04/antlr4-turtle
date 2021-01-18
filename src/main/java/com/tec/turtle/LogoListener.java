package com.tec.turtle;

import com.tec.antlrturtle.LogoBaseListener;
import com.tec.antlrturtle.LogoParser;
import com.tec.antlrturtle.LogoParser.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * Clase {@link LogoListener} que se encarga de recibir las llamadas del parser y delega
 * la ejecucion de los comandos al {@code painter}
 */
public class LogoListener extends LogoBaseListener {

    /**
     * Variable que almacena las variables del programa en ejecucion
     */
    private final HashMap<String, String> variables = new HashMap<>();

    /**
     * Variable que se encarga de dibujar en el canvas
     */
    private final TurtlePainter painter;

    /**
     * Constructor de la clase LogoListener
     * @param painter Variable que se encarga de dibujar en el canvas
     */
    public LogoListener(TurtlePainter painter) {
        this.painter = painter;
    }

    /**
     * Metodo que se encarga del comando finish
     * @param ctx Contexto de uso
     */
    @Override
    public void exitProg(ProgContext ctx) {
        this.painter.finish();
    }

}