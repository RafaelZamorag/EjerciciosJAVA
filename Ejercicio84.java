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
public class Ejercicio84 {
    public static void main(String[] args) {
        String inputEdad = JOptionPane.showInputDialog("Ingrese su edad:");
        int edad = Integer.parseInt(inputEdad);

        JOptionPane.showMessageDialog(null, "La edad ingresada es: " + edad);
    }

}
