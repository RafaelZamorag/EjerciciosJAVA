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
public class Ejercicio165 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese la cantidad de horas
        String inputHoras = JOptionPane.showInputDialog("Ingrese la cantidad de horas:");

        // Solicitar al usuario que ingrese la cantidad de minutos
        String inputMinutos = JOptionPane.showInputDialog("Ingrese la cantidad de minutos:");

        // Solicitar al usuario que ingrese la cantidad de segundos
        String inputSegundos = JOptionPane.showInputDialog("Ingrese la cantidad de segundos:");

        // Convertir las cadenas a números
        try {
            int horas = Integer.parseInt(inputHoras);
            int minutos = Integer.parseInt(inputMinutos);
            int segundos = Integer.parseInt(inputSegundos);

            // Calcular el total de segundos
            int totalSegundos = horas * 3600 + minutos * 60 + segundos;

            // Mostrar el resultado utilizando JOptionPane.showMessageDialog
            JOptionPane.showMessageDialog(null, "La cantidad total de segundos es: " + totalSegundos);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores numéricos válidos.");
        }
    }

}
