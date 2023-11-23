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
public class Ejercicio159 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número
        String inputNumero = JOptionPane.showInputDialog("Ingrese un número:");

        // Convertir la cadena a un número entero
        try {
            int numero = Integer.parseInt(inputNumero);

            // Verificar si el número es primo
            if (esPrimo(numero)) {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es primo.");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + numero + " no es primo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
        }
    }

    // Función para verificar si un número es primo
    private static boolean esPrimo(int numero) {
        // Un número primo es aquel que solo es divisible entre 1 y él mismo
        if (numero <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // El número es divisible por un número diferente de 1 y él mismo
            }
        }
        return true; // El número es primo
    }

}
