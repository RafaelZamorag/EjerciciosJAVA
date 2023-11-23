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
public class Ejercicio170 {
    public static void main(String[] args) {
        // Capturar la primera fracción
        int numerador1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numerador de la primera fracción:"));
        int denominador1 = Integer
                .parseInt(JOptionPane.showInputDialog("Ingrese el denominador de la primera fracción:"));

        // Capturar la segunda fracción
        int numerador2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numerador de la segunda fracción:"));
        int denominador2 = Integer
                .parseInt(JOptionPane.showInputDialog("Ingrese el denominador de la segunda fracción:"));

        // Verificar que ambos denominadores sean iguales
        if (denominador1 == denominador2) {
            // Realizar la suma y resta
            int sumaNumerador = numerador1 + numerador2;
            int restaNumerador = numerador1 - numerador2;
            int denominador = denominador1; // Ya que se asume que ambos denominadores son iguales

            // Mostrar el resultado usando JOptionPane
            JOptionPane.showMessageDialog(null,
                    numerador1 + "/" + denominador + " + " + numerador2 + "/" + denominador + " = " + sumaNumerador
                            + "/" + denominador + "\n"
                            + numerador1 + "/" + denominador + " - " + numerador2 + "/" + denominador + " = "
                            + restaNumerador + "/" + denominador);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Los denominadores no son iguales. Por favor, ingrese fracciones con el mismo denominador.");
        }
    }

}
