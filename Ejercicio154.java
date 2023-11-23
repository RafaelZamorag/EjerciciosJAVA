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
public class Ejercicio154 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese la primera cadena de caracteres
        String cadena1 = JOptionPane.showInputDialog("Ingrese la primera cadena de caracteres:");

        // Solicitar al usuario que ingrese la segunda cadena de caracteres
        String cadena2 = JOptionPane.showInputDialog("Ingrese la segunda cadena de caracteres:");

        // Comparar las cadenas
        if (cadena1.equals(cadena2)) {
            // Ambas cadenas son iguales
            JOptionPane.showMessageDialog(null, "Las cadenas son iguales.");
        } else {
            // Las cadenas no son iguales, determinar cuál es mayor alfabéticamente
            int comparacion = cadena1.compareTo(cadena2);

            if (comparacion > 0) {
                JOptionPane.showMessageDialog(null,
                        "La cadena \"" + cadena1 + "\" es mayor alfabéticamente que \"" + cadena2 + "\".");
            } else {
                JOptionPane.showMessageDialog(null,
                        "La cadena \"" + cadena2 + "\" es mayor alfabéticamente que \"" + cadena1 + "\".");
            }
        }
    }

}
