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
public class Ejercicio142 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar la base (N)
        double base = obtenerNumero("Ingrese la base (N):");

        // Solicitar al usuario ingresar el exponente (X)
        int exponente = obtenerEntero("Ingrese el exponente (X):");

        // Calcular N^X
        double resultado = calcularPotencia(base, exponente);

        // Mostrar el resultado en pantalla
        JOptionPane.showMessageDialog(null, base + " elevado a la potencia " + exponente + " es igual a: " + resultado);
    }

    // Función para obtener un número desde el teclado
    public static double obtenerNumero(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
            }
        }
    }

    // Función para obtener un número entero desde el teclado
    public static int obtenerEntero(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor entero válido.");
            }
        }
    }

    // Función para calcular la potencia N^X
    public static double calcularPotencia(double base, int exponente) {
        if (exponente == 0) {
            return 1; // Cualquier número elevado a la potencia 0 es 1
        }

        double resultado = 1.0;

        // Manejar exponentes negativos
        if (exponente < 0) {
            base = 1 / base;
            exponente = -exponente;
        }

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }

}
