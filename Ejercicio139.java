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
public class Ejercicio139 {

    public static void main(String[] args) {
        // Solicitar al usuario ingresar un número
        int numero = obtenerEnteroPositivo("Ingrese un número para calcular su factorial:");

        // Calcular el factorial del número ingresado
        long factorial = calcularFactorial(numero);

        // Mostrar el resultado en pantalla
        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
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

    // Función para calcular el factorial de un número
    public static long calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= numero; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

}
