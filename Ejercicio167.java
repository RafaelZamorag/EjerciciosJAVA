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
public class Ejercicio167 {
    public static void main(String[] args) {
        int suma = 0;
        int cantidadNumeros = 0;

        // Solicitar al usuario que ingrese números positivos hasta que ingrese 0
        int numero = solicitarNumero();

        while (numero != 0) {
            if (numero > 0) {
                suma += numero;
                cantidadNumeros++;
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número positivo.");
            }

            numero = solicitarNumero();
        }

        // Calcular el promedio
        double promedio = (double) suma / cantidadNumeros;

        // Mostrar el resultado utilizando JOptionPane.showMessageDialog
        JOptionPane.showMessageDialog(null, "El promedio de los números ingresados es: " + promedio);
    }

    // Función para solicitar al usuario que ingrese un número
    private static int solicitarNumero() {
        String inputNumero = JOptionPane.showInputDialog("Ingrese un número (0 para terminar):");
        return Integer.parseInt(inputNumero);
    }

}
