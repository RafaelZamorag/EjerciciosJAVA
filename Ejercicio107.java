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
public class Ejercicio107 {

    public static void main(String[] args) {
        // Solicitar al usuario que ingrese la edad
        int edad = obtenerEdadValida();

        // Determinar si la persona es mayor o menor de edad
        String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "La persona tiene " + edad + " años. Es " + resultado);
    }

    // Función para obtener una edad válida entre 1 y 100
    public static int obtenerEdadValida() {
        int edad = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                // Solicitar al usuario que ingrese la edad
                String inputEdad = JOptionPane.showInputDialog("Ingrese la edad (entre 1 y 100):");
                edad = Integer.parseInt(inputEdad);

                // Verificar si la edad está en el rango válido
                if (edad >= 1 && edad <= 100) {
                    entradaValida = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese una edad válida entre 1 y 100.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
            }
        }

        return edad;
    }
}
