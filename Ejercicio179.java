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
public class Ejercicio179 {
    public static void main(String[] args) {
        // Obtener las calificaciones del usuario
        double matematicas = obtenerCalificacion("Matemáticas");
        double ingles = obtenerCalificacion("Inglés");
        double espanol = obtenerCalificacion("Español");

        // Calcular el promedio
        double promedio = calcularPromedio(matematicas, ingles, espanol);

        // Contar el total de materias aprobadas y reprobadas
        int aprobadas = contarMateriasAprobadas(matematicas, ingles, espanol);
        int reprobadas = contarMateriasReprobadas(matematicas, ingles, espanol);

        // Obtener la materia con la menor calificación
        String materiaMenorCalificacion = obtenerMateriaMenorCalificacion(matematicas, ingles, espanol);

        // Mostrar los resultados utilizando JOptionPane
        JOptionPane.showMessageDialog(null, "Promedio: " + promedio
                + "\nTotal de materias aprobadas: " + aprobadas
                + "\nTotal de materias reprobadas: " + reprobadas
                + "\nMateria con menor calificación: " + materiaMenorCalificacion);
    }

    // Método para obtener una calificación del usuario
    private static double obtenerCalificacion(String materia) {
        String calificacionStr = JOptionPane.showInputDialog("Ingrese la calificación de " + materia + ":");
        return Double.parseDouble(calificacionStr);
    }

    // Método para calcular el promedio de tres calificaciones
    private static double calcularPromedio(double calificacion1, double calificacion2, double calificacion3) {
        return (calificacion1 + calificacion2 + calificacion3) / 3.0;
    }

    // Método para contar el total de materias aprobadas
    private static int contarMateriasAprobadas(double matematicas, double ingles, double espanol) {
        int contador = 0;
        if (matematicas >= 6.0) {
            contador++;
        }
        if (ingles >= 6.0) {
            contador++;
        }
        if (espanol >= 6.0) {
            contador++;
        }
        return contador;
    }

    // Método para contar el total de materias reprobadas
    private static int contarMateriasReprobadas(double matematicas, double ingles, double espanol) {
        int contador = 0;
        if (matematicas < 6.0) {
            contador++;
        }
        if (ingles < 6.0) {
            contador++;
        }
        if (espanol < 6.0) {
            contador++;
        }
        return contador;
    }

    // Método para obtener la materia con la menor calificación
    private static String obtenerMateriaMenorCalificacion(double matematicas, double ingles, double espanol) {
        double menorCalificacion = Math.min(matematicas, Math.min(ingles, espanol));

        if (menorCalificacion == matematicas) {
            return "Matemáticas";
        } else if (menorCalificacion == ingles) {
            return "Inglés";
        } else {
            return "Español";
        }
    }

}
