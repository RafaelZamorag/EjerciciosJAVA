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
public class Ejercicio131 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar la tarifa por hora y las horas trabajadas
        double tarifaPorHora = obtenerNumero("Ingrese la tarifa por hora:");
        double horasTrabajadas = obtenerNumero("Ingrese las horas trabajadas:");

        // Calcular la nómina
        double nomina = calcularNomina(tarifaPorHora, horasTrabajadas);

        // Mostrar el resultado en pantalla
        JOptionPane.showMessageDialog(null, "La nómina del trabajador es: $" + nomina);
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

    // Función para calcular la nómina del trabajador
    public static double calcularNomina(double tarifaPorHora, double horasTrabajadas) {
        double horasNormales = Math.min(horasTrabajadas, 40); // Primeras 40 horas
        double horasExtras = Math.max(horasTrabajadas - 40, 0); // Horas extras (si las hay)

        // Calcular el salario tomando en cuenta las horas extras al doble
        double salario = (horasNormales * tarifaPorHora) + (horasExtras * tarifaPorHora * 2);

        return salario;
    }

}
