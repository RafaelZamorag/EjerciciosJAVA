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
public class Ejercicio110 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese la temperatura del día
        double temperatura = obtenerTemperatura();

        // Determinar el comentario con respecto a la temperatura
        String comentario = obtenerComentario(temperatura);

        // Mostrar el comentario
        JOptionPane.showMessageDialog(null, comentario);
    }

    // Función para obtener la temperatura válida
    public static double obtenerTemperatura() {
        double temperatura = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                // Solicitar al usuario que ingrese la temperatura
                String inputTemperatura = JOptionPane.showInputDialog("Ingrese la temperatura del día:");
                temperatura = Double.parseDouble(inputTemperatura);
                entradaValida = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
            }
        }

        return temperatura;
    }

    // Función para obtener el comentario con respecto a la temperatura
    public static String obtenerComentario(double temperatura) {
        if (temperatura >= 0 && temperatura <= 10) {
            return "Mucho Frío";
        } else if (temperatura >= 11 && temperatura <= 18) {
            return "Frío";
        } else if (temperatura >= 19 && temperatura <= 25) {
            return "Templado";
        } else if (temperatura >= 26 && temperatura <= 40) {
            return "Calor";
        } else {
            return "La temperatura ingresada no se encuentra en los rangos definidos.";
        }
    }

}
