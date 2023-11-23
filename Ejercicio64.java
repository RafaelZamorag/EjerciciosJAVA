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
public class Ejercicio64 {
    public static void main(String[] args) {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de x (base):"));
        int exponente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de y (exponente):"));
        int resultado = 1;

        if (base < 0 || exponente < 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese números enteros positivos.");
        } else {
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }

            JOptionPane.showMessageDialog(null, base + "^" + exponente + " = " + resultado);
        }
    }

}
