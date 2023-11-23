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
public class Ejercicio205 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar la cantidad en Bolivianos
        double bolivianos = obtenerCantidad("Ingrese la cantidad en Bolivianos:");

        // Solicitar al usuario ingresar la tasa de cambio
        double tasaCambio = obtenerCantidad("Ingrese la tasa de cambio (1 dólar = ? bolivianos):");

        // Convertir Bolivianos a Dólares
        double dolares = convertirADolares(bolivianos, tasaCambio);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, bolivianos + " bolivianos equivalen a " + dolares + " dólares.");
    }

    private static double convertirADolares(double bolivianos, double tasaCambio) {
        // Aplicar la tasa de cambio para convertir Bolivianos a Dólares
        return bolivianos / tasaCambio;
    }

    private static double obtenerCantidad(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }
}
