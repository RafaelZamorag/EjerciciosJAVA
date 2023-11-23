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
public class Ejercicio225 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar el tamaño del lado
        int lado = obtenerEnteroPositivo("Ingrese el tamaño del lado del cuadrado:");

        // Construir y mostrar el cuadrado de asteriscos
        String cuadrado = construirCuadradoAsteriscos(lado);
        JOptionPane.showMessageDialog(null, cuadrado);
    }

    private static int obtenerEnteroPositivo(String mensaje) {
        int numero;
        do {
            String input = JOptionPane.showInputDialog(mensaje);
            numero = Integer.parseInt(input);
        } while (numero <= 0);

        return numero;
    }

    private static String construirCuadradoAsteriscos(int lado) {
        StringBuilder cuadrado = new StringBuilder();

        // Construir la primera fila de asteriscos
        for (int i = 0; i < lado; i++) {
            cuadrado.append('*');
        }
        cuadrado.append('\n');

        // Construir las filas intermedias con asterisco solo en el borde
        for (int i = 1; i < lado - 1; i++) {
            cuadrado.append('*');
            for (int j = 1; j < lado - 1; j++) {
                cuadrado.append(' ');
            }
            cuadrado.append('*');
            cuadrado.append('\n');
        }

        // Construir la última fila de asteriscos
        for (int i = 0; i < lado; i++) {
            cuadrado.append('*');
        }

        return cuadrado.toString();
    }
}
