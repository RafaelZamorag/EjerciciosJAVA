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
public class Ejercicio233 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar la cantidad de números (N)
        int cantidadNumeros = obtenerEnteroPositivo("Ingrese la cantidad de números negativos:");

        // Bucle para leer N números negativos, convertirlos a positivos e imprimirlos
        for (int i = 1; i <= cantidadNumeros; i++) {
            // Solicitar al usuario ingresar un número negativo
            double numeroNegativo = obtenerDoubleNegativo("Ingrese el número negativo " + i + ":");

            // Convertir el número negativo a positivo
            double numeroPositivo = Math.abs(numeroNegativo);

            // Imprimir el número positivo
            System.out.println("Número positivo: " + numeroPositivo);
        }
    }

    private static int obtenerEnteroPositivo(String mensaje) {
        // Solicitar al usuario ingresar un número positivo y convertir a int
        int numero;
        do {
            String input = JOptionPane.showInputDialog(mensaje);
            numero = Integer.parseInt(input);
        } while (numero <= 0);

        return numero;
    }

    private static double obtenerDoubleNegativo(String mensaje) {
        // Solicitar al usuario ingresar un número negativo y convertir a double
        double numero;
        do {
            String input = JOptionPane.showInputDialog(mensaje);
            numero = Double.parseDouble(input);
        } while (numero >= 0);

        return numero;
    }

}
