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
public class Ejercicio69 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo (n):"));
        int suma = 0;

        if (n < 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero positivo o cero.");
        } else {
            for (int i = 1; i <= n; i++) {
                suma += Math.pow(2, i);
            }

            JOptionPane.showMessageDialog(null, "La suma de potencias de 2 desde 2^1 hasta 2^" + n + " es: " + suma);
        }
    }

}
