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
public class Ejercicio156 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese la primera cadena en minúsculas
        String cadena1 = JOptionPane.showInputDialog("Ingrese la primera cadena en minúsculas:");

        // Solicitar al usuario que ingrese la segunda cadena en minúsculas
        String cadena2 = JOptionPane.showInputDialog("Ingrese la segunda cadena en minúsculas:");

        // Convertir las cadenas a mayúsculas
        String cadenaMayusculas1 = cadena1.toUpperCase();
        String cadenaMayusculas2 = cadena2.toUpperCase();

        // Comparar las cadenas en mayúsculas
        if (cadenaMayusculas1.equals(cadenaMayusculas2)) {
            JOptionPane.showMessageDialog(null, "Las cadenas en mayúsculas son iguales.");
        } else {
            JOptionPane.showMessageDialog(null, "Las cadenas en mayúsculas no son iguales.");
        }
    }

}
