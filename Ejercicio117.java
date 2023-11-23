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
public class Ejercicio117 {
    public static void main(String[] args) {
        // Leer números indefinidamente hasta que llegue el número 0
        int cantidadNumeros = leerNumeros();

        // Mostrar la cantidad de números leídos
        JOptionPane.showMessageDialog(null, "La cantidad de números leídos es: " + cantidadNumeros);
    }

    // Función para leer números indefinidamente hasta que llegue el número 0
    public static int leerNumeros() {
        int cantidadNumeros = 0;
        boolean continuar = true;

        while (continuar) {
            try {
                // Solicitar al usuario que ingrese un número
                String inputNumero = JOptionPane.showInputDialog("Ingrese un número (ingrese 0 para finalizar):");
                int numero = Integer.parseInt(inputNumero);

                // Verificar si el número ingresado es 0 para finalizar
                if (numero == 0) {
                    continuar = false;
                } else {
                    cantidadNumeros++;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
            }
        }

        return cantidadNumeros;
    }

}
