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
public class Ejercicio184 {
    public static void main(String[] args) {
        // Captura de datos
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre completo:");
        String fechaNacimiento = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento (YYYY-MM-DD):");

        // Generar RFC
        String rfc = generarRFC(nombre, fechaNacimiento);

        // Mostrar el RFC
        JOptionPane.showMessageDialog(null, "Su RFC es: " + rfc);
    }

    private static String generarRFC(String nombre, String fechaNacimiento) {
        // Obtener iniciales del nombre
        String iniciales = obtenerIniciales(nombre);

        // Obtener año de nacimiento para las primeras dos cifras del RFC
        String anioRFC = fechaNacimiento.substring(2, 4);

        // Obtener mes y día de nacimiento
        String mesDiaRFC = fechaNacimiento.substring(5, 7) + fechaNacimiento.substring(8, 10);

        // Generar homoclave (puedes modificar esto según tus necesidades)
        String homoclave = "A01";

        // Combinar todos los componentes para formar el RFC
        return iniciales.toUpperCase() + anioRFC + mesDiaRFC + homoclave;
    }

    private static String obtenerIniciales(String nombre) {
        // Obtener las iniciales del nombre
        StringBuilder iniciales = new StringBuilder();
        String[] palabras = nombre.split("\\s+"); // Dividir por espacios
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                iniciales.append(palabra.charAt(0));
            }
        }
        return iniciales.toString();
    }

}
