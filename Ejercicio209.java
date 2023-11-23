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
public class Ejercicio209 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar el número de reprobados, aprobados, notables y
        // sobresalientes
        int reprobados = obtenerEntero("Ingrese el número de reprobados:");
        int aprobados = obtenerEntero("Ingrese el número de aprobados:");
        int notables = obtenerEntero("Ingrese el número de notables:");
        int sobresalientes = obtenerEntero("Ingrese el número de sobresalientes:");

        // Calcular estadísticas
        double porcentajeAprobados = calcularPorcentajeAprobados(aprobados, notables, sobresalientes);
        double porcentajeReprobados = calcularPorcentajeReprobados(reprobados, aprobados, notables, sobresalientes);

        // Mostrar resultados
        JOptionPane.showMessageDialog(null,
                "Tanto por ciento de alumnos que han superado la asignatura: " + porcentajeAprobados + "%");
        JOptionPane.showMessageDialog(null, "Tanto por ciento de reprobados: " + porcentajeReprobados + "%");
    }

    private static double calcularPorcentajeAprobados(int aprobados, int notables, int sobresalientes) {
        int totalAprobados = aprobados + notables + sobresalientes;
        int totalAlumnos = totalAprobados + obtenerEntero("Ingrese el número de reprobados:");

        // Calcular el tanto por ciento de alumnos que han superado la asignatura
        return (totalAprobados * 100.0) / totalAlumnos;
    }

    private static double calcularPorcentajeReprobados(int reprobados, int aprobados, int notables,
            int sobresalientes) {
        int totalAlumnos = reprobados + aprobados + notables + sobresalientes;

        // Calcular el tanto por ciento de reprobados
        return (reprobados * 100.0) / totalAlumnos;
    }

    private static int obtenerEntero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

}
