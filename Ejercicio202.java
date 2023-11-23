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
public class Ejercicio202 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar el año de nacimiento
        int anioNacimiento = obtenerEntero("Ingrese el año de nacimiento:");

        // Obtener el año actual
        int anioActual = java.time.Year.now().getValue();

        // Calcular la edad
        int edad = anioActual - anioNacimiento;

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "Tu edad es: " + edad + " años.");
    }

    private static int obtenerEntero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

}
