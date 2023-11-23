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
public class Ejercicio132 {

    public static void main(String[] args) {
        // Saldo inicial
        double saldo = 1000;

        // Bucle principal del cajero automático
        while (true) {
            // Mostrar menú de opciones al usuario
            String inputOpcion = JOptionPane.showInputDialog("Cajero Automático\n" +
                    "1. Depósito\n" +
                    "2. Retiro\n" +
                    "3. Salir\n" +
                    "Saldo actual: $" + saldo +
                    "\nSeleccione una opción (1-3):");

            // Convertir la opción a un número entero
            int opcion = obtenerEntero(inputOpcion);

            // Realizar la operación correspondiente según la opción seleccionada
            switch (opcion) {
                case 1:
                    // Depósito
                    double cantidadDeposito = obtenerNumero("Ingrese la cantidad a depositar:");
                    saldo += cantidadDeposito;
                    JOptionPane.showMessageDialog(null, "Depósito exitoso. Nuevo saldo: $" + saldo);
                    break;
                case 2:
                    // Retiro
                    double cantidadRetiro = obtenerNumero("Ingrese la cantidad a retirar:");
                    if (cantidadRetiro > saldo) {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente. Operación cancelada.");
                    } else {
                        saldo -= cantidadRetiro;
                        JOptionPane.showMessageDialog(null, "Retiro exitoso. Nuevo saldo: $" + saldo);
                    }
                    break;
                case 3:
                    // Salir
                    JOptionPane.showMessageDialog(null,
                            "Saldo final: $" + saldo + "\nGracias por utilizar el cajero automático.");
                    System.exit(0); // Salir del programa
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Opción no válida. Por favor, seleccione una opción válida (1-3).");
            }
        }
    }

    // Función para obtener un número desde el teclado
    public static double obtenerNumero(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
            }
        }
    }

    // Función para obtener un número entero desde el teclado
    public static int obtenerEntero(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor entero válido.");
            }
        }
    }

}
