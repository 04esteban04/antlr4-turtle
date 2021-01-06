package com.tec.turtle;

import java.util.List;

/**
 * Interface to be implemented by classes that provide support on translating the commands from a logo program into a different representation
 * <p>
 * The methods in this interface are invoked by {@link LogoListener}, by translating the input of a logo program. Implementations can be anything and not just UI tools. Some
 * implementations of this interface might be:
 *     <ul>
 *         <li>A spy that records the commands and provides an assertion mechanism</li>
 *         <li>A program that just prints the commands in stdout</li>
 *         <li>An implementation that draws the logo program in console</li>
 *         <li>A JavaFX implementation that draws the logo program in a canvas</li>
 *         <li>A web server that delegates the commands to a HTML front-end</li>
 *     </ul>
 * </p>
 */
public interface TurtlePainter {

    int diferencia(List<Integer> numeros);

    int azar(int n);

    int menos(int x);

    int division(int x, int y);

    int resto(int x, int y);

    int suma(List<Integer> numeros);

    boolean o(boolean condicion, boolean condicion2);

    boolean y(boolean condicion, boolean condicion2);

    boolean iguales(int x, int y);

    boolean menorque(int x, int y);

    boolean mayorque(int x, int y);

    int producto(List<Integer> numeros);

    double rumbo();

    void centro();

    void espera(final int n);

    void ponx(final int point);

    void pony(final int point);

    void goma();

    void poncolorlapiz(final String color);

    void forward(final int points);

    void back(final int points);

    void right(final int degrees);

    void left(final int degrees);

    void set(final int x, final int y);

    void penUp();

    void penDown();

    void cls();

    /**
     * Resets the turtle's angel to 0 degrees, which effectively is the turtle facing EAST
     */
    void resetAngle();

    void finish();
}
