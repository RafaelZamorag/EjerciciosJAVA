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
public class Ejercicio169 {
    public static void main(String[] args) {
        // Obtener el año de nacimiento
        String input = JOptionPane.showInputDialog("Ingrese el año de nacimiento:");

        // Convertir el input a entero
        int anoNacimiento = Integer.parseInt(input);

        // Calcular la edad
        int edad = 2023 - anoNacimiento;

        // Determinar la etapa de la vida
        String etapa = determinarEtapaDeVida(edad);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "La persona está en la etapa de: " + etapa);
    }

    // Método para determinar la etapa de la vida
    private static String determinarEtapaDeVida(int edad) {
        if (edad >= 1 && edad <= 12) {
            return "Niñez (1-12 años)";
        } else if (edad >= 13 && edad <= 18) {
            return "Adolescencia (13-18 años)";
        } else if (edad >= 19 && edad <= 30) {
            return "Juventud (19-30 años)";
        } else if (edad >= 31 && edad <= 60) {
            return "Adultez (31-60 años)";
        } else if (edad > 60 && edad <= 100) {
            return "Vejez (más de 60 años)";
        } else {
            return "Edad fuera del rango de 1 a 100 años";
        }
    }

}
