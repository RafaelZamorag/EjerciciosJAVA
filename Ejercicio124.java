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
public class Ejercicio124 {
    public static void main(String[] args) {
        // Mostrar los múltiplos de 3 en el rango del 1 al 3000
        mostrarMultiplosDeTres();
    }

    // Función para mostrar los múltiplos de 3 en el rango del 1 al 3000
    public static void mostrarMultiplosDeTres() {
        StringBuilder resultado = new StringBuilder("Múltiplos de 3 en el rango del 1 al 3000:\n");

        for (int i = 1; i <= 3000; i++) {
            if (i % 3 == 0) {
                resultado.append(i).append("\n");
            }
        }

        // Mostrar el resultado en un cuadro de mensaje
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
