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
public class Ejercicio181 {
    public static void main(String[] args) {
        // Obtener el número del usuario
        String numeroStr = JOptionPane.showInputDialog("Ingrese un número entero positivo:");
        int numero = Integer.parseInt(numeroStr);

        // Verificar si el número es perfecto
        boolean esPerfecto = verificarNumeroPerfecto(numero);

        // Mostrar el resultado utilizando JOptionPane
        if (esPerfecto) {
            JOptionPane.showMessageDialog(null, numero + " es un número perfecto.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es un número perfecto.");
        }
    }

    // Método para verificar si un número es perfecto
    private static boolean verificarNumeroPerfecto(int numero) {
        if (numero <= 0) {
            // El número debe ser positivo
            return false;
        }

        // Inicializar la suma de los divisores
        int sumaDivisores = 0;

        // Recorrer los posibles divisores hasta la mitad del número
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                // Si i es divisor, sumarlo a la suma de divisores
                sumaDivisores += i;
            }
        }

        // Verificar si la suma de los divisores es igual al número
        return sumaDivisores == numero;
    }

}
