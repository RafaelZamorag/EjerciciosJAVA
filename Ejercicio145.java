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
public class Ejercicio145 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar tres números
        double lado1 = obtenerNumero("Ingrese el primer lado del triángulo:");
        double lado2 = obtenerNumero("Ingrese el segundo lado del triángulo:");
        double lado3 = obtenerNumero("Ingrese el tercer lado del triángulo:");

        // Verificar si los números forman un triángulo
        if (esTriangulo(lado1, lado2, lado3)) {
            // Determinar el tipo de triángulo
            String tipoTriangulo = determinarTipoTriangulo(lado1, lado2, lado3);

            // Mostrar el resultado en pantalla
            JOptionPane.showMessageDialog(null, "Los lados forman un triángulo " + tipoTriangulo);
        } else {
            // Mostrar mensaje de error
            JOptionPane.showMessageDialog(null, "Los lados no forman un triángulo. Verifique los valores ingresados.");
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

    // Función para verificar si los lados forman un triángulo
    public static boolean esTriangulo(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    // Función para determinar el tipo de triángulo
    public static String determinarTipoTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return "equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "isósceles";
        } else {
            return "escaleno";
        }
    }

}
