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
public class Ejercicio136 {
    public static void main(String[] args) {
        // Bucle infinito para simular el reloj
        while (true) {
            // Obtener la hora actual en formato HH:MM:SS
            String horaActual = obtenerHoraActual();

            // Mostrar la hora en pantalla
            JOptionPane.showMessageDialog(null, "Hora actual: " + horaActual);

            // Esperar un segundo antes de actualizar la hora
            esperarSegundo();
        }
    }

    // Función para obtener la hora actual en formato HH:MM:SS
    public static String obtenerHoraActual() {
        // Obtener la hora actual del sistema
        long tiempoActual = System.currentTimeMillis();

        // Calcular las horas, minutos y segundos
        long segundos = tiempoActual / 1000;
        long minutos = segundos / 60;
        long horas = minutos / 60;
        segundos %= 60;
        minutos %= 60;
        horas %= 24;

        // Formatear la hora en HH:MM:SS
        String horaFormateada = String.format("%02d:%02d:%02d", horas, minutos, segundos);

        return horaFormateada;
    }

    // Función para esperar un segundo
    public static void esperarSegundo() {
        try {
            Thread.sleep(1000); // Esperar 1000 milisegundos (1 segundo)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
