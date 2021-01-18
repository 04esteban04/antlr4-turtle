package com.tec.turtle;

import java.util.List;

/**
 * Interfaz que debe ser implementada por las clases que traduzcan los comandos de un programa Logo en una representacion diferente.
 * Los metodos en esta interfaz son invocados por {@link LogoListener}, mediante la traduccion de la entrada de un programa Logo.
 */
public interface TurtlePainter {

    /**
     * Retorna el n elemento de una lista
     * @param lista lista a buscar el elemento
     * @param n posicion en la que se encuentra el elemento
     * @return numero encontrado
     */
    double elemento(List<Double> lista, int n);

    /**
     * Retorna el ultimo elemento de la lista
     * @param lista lista a buscar el ultimo elemento
     * @return numero que se encuentra en la ultima posicion
     */
    double ultimo(List<Double> lista);

    /**
     * Cuenta la cantidad de elementos de una lista
     * @param lista lista a contar
     * @return entero respectivo a la cantidad de elementos
     */
    int cuenta(List<Double> lista);

    /**
     * Elige un numero al azar de una lista
     * @param lista lista de la cual se elige
     * @return numero elegido
     */
    double elegir(List<Double> lista);

    /**
     * Metodo que retorna el primer elemento de una lista
     * @param lista lista a obtener el primer elemento
     * @return numero como primero elemento de la lista
     */
    double primero(List<Double> lista);

    /**
     * Metodo que se encarga del comando aparecer
     */
    void aparecer();

    /**
     * Metodo que se encarga del comando ocultar
     */
    void ocultar();

    /**
     * Metodo que se encarga del comando ponRumbo
     * @param rumbo Rumbo deseado del painter
     */
    void ponRumbo(int rumbo);

    /**
     * Metodo que se encarga del comando rumbo
     */
    double rumbo();

    /**
     * Metodo que se encarga del comando centro
     */
    void centro();

    /**
     * Metodo que se encarga del comando espera
     * @param n Valor a esperar
     */
    void espera(final int n);

    /**
     * Metodo que se encarga del comando ponx
     * @param point Valor a poner en x
     */
    void ponx(final int point);

    /**
     * Metodo que se encarga del comando pony
     * @param point Valor a poner en y
     */
    void pony(final int point);

    /**
     * Metodo que se encarga del comando poncolorlapiz
     * @param color Valor del color del lapiz usado
     */
    void poncolorlapiz(final String color);

    /**
     * Metodo que se encarga del comando goma
     */
    void goma();

    /**
     * Metodo que se encarga del comando azar
     * @param n Valor a utilizar
     * @return Valor escogido
     */
    int azar(int n);

    /**
     * Metodo que se encarga del comando inc
     * @param x Cantidad a incrementar
     * @param n Valor de incremento
     * @return Valor incrementado
     */
    int inc(Integer x, Integer n);

    /**
     * Metodo que se encarga del comando suma
     * @param numeros Valores a utilizar
     * @return Resultado de la suma
     */
    int suma(List<Integer> numeros);

    /**
     * Metodo que se encarga del comando diferencia
     * @param numeros Valores a utilizar
     * @return Resultado de la diferencia
     */
    int diferencia(List<Integer> numeros);

    /**
     * Metodo que se encarga del comando menos
     * @param x Valor a utilizar
     * @return Valor restado
     */
    int menos(int x);

    /**
     * Metodo que se encarga del comando resto
     * @param x Valor a restar
     * @param y Valor restado
     * @return Resultado de resta
     */
    int resto(int x, int y);

    /**
     * Metodo que se encarga del comando potencia
     * @param n Valor a incrementar
     * @param p Valor de potencia
     * @return Valor incrementado en la potencia dada
     */
    double potencia(int n, int p);

    /**
     * Metodo que se encarga del comando producto
     * @param numeros Valores a utilizar
     * @return Resultado de la multiplicacion
     */
    int producto(List<Integer> numeros);

    /**
     * Metodo que se encarga del comando division
     * @param x Valor a dividir
     * @param y Valor usado para dividir
     * @return Resultado de la division
     */
    int division(int x, int y);

    /**
     * Metodo que se encarga del comando redondea
     * @param x Valor a redondear
     * @return Valor redondeado
     */
    Long redondea(double x);

    /**
     * Metodo que se encarga del comando o logico
     * @param condicion Condicion dada
     * @param condicion2 Condicion dada
     * @return Resultado de la evaluacion de las condiciones dadas
     */
    boolean o(boolean condicion, boolean condicion2);

    /**
     * Metodo que se encarga del comando y logico
     * @param condicion Condicion dada
     * @param condicion2 Condicion dada
     * @return Resultado de la evaluacion de las condiciones dadas
     */
    boolean y(boolean condicion, boolean condicion2);

    /**
     * Metodo que se encarga del comando iguales
     * @param x Valor dado
     * @param y Valor dado
     * @return Resultado de la comparacion de los valores dados
     */
    boolean iguales(int x, int y);

    /**
     * Metodo que se encarga del comando menorque
     * @param x Valor dado
     * @param y Valor dado
     * @return Resultado de la evaluacion de los valores dados
     */
    boolean menorque(int x, int y);

    /**
     * Metodo que se encarga del comando mayorque
     * @param x Valor dado
     * @param y Valor dado
     * @return Resultado de la evaluacion de los valores dados
     */
    boolean mayorque(int x, int y);

    /**
     * Metodo que se encarga del comando forward
     * @param x Cantidad de puntos a moverse hacia adelante
     */
    void avanza(final int x);

    /**
     * Metodo que se encarga del comando back
     * @param x Cantidad de puntos a moverse hacia atras
     */
    void retrocede(final int x);

    /**
     * Metodo que se encarga del comando right
     * @param angulo Cantidad de grados a moverse hacia la derecha
     */
    void giraderecha(final int angulo);

    /**
     * Metodo que se encarga del comando left
     * @param angulo Cantidad de grados a moverse hacia la izquierda
     */
    void giraizquierda(final int angulo);

    /**
     * Metodo que se encarga del comando set
     * @param x Valor a establecer
     * @param y Valor a establecer
     */
    void ponxy(final int x, final int y);

    /**
     * Metodo que se encarga del comando penUp
     */
    void subelapiz();

    /**
     * Metodo que se encarga del comando penDown
     */
    void bajalapiz();

    /**
     * Metodo que se encarga del comando cls
     */
    void borrapantalla();

    /**
     * Metodo que se encarga del comando resetAngle
     */
    void resetAngle();

    /**
     * Metodo que se encarga del comando finish
     */
    void finish();
}
