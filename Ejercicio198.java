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
public class Ejercicio198 {
    public static void main(String[] args) {
        // Crear y mostrar el tablero inicial
        int[][] tablero = generarTablero();
        mostrarTablero(tablero);

        // Permitir al usuario ingresar números
        ingresarNumeros(tablero);
    }

    private static int[][] generarTablero() {
        // Implementar lógica para generar un tablero de Sudoku válido
        // Aquí, por simplicidad, simplemente se crea un tablero aleatorio

        int[][] tablero = new int[9][9];
        // ... lógica para llenar el tablero aleatoriamente ...

        return tablero;
    }

    private static void mostrarTablero(int[][] tablero) {
        // Mostrar el tablero en la consola
        System.out.println("Tablero de Sudoku:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void ingresarNumeros(int[][] tablero) {
        while (true) {
            // Solicitar al usuario ingresar coordenadas y número
            int fila = obtenerEntero("Ingrese la fila (1-9) o -1 para salir:");
            if (fila == -1) {
                break;
            }

            int columna = obtenerEntero("Ingrese la columna (1-9):");
            int numero = obtenerEntero("Ingrese el número (1-9):");

            // Validar si el número ingresado cumple con las reglas
            if (validarNumero(tablero, fila - 1, columna - 1, numero)) {
                tablero[fila - 1][columna - 1] = numero;
                mostrarTablero(tablero);
            } else {
                JOptionPane.showMessageDialog(null, "Número no válido. Inténtelo de nuevo.");
            }
        }
    }

    private static boolean validarNumero(int[][] tablero, int fila, int columna, int numero) {
        // Verificar la fila y la columna
        for (int i = 0; i < 9; i++) {
            if (tablero[fila][i] == numero || tablero[i][columna] == numero) {
                return false;
            }
        }

        // Verificar el sector (bloque 3x3)
        int sectorFilaInicio = (fila / 3) * 3;
        int sectorColumnaInicio = (columna / 3) * 3;
        for (int i = sectorFilaInicio; i < sectorFilaInicio + 3; i++) {
            for (int j = sectorColumnaInicio; j < sectorColumnaInicio + 3; j++) {
                if (tablero[i][j] == numero) {
                    return false;
                }
            }
        }

        // Si pasa todas las validaciones, el número es válido
        return true;
    }

    private static int obtenerEntero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

}
