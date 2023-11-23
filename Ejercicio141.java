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
public class Ejercicio141 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar un número
        double numero = obtenerNumero("Ingrese un número para calcular su raíz cuadrada:");

        // Calcular la raíz cuadrada utilizando el método de aproximación
        double raizCuadrada = calcularRaizCuadrada(numero);

        // Mostrar el resultado en pantalla
        JOptionPane.showMessageDialog(null, "La raíz cuadrada de " + numero + " es aproximadamente: " + raizCuadrada);
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

    // Función para calcular la raíz cuadrada utilizando el método de aproximación
    public static double calcularRaizCuadrada(double numero) {
        double aproximacion = 1.0; // Puedes ajustar la aproximación inicial según tus necesidades

        for (int i = 0; i < 10; i++) { // Ajusta el número de iteraciones según tus necesidades
            aproximacion = 0.5 * (aproximacion + numero / aproximacion);
        }

        // Truncar el resultado a dos decimales
        aproximacion = trunc(aproximacion);

        return aproximacion;
    }

    // Función para truncar un número a dos decimales
    public static double trunc(double valor) {
        return Math.floor(valor * 100) / 100;
    }

}
