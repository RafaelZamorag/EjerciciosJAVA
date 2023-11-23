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
public class Ejercicio134 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar tres números enteros
        int numero1 = obtenerEntero("Ingrese el primer número entero:");
        int numero2 = obtenerEnteroValidado("Ingrese el segundo número entero (diferente al primero):", numero1);
        int numero3 = obtenerEntero("Ingrese el tercer número entero:");

        // Determinar cuál es el mayor y cuál es el menor
        int mayor = determinarMayor(numero1, numero2, numero3);
        int menor = determinarMenor(numero1, numero2, numero3);

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

    // Función para obtener un número entero desde el teclado, validando que sea
    // diferente al primer número
    public static int obtenerEnteroValidado(String mensaje, int numero1) {
        int numero2;
        do {
            numero2 = obtenerEntero(mensaje);
            if (numero1 == numero2) {
                JOptionPane.showMessageDialog(null,
                        "El segundo número debe ser diferente al primero. Inténtelo de nuevo.");
            }
        } while (numero1 == numero2);
        return numero2;
    }

    // Función para determinar el número mayor
    public static int determinarMayor(int numero1, int numero2, int numero3) {
        return Math.max(Math.max(numero1, numero2), numero3);
    }

    // Función para determinar el número menor
    public static int determinarMenor(int numero1, int numero2, int numero3) {
        return Math.min(Math.min(numero1, numero2), numero3);
    }

}
