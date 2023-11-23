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
public class Ejercicio127 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar la fecha (día, mes, año)
        int dia = obtenerEntero("Ingrese el día:");
        int mes = obtenerEntero("Ingrese el mes:");
        int año = obtenerEntero("Ingrese el año:");

        // Determinar la estación del año
        String estacion = determinarEstacion(dia, mes);

        // Mostrar la estación del año en pantalla
        JOptionPane.showMessageDialog(null,
                "La fecha " + dia + "/" + mes + "/" + año + " pertenece a la estación: " + estacion);
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

    // Función para determinar la estación del año
    public static String determinarEstacion(int dia, int mes) {
        String estacion = "";

        switch (mes) {
            case 1:
            case 2:
                estacion = "Invierno";
                break;
            case 3:
                if (dia >= 20) {
                    estacion = "Primavera";
                } else {
                    estacion = "Invierno";
                }
                break;
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
                if (dia >= 21) {
                    estacion = "Verano";
                } else {
                    estacion = "Primavera";
                }
                break;
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
                if (dia >= 22) {
                    estacion = "Otoño";
                } else {
                    estacion = "Verano";
                }
                break;
            case 10:
            case 11:
                estacion = "Otoño";
                break;
            case 12:
                if (dia >= 21) {
                    estacion = "Invierno";
                } else {
                    estacion = "Otoño";
                }
                break;
            default:
                estacion = "Mes no válido";
        }

        return estacion;
    }

}
