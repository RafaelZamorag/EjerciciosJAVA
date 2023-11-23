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
public class Ejercicio161 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese el valor de la primera variable
        String inputVariable1 = JOptionPane.showInputDialog("Ingrese el valor de la primera variable:");

        // Solicitar al usuario que ingrese el valor de la segunda variable
        String inputVariable2 = JOptionPane.showInputDialog("Ingrese el valor de la segunda variable:");

        // Convertir las cadenas a números enteros
        try {
            int variable1 = Integer.parseInt(inputVariable1);
            int variable2 = Integer.parseInt(inputVariable2);

            // Intercambiar los valores de las variables
            int temp = variable1;
            variable1 = variable2;
            variable2 = temp;

            // Mostrar los valores intercambiados utilizando JOptionPane.showMessageDialog
            JOptionPane.showMessageDialog(null, "Valores intercambiados:\n"
                    + "Variable 1: " + variable1 + "\n"
                    + "Variable 2: " + variable2);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores numéricos válidos.");
        }
    }

}
