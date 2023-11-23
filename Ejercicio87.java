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
public class Ejercicio87 {
    public static void main(String[] args) {
        double lado = Double
                .parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado del triángulo equilátero:"));

        if (lado <= 0) {
            JOptionPane.showMessageDialog(null, "DATOS NO VÁLIDOS");
        } else {
            double area = (Math.pow(lado, 2) * Math.sqrt(3)) / 4;

            if (area > 1000) {
                JOptionPane.showMessageDialog(null, "El área del triángulo es: " + area + "\nDATOS NO VÁLIDOS");
            } else {
                JOptionPane.showMessageDialog(null, "El área del triángulo es: " + area);
            }
        }
    }

}
