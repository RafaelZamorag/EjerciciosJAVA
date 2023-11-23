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
public class Ejercicio112 {
    public static void main(String[] args) {
        // Mostrar el menú y obtener la opción del usuario
        char opcion = mostrarMenu();

        // Obtener el destino y mensaje según la opción seleccionada
        String destino = obtenerDestino(opcion);
        int tiempoTraslado = obtenerTiempoTraslado(opcion);
        double costo = obtenerCosto(opcion);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "Su destino es \"" + destino + "\", tiempo de traslado " +
                tiempoTraslado + " hrs, costo $" + costo);
    }

    // Función para mostrar el menú y obtener la opción del usuario
    public static char mostrarMenu() {
        String menu = "Línea de autobuses ADO, seleccione su destino:\n" +
                "a) Cartagena. [$150]\n" +
                "b) Barranquilla. [$320]\n" +
                "c) Sincelejo. [$120]\n" +
                "d) Valledupar. [$90]\n" +
                "e) Santa Marta.[$110]";

        String opcionStr = JOptionPane.showInputDialog(menu);

        // Obtener el primer carácter de la opción ingresada
        char opcion = (opcionStr != null && opcionStr.length() > 0) ? opcionStr.charAt(0) : ' ';

        return opcion;
    }

    // Función para obtener el destino según la opción seleccionada
    public static String obtenerDestino(char opcion) {
        switch (Character.toUpperCase(opcion)) {
            case 'A':
                return "Cartagena";
            case 'B':
                return "Barranquilla";
            case 'C':
                return "Sincelejo";
            case 'D':
                return "Valledupar";
            case 'E':
                return "Santa Marta";
            default:
                return "Destino no válido";
        }
    }

    // Función para obtener el tiempo de traslado según la opción seleccionada
    public static int obtenerTiempoTraslado(char opcion) {
        switch (Character.toUpperCase(opcion)) {
            case 'A':
                return 2;
            case 'B':
                return 4;
            case 'C':
                return 3;
            case 'D':
                return 5;
            case 'E':
                return 3;
            default:
                return 0;
        }
    }

    // Función para obtener el costo del boleto según la opción seleccionada
    public static double obtenerCosto(char opcion) {
        switch (Character.toUpperCase(opcion)) {
            case 'A':
                return 200.0;
            case 'B':
                return 320.0;
            case 'C':
                return 120.0;
            case 'D':
                return 90.0;
            case 'E':
                return 110.0;
            default:
                return 0.0;
        }
    }

}
