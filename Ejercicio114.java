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
public class Ejercicio114 {
    public static void main(String[] args) {
        // Mostrar los números comprendidos entre 1 y 1000
        mostrarNumeros();
    }

    // Función para mostrar los números comprendidos entre 1 y 1000
    public static void mostrarNumeros() {
        StringBuilder resultado = new StringBuilder("Números comprendidos entre 1 y 1000:\n");

        for (int i = 1; i <= 1000; i++) {
            resultado.append(i).append("\n");
        }

        // Mostrar el resultado en un cuadro de mensaje
        JOptionPane.showMessageDialog(null, resultado.toString());
    }

}
