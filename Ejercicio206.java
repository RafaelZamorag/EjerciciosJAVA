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
public class Ejercicio206 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar el salario actual
        double salarioActual = obtenerCantidad("Ingrese el salario actual del obrero:");

        // Calcular el nuevo salario con un aumento del 25%
        double nuevoSalario = calcularNuevoSalario(salarioActual);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El nuevo salario es: $" + nuevoSalario);
    }

    private static double calcularNuevoSalario(double salarioActual) {
        // Aplicar el incremento del 25% al salario actual
        return salarioActual * 1.25;
    }

    private static double obtenerCantidad(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }

}
