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
public class Ejercicio66 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo (n):"));
        int suma = 0;

        if (n <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero positivo.");
        } else {
            for (int i = 1; i <= 2 * n - 1; i += 2) {
                suma += i;
            }

            JOptionPane.showMessageDialog(null,
                    "La suma de los números impares desde 1 hasta " + (2 * n - 1) + " es: " + suma);
        }
    }

}
