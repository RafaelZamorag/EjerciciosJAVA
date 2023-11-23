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
public class Ejercicio123 {
    public static void main(String[] args) {
        // Solicitar al usuario los datos necesarios
        double capital = obtenerNumero("Ingrese el capital inicial:");
        double tasaInteres = obtenerNumero("Ingrese la tasa de interés diaria (%):");
        int dias = obtenerEntero("Ingrese el número de días:");

        // Calcular el capital final con interés simple
        double capitalFinal = calcularInteresSimple(capital, tasaInteres, dias);

        // Mostrar el resultado en pantalla
        JOptionPane.showMessageDialog(null, "El capital final con interés simple es: $" + capitalFinal);
    }

    // Función para solicitar al usuario un número
    public static double obtenerNumero(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
            }
        }
    }

    // Función para solicitar al usuario un número entero
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

    // Función para calcular el capital final con interés simple
    public static double calcularInteresSimple(double capital, double tasaInteres, int dias) {
        double interesSimple = (capital * tasaInteres * dias) / 100;
        return capital + interesSimple;
    }

}
