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
public class Ejercicio94 {
    public static void main(String[] args) {
        // Ingresar el número entero
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero:"));

        // Calcular el valor absoluto
        int valorAbsoluto = Math.abs(numero);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El valor absoluto de " + numero + " es: " + valorAbsoluto);
    }

}
