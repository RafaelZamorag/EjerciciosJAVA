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
public class Ejercicio93 {
    public static void main(String[] args) {
        // Ingresar el tiempo en minutos
        int tiempoEnMinutos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo en minutos:"));

        // Calcular horas, minutos y segundos
        int horas = tiempoEnMinutos / 60;
        int minutos = tiempoEnMinutos % 60;
        int segundos = minutos * 60;

        // Mostrar el resultado
        String mensaje = "Tiempo ingresado: " + tiempoEnMinutos + " minutos\n" +
                "Equivalente a: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
