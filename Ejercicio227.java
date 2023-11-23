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
public class Ejercicio227 {
    public static void main(String[] args) {
        // Precios fijos de los productos
        final double PRECIO_BOCADILLO_JAMON = 1.5;
        final double PRECIO_REFRESCO = 1.05;
        final double PRECIO_CERVEZA = 2.0; // Precio ficticio para la cerveza

        // Solicitar al usuario ingresar el número de unidades consumidas de cada
        // producto
        int cantidadBocadilloJamon = obtenerCantidad("Ingrese el número de bocadillos de jamón:");
        int cantidadRefresco = obtenerCantidad("Ingrese el número de refrescos:");
        int cantidadCerveza = obtenerCantidad("Ingrese el número de cervezas:");

        // Calcular la cuenta total
        double total = calcularCuentaTotal(cantidadBocadilloJamon, cantidadRefresco, cantidadCerveza,
                PRECIO_BOCADILLO_JAMON, PRECIO_REFRESCO, PRECIO_CERVEZA);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "Cuenta total: $" + total);
    }

    private static int obtenerCantidad(String mensaje) {
        // Solicitar al usuario ingresar la cantidad de un producto y convertir a int
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

    private static double calcularCuentaTotal(int cantidadBocadilloJamon, int cantidadRefresco, int cantidadCerveza,
            double precioBocadilloJamon, double precioRefresco, double precioCerveza) {
        // Calcular la cuenta total sumando el costo de cada producto
        double total = cantidadBocadilloJamon * precioBocadilloJamon
                + cantidadRefresco * precioRefresco
                + cantidadCerveza * precioCerveza;
        return total;
    }

}
