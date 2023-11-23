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
public class Ejercicio201 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar las calificaciones parciales, la del examen
        // final y la del trabajo final
        double[] calificacionesParciales = new double[3];
        for (int i = 0; i < 3; i++) {
            calificacionesParciales[i] = obtenerCantidad("Ingrese la calificación parcial " + (i + 1) + ":");
        }

        double calificacionExamenFinal = obtenerCantidad("Ingrese la calificación del examen final:");
        double calificacionTrabajoFinal = obtenerCantidad("Ingrese la calificación del trabajo final:");

        // Calcular la calificación final
        double calificacionFinal = calcularCalificacionFinal(calificacionesParciales, calificacionExamenFinal,
                calificacionTrabajoFinal);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "La calificación final es: " + calificacionFinal);
    }

    private static double obtenerCantidad(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }

    private static double calcularCalificacionFinal(double[] calificacionesParciales, double calificacionExamenFinal,
            double calificacionTrabajoFinal) {
        // Calcular el promedio de las calificaciones parciales
        double promedioParciales = (calificacionesParciales[0] + calificacionesParciales[1]
                + calificacionesParciales[2]) / 3;

        // Calcular la calificación final con los porcentajes dados
        double calificacionFinal = 0.55 * promedioParciales + 0.30 * calificacionExamenFinal
                + 0.15 * calificacionTrabajoFinal;

        return calificacionFinal;
    }
}
