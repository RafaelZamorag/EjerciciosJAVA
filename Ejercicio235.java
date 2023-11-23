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
public class Ejercicio235 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar la cantidad de números de Fibonacci (N)
        int n = obtenerEnteroPositivo("Ingrese la cantidad de números de Fibonacci:");

        // Calcular y mostrar la serie de los N primeros números de Fibonacci
        String resultado = calcularFibonacci(n);
        JOptionPane.showMessageDialog(null, "Serie de Fibonacci para N=" + n + ":\n" + resultado);
    }

    private static int obtenerEnteroPositivo(String mensaje) {
        // Solicitar al usuario ingresar un número positivo y convertir a int
        int numero;
        do {
            String input = JOptionPane.showInputDialog(mensaje);
            numero = Integer.parseInt(input);
        } while (numero <= 0);

        return numero;
    }

    private static String calcularFibonacci(int n) {
        StringBuilder resultado = new StringBuilder();
        int primero = 0, segundo = 1;

        for (int i = 0; i < n; i++) {
            resultado.append(primero).append(", ");
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }

        return resultado.toString();
    }

}
