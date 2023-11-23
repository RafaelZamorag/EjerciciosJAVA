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
public class Ejercicio72 {
    public static void main(String[] args) {
        double tarifaPorHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tarifa por hora:"));
        int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas:"));

        if (tarifaPorHora <= 0 || horasTrabajadas < 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos.");
        } else {
            double salario;

            if (horasTrabajadas <= 40) {
                salario = tarifaPorHora * horasTrabajadas;
            } else {
                double horasExtras = horasTrabajadas - 40;
                salario = (tarifaPorHora * 40) + (tarifaPorHora * 1.5 * horasExtras);
            }

            JOptionPane.showMessageDialog(null, "El salario del trabajador es: $" + salario);
        }
    }

}
