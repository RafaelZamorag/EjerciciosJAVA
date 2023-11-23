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
public class Ejercicio75 {
    public static void main(String[] args) {
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un año:"));

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            JOptionPane.showMessageDialog(null, anio + " es un año bisiesto.");
        } else {
            JOptionPane.showMessageDialog(null, anio + " no es un año bisiesto.");
        }
    }
    
}
