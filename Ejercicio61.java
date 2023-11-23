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
public class Ejercicio61 {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el entero #" + i + ":"));
            suma += numero * numero;
        }

        JOptionPane.showMessageDialog(null,
                "La suma de los cuadrados de los 10 primeros enteros mayores que cero es: " + suma);
    }
}
