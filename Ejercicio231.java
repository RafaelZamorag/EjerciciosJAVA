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
public class Ejercicio231 {
    public static void main(String[] args) {
        // Inicializar la variable para la suma de números positivos
        double sumaPositivos = 0;

        // Bucle para leer 10 números
        for (int i = 1; i <= 10; i++) {
            // Solicitar al usuario ingresar un número
            double numero = obtenerDouble("Ingrese el número " + i + ":");

            // Verificar si el número es positivo y sumarlo
            if (numero > 0) {
                // Imprimir el número positivo
                System.out.println("Número positivo: " + numero);

                // Sumar el número positivo a la suma
                sumaPositivos += numero;
            }
        }

        // Mostrar la suma de los números positivos
        JOptionPane.showMessageDialog(null, "La suma de los números positivos es: " + sumaPositivos);
    }

    private static double obtenerDouble(String mensaje) {
        // Solicitar al usuario ingresar un número y convertir a double
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }

}
