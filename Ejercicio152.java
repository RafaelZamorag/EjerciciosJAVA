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
public class Ejercicio152 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese una cadena de caracteres
        String inputCadena = JOptionPane.showInputDialog("Ingrese una cadena de caracteres:");

        // Convertir la cadena de entrada a un arreglo de caracteres
        char[] arregloOriginal = inputCadena.toCharArray();

        // Crear un nuevo arreglo para copiar la cadena
        char[] arregloCopia = new char[arregloOriginal.length];

        // Copiar el contenido del arreglo original al arreglo de copia
        System.arraycopy(arregloOriginal, 0, arregloCopia, 0, arregloOriginal.length);

        // Mostrar la cadena original y la copia en mensajes separados
        JOptionPane.showMessageDialog(null, "Cadena Original: " + new String(arregloOriginal));
        JOptionPane.showMessageDialog(null, "Copia de la Cadena: " + new String(arregloCopia));
    }

}
