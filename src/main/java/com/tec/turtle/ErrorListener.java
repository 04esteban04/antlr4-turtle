package com.tec.turtle;

import com.tec.turtle.ui.TurtleFXUIController;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ErrorListener extends BaseErrorListener {

    public static ErrorListener INSTANCE = new ErrorListener();

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
            TurtleFXUIController.error(exception.getMessage());
        }
    }

}