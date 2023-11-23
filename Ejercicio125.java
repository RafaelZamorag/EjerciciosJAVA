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
public class Ejercicio125 {
    public static void main(String[] args) {
        // Leer el número desde el teclado
        int numero = obtenerEntero("Ingrese el número para encontrar sus múltiplos de 3:");

        // Mostrar los múltiplos de 3 para el número ingresado
        mostrarMultiplosDeTres(numero);
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

    // Función para mostrar los múltiplos de 3 para un número dado
    public static void mostrarMultiplosDeTres(int numero) {
        StringBuilder resultado = new StringBuilder("Múltiplos de 3 para el número " + numero + ":\n");

        for (int i = 1; i <= 3000; i++) {
            if (i % 3 == 0) {
                resultado.append(i).append("\n");
            }
        }

        // Mostrar el resultado en un cuadro de mensaje
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
