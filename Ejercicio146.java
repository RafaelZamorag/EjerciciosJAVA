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
public class Ejercicio146 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar el número límite para la serie de Fibonacci
        int limite = obtenerEnteroPositivo("Ingrese el número límite para la serie de Fibonacci:");

        // Mostrar la serie de Fibonacci hasta el límite
        mostrarSerieFibonacci(limite);
    }

    // Función para obtener un número entero positivo desde el teclado
    public static int obtenerEnteroPositivo(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                int numero = Integer.parseInt(input);
                if (numero >= 0) {
                    return numero;
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero positivo.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
            }
        }
    }

    // Función para mostrar la serie de Fibonacci hasta un número límite
    public static void mostrarSerieFibonacci(int limite) {
        int a = 0, b = 1;

        // Mostrar los primeros dos números de la serie
        JOptionPane.showMessageDialog(null, "Serie de Fibonacci hasta el número " + limite + ":\n" + a + "\n" + b);

        // Calcular y mostrar los siguientes números de la serie hasta el límite
        while (true) {
            int siguiente = a + b;
            if (siguiente > limite) {
                break;
            }
            JOptionPane.showMessageDialog(null, siguiente);
            a = b;
            b = siguiente;
        }
    }

}
