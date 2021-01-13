package com.tec.turtle.ui;

import javafx.application.Platform;

/**
 * Clase que se encarga de ayudar en el manejo de Threads
 */
public class JavaFXThreadHelper {

    /**
     * Constructor de la clase JavaFXThreadHelper
     */
    private JavaFXThreadHelper() {
    }

    /**
     * Metodo que ayuda a decidir si ejecutar o posponer la ejecucion de una tarea especifica
     * @param runnable Determina si la aplicacion puede ejecutar la tarea o no
     */
    public static void runOrDefer(final Runnable runnable) {
        if (Platform.isFxApplicationThread()) {
            runnable.run();
        } else {
            Platform.runLater(runnable);
        }
    }
}
