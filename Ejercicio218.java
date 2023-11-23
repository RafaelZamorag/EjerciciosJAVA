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
public class Ejercicio218 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar el valor de N
        int n = obtenerEnteroPositivoPar("Ingrese un número positivo y par (N):");

        // Calcular y mostrar la suma de los primeros N números naturales
        int suma = calcularSumaNaturales(n);
        JOptionPane.showMessageDialog(null, "La suma de los primeros " + n + " números naturales es: " + suma);
    }

    private static int calcularSumaNaturales(int n) {
        // Calcular la suma de los primeros N números naturales
        return (n * (n + 1)) / 2;
    }

    private static int obtenerEnteroPositivoPar(String mensaje) {
        int numero;
        do {
            String input = JOptionPane.showInputDialog(mensaje);
            numero = Integer.parseInt(input);
        } while (numero <= 0 || numero % 2 != 0);

        return numero;
    }

}
