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
public class Ejercicio204 {

    public static void main(String[] args) {
        // Solicitar al usuario ingresar el valor en dólares
        double dolares = obtenerCantidad("Ingrese el valor en dólares:");

        // Definir la tasa de cambio
        double tasaCambio = 8.08;

        // Convertir dólares a Bolivianos
        double bolivianos = convertirADolares(dolares, tasaCambio);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, dolares + " dólares equivalen a " + bolivianos + " bolivianos.");
    }

    private static double convertirADolares(double dolares, double tasaCambio) {
        // Aplicar la tasa de cambio para convertir dólares a Bolivianos
        return dolares * tasaCambio;
    }

    private static double obtenerCantidad(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }

}
