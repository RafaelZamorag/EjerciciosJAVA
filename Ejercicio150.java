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
public class Ejercicio150 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número entero
        int numero = obtenerEnteroPositivo(
                "Ingrese un número entero para calcular su descomposición en factores primos:");

        // Calcular y mostrar la descomposición en factores primos
        String resultado = descomponerEnFactoresPrimos(numero);
        JOptionPane.showMessageDialog(null, "Descomposición en factores primos de " + numero + ": " + resultado);
    }

    // Función para obtener un número entero positivo desde el teclado
    public static int obtenerEnteroPositivo(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                int numero = Integer.parseInt(input);
                if (numero > 0) {
                    return numero;
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero positivo.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
            }
        }
    }

    // Función para descomponer un número en factores primos
    public static String descomponerEnFactoresPrimos(int numero) {
        int divisor = 2;
        StringBuilder resultado = new StringBuilder();

        while (numero > 1) {
            if (numero % divisor == 0) {
                resultado.append(divisor).append(" ");
                numero /= divisor;
            } else {
                divisor++;
            }
        }

        return resultado.toString().trim();
    }

}
