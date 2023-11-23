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
public class Ejercicio99 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un año
        String inputYear = JOptionPane.showInputDialog("Ingrese un año:");

        // Convertir la entrada a un número entero
        int year = Integer.parseInt(inputYear);

        // Determinar si el año es bisiesto
        boolean esBisiesto = esAñoBisiesto(year);

        // Mostrar el resultado
        String resultado = esBisiesto ? "El año es bisiesto." : "El año no es bisiesto.";
        JOptionPane.showMessageDialog(null, resultado);
    }

    // Función para determinar si un año es bisiesto
    public static boolean esAñoBisiesto(int año) {
        // Un año es bisiesto si es divisible por 4, pero no por 100, a menos que
        // también sea divisible por 400
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);

    }

}
