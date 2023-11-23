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
public class Ejercicio103 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese el primer número
        String inputNumero1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        double numero1 = Double.parseDouble(inputNumero1);

        // Solicitar al usuario que ingrese el segundo número
        String inputNumero2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
        double numero2 = Double.parseDouble(inputNumero2);

        // Solicitar al usuario que ingrese el tercer número
        String inputNumero3 = JOptionPane.showInputDialog("Ingrese el tercer número:");
        double numero3 = Double.parseDouble(inputNumero3);

        // Determinar el número menor
        double menor = encontrarMenor(numero1, numero2, numero3);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El número menor es: " + menor);
    }

    // Función para encontrar el número menor entre tres números
    public static double encontrarMenor(double num1, double num2, double num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

}
