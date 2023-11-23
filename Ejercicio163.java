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
public class Ejercicio163 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese el primer número
        String inputNumeroA = JOptionPane.showInputDialog("Ingrese el primer número (A):");

        // Solicitar al usuario que ingrese el segundo número
        String inputNumeroB = JOptionPane.showInputDialog("Ingrese el segundo número (B):");

        // Convertir las cadenas a números
        try {
            double numeroA = Double.parseDouble(inputNumeroA);
            double numeroB = Double.parseDouble(inputNumeroB);

            // Realizar operaciones básicas
            double suma = numeroA + numeroB;
            double resta = numeroA - numeroB;
            double multiplicacion = numeroA * numeroB;

            // Verificar si el segundo número (B) es diferente de cero antes de realizar la
            // división
            double division = 0.0;
            double residuo = 0.0;
            if (numeroB != 0) {
                division = numeroA / numeroB;
                residuo = numeroA % numeroB;
            }

            // Mostrar los resultados utilizando JOptionPane.showMessageDialog
            String mensajeResultados = "Resultados:\n" +
                    "Suma: " + suma + "\n" +
                    "Resta: " + resta + "\n" +
                    "Multiplicación: " + multiplicacion + "\n";

            if (numeroB != 0) {
                mensajeResultados += "División: " + division + "\n" +
                        "Residuo: " + residuo;
            } else {
                mensajeResultados += "División: No es posible dividir por cero.\n" +
                        "Residuo: No es posible calcular el residuo.";
            }

            JOptionPane.showMessageDialog(null, mensajeResultados);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos.");
        }
    }

}
