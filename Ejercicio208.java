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
public class Ejercicio208 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar las calificaciones parciales, la de prácticas y
        // la de asistencia
        double[] calificacionesParciales = new double[3];
        for (int i = 0; i < 3; i++) {
            calificacionesParciales[i] = obtenerCantidad("Ingrese la calificación parcial " + (i + 1) + ":");
        }

        double calificacionPracticas = obtenerCantidad("Ingrese la calificación de prácticas:");
        double calificacionAsistencia = obtenerCantidad("Ingrese la calificación de asistencia a clases:");

        // Calcular la calificación final
        double calificacionFinal = calcularCalificacionFinal(calificacionesParciales, calificacionPracticas,
                calificacionAsistencia);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "La calificación final es: " + calificacionFinal);
    }

    private static double calcularCalificacionFinal(double[] calificacionesParciales, double calificacionPracticas,
            double calificacionAsistencia) {
        // Calcular el promedio de las calificaciones parciales
        double promedioParciales = (calificacionesParciales[0] + calificacionesParciales[1]
                + calificacionesParciales[2]) / 3;

        // Calcular la calificación final con los porcentajes dados
        double calificacionFinal = 0.6 * promedioParciales + 0.3 * calificacionPracticas + 0.1 * calificacionAsistencia;

        return calificacionFinal;
    }

    private static double obtenerCantidad(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }
}
