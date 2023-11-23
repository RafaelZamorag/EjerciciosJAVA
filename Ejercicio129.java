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
public class Ejercicio129 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar el número del mes y el año
        int numeroMes = obtenerEntero("Ingrese el número del mes (1-12):");
        int año = obtenerEntero("Ingrese el año:");

        // Validar que el número del mes esté en el rango correcto
        if (numeroMes >= 1 && numeroMes <= 12) {
            // Determinar el número de días para el mes y año dados
            int diasEnMes = determinarDiasEnMes(numeroMes, año);

            // Mostrar el resultado en pantalla
            JOptionPane.showMessageDialog(null,
                    "El número total de días para el mes " + numeroMes + " del año " + año + " es: " + diasEnMes);
        } else {
            JOptionPane.showMessageDialog(null, "Número de mes no válido. Por favor, ingrese un número entre 1 y 12.");
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

    // Función para determinar el número de días en un mes y año dados
    public static int determinarDiasEnMes(int numeroMes, int año) {
        switch (numeroMes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) ? 29 : 28;
            default:
                return -1; // Mes no válido
        }
    }
}
