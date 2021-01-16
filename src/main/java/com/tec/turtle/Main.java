package com.tec.turtle;

import com.tec.turtle.ui.TurtleFXUI;
import javafx.application.Application;

/**
 * Clase main que se encarga de ejecutar el programa
 */
public class Main {

    /**
     * Metodo main que ejecuta el programa
     * @param args Argumentos necesarios para el programa
     */
    public static void main(final String... args) {
        Application.launch(TurtleFXUI.class, args);
    }
}
