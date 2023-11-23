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
public class Ejercicio222 {
    public static void main(String[] args) {
        // Inicializar variables
        int numero;
        int maximo = Integer.MIN_VALUE; // Inicializar con el valor mínimo posible
        int minimo = Integer.MAX_VALUE; // Inicializar con el valor máximo posible
        int suma = 0;
        int contador = 0;

        // Bucle para leer números hasta que se ingrese 0
        do {
            numero = obtenerEntero("Ingrese un número (0 para finalizar):");

            // Verificar si el número es distinto de 0
            if (numero != 0) {
                // Actualizar máximo y mínimo
                maximo = Math.max(maximo, numero);
                minimo = Math.min(minimo, numero);
                // Acumular la suma y contar los números
                suma += numero;
                contador++;
            }
        } while (numero != 0);

        // Calcular y mostrar la media, el máximo y el mínimo
        if (contador > 0) {
            double media = (double) suma / contador;
            JOptionPane.showMessageDialog(null,
                    "Máximo: " + maximo + "\nMínimo: " + minimo + "\nMedia: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron números válidos.");
        }
    }

    private static int obtenerEntero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

}
