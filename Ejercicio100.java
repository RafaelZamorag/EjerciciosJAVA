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
public class Ejercicio100 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese el primer número
        String inputNumero1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        int numero1 = Integer.parseInt(inputNumero1);

        // Solicitar al usuario que ingrese el segundo número
        String inputNumero2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
        int numero2 = Integer.parseInt(inputNumero2);

        // Calcular la suma de los dos números
        int suma = numero1 + numero2;

        // Determinar si la suma es par o impar
        String resultado = (suma % 2 == 0) ? "La suma es par." : "La suma es impar.";

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, resultado);
    }

}
