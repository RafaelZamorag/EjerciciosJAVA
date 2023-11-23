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
public class Ejercicio138 {
    public static void main(String[] args) {
        // Bucle principal para mostrar el menú
        while (true) {
            // Mostrar menú de opciones al usuario
            String inputOpcion = JOptionPane.showInputDialog("Calculadora de Áreas\n" +
                    "1. Calcular área del círculo\n" +
                    "2. Calcular área del rectángulo\n" +
                    "3. Calcular área del triángulo\n" +
                    "0. Salir\n" +
                    "Seleccione una opción:");

            // Convertir la opción a un número entero
            int opcion = obtenerEntero(inputOpcion);

            // Realizar la operación correspondiente según la opción seleccionada
            switch (opcion) {
                case 1:
                    // Calcular área del círculo
                    double radio = obtenerNumero("Ingrese el radio del círculo:");
                    double areaCirculo = calcularAreaCirculo(radio);
                    mostrarResultado("Área del círculo:", areaCirculo);
                    break;
                case 2:
                    // Calcular área del rectángulo
                    double baseRectangulo = obtenerNumero("Ingrese la base del rectángulo:");
                    double alturaRectangulo = obtenerNumero("Ingrese la altura del rectángulo:");
                    double areaRectangulo = calcularAreaRectangulo(baseRectangulo, alturaRectangulo);
                    mostrarResultado("Área del rectángulo:", areaRectangulo);
                    break;
                case 3:
                    // Calcular área del triángulo
                    double baseTriangulo = obtenerNumero("Ingrese la base del triángulo:");
                    double alturaTriangulo = obtenerNumero("Ingrese la altura del triángulo:");
                    double areaTriangulo = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
                    mostrarResultado("Área del triángulo:", areaTriangulo);
                    break;
                case 0:
                    // Salir del programa
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    // Función para obtener un número desde el teclado
    public static double obtenerNumero(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                return Double.parseDouble(input);
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

    // Función para calcular el área del círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Función para calcular el área del rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Función para calcular el área del triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Función para mostrar el resultado en pantalla
    public static void mostrarResultado(String mensaje, double resultado) {
        JOptionPane.showMessageDialog(null, mensaje + " " + resultado);
    }

}
