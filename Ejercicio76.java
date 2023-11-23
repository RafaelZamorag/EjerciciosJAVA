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
public class Ejercicio76 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero:"));

        int cifras = 0;
        int numeroAbsoluto = Math.abs(numero);

        while (numeroAbsoluto > 0) {
            cifras++;
            numeroAbsoluto /= 10;
        }

        JOptionPane.showMessageDialog(null, "El número " + numero + " tiene " + cifras + " cifras.");
    }
}
