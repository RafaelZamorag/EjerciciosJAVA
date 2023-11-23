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
public class Ejercicio197 {
    public static void main(String[] args) {
        // Solicitar al usuario el nombre del archivo
        String nombreArchivo = JOptionPane.showInputDialog("Ingrese el nombre del archivo de estado de cuenta:");

        // Leer y mostrar el estado de cuenta desde el archivo
        mostrarEstadoCuenta(nombreArchivo);
    }

    private static void mostrarEstadoCuenta(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            // Leer la primera línea que contiene los encabezados
            String linea = br.readLine();
            System.out.println(linea); // Mostrar los encabezados

            // Leer las siguientes líneas con los datos
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(","); // Separar los datos por la coma

                // Mostrar los datos en un formato deseado (aquí se muestra en consola)
                String mensaje = String.format(
                        "Nombre: %s\nCuenta: %s\nMovimiento: %s\nTipo de Movimiento: %s\nSaldo: %s\n",
                        datos[0], datos[1], datos[2], datos[3], datos[4]);

                JOptionPane.showMessageDialog(null, mensaje);
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer el archivo.");
        }
    }

}
