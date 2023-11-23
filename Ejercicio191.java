/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segunda.parte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Ejercicio191 {
    public static void main(String[] args) {
        // Solicitar al usuario el nombre del archivo
        String nombreArchivo = JOptionPane.showInputDialog("Ingrese el nombre del archivo de texto:");

        // Leer y mostrar el contenido del archivo
        String contenido = leerArchivo(nombreArchivo);
        if (contenido != null) {
            JOptionPane.showMessageDialog(null, "Contenido del archivo:\n" + contenido);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo leer el archivo.");
        }
    }

    private static String leerArchivo(String nombreArchivo) {
        StringBuilder contenido = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return contenido.toString();
    }

}
