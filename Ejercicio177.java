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
public class Ejercicio177 {
    public static void main(String[] args) {
        // Obtener el número del usuario
        String numeroStr = JOptionPane.showInputDialog("Ingrese un número entero:");

        // Convertir la entrada a un número entero
        int numero = Integer.parseInt(numeroStr);

        // Obtener y mostrar los divisores
        String resultado = obtenerDivisores(numero);
        JOptionPane.showMessageDialog(null, "Los divisores de " + numero + " son: " + resultado);
    }

    // Método para obtener los divisores de un número
    private static String obtenerDivisores(int numero) {
        StringBuilder divisores = new StringBuilder();

        for (int i = 1; i <= numero; i++) {
            // Si i es divisor de numero, lo agrega a la lista
            if (numero % i == 0) {
                divisores.append(i).append(", ");
            }
        }

        // Eliminar la coma y el espacio al final
        int length = divisores.length();
        if (length > 0) {
            divisores.delete(length - 2, length);
        }

        return divisores.toString();
    }

}
