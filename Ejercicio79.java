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
public class Ejercicio79 {
    public static void main(String[] args) {
        int voltajeBombillo = 120; // Voltaje de un bombillo en voltios
        int numeroBombillos = 3; // Número de bombillos
        int voltajeTotal = voltajeBombillo * numeroBombillos;

        JOptionPane.showMessageDialog(null,
                "El voltaje total de los tres bombillos es: " + voltajeTotal + " V (kilovoltios)");
    }

}
