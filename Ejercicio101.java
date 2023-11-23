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
public class Ejercicio101 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese el primer número
        String inputNumero1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        int numero1 = Integer.parseInt(inputNumero1);

        // Solicitar al usuario que ingrese el segundo número
        String inputNumero2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
        int numero2 = Integer.parseInt(inputNumero2);

        // Verificar si el primer número es divisible por el segundo
        String resultado = (esDivisible(numero1, numero2)) ? "Es divisible." : "No es divisible.";

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, resultado);
    }

    // Función para determinar si un número es divisible por otro
    public static boolean esDivisible(int num1, int num2) {
        // Verificar si el primer número es divisible por el segundo
        return num1 % num2 == 0;
    }

}
