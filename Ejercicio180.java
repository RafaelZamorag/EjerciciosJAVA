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
public class Ejercicio180 {
    public static void main(String[] args) {
        // Inicializar variables
        int totalPersonas = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int sumaEdadesHombres = 0;
        int sumaEdadesMujeres = 0;
        int edadPersonaMasJoven = Integer.MAX_VALUE;

        // Solicitar información de personas hasta que se ingrese una edad negativa
        while (true) {
            // Obtener edad del usuario
            String edadStr = JOptionPane
                    .showInputDialog("Ingrese la edad de la persona (ingrese un número negativo para salir):");
            int edad = Integer.parseInt(edadStr);

            // Salir del bucle si se ingresa una edad negativa
            if (edad < 0) {
                break;
            }

            // Obtener sexo del usuario
            String sexo = JOptionPane.showInputDialog("Ingrese el sexo de la persona (H para hombre, M para mujer):")
                    .toUpperCase();

            // Validar que no se permiten menores de edad
            if (edad >= 18) {
                // Actualizar variables
                totalPersonas++;
                if (sexo.equals("H")) {
                    totalHombres++;
                    sumaEdadesHombres += edad;
                } else if (sexo.equals("M")) {
                    totalMujeres++;
                    sumaEdadesMujeres += edad;
                }

                // Actualizar edad de la persona más joven
                edadPersonaMasJoven = Math.min(edad, edadPersonaMasJoven);
            } else {
                JOptionPane.showMessageDialog(null, "No se permiten menores de edad en la fiesta.");
            }
        }

        // Calcular promedio de edades por sexo
        double promedioEdadesHombres = totalHombres > 0 ? (double) sumaEdadesHombres / totalHombres : 0;
        double promedioEdadesMujeres = totalMujeres > 0 ? (double) sumaEdadesMujeres / totalMujeres : 0;

        // Mostrar resultados utilizando JOptionPane
        JOptionPane.showMessageDialog(null,
                "Total de personas en la fiesta: " + totalPersonas +
                        "\nTotal de hombres: " + totalHombres +
                        "\nTotal de mujeres: " + totalMujeres +
                        "\nPromedio de edades de hombres: " + promedioEdadesHombres +
                        "\nPromedio de edades de mujeres: " + promedioEdadesMujeres +
                        "\nEdad de la persona más joven: " + edadPersonaMasJoven);
    }

}
