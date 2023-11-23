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
public class Ejercicio230 {
    public static void main(String[] args) {
        // Bucle para repetir hasta que se ingresen números válidos
        while (true) {
            // Solicitar al usuario ingresar dos números
            double numero1 = obtenerDoublePositivo("Ingrese el primer número:");
            double numero2 = obtenerDoublePositivo("Ingrese el segundo número:");

            // Verificar si el primer número es mayor que el segundo
            if (numero1 > numero2) {
                // Calcular y mostrar el resultado de la división
                double resultado = numero1 / numero2;
                JOptionPane.showMessageDialog(null, "El resultado de la división es: " + resultado);
                break; // Salir del bucle ya que los números son válidos
            } else {
                // Mostrar mensaje de error si no se cumplen las condiciones
                JOptionPane.showMessageDialog(null,
                        "El primer número debe ser mayor que el segundo. Intente de nuevo.");
            }
        }
    }

    private static double obtenerDoublePositivo(String mensaje) {
        // Solicitar al usuario ingresar un número positivo y convertir a double
        double numero;
        do {
            String input = JOptionPane.showInputDialog(mensaje);
            numero = Double.parseDouble(input);
        } while (numero <= 0);

        return numero;
    }
}
