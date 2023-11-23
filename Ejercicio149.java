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
public class Ejercicio149 {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 1 y 100
        int numeroAleatorio = generarNumeroAleatorio(1, 100);

        // Iniciar el juego
        jugarAdivinaNumero(numeroAleatorio);
    }

    // Función para generar un número aleatorio en un rango dado
    public static int generarNumeroAleatorio(int minimo, int maximo) {
        return (int) (Math.random() * (maximo - minimo + 1)) + minimo;
    }

    // Función principal del juego
    public static void jugarAdivinaNumero(int numeroAleatorio) {
        int intentos = 0;

        while (true) {
            // Solicitar al usuario que ingrese un número
            int numeroUsuario = obtenerEntero("Piensa en un número entre 1 y 100 e ingresa tu estimación:");

            // Incrementar el contador de intentos
            intentos++;

            // Verificar si el número ingresado es igual al número aleatorio
            if (numeroUsuario == numeroAleatorio) {
                // El usuario adivinó el número, mostrar mensaje de felicitación
                JOptionPane.showMessageDialog(null, "¡Felicidades! Adivinaste el número " + numeroAleatorio +
                        "\nNúmero de intentos: " + intentos);
                break;
            } else if (numeroUsuario < numeroAleatorio) {
                // El número es menor, indicar al usuario
                JOptionPane.showMessageDialog(null, "El número es mayor. Sigue intentando.");
            } else {
                // El número es mayor, indicar al usuario
                JOptionPane.showMessageDialog(null, "El número es menor. Sigue intentando.");
            }
        }
    }

    // Función para obtener un número entero desde el teclado
    public static int obtenerEntero(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
            }
        }
    }

}
