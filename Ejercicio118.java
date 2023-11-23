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
public class Ejercicio118 {
    public static void main(String[] args) {
        // Solicitar los montos de 10 artículos
        double[] montos = obtenerMontosArticulos(10);

        // Calcular el monto total a pagar
        double totalPagar = calcularMontoTotal(montos);

        // Mostrar el monto total a pagar
        JOptionPane.showMessageDialog(null, "El monto total a pagar es: $" + totalPagar);
    }

    // Función para obtener los montos de los artículos
    public static double[] obtenerMontosArticulos(int cantidadArticulos) {
        double[] montos = new double[cantidadArticulos];

        for (int i = 0; i < cantidadArticulos; i++) {
            try {
                // Solicitar al usuario que ingrese el monto del artículo
                String inputMonto = JOptionPane.showInputDialog("Ingrese el monto del artículo " + (i + 1) + ":");
                montos[i] = Double.parseDouble(inputMonto);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
                i--; // Restar 1 al índice para repetir la iteración y solicitar el monto nuevamente
            }
        }

        return montos;
    }

    // Función para calcular el monto total a pagar
    public static double calcularMontoTotal(double[] montos) {
        double total = 0;

        for (double monto : montos) {
            total += monto;
        }

        return total;
    }

}
