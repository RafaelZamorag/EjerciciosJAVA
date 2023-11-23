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
public class Ejercicio157 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese su nombre en MAYÚSCULAS
        String nombreEnMayusculas = JOptionPane.showInputDialog("Ingrese su nombre en MAYÚSCULAS:");

        // Verificar si el nombre comienza con la letra 'A'
        if (nombreEnMayusculas.startsWith("A")) {
            // Convertir el nombre a minúsculas
            String nombreEnMinusculas = nombreEnMayusculas.toLowerCase();
            JOptionPane.showMessageDialog(null, "Nombre convertido a minúsculas: " + nombreEnMinusculas);
        } else {
            // No convertir el nombre si no comienza con 'A'
            JOptionPane.showMessageDialog(null,
                    "El nombre no comienza con la letra 'A'. No se realizaron conversiones.");
        }
    }

}
