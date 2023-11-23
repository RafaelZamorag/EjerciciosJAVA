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
public class Ejercicio166 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese el peso en kilogramos
        String inputPeso = JOptionPane.showInputDialog("Ingrese su peso en kilogramos:");

        // Solicitar al usuario que ingrese la estatura en metros
        String inputEstatura = JOptionPane.showInputDialog("Ingrese su estatura en metros:");

        // Convertir las cadenas a números
        try {
            double peso = Double.parseDouble(inputPeso);
            double estatura = Double.parseDouble(inputEstatura);

            // Calcular el IMC
            double imc = peso / (estatura * estatura);

            // Determinar la categoría del IMC
            String categoria;
            if (imc < 18.5) {
                categoria = "Bajo peso";
            } else if (imc < 24.9) {
                categoria = "Normal";
            } else if (imc < 29.9) {
                categoria = "Sobrepeso";
            } else {
                categoria = "Obesidad";
            }

            // Mostrar el resultado utilizando JOptionPane.showMessageDialog
            JOptionPane.showMessageDialog(null, "Su IMC es: " + imc + "\nCategoría: " + categoria);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores numéricos válidos.");
        }
    }
}
