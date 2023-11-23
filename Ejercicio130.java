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
public class Ejercicio130 {

    public static void main(String[] args) {
        // Solicitar al usuario ingresar el monto del préstamo y el plazo en meses
        double montoPrestamo = obtenerNumero("Ingrese el monto del préstamo:");
        int plazoMeses = obtenerEntero("Ingrese el plazo en meses (12 o 24):");

        // Validar que el plazo sea 12 o 24 meses
        if (plazoMeses == 12 || plazoMeses == 24) {
            // Calcular el monto total a pagar por mes y el total a pagar
            double montoTotalPagar = calcularTotalPagar(montoPrestamo, plazoMeses);

            // Mostrar el resultado en pantalla
            JOptionPane.showMessageDialog(null, "El monto total a pagar por mes es: $" + montoTotalPagar +
                    "\nEl total a pagar al final del plazo es: $" + (montoTotalPagar * plazoMeses));
        } else {
            JOptionPane.showMessageDialog(null, "Plazo no válido. Por favor, ingrese un plazo de 12 o 24 meses.");
        }
    }

    // Función para obtener un número desde el teclado
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

    // Función para calcular el monto total a pagar por mes
    public static double calcularTotalPagar(double montoPrestamo, int plazoMeses) {
        double tasaInteresMensual = 0.02; // 2% de interés mensual

        for (int i = 0; i < plazoMeses; i++) {
            montoPrestamo *= (1 + tasaInteresMensual);
        }

        return montoPrestamo;
    }

}
