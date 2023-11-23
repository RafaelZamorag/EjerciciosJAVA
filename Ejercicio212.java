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
public class Ejercicio212 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar el coste total del automóvil
        double costeTotal = obtenerCantidad("Ingrese el coste total del automóvil:");

        // Definir la ganancia del vendedor y el impuesto
        double porcentajeGananciaVendedor = 12;
        double porcentajeImpuesto = 6;

        // Calcular el coste para el consumidor
        double costeConsumidor = calcularCosteConsumidor(costeTotal, porcentajeGananciaVendedor, porcentajeImpuesto);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El coste para el consumidor es: $" + costeConsumidor);
    }

    private static double calcularCosteConsumidor(double costeTotal, double porcentajeGananciaVendedor,
            double porcentajeImpuesto) {
        // Calcular la ganancia del vendedor y el impuesto
        double gananciaVendedor = (costeTotal * porcentajeGananciaVendedor) / 100;
        double impuesto = (costeTotal * porcentajeImpuesto) / 100;

        // Calcular el coste para el consumidor sumando la ganancia del vendedor y el
        // impuesto
        return costeTotal + gananciaVendedor + impuesto;
    }

    private static double obtenerCantidad(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }
}
