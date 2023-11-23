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
public class Ejercicio135 {
    public static void main(String[] args) {
        // Solicitar al usuario la cantidad de números a ingresar
        int cantidadNumeros = obtenerEntero("Ingrese la cantidad de números:");

        // Validar que la cantidad sea positiva
        if (cantidadNumeros <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una cantidad válida y positiva.");
            System.exit(0); // Salir del programa
        }

        // Solicitar al usuario ingresar los números
        int[] numeros = new int[cantidadNumeros];
        for (int i = 0; i < cantidadNumeros; i++) {
            numeros[i] = obtenerEntero("Ingrese el número " + (i + 1) + ":");
        }

        // Determinar cuál es el mayor y cuál es el menor
        int mayor = determinarMayor(numeros);
        int menor = determinarMenor(numeros);

        // Mostrar el resultado en pantalla
        JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor + "\nEl número menor es: " + menor);
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

    // Función para determinar el número mayor
    public static int determinarMayor(int[] numeros) {
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    // Función para determinar el número menor
    public static int determinarMenor(int[] numeros) {
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

}
