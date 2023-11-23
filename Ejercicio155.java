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
public class Ejercicio155 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese una palabra
        String palabra = JOptionPane.showInputDialog("Ingrese una palabra:");

        // Verificar si la palabra es un palíndromo
        if (esPalindromo(palabra)) {
            JOptionPane.showMessageDialog(null, "La palabra \"" + palabra + "\" es un palíndromo.");
        } else {
            JOptionPane.showMessageDialog(null, "La palabra \"" + palabra + "\" no es un palíndromo.");
        }
    }

    // Función para verificar si una palabra es un palíndromo
    private static boolean esPalindromo(String palabra) {
        // Eliminar espacios en blanco y convertir a minúsculas para hacer la
        // comparación más robusta
        palabra = palabra.replaceAll("\\s", "").toLowerCase();

        // Verificar si la palabra es un palíndromo
        int longitud = palabra.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - i - 1)) {
                return false; // No es un palíndromo
            }
        }
        return true; // Es un palíndromo
    }

}
