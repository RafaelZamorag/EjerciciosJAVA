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
public class Ejercicio213 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar los tiempos de cada día de la semana
        double tiempoLunes = obtenerCantidad("Ingrese el tiempo del lunes (en minutos):");
        double tiempoMiercoles = obtenerCantidad("Ingrese el tiempo del miércoles (en minutos):");
        double tiempoViernes = obtenerCantidad("Ingrese el tiempo del viernes (en minutos):");

        // Calcular el tiempo promedio
        double tiempoPromedio = calcularTiempoPromedio(tiempoLunes, tiempoMiercoles, tiempoViernes);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El tiempo promedio en una semana es: " + tiempoPromedio + " minutos");
    }

    private static double calcularTiempoPromedio(double tiempoLunes, double tiempoMiercoles, double tiempoViernes) {
        // Calcular el tiempo promedio sumando los tiempos de los tres días y dividiendo
        // por 3
        return (tiempoLunes + tiempoMiercoles + tiempoViernes) / 3;
    }

    private static double obtenerCantidad(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }

}
