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
public class Ejercicio119 {
    public static void main(String[] args) {
        // Definir la contraseña correcta
        String contraseñaCorrecta = "passwd";

        // Inicializar el contador de intentos
        int intentos = 0;

        // Realizar hasta 3 intentos
        while (intentos < 3) {
            // Solicitar al usuario que ingrese la contraseña
            String contraseñaIngresada = JOptionPane.showInputDialog("Ingrese la contraseña:");

            // Verificar la validez de la contraseña
            if (contraseñaCorrecta.equals(contraseñaIngresada)) {
                // Contraseña correcta
                JOptionPane.showMessageDialog(null, "Contraseña aceptada");
                break; // Salir del bucle
            } else {
                // Contraseña incorrecta
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta. Intentos restantes: " + (2 - intentos));
                intentos++;
            }
        }

        // Si se superan los 3 intentos, mostrar mensaje
        if (intentos == 3) {
            JOptionPane.showMessageDialog(null, "Intentos excedidos. El programa finalizará.");
        }
    }
}
