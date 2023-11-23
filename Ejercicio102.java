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
public class Ejercicio102 {

    public static void main(String[] args) {
        // Solicitar al usuario que ingrese las horas trabajadas
        String inputHorasTrabajadas = JOptionPane.showInputDialog("Ingrese las horas trabajadas:");
        int horasTrabajadas = Integer.parseInt(inputHorasTrabajadas);

        // Solicitar al usuario que ingrese la tarifa por hora
        String inputTarifaPorHora = JOptionPane.showInputDialog("Ingrese la tarifa por hora:");
        double tarifaPorHora = Double.parseDouble(inputTarifaPorHora);

        // Calcular el salario
        double salario = calcularSalario(horasTrabajadas, tarifaPorHora);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El salario del trabajador es: $" + salario);
    }

    // Función para calcular el salario del trabajador
    public static double calcularSalario(int horasTrabajadas, double tarifaPorHora) {
        // Definir la cantidad de horas estándar (40 horas)
        int horasEstandar = 40;

        // Definir el factor de incremento para horas extras (25%)
        double incrementoHorasExtras = 1.25;

        // Calcular el salario estándar
        double salario = Math.min(horasTrabajadas, horasEstandar) * tarifaPorHora;

        // Calcular el salario por horas extras, si las hay
        if (horasTrabajadas > horasEstandar) {
            salario += (horasTrabajadas - horasEstandar) * tarifaPorHora * incrementoHorasExtras;
        }

        return salario;
    }

}
