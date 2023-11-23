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
public class Ejercicio78 {
    public static void main(String[] args) {
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto:"));
        double descuento;

        if (monto >= 10000) {
            descuento = monto * 0.20; // 20% de descuento
        } else {
            descuento = monto * 0.10; // 10% de descuento
        }

        double montoConDescuento = monto - descuento;

        JOptionPane.showMessageDialog(null, "El monto original es: $" + monto
                + "\nEl descuento aplicado es: $" + descuento
                + "\nEl monto con descuento es: $" + montoConDescuento);
    }

}
