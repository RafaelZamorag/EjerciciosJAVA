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
public class Ejercicio81 {
    public static void main(String[] args) {
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo:"));

        if (radio <= 0) {
            JOptionPane.showMessageDialog(null, "DATOS ERRÓNEOS");
        } else {
            double area = Math.PI * Math.pow(radio, 2);

            if (area > 5000) {
                JOptionPane.showMessageDialog(null, "El área del círculo es: " + area + "\nDATOS ERRÓNEOS");
            } else {
                JOptionPane.showMessageDialog(null, "El área del círculo es: " + area);
            }
        }
    }

}
