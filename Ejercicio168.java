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
public class Ejercicio168 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese las 5 letras vocales en desorden
        String inputVocales = JOptionPane.showInputDialog("Ingrese las 5 letras vocales en desorden:");

        // Verificar si se ingresaron exactamente 5 caracteres
        if (inputVocales.length() != 5) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese exactamente 5 letras vocales.");
            return; // Salir del programa si no se ingresaron 5 caracteres
        }

        // Convertir la cadena a un arreglo de caracteres
        char[] vocales = inputVocales.toCharArray();

        // Ordenar el arreglo de caracteres
        Arrays.sort(vocales);

        // Convertir el arreglo ordenado de nuevo a una cadena
        String vocalesOrdenadas = new String(vocales);

        // Mostrar las vocales ordenadas utilizando JOptionPane.showMessageDialog
        JOptionPane.showMessageDialog(null, "Las vocales ordenadas son: " + vocalesOrdenadas);
    }
}
