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
public class Ejercicio70 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo (n):"));
        int resultado = 0;
        int signo = 1;

        if (n < 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero positivo o cero.");
        } else {
            for (int i = 1; i <= n; i++) {
                resultado += signo * i;
                signo *= -1; // Cambiamos el signo en cada iteración
            }

            JOptionPane.showMessageDialog(null,
                    "El resultado de la expresión 1 - 2 + 3 - 4 + 5 - 6 + ... + " + n + " es: " + resultado);
        }
    }

}
