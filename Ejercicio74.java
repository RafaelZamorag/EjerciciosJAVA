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
public class Ejercicio74 {

    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer número:"));

        double mayor, medio, menor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            if (num2 >= num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            if (num1 >= num3) {
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }
        } else {
            mayor = num3;
            if (num1 >= num2) {
                medio = num1;
                menor = num2;
            } else {
                medio = num2;
                menor = num1;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Los números ordenados de mayor a menor son: " + mayor + ", " + medio + ", " + menor);
    }
}
