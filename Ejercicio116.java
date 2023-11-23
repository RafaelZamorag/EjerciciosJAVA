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
public class Ejercicio116 {
    public static void main(String[] args) {
        // Calcular y mostrar la suma de los números enteros pares entre 1 y 1000
        int sumaPares = calcularSumaNumerosPares();
        JOptionPane.showMessageDialog(null, "La suma de los números enteros pares entre 1 y 1000 es: " + sumaPares);

        // Calcular y mostrar la multiplicación de los números enteros impares entre 1 y
        // 50
        long multiplicacionNones = calcularMultiplicacionNumerosNones();
        JOptionPane.showMessageDialog(null,
                "La multiplicación de los números enteros nones entre 1 y 50 es: " + multiplicacionNones);
    }

    // Función para calcular la suma de los números enteros pares entre 1 y 1000
    public static int calcularSumaNumerosPares() {
        int suma = 0;

        for (int i = 2; i <= 1000; i += 2) {
            suma += i;
        }

        return suma;
    }

    // Función para calcular la multiplicación de los números enteros impares entre
    // 1 y 50
    public static long calcularMultiplicacionNumerosNones() {
        long multiplicacion = 1;

        for (int i = 1; i <= 50; i += 2) {
            multiplicacion *= i;
        }

        return multiplicacion;
    }

}
