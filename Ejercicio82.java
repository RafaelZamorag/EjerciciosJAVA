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
public class Ejercicio82 {
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número:"));

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "El número ingresado es positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "El número ingresado es negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "El número ingresado es cero.");
        }
    }

}
