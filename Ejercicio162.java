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
public class Ejercicio162 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número positivo menor a 10
        String inputNumero = JOptionPane.showInputDialog("Ingrese un número positivo menor a 10:");

        // Convertir la cadena a un número entero
        try {
            int numero = Integer.parseInt(inputNumero);

            // Verificar si el número cumple con las condiciones
            if (numero > 0 && numero < 10) {
                // Mostrar la tabla de multiplicar utilizando JOptionPane.showMessageDialog
                mostrarTablaMultiplicar(numero);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número positivo menor a 10.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
        }
    }

    // Función para mostrar la tabla de multiplicar de un número
    private static void mostrarTablaMultiplicar(int numero) {
        StringBuilder tabla = new StringBuilder();
        tabla.append("Tabla de multiplicar del ").append(numero).append(":\n");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            tabla.append(numero).append(" x ").append(i).append(" = ").append(resultado).append("\n");
        }

        // Mostrar la tabla utilizando JOptionPane.showMessageDialog
        JOptionPane.showMessageDialog(null, tabla.toString());
    }

}
