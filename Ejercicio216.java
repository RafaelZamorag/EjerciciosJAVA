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
public class Ejercicio216 {
    public static void main(String[] args) {
        // Calificaciones y tareas de cada materia
        double calificacionMatematicas = obtenerCantidad("Ingrese la calificación en Matemáticas (examen):");
        double[] tareasMatematicas = obtenerTareas(3);

        double calificacionFisica = obtenerCantidad("Ingrese la calificación en Física (examen):");
        double[] tareasFisica = obtenerTareas(2);

        double calificacionQuimica = obtenerCantidad("Ingrese la calificación en Química (examen):");
        double[] tareasQuimica = obtenerTareas(3);

        // Calcular promedio general y promedio en cada materia
        double promedioGeneral = calcularPromedioGeneral(calificacionMatematicas, calificacionFisica,
                calificacionQuimica);
        double promedioMatematicas = calcularPromedioMateria(calificacionMatematicas, tareasMatematicas);
        double promedioFisica = calcularPromedioMateria(calificacionFisica, tareasFisica);
        double promedioQuimica = calcularPromedioMateria(calificacionQuimica, tareasQuimica);

        // Mostrar los resultados
        JOptionPane.showMessageDialog(null, "Promedio general: " + promedioGeneral);
        JOptionPane.showMessageDialog(null, "Promedio en Matemáticas: " + promedioMatematicas);
        JOptionPane.showMessageDialog(null, "Promedio en Física: " + promedioFisica);
        JOptionPane.showMessageDialog(null, "Promedio en Química: " + promedioQuimica);
    }

    private static double[] obtenerTareas(int cantidadTareas) {
        double[] tareas = new double[cantidadTareas];
        for (int i = 0; i < cantidadTareas; i++) {
            tareas[i] = obtenerCantidad("Ingrese la calificación de la tarea " + (i + 1) + ":");
        }
        return tareas;
    }

    private static double obtenerCantidad(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }

    private static double calcularPromedioGeneral(double calificacionMatematicas, double calificacionFisica,
            double calificacionQuimica) {
        // Calcular el promedio general de las tres materias
        return (calificacionMatematicas + calificacionFisica + calificacionQuimica) / 3;
    }

    private static double calcularPromedioMateria(double calificacionExamen, double[] calificacionesTareas) {
        // Porcentajes de evaluación
        double porcentajeExamen = 0.0;
        double porcentajeTareas = 0.0;

        if (calificacionesTareas.length > 0) {
            porcentajeExamen = 0.9;
            porcentajeTareas = 0.1 / calificacionesTareas.length;
        }

        // Calcular el promedio en una materia
        double sumaTareas = 0.0;
        for (double tarea : calificacionesTareas) {
            sumaTareas += tarea;
        }

        double promedioTareas = (calificacionesTareas.length > 0) ? sumaTareas / calificacionesTareas.length : 0.0;

        return (calificacionExamen * porcentajeExamen) + (promedioTareas * porcentajeTareas);
    }

}
