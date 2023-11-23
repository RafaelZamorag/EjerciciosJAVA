/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segunda.parte;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Ejercicio192 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar el texto
        String texto = JOptionPane.showInputDialog("Ingrese el texto (máximo 255 caracteres):");

        // Validar que el texto no sea nulo y no exceda los 255 caracteres
        if (texto != null && texto.length() <= 255) {
            // Solicitar al usuario el nombre del archivo
            String nombreArchivo = JOptionPane.showInputDialog("Ingrese el nombre del archivo:");

            // Escribir el texto en el archivo
            if (nombreArchivo != null) {
                escribirArchivo(nombreArchivo, texto);
                JOptionPane.showMessageDialog(null, "Texto guardado exitosamente en el archivo.");
            } else {
                JOptionPane.showMessageDialog(null, "Nombre del archivo no válido.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Texto no válido o excede los 255 caracteres.");
        }
    }

    private static void escribirArchivo(String nombreArchivo, String texto) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(texto);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo.");
        }
    }

}
