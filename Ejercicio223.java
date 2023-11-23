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
public class Ejercicio223 {

    public static void main(String[] args) {
        // Inicializar contador
        int contador = 0;

        // Bucle para contar múltiplos de 2 o de 3 en el rango de 1 a 100
        for (int i = 1; i <= 100; i++) {
            if (esMultiploDeDos(i) || esMultiploDeTres(i)) {
                contador++;
            }
        }

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null,
                "La cantidad de números múltiplos de 2 o de 3 en el rango de 1 a 100 es: " + contador);
    }

    private static boolean esMultiploDeDos(int numero) {
        return numero % 2 == 0;
    }

    private static boolean esMultiploDeTres(int numero) {
        return numero % 3 == 0;
    }

}
