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
public class Ejercicio203 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar su edad
        int edad = obtenerEntero("Ingrese su edad:");

        // Calcular el número de pulsaciones por cada 10 segundos de ejercicio
        double pulsaciones = calcularPulsaciones(edad);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "Número de pulsaciones por cada 10 segundos: " + pulsaciones);
    }

    private static double calcularPulsaciones(int edad) {
        // Aplicar la fórmula para calcular el número de pulsaciones
        return (220.0 - edad) / 10.0;
    }

    private static int obtenerEntero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }
}
