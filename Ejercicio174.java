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
public class Ejercicio174 {
    public static void main(String[] args) {
        // Obtener el nombre real del usuario
        String nombreReal = JOptionPane.showInputDialog("Ingrese su nombre completo:");

        // Obtener el área o departamento del usuario
        String areaDepartamento = JOptionPane.showInputDialog("Ingrese su área o departamento:");

        // Generar el nombre de usuario
        String nombreUsuario = generarNombreUsuario(nombreReal, areaDepartamento);

        // Mostrar el nombre de usuario utilizando JOptionPane
        JOptionPane.showMessageDialog(null, "El nombre de usuario generado es: " + nombreUsuario);
    }

    // Método para generar el nombre de usuario
    private static String generarNombreUsuario(String nombreReal, String areaDepartamento) {
        // Obtener las iniciales del nombre real
        String iniciales = obtenerIniciales(nombreReal);

        // Convertir el área o departamento a minúsculas y quitar espacios
        areaDepartamento = areaDepartamento.toLowerCase().replaceAll("\\s", "");

        // Concatenar las iniciales y el área o departamento para formar el nombre de
        // usuario
        return areaDepartamento + iniciales;
    }

    // Método para obtener las iniciales de un nombre
    private static String obtenerIniciales(String nombreReal) {
        StringBuilder iniciales = new StringBuilder();
        String[] partesNombre = nombreReal.split("\\s");

        for (String parte : partesNombre) {
            if (!parte.isEmpty()) {
                iniciales.append(Character.toUpperCase(parte.charAt(0)));
            }
        }

        return iniciales.toString();
    }

}
