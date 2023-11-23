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
public class Ejercicio193 {

    public static void main(String[] args) {
        // Solicitar al usuario un número entre 1 y 255
        int numeroDecimal = obtenerNumero("Ingrese un número entre 1 y 255:");

        // Verificar que el número esté en el rango permitido
        if (numeroDecimal >= 1 && numeroDecimal <= 255) {
            // Convertir el número a binario
            String binario = convertirABinario(numeroDecimal);

            // Mostrar el resultado en un cuadro de diálogo
            JOptionPane.showMessageDialog(null, "La conversión a binario de " + numeroDecimal + " es: " + binario);
        } else {
            JOptionPane.showMessageDialog(null, "Número fuera del rango permitido.");
        }
    }

    private static int obtenerNumero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

    private static String convertirABinario(int numeroDecimal) {
        // Utilizar el método toBinaryString de Integer para convertir a binario
        return Integer.toBinaryString(numeroDecimal);
    }

}
