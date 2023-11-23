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
public class Ejercicio108 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número
        int numero = obtenerNumero();

        // Determinar si el número es par o impar
        String resultado = (esPar(numero)) ? "El número es par." : "El número es impar.";

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, resultado);
    }

    // Función para obtener un número válido
    public static int obtenerNumero() {
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                // Solicitar al usuario que ingrese un número
                String inputNumero = JOptionPane.showInputDialog("Ingrese un número:");
                numero = Integer.parseInt(inputNumero);
                entradaValida = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
            }
        }

        return numero;
    }

    // Función para determinar si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
