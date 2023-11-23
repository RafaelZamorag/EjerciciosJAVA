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
public class Ejercicio65 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo (n):"));
        int suma = 0;

        if (n <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero positivo.");
        } else {
            for (int i = 1; i <= n; i++) {
                suma += i;
            }

            JOptionPane.showMessageDialog(null, "La suma de los números desde 1 hasta " + n + " es: " + suma);
        }
    }
}
