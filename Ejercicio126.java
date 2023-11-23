/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segunda.parte;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Ejercicio126 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar la fecha en formato AAAA MM DD
        String inputFecha = JOptionPane.showInputDialog("Ingrese la fecha en formato AAAA MM DD:");

        // Convertir la cadena de texto a un objeto Date
        Date fecha = convertirFecha(inputFecha);

        // Mostrar la fecha en formato de texto
        if (fecha != null) {
            String fechaTexto = formatearFecha(fecha);
            JOptionPane.showMessageDialog(null, fechaTexto);
        } else {
            JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Por favor, ingrese una fecha válida.");
        }
    }

    // Función para convertir la cadena de texto a un objeto Date
    public static Date convertirFecha(String inputFecha) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy MM dd");
            return formato.parse(inputFecha);
        } catch (ParseException e) {
            return null; // Devuelve null si hay un error al parsear la fecha
        }
    }

    // Función para formatear la fecha en formato de texto
    public static String formatearFecha(Date fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd MMMM 'de' yyyy");
        return formato.format(fecha);
    }
}
