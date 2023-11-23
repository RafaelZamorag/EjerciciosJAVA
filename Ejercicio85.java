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
public class Ejercicio85 {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El número ingresado es PAR.");
        } else {
            JOptionPane.showMessageDialog(null, "El número ingresado es IMPAR.");
        }
    }

}
