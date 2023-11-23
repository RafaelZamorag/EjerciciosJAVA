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
public class Ejercicio173 {
    public static void main(String[] args) {
        double totalPagar = 0;
        int cantidadTotalProductos = 0;

        while (true) {
            // Obtener la cantidad vendida del usuario
            String cantidadStr = JOptionPane.showInputDialog("Introduzca la cantidad vendida (0 para finalizar):");
            int cantidad = Integer.parseInt(cantidadStr);

            // Salir del bucle si la cantidad es cero
            if (cantidad == 0) {
                break;
            }

            // Obtener el precio del usuario
            String precioStr = JOptionPane.showInputDialog("Introduzca el precio:");
            double precio = Double.parseDouble(precioStr);

            // Calcular el subtotal y actualizar el total a pagar y la cantidad total de
            // productos
            double subtotal = cantidad * precio;
            totalPagar += subtotal;
            cantidadTotalProductos += cantidad;
        }

        // Mostrar el resultado usando JOptionPane
        JOptionPane.showMessageDialog(null,
                "Total a pagar: $" + totalPagar + "\nCantidad total de productos: " + cantidadTotalProductos);
    }

}
