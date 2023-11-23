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
public class Ejercicio63 {
    public static void main(String[] args) {
        int suma = 0;
        boolean terminado = false;

        while (!terminado) {
            String input = JOptionPane.showInputDialog("Ingrese un valor entero (0 para terminar):");

            try {
                int valor = Integer.parseInt(input);

                if (valor == 0) {
                    terminado = true;
                } else if (valor > 0) {
                    suma += valor;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor entero válido.");
            }
        }

        JOptionPane.showMessageDialog(null, "La suma de los valores mayores a 0 es: " + suma);
    }

}
