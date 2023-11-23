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
public class Ejercicio224 {
    public static void main(String[] args) {
        // Bucle para ingresar datos de los alumnos
        while (true) {
            // Solicitar al usuario ingresar el nombre del alumno
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno (deje vacío para salir):");

            // Salir del bucle si el nombre es una cadena vacía
            if (nombre.isEmpty()) {
                break;
            }

            // Solicitar al usuario ingresar las tres notas del alumno
            double practica = obtenerNota("Ingrese la nota de práctica:");
            double problemas = obtenerNota("Ingrese la nota de problemas:");
            double teoria = obtenerNota("Ingrese la nota de teoría:");

            // Verificar que las notas estén en el rango de 0 a 10
            if (esNotaValida(practica) && esNotaValida(problemas) && esNotaValida(teoria)) {
                // Calcular la nota final según el criterio especificado
                double notaFinal = calcularNotaFinal(practica, problemas, teoria);

                // Mostrar el resultado
                JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nNota Final: " + notaFinal);
            } else {
                // Mostrar mensaje de error si las notas no están en el rango válido
                JOptionPane.showMessageDialog(null,
                        "Error: Las notas deben estar en el rango de 0 a 10. Intente de nuevo.");
            }
        }
    }

    private static double obtenerNota(String mensaje) {
        // Solicitar al usuario ingresar una nota y convertir a double
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }

    private static boolean esNotaValida(double nota) {
        // Verificar si la nota está en el rango de 0 a 10
        return nota >= 0 && nota <= 10;
    }

    private static double calcularNotaFinal(double practica, double problemas, double teoria) {
        // Calcular la nota final según el criterio especificado
        return 0.1 * practica + 0.5 * problemas + 0.4 * teoria;
    }

}
