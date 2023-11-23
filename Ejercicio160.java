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
public class Ejercicio160 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un tiempo en segundos
        String inputSegundos = JOptionPane.showInputDialog("Ingrese el tiempo en segundos:");

        // Convertir la cadena a un número entero
        try {
            int tiempoSegundos = Integer.parseInt(inputSegundos);

            // Calcular días, horas y minutos
            int dias = tiempoSegundos / (24 * 3600);
            int horas = (tiempoSegundos % (24 * 3600)) / 3600;
            int minutos = (tiempoSegundos % 3600) / 60;

            // Mostrar el resultado utilizando JOptionPane.showMessageDialog
            JOptionPane.showMessageDialog(null, "Tiempo en segundos: " + tiempoSegundos + "\n"
                    + "Días: " + dias + "\n"
                    + "Horas: " + horas + "\n"
                    + "Minutos: " + minutos);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
        }
    }

}
