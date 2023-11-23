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
public class Ejercicio186 {
    public static void main(String[] args) {
        // Captura de la cadena de caracteres
        String palabra = JOptionPane.showInputDialog("Ingrese una palabra:");

        // Invertir la palabra
        String palabraInvertida = invertirPalabra(palabra);

        // Mostrar la palabra invertida
        JOptionPane.showMessageDialog(null, "La palabra invertida es: " + palabraInvertida);
    }

    private static String invertirPalabra(String palabra) {
        // Convertir la cadena a un arreglo de caracteres
        char[] caracteres = palabra.toCharArray();

        // Invertir el orden de los caracteres
        for (int i = 0; i < caracteres.length / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - 1 - i];
            caracteres[caracteres.length - 1 - i] = temp;
        }

        // Convertir el arreglo de caracteres de vuelta a una cadena
        return new String(caracteres);
    }

}
