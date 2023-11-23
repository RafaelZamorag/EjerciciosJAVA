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
public class Ejercicio106 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese dos números enteros positivos
        String inputNumero1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        int numero1 = Integer.parseInt(inputNumero1);

        String inputNumero2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
        int numero2 = Integer.parseInt(inputNumero2);

        // Calcular el máximo común divisor
        int mcd = calcularMCD(numero1, numero2);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El MCD de " + numero1 + " y " + numero2 + " es: " + mcd);
    }

    // Función para calcular el máximo común divisor usando el algoritmo de Euclides
    public static int calcularMCD(int m, int n) {
        // Aplicar el algoritmo de Euclides
        while (n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }
        return m;
    }

}
