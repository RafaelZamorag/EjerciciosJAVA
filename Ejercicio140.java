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
public class Ejercicio140 {
    public static void main(String[] args) {
        while (true) {
            // Mostrar el menú al usuario
            String inputOpcion = JOptionPane.showInputDialog("Menú:\n" +
                    "1) Salir\n" +
                    "2) Sumatoria\n" +
                    "3) Factorial\n" +
                    "Ingrese el número de la opción deseada:");

            // Convertir la opción a un número entero
            int opcion = obtenerEntero(inputOpcion);

            switch (opcion) {
                case 1:
                    // Salir del programa
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    System.exit(0);
                    break;
                case 2:
                    // Calcular sumatoria
                    int numeroSumatoria = obtenerEnteroPositivo("Ingrese un número para calcular su sumatoria:");
                    int sumatoria = calcularSumatoria(numeroSumatoria);
                    mostrarResultado("La sumatoria de " + numeroSumatoria + " es:", sumatoria);
                    break;
                case 3:
                    // Calcular factorial
                    int numeroFactorial = obtenerEnteroPositivo("Ingrese un número para calcular su factorial:");
                    long factorial = calcularFactorial(numeroFactorial);
                    mostrarResultado("El factorial de " + numeroFactorial + " es:", factorial);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    // Función para obtener un número entero positivo desde el teclado
    public static int obtenerEnteroPositivo(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                int numero = Integer.parseInt(input);
                if (numero >= 0) {
                    return numero;
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero positivo.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
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
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor entero válido.");
            }
        }
    }

    // Función para calcular la sumatoria de un número
    public static int calcularSumatoria(int numero) {
        int sumatoria = 0;
        for (int i = 1; i <= numero; i++) {
            sumatoria += i;
        }
        return sumatoria;
    }

    // Función para calcular el factorial de un número
    public static long calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= numero; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    // Función para mostrar el resultado en pantalla
    public static void mostrarResultado(String mensaje, long resultado) {
        JOptionPane.showMessageDialog(null, mensaje + " " + resultado);
    }

}
