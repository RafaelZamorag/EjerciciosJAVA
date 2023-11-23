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
public class Ejercicio128 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar el año
        int año = obtenerEntero("Ingrese el año (en formato de 4 dígitos):");

        // Determinar si el año es bisiesto
        boolean esBisiesto = determinarBisiesto(año);

        // Mostrar el resultado en pantalla
        String mensaje = esBisiesto ? "El año " + año + " es bisiesto." : "El año " + año + " no es bisiesto.";
        JOptionPane.showMessageDialog(null, mensaje);
    }

    // Función para obtener un número entero desde el teclado
    public static int obtenerEntero(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor entero válido.");
            }
        }
    }

    // Función para determinar si un año es bisiesto
    public static boolean determinarBisiesto(int año) {
        // Un año es bisiesto si es múltiplo de 4, excepto los múltiplos de 100,
        // a menos que también sean múltiplos de 400
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

}
