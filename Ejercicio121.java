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
public class Ejercicio121 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese 5 números
        double[] numeros = obtenerNumeros(5);

        // Calcular la suma total de los números
        double sumaTotal = calcularSumaTotal(numeros);

        // Mostrar la suma total en pantalla
        JOptionPane.showMessageDialog(null, "La suma total de los 5 números es: " + sumaTotal);
    }

    // Función para obtener los 5 números ingresados por el usuario
    public static double[] obtenerNumeros(int cantidadNumeros) {
        double[] numeros = new double[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            try {
                // Solicitar al usuario que ingrese un número
                String inputNumero = JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":");
                numeros[i] = Double.parseDouble(inputNumero);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
                i--; // Restar 1 al índice para repetir la iteración y solicitar el número nuevamente
            }
        }

        return numeros;
    }

    // Función para calcular la suma total de los números
    public static double calcularSumaTotal(double[] numeros) {
        double sumaTotal = 0;

        for (double numero : numeros) {
            sumaTotal += numero;
        }

        return sumaTotal;
    }

}
