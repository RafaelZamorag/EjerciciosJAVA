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
public class Ejercicio92 {
    public static void main(String[] args) {
        // Ingresar la longitud de los vectores
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de los vectores:"));

        // Ingresar elementos del primer vector
        int[] vector1 = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            vector1[i] = Integer
                    .parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + " del primer vector:"));
        }

        // Ingresar elementos del segundo vector
        int[] vector2 = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            vector2[i] = Integer
                    .parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + " del segundo vector:"));
        }

        // Calcular el producto escalar
        int productoEscalar = calcularProductoEscalar(vector1, vector2);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El producto escalar de los vectores es: " + productoEscalar);
    }

    // Función para calcular el producto escalar de dos vectores
    private static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            throw new IllegalArgumentException("Los vectores deben tener la misma longitud.");
        }

        int productoEscalar = 0;
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }

        return productoEscalar;
    }
}
