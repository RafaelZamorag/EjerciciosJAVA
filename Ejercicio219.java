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
public class Ejercicio219 {

    public static void main(String[] args) {
        // Solicitar al usuario ingresar el valor de N
        int n = obtenerEnteroPositivo("Ingrese un número positivo (N):");

        // Calcular y mostrar la suma de los N primeros números pares
        int suma = calcularSumaNumerosPares(n);
        JOptionPane.showMessageDialog(null, "La suma de los primeros " + n + " números pares es: " + suma);
    }

    private static int calcularSumaNumerosPares(int n) {
        // Calcular la suma de los N primeros números pares
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            int numeroPar = 2 * i;
            suma += numeroPar;
        }
        return suma;
    }

    private static int obtenerEnteroPositivo(String mensaje) {
        int numero;
        do {
            String input = JOptionPane.showInputDialog(mensaje);
            numero = Integer.parseInt(input);
        } while (numero <= 0);

        return numero;
    }

}
