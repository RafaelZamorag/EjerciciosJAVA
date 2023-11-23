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
public class Ejercicio190 {
    public static void main(String[] args) {
        // Número total de transacciones
        int numeroTransacciones = 5;

        // Realizar varias transacciones
        for (int i = 1; i <= numeroTransacciones; i++) {
            realizarTransaccion(i);
        }
    }

    private static void realizarTransaccion(int numeroTransaccion) {
        // Captura de la cantidad a pagar y el monto pagado
        double cantidadAPagar = obtenerDouble("Transacción #" + numeroTransaccion + "\nIngrese la cantidad a pagar:");
        double montoPagado = obtenerDouble("Transacción #" + numeroTransaccion + "\nIngrese el monto pagado:");

        // Calcular la diferencia a devolver
        double diferencia = montoPagado - cantidadAPagar;

        // Verificar si hay cambio que devolver
        if (diferencia >= 0) {
            // Determinar las denominaciones monetarias a utilizar
            int[] denominaciones = { 1000, 500, 300, 200, 100 };
            int[] cantidades = new int[denominaciones.length];

            // Calcular las denominaciones y cantidades necesarias
            for (int i = 0; i < denominaciones.length; i++) {
                cantidades[i] = (int) (diferencia / denominaciones[i]);
                diferencia %= denominaciones[i];
            }

            // Mostrar el cambio y las denominaciones
            StringBuilder mensaje = new StringBuilder("Cambio a devolver: $" + montoPagado + " - $" + cantidadAPagar
                    + " = $" + String.format("%.2f", diferencia) + "\n\n");
            mensaje.append("Denominaciones utilizadas:\n");

            for (int i = 0; i < denominaciones.length; i++) {
                if (cantidades[i] > 0) {
                    mensaje.append("$").append(denominaciones[i]).append(" x ").append(cantidades[i]).append("\n");
                }
            }

            JOptionPane.showMessageDialog(null, mensaje.toString());
        } else {
            JOptionPane.showMessageDialog(null, "El monto pagado es insuficiente. No hay cambio que devolver.");
        }
    }

    private static double obtenerDouble(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }

}
