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
public class Ejercicio83 {
    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        double numero3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer número:"));

        double promedio = (numero1 + numero2 + numero3) / 3;

        if (promedio > 7) {
            JOptionPane.showMessageDialog(null, "APROBADO");
        } else {
            JOptionPane.showMessageDialog(null, "MEJORE LA NOTA");
        }
    }

}
