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
public class Ejercicio143 {
    public static void main(String[] args) {
        // Calcular la suma de los números pares entre 1 y 100
        int sumaPares = calcularSumaNumerosPares();

        // Mostrar el resultado en pantalla
        JOptionPane.showMessageDialog(null, "La suma de los números pares entre 1 y 100 es: " + sumaPares);
    }

    // Función para calcular la suma de los números pares entre 1 y 100
    public static int calcularSumaNumerosPares() {
        int suma = 0;

        for (int i = 2; i <= 100; i += 2) {
            suma += i;
        }

        return suma;
    }

}
