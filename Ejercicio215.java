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
public class Ejercicio215 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar los datos del coche
        double kilometrajeAnterior = obtenerCantidad("Ingrese el kilometraje de la última vez que se reportó:");
        double kilometrajeActual = obtenerCantidad("Ingrese el kilometraje actual:");
        double litrosRepostados = obtenerCantidad("Ingrese los litros de gasolina repostados la última vez:");
        double cantidadGasolinaActual = obtenerCantidad("Ingrese la cantidad de gasolina actual:");

        // Calcular el consumo medio en litros cada 100 kilómetros
        double consumoMedio = calcularConsumoMedio(kilometrajeAnterior, kilometrajeActual, litrosRepostados,
                cantidadGasolinaActual);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El consumo medio es: " + consumoMedio + " litros cada 100 kilómetros");
    }

    private static double calcularConsumoMedio(double kilometrajeAnterior, double kilometrajeActual,
            double litrosRepostados, double cantidadGasolinaActual) {
        // Calcular la distancia recorrida y el consumo medio
        double distanciaRecorrida = kilometrajeActual - kilometrajeAnterior;
        double consumoMedio = (litrosRepostados / distanciaRecorrida) * 100;

        // Calcular la cantidad de gasolina actual necesaria para recorrer 100
        // kilómetros
        double litrosCada100Km = (cantidadGasolinaActual / distanciaRecorrida) * 100;

        return litrosCada100Km;
    }

    private static double obtenerCantidad(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }

}
