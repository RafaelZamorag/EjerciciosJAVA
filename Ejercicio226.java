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
public class Ejercicio226 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar la altura de la escalera
        int altura = obtenerEnteroPositivo("Ingrese la altura de la escalera invertida:");

        // Construir y mostrar la escalera invertida de asteriscos
        String escalera = construirEscaleraInvertidaAsteriscos(altura);
        JOptionPane.showMessageDialog(null, escalera);
    }

    private static int obtenerEnteroPositivo(String mensaje) {
        int numero;
        do {
            String input = JOptionPane.showInputDialog(mensaje);
            numero = Integer.parseInt(input);
        } while (numero <= 0);

        return numero;
    }

    private static String construirEscaleraInvertidaAsteriscos(int altura) {
        StringBuilder escalera = new StringBuilder();

        // Construir la escalera invertida de asteriscos
        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                escalera.append('*');
            }
            escalera.append('\n');
        }

        return escalera.toString();
    }

}
