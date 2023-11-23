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
public class Ejercicio207 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar dos valores reales
        double numero1 = obtenerCantidad("Ingrese el primer número:");
        double numero2 = obtenerCantidad("Ingrese el segundo número:");

        // Realizar las operaciones
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;

        // Verificar la división por cero antes de realizarla
        double division = (numero2 != 0) ? (numero1 / numero2) : Double.NaN;

        double multiplicacion = numero1 * numero2;

        // Mostrar los resultados
        mostrarResultado("Suma: " + suma);
        mostrarResultado("Resta: " + resta);
        mostrarResultado("División: " + (Double.isNaN(division) ? "Error (división por cero)" : division));
        mostrarResultado("Multiplicación: " + multiplicacion);
    }

    private static double obtenerCantidad(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }

    private static void mostrarResultado(String resultado) {
        JOptionPane.showMessageDialog(null, resultado);
    }

}
