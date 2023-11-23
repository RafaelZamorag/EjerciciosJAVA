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
public class Ejercicio194 {
    public static void main(String[] args) {
        // Declarar un arreglo para almacenar los 10 números
        int[] numeros = new int[10];

        // Solicitar al usuario ingresar los 10 números
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = obtenerNumero("Ingrese el número en la posición " + (i + 1) + ":");
        }

        // Ordenar los números utilizando el método de la burbuja
        ordenarBurbuja(numeros);

        // Mostrar los números ordenados
        mostrarNumerosOrdenados(numeros);
    }

    private static int obtenerNumero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

    private static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar los elementos si están en el orden incorrecto
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    private static void mostrarNumerosOrdenados(int[] arreglo) {
        StringBuilder resultado = new StringBuilder("Números ordenados de forma ascendente:\n");

        for (int numero : arreglo) {
            resultado.append(numero).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

}
