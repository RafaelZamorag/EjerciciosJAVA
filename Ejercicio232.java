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
public class Ejercicio232 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar la cantidad de números (N)
        int cantidadNumeros = obtenerEnteroPositivo("Ingrese la cantidad de números:");

        // Inicializar contadores
        int positivos = 0;
        int negativos = 0;
        int neutros = 0;

        // Bucle para leer N números
        for (int i = 1; i <= cantidadNumeros; i++) {
            // Solicitar al usuario ingresar un número
            double numero = obtenerDouble("Ingrese el número " + i + ":");

            // Verificar si el número es positivo, negativo o neutro y actualizar contadores
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                neutros++;
            }
        }

        // Mostrar los resultados
        JOptionPane.showMessageDialog(null,
                "Cantidad de números positivos: " + positivos + "\n" +
                        "Cantidad de números negativos: " + negativos + "\n" +
                        "Cantidad de números neutros: " + neutros);
    }

    private static int obtenerEnteroPositivo(String mensaje) {
        // Solicitar al usuario ingresar un número positivo y convertir a int
        int numero;
        do {
            String input = JOptionPane.showInputDialog(mensaje);
            numero = Integer.parseInt(input);
        } while (numero <= 0);

        return numero;
    }

    private static double obtenerDouble(String mensaje) {
        // Solicitar al usuario ingresar un número y convertir a double
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }

}
