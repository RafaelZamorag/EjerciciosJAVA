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
public class Ejercicio109 {

    public static void main(String[] args) {
        // Solicitar al usuario que ingrese el monto de la venta
        double montoVenta = obtenerMontoVenta();

        // Aplicar el descuento si el monto de la venta es mayor a 1000 pesos
        double montoNeto = (montoVenta > 1000) ? aplicarDescuento(montoVenta) : montoVenta;

        // Mostrar el monto neto de la venta
        JOptionPane.showMessageDialog(null, "El monto neto de la venta es: $" + montoNeto);
    }

    // Función para obtener el monto de la venta válido
    public static double obtenerMontoVenta() {
        double montoVenta = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                // Solicitar al usuario que ingrese el monto de la venta
                String inputMontoVenta = JOptionPane.showInputDialog("Ingrese el monto de la venta:");
                montoVenta = Double.parseDouble(inputMontoVenta);
                entradaValida = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
            }
        }

        return montoVenta;
    }

    // Función para aplicar el descuento del 10% si el monto es mayor a 1000
    public static double aplicarDescuento(double monto) {
        return monto * 0.9; // Descuento del 10%
    }

}
