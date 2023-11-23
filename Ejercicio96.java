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
public class Ejercicio96 {
    public static void main(String[] args) {
        // Ingresar la frase
        String frase = JOptionPane.showInputDialog("Ingrese una frase:");

        // Dividir la frase en palabras
        String[] palabras = frase.split("\\s+");

        // Construir el mensaje con cada palabra y su longitud
        StringBuilder mensaje = new StringBuilder("Palabras de la frase:\n");
        for (String palabra : palabras) {
            mensaje.append(palabra).append("\t").append("Número de letras: ").append(palabra.length()).append("\n");
        }

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

}
