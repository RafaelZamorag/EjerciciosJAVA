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
public class Ejercicio120 {
    public static void main(String[] args) {
        // Bucle para seguir imprimiendo el saludo según la respuesta del usuario
        do {
            // Imprimir el saludo
            JOptionPane.showMessageDialog(null, "Hola usuario!");

            // Preguntar al usuario si desea seguir imprimiendo
            String respuesta = JOptionPane.showInputDialog("¿Desea que siga imprimiendo el saludo? (S/N)");

            // Verificar la respuesta del usuario
            if (respuesta == null || !respuesta.equalsIgnoreCase("S")) {
                break; // Salir del bucle si la respuesta no es "S"
            }
        } while (true);
    }

}
