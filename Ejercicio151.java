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
public class Ejercicio151 {

    public static void main(String[] args) {
        // Solicitar al usuario que ingrese una cadena de caracteres
        String inputCadena = JOptionPane.showInputDialog("Ingrese una cadena de caracteres:");

        // Verificar la longitud de la cadena
        if (inputCadena.length() > 10) {
            // Mostrar la cadena si supera los 10 caracteres
            JOptionPane.showMessageDialog(null, "La cadena ingresada es: " + inputCadena);
        } else {
            // No mostrar la cadena si no supera los 10 caracteres
            JOptionPane.showMessageDialog(null, "La cadena no supera los 10 caracteres.");

        }
    }
}
