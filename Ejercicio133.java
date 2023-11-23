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
public class Ejercicio133 {

    public static void main(String[] args) {
        // Solicitar al usuario ingresar dos números enteros
        int numero1 = obtenerEntero("Ingrese el primer número entero:");
        int numero2 = obtenerEntero("Ingrese el segundo número entero:");

        // Determinar cuál es el mayor y cuál es el menor
        int mayor = determinarMayor(numero1, numero2);
        int menor = determinarMenor(numero1, numero2);

        // Mostrar el resultado en pantalla
        JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor + "\nEl número menor es: " + menor);
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

    // Función para determinar el número mayor
    public static int determinarMayor(int numero1, int numero2) {
        return Math.max(numero1, numero2);
    }

    // Función para determinar el número menor
    public static int determinarMenor(int numero1, int numero2) {
        return Math.min(numero1, numero2);
    }

}
