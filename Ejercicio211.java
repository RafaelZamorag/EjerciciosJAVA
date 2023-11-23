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
public class Ejercicio211 {

    public static void main(String[] args) {
        // Solicitar al usuario ingresar el número de unidades consumidas de cada
        // alimento
        int bocadilloJamon = obtenerEntero("Ingrese el número de bocadillos de jamón:");
        int bocadilloQueso = obtenerEntero("Ingrese el número de bocadillos de queso:");
        int patatasFritas = obtenerEntero("Ingrese el número de patatas fritas:");
        int refresco = obtenerEntero("Ingrese el número de refrescos:");
        int cerveza = obtenerEntero("Ingrese el número de cervezas:");

        // Calcular la cuenta total
        double total = calcularCuentaTotal(bocadilloJamon, bocadilloQueso, patatasFritas, refresco, cerveza);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "La cuenta total es: $" + total);
    }

    private static double calcularCuentaTotal(int bocadilloJamon, int bocadilloQueso, int patatasFritas, int refresco,
            int cerveza) {
        // Definir los precios de cada alimento
        double precioBocadilloJamon = 15;
        double precioBocadilloQueso = 10;
        double precioPatatasFritas = 5;
        double precioRefresco = 3;
        double precioCerveza = 4;

        // Calcular la cuenta total sumando el costo de cada alimento
        return (bocadilloJamon * precioBocadilloJamon) +
                (bocadilloQueso * precioBocadilloQueso) +
                (patatasFritas * precioPatatasFritas) +
                (refresco * precioRefresco) +
                (cerveza * precioCerveza);
    }

    private static int obtenerEntero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

}
