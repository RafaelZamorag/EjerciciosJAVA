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
public class Ejercicio214 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar las cantidades invertidas por cada persona
        double inversionPersona1 = obtenerCantidad("Ingrese la cantidad invertida por la persona 1:");
        double inversionPersona2 = obtenerCantidad("Ingrese la cantidad invertida por la persona 2:");
        double inversionPersona3 = obtenerCantidad("Ingrese la cantidad invertida por la persona 3:");

        // Calcular el porcentaje de inversión de cada persona
        double porcentajePersona1 = calcularPorcentaje(inversionPersona1,
                inversionPersona1 + inversionPersona2 + inversionPersona3);
        double porcentajePersona2 = calcularPorcentaje(inversionPersona2,
                inversionPersona1 + inversionPersona2 + inversionPersona3);
        double porcentajePersona3 = calcularPorcentaje(inversionPersona3,
                inversionPersona1 + inversionPersona2 + inversionPersona3);

        // Mostrar los resultados
        JOptionPane.showMessageDialog(null, "Porcentaje de inversión de la persona 1: " + porcentajePersona1 + "%");
        JOptionPane.showMessageDialog(null, "Porcentaje de inversión de la persona 2: " + porcentajePersona2 + "%");
        JOptionPane.showMessageDialog(null, "Porcentaje de inversión de la persona 3: " + porcentajePersona3 + "%");
    }

    private static double calcularPorcentaje(double cantidadPersona, double cantidadTotal) {
        // Calcular el porcentaje de inversión de una persona con respecto a la cantidad
        // total
        return (cantidadPersona / cantidadTotal) * 100;
    }

    private static double obtenerCantidad(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }
}
