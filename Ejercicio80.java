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
public class Ejercicio80 {
    public static void main(String[] args) {
        // Ingreso de un dato entero
        int datoEntero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero:"));

        // Ingreso de un dato real
        double datoReal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número real:"));

        // Mostrar los datos ingresados
        JOptionPane.showMessageDialog(null,
                "Dato entero ingresado: " + datoEntero + "\nDato real ingresado: " + datoReal);
    }

}
