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
public class Ejercicio86 {
    public static void main(String[] args) {
        double sumaVoltajes = 0;

        for (int i = 1; i <= 5; i++) {
            double voltaje = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el voltaje #" + i + ":"));
            sumaVoltajes += voltaje;
        }

        double promedio = sumaVoltajes / 5;

        if (promedio > 220) {
            JOptionPane.showMessageDialog(null, "ALTO VOLTAJE");
        } else {
            JOptionPane.showMessageDialog(null, "VOLTAJE CORRECTO");
        }
    }
}
