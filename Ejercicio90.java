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
public class Ejercicio90 {

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int contarPrimosMatriz(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int numero : fila) {
                if (esPrimo(numero)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    // Función para contar números primos en un vector
    private static int contarPrimosVector(int[] vector) {
        int contador = 0;
        for (int numero : vector) {
            if (esPrimo(numero)) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        // Ingresar dimensiones de la matriz
        int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas de la matriz:"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas de la matriz:"));

        // Crear matriz
        int[][] matriz = new int[filas][columnas];

        // Ingresar elementos de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese el elemento en la posición [" + i + "][" + j + "]:"));
            }
        }

        // Ingresar elementos del vector
        int longitudVector = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del vector:"));
        int[] vector = new int[longitudVector];

        for (int i = 0; i < longitudVector; i++) {
            vector[i] = Integer
                    .parseInt(JOptionPane.showInputDialog("Ingrese el elemento en la posición " + i + " del vector:"));
        }

        // Contar números primos en la matriz y el vector
        int primosMatriz = contarPrimosMatriz(matriz);
        int primosVector = contarPrimosVector(vector);

        // Mostrar resultados
        JOptionPane.showMessageDialog(null, "Cantidad de números primos en la matriz: " + primosMatriz +
                "\nCantidad de números primos en el vector: " + primosVector);
    }

}
