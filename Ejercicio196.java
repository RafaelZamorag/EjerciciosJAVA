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
public class Ejercicio196 {
    public static void main(String[] args) {
        // Declarar e inicializar el arreglo bidimensional para los ingresos
        double[][] ingresosVendedores = new double[18][10];

        // Ingresar los datos de ingresos de cada vendedor y producto
        ingresarIngresos(ingresosVendedores);

        // Mostrar menú de opciones
        mostrarMenu(ingresosVendedores);
    }

    private static void ingresarIngresos(double[][] ingresosVendedores) {
        for (int vendedor = 0; vendedor < 18; vendedor++) {
            for (int producto = 0; producto < 10; producto++) {
                // Solicitar al usuario ingresar los ingresos para cada producto y vendedor
                ingresosVendedores[vendedor][producto] = obtenerDouble(
                        "Ingrese los ingresos para el vendedor " + (vendedor + 1) +
                                " y producto " + (producto + 1) + ":");
            }
        }
    }

    private static void mostrarMenu(double[][] ingresosVendedores) {
        while (true) {
            // Mostrar menú de opciones
            String opcion = JOptionPane.showInputDialog("Seleccione una opción:\n" +
                    "1. Revisar el total de ingresos por vendedor\n" +
                    "2. Ver el promedio por producto\n" +
                    "3. Ver el promedio por vendedor\n" +
                    "4. Obtener los ingresos totales\n" +
                    "5. Salir");

            switch (opcion) {
                case "1":
                    mostrarIngresosPorVendedor(ingresosVendedores);
                    break;
                case "2":
                    mostrarPromedioPorProducto(ingresosVendedores);
                    break;
                case "3":
                    mostrarPromedioPorVendedor(ingresosVendedores);
                    break;
                case "4":
                    mostrarIngresosTotales(ingresosVendedores);
                    break;
                case "5":
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    private static void mostrarIngresosPorVendedor(double[][] ingresosVendedores) {
        StringBuilder resultado = new StringBuilder("Ingresos por vendedor:\n");

        for (int vendedor = 0; vendedor < 18; vendedor++) {
            double totalVendedor = 0;
            for (int producto = 0; producto < 10; producto++) {
                totalVendedor += ingresosVendedores[vendedor][producto];
            }
            resultado.append("Vendedor ").append(vendedor + 1).append(": $").append(totalVendedor).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    private static void mostrarPromedioPorProducto(double[][] ingresosVendedores) {
        StringBuilder resultado = new StringBuilder("Promedio por producto:\n");

        for (int producto = 0; producto < 10; producto++) {
            double totalProducto = 0;
            for (int vendedor = 0; vendedor < 18; vendedor++) {
                totalProducto += ingresosVendedores[vendedor][producto];
            }
            double promedioProducto = totalProducto / 18;
            resultado.append("Producto ").append(producto + 1).append(": $").append(promedioProducto).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    private static void mostrarPromedioPorVendedor(double[][] ingresosVendedores) {
        StringBuilder resultado = new StringBuilder("Promedio por vendedor:\n");

        for (int vendedor = 0; vendedor < 18; vendedor++) {
            double totalVendedor = 0;
            for (int producto = 0; producto < 10; producto++) {
                totalVendedor += ingresosVendedores[vendedor][producto];
            }
            double promedioVendedor = totalVendedor / 10;
            resultado.append("Vendedor ").append(vendedor + 1).append(": $").append(promedioVendedor).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    private static void mostrarIngresosTotales(double[][] ingresosVendedores) {
        double ingresosTotales = 0;

        for (int vendedor = 0; vendedor < 18; vendedor++) {
            for (int producto = 0; producto < 10; producto++) {
                ingresosTotales += ingresosVendedores[vendedor][producto];
            }
        }

        JOptionPane.showMessageDialog(null, "Ingresos totales: $" + ingresosTotales);
    }

    private static double obtenerDouble(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }

}
