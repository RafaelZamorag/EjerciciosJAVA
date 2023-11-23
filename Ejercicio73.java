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
public class Ejercicio73 {
    public static void main(String[] args) {
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo del trabajador:"));
        double descuento = 0;
        double sueldoNeto = 0;

        if (sueldo <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un sueldo válido.");
        } else if (sueldo <= 1000) {
            descuento = sueldo * 0.10;
            sueldoNeto = sueldo - descuento;
        } else if (sueldo <= 2000) {
            double adicional = sueldo - 1000;
            descuento = (1000 * 0.10) + (adicional * 0.05);
            sueldoNeto = sueldo - descuento;
        } else {
            double adicional = sueldo - 2000;
            descuento = (1000 * 0.10) + (1000 * 0.05) + (adicional * 0.03);
            sueldoNeto = sueldo - descuento;
        }

        JOptionPane.showMessageDialog(null, "Descuento: $" + descuento + "\nSueldo Neto: $" + sueldoNeto);
    }

}
