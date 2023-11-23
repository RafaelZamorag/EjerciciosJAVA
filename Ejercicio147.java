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
public class Ejercicio147 {

    public static void main(String[] args) {
        // Declarar una matriz para almacenar los resultados de los exámenes
        int[][] resultados = new int[5][3];

        // Solicitar al usuario ingresar los resultados de los exámenes
        ingresarResultados(resultados);

        // Determinar y mostrar los resultados
        determinarResultados(resultados);
    }

    // Función para ingresar los resultados de los exámenes
    public static void ingresarResultados(int[][] resultados) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                resultados[i][j] = obtenerEntero(
                        "Ingrese la calificación del alumno " + (i + 1) + " en el examen " + (j + 1) + ":");
            }
        }
    }

    // Función para obtener un número entero desde el teclado
    public static int obtenerEntero(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
            }
        }
    }

    // Función para determinar y mostrar los resultados
    public static void determinarResultados(int[][] resultados) {
        // Contadores para los casos a, b y c
        int aprobadosEnTodos = 0;
        int aprobadosAlMenosUno = 0;
        int aprobadosSoloUltimo = 0;

        for (int i = 0; i < 5; i++) {
            boolean aproboTodos = true;
            boolean aproboAlMenosUno = false;
            boolean aproboSoloUltimo = true;

            for (int j = 0; j < 3; j++) {
                if (resultados[i][j] < 10) {
                    aproboTodos = false;
                } else {
                    aproboAlMenosUno = true;
                }

                if (j < 2 && resultados[i][j] >= 10) {
                    aproboSoloUltimo = false;
                }
            }

            if (aproboTodos) {
                aprobadosEnTodos++;
            }

            if (aproboAlMenosUno) {
                aprobadosAlMenosUno++;
            }

            if (aproboSoloUltimo) {
                aprobadosSoloUltimo++;
            }
        }

        // Mostrar los resultados
        JOptionPane.showMessageDialog(null, "a) Alumnos que aprobaron todos los exámenes: " + aprobadosEnTodos +
                "\nb) Alumnos que aprobaron al menos un examen: " + aprobadosAlMenosUno +
                "\nc) Alumnos que aprobaron únicamente el último examen: " + aprobadosSoloUltimo);
    }

}
