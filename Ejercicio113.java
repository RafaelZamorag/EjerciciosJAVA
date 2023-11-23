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
public class Ejercicio113 {
    public static void main(String[] args) {
        // Mostrar el menú y obtener la opción del usuario
        int opcion = mostrarMenu();

        // Calcular el costo estimado de gasolina según la opción seleccionada
        double distancia = 500.0; // Distancia a Monterrey en kilómetros
        double rendimiento = obtenerRendimiento(opcion);
        double costoGasolina = calcularCostoGasolina(distancia, rendimiento);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El costo estimado de gasolina para viajar a Monterrey en "
                + obtenerTipoTransporte(opcion) + " es: $" + costoGasolina);
    }

    // Función para mostrar el menú y obtener la opción del usuario
    public static int mostrarMenu() {
        String menu = "Seleccione el tipo de transporte para calcular el costo de gasolina:\n" +
                "1) Motocicleta\n" +
                "2) Automóvil\n" +
                "3) Pickup";

        String opcionStr = JOptionPane.showInputDialog(menu);

        // Obtener la opción ingresada
        int opcion = (opcionStr != null && opcionStr.length() > 0) ? Integer.parseInt(opcionStr) : 0;

        return opcion;
    }

    // Función para obtener el rendimiento según la opción seleccionada
    public static double obtenerRendimiento(int opcion) {
        switch (opcion) {
            case 1:
                return 20.0; // Rendimiento de Motocicleta en km/lt
            case 2:
                return 10.0; // Rendimiento de Automóvil en km/lt
            case 3:
                return 5.0; // Rendimiento de Pickup en km/lt
            default:
                return 0.0;
        }
    }

    // Función para calcular el costo estimado de gasolina
    public static double calcularCostoGasolina(double distancia, double rendimiento) {
        // Calcular la cantidad de litros necesarios
        double litrosNecesarios = distancia / rendimiento;

        // Calcular el costo de gasolina considerando un precio promedio de $25 por
        // litro
        double precioGasolina = 25.0; // Precio promedio de gasolina en pesos por litro
        return litrosNecesarios * precioGasolina;
    }

    // Función para obtener el tipo de transporte según la opción seleccionada
    public static String obtenerTipoTransporte(int opcion) {
        switch (opcion) {
            case 1:
                return "Motocicleta";
            case 2:
                return "Automóvil";
            case 3:
                return "Pickup";
            default:
                return "Tipo de transporte no válido";
        }
    }

}
