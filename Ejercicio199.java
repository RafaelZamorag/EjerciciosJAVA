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
public class Ejercicio199 {
    static final int TAMANO_TABLERO = 8;
    static char[][] tablero = new char[TAMANO_TABLERO][TAMANO_TABLERO];
    static int puntosJugador1 = 0;
    static int puntosJugador2 = 0;

    public static void main(String[] args) {
        inicializarTablero();
        mostrarTablero();

        while (true) {
            realizarMovimiento(1); // Jugador 1
            mostrarTablero();
            if (verificarGanador()) {
                break;
            }

            realizarMovimiento(2); // Jugador 2
            mostrarTablero();
            if (verificarGanador()) {
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Fin del juego. Puntos del Jugador 1: " + puntosJugador1 +
                "\nPuntos del Jugador 2: " + puntosJugador2);
    }

    private static void inicializarTablero() {
        // Inicializar el tablero con peones
        for (int i = 1; i < TAMANO_TABLERO; i += 2) {
            tablero[0][i] = 'P';
            tablero[TAMANO_TABLERO - 1][i - 1] = 'P';
        }
    }

    private static void mostrarTablero() {
        StringBuilder mensaje = new StringBuilder("Tablero de Ajedrez:\n");

        for (int i = 0; i < TAMANO_TABLERO; i++) {
            for (int j = 0; j < TAMANO_TABLERO; j++) {
                mensaje.append(tablero[i][j]).append(" ");
            }
            mensaje.append("\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

    private static void realizarMovimiento(int jugador) {
        int fila, columna;

        do {
            fila = obtenerEntero("Jugador " + jugador + ", ingrese la fila (1-8):") - 1;
            columna = obtenerEntero("Jugador " + jugador + ", ingrese la columna (1-8):") - 1;
        } while (!esMovimientoValido(jugador, fila, columna));

        // Realizar el movimiento
        tablero[fila][columna] = jugador == 1 ? '1' : '2';

        // Verificar si "come" a una pieza rival
        if (jugador == 1 && fila + 1 < TAMANO_TABLERO && tablero[fila + 1][columna] == '2') {
            puntosJugador1++;
        } else if (jugador == 2 && fila - 1 >= 0 && tablero[fila - 1][columna] == '1') {
            puntosJugador2++;
        }
    }

    private static boolean esMovimientoValido(int jugador, int fila, int columna) {
        if (fila < 0 || fila >= TAMANO_TABLERO || columna < 0 || columna >= TAMANO_TABLERO) {
            return false; // Movimiento fuera del tablero
        }

        if (jugador == 1 && tablero[fila][columna] != 'P') {
            return false; // Jugador 1 solo puede mover peones
        }

        if (jugador == 2 && tablero[fila][columna] != 'P') {
            return false; // Jugador 2 solo puede mover peones
        }

        return true;
    }

    private static boolean verificarGanador() {
        return puntosJugador1 >= 2 || puntosJugador2 >= 2;
    }

    private static int obtenerEntero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

}
