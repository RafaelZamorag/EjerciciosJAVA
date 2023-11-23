/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segunda.parte;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Ejercicio187 {
    public static void main(String[] args) {
        // Tamaño del tablero de ajedrez
        int tamanoTablero = 8;

        // Captura de la posición inicial de la reina
        int filaActual = obtenerEntero("Ingrese la fila inicial de la reina (1-" + tamanoTablero + "):");
        int columnaActual = obtenerEntero("Ingrese la columna inicial de la reina (1-" + tamanoTablero + "):");

        // Validar posición inicial de la reina
        if (!esPosicionValida(filaActual, columnaActual, tamanoTablero)) {
            JOptionPane.showMessageDialog(null, "Posición inicial inválida. Saliendo del programa.");
            System.exit(0);
        }

        // Captura de la posición a la cual se moverá la reina
        int filaNueva = obtenerEntero("Ingrese la nueva fila de la reina (1-" + tamanoTablero + "):");
        int columnaNueva = obtenerEntero("Ingrese la nueva columna de la reina (1-" + tamanoTablero + "):");

        // Validar movimiento
        if (esMovimientoValido(filaActual, columnaActual, filaNueva, columnaNueva)) {
            JOptionPane.showMessageDialog(null, "Movimiento válido. La reina puede moverse a esa posición.");
        } else {
            JOptionPane.showMessageDialog(null, "Movimiento inválido. La reina no puede moverse a esa posición.");
        }
    }

    private static int obtenerEntero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

    private static boolean esPosicionValida(int fila, int columna, int tamanoTablero) {
        return fila >= 1 && fila <= tamanoTablero && columna >= 1 && columna <= tamanoTablero;
    }

    private static boolean esMovimientoValido(int filaActual, int columnaActual, int filaNueva, int columnaNueva) {
        // Un movimiento de reina es válido si se mueve en la misma fila, columna o
        // diagonal
        return filaActual == filaNueva || columnaActual == columnaNueva ||
                Math.abs(filaNueva - filaActual) == Math.abs(columnaNueva - columnaActual);
    }

}
