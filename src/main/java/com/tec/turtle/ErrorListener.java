package com.tec.turtle;

import com.tec.turtle.ui.TurtleFXUIController;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 * Clase que se encarga de manejar los errores generados durante la compilacion del programa
 */
public class ErrorListener extends BaseErrorListener {

    /**
     * Variable que se utiliza para manejar los errores de compilcion
     */
    public static ErrorListener errorListener = new ErrorListener();

    /**
     * Metodo para manejar el error obtenido
     * @param recognizer Reconocedor del error
     * @param offendingSymbol Causante del error
     * @param line Linea del error
     * @param charPositionInLine Posicion del error en la linea
     * @param msg Mensaje de error
     * @param e Excepcion obtenida
     * @throws ParseCancellationException Excepcion generada
     */
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                            String msg, RecognitionException e) throws ParseCancellationException {
        try{
            String datoIngresado = msg.split("'")[1];
            String datoEsperado = msg.split("'")[2];
            datoEsperado = datoEsperado.substring(10);

            throw new ParseCancellationException("-> Línea " + line + ":" + charPositionInLine +
                                                "\n    - Dato ingresado extraño: " + datoIngresado +
                                                "\n    - Se espera que el dato ingresado sea: " + datoEsperado);
        } catch (Exception exception){
            TurtleFXUIController.error(exception.getMessage(), "excepcion");
        }
    }

}