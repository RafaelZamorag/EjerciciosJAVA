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
public class Ejercicio229 {
    public static void main(String[] args) {
        // Bucle para repetir el proceso hasta que ambos números sean 0
        do {
            // Solicitar al usuario ingresar dos números
            int numero1 = obtenerEntero("Ingrese el primer número:");
            int numero2 = obtenerEntero("Ingrese el segundo número:");

            // Verificar si ambos números son pares
            if (esPar(numero1) && esPar(numero2)) {
                // Calcular y mostrar la suma de los números
                int suma = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "La suma de los números es: " + suma);
            } else {
                // Mostrar mensaje de error si alguno de los números no es par
                JOptionPane.showMessageDialog(null, "Ambos números deben ser pares. Intente de nuevo.");
            }
        } while (!ambosNumerosSonCero());
    }

    private static int obtenerEntero(String mensaje) {
        // Solicitar al usuario ingresar un número y convertir a int
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

    private static boolean esPar(int numero) {
        // Verificar si un número es par
        return numero % 2 == 0;
    }

    private static boolean ambosNumerosSonCero() {
        // Verificar si ambos números son cero
        return obtenerEntero("Ingrese el primer número:") == 0 && obtenerEntero("Ingrese el segundo número:") == 0;
    }

}
