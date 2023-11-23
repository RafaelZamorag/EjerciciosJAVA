/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segunda.parte;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Ejercicio95 {
    public static void main(String[] args) {
        // Ingresar la longitud del vector
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del vector:"));

        // Ingresar elementos del vector
        int[] vector = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            vector[i] = Integer
                    .parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1) + " del vector:"));
        }

        // Ordenar el vector de mayor a menor
        Arrays.sort(vector);
        int[] vectorOrdenado = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            vectorOrdenado[i] = vector[longitud - i - 1];
        }

        // Mostrar el vector ordenado
        StringBuilder mensaje = new StringBuilder("Vector ordenado de mayor a menor: ");
        for (int i = 0; i < longitud; i++) {
            mensaje.append(vectorOrdenado[i]).append(" ");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
        {

        }

    }

}
