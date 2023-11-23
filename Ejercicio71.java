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
public class Ejercicio71 {
    public static void main(String[] args) {
        int n = Integer
                .parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de términos de la serie de Fibonacci (n):"));

        if (n <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero positivo.");
        } else {
            int primero = 1;
            int segundo = 1;
            StringBuilder resultado = new StringBuilder();

            resultado.append(primero).append(" ").append(segundo).append(" ");

            for (int i = 3; i <= n; i++) {
                int siguiente = primero + segundo;
                resultado.append(siguiente).append(" ");
                primero = segundo;
                segundo = siguiente;
            }

            JOptionPane.showMessageDialog(null,
                    "La serie de Fibonacci con " + n + " términos es: " + resultado.toString());
        }
    }

}
