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
public class Ejercicio104 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese el número
        String inputNumero = JOptionPane.showInputDialog("Ingrese el número:");
        double numero = Double.parseDouble(inputNumero);

        // Solicitar al usuario que ingrese el índice de la raíz
        String inputIndiceRaiz = JOptionPane.showInputDialog("Ingrese el índice de la raíz:");
        double indiceRaiz = Double.parseDouble(inputIndiceRaiz);

        // Calcular la raíz
        double resultado = calcularRaiz(numero, indiceRaiz);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "La raíz " + indiceRaiz + " de " + numero + " es: " + resultado);
    }

    // Función para calcular la raíz con un índice específico
    public static double calcularRaiz(double numero, double indice) {
        // Calcular la raíz elevando el número a la potencia inversa del índice
        return Math.pow(numero, 1 / indice);
    }

}
