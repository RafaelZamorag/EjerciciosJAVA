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
public class Ejercicio148 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar la cantidad de alumnos
        int cantidadAlumnos = obtenerEnteroPositivo("Ingrese la cantidad de alumnos:");

        // Declarar un arreglo para almacenar las calificaciones
        double[] calificaciones = new double[cantidadAlumnos];

        // Solicitar al usuario ingresar las calificaciones de los alumnos
        ingresarCalificaciones(calificaciones);

        // Calcular y mostrar las estadísticas
        calcularYMostrarEstadisticas(calificaciones);
    }

    // Función para obtener un número entero positivo desde el teclado
    public static int obtenerEnteroPositivo(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
            }
        }
    }

    // Función para ingresar las calificaciones de los alumnos
    public static void ingresarCalificaciones(double[] calificaciones) {
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = obtenerDouble("Ingrese la calificación del alumno " + (i + 1) + ":");
        }
    }

    // Función para obtener un número double desde el teclado
    public static double obtenerDouble(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
            }
        }
    }

    // Función para calcular y mostrar estadísticas
    public static void calcularYMostrarEstadisticas(double[] calificaciones) {
        // Calcular el promedio
        double promedio = calcularPromedio(calificaciones);

        // Calcular la calificación más alta
        double maximo = calcularMaximo(calificaciones);

        // Calcular la calificación más baja
        double minimo = calcularMinimo(calificaciones);

        // Mostrar las estadísticas
        JOptionPane.showMessageDialog(null, "Promedio: " + promedio +
                "\nCalificación más alta: " + maximo +
                "\nCalificación más baja: " + minimo);
    }

    // Función para calcular el promedio de un arreglo de calificaciones
    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    // Función para calcular la calificación más alta en un arreglo
    public static double calcularMaximo(double[] calificaciones) {
        double maximo = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion > maximo) {
                maximo = calificacion;
            }
        }
        return maximo;
    }

    // Función para calcular la calificación más baja en un arreglo
    public static double calcularMinimo(double[] calificaciones) {
        double minimo = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion < minimo) {
                minimo = calificacion;
            }
        }
        return minimo;
    }

}
