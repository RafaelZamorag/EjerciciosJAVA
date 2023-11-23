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
public class Ejercicio89 {
    public static void main(String[] args) {
        double distanciaMetros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia en metros:"));
        double distanciaKilometros = distanciaMetros / 1000;

        JOptionPane.showMessageDialog(null, "La distancia en kilómetros es: " + distanciaKilometros + " km");
    }
}
