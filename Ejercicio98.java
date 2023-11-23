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
public class Ejercicio98 {
    public static void main(String[] args) {
        // Ingresar dos valores
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer valor:"));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo valor:"));

        // Calcular la suma y la resta de los dos valores
        double suma = valor1 + valor2;
        double resta = valor1 - valor2;

        // Verificar si la división de la suma entre la resta es exacta
        String mensaje;
        if (resta != 0 && suma % resta == 0) {
            mensaje = "La división de la suma entre la resta es exacta.";
        } else {
            mensaje = "La división de la suma entre la resta no es exacta.";
        }

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
