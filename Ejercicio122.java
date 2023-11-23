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
public class Ejercicio122 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese números hasta que se introduzca un cero
        double[] numeros = obtenerNumeros();

        // Calcular la suma total de los números
        double sumaTotal = calcularSumaTotal(numeros);

        // Mostrar la suma total en pantalla
        JOptionPane.showMessageDialog(null, "La suma total de los números es: " + sumaTotal);
    }

    // Función para obtener los números ingresados por el usuario hasta que se
    // introduzca un cero
    public static double[] obtenerNumeros() {
        // Usar una lista para almacenar los números ya que no sabemos cuántos se
        // ingresarán
        java.util.ArrayList<Double> numerosList = new java.util.ArrayList<>();

        // Bucle para solicitar al usuario que ingrese números hasta que se introduzca
        // un cero
        while (true) {
            try {
                // Solicitar al usuario que ingrese un número
                String inputNumero = JOptionPane.showInputDialog("Ingrese un número (0 para finalizar):");
                double numero = Double.parseDouble(inputNumero);

                // Verificar si el número ingresado es cero para finalizar
                if (numero == 0) {
                    break;
                } else {
                    // Agregar el número a la lista
                    numerosList.add(numero);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
            }
        }

        // Convertir la lista a un array
        double[] numeros = new double[numerosList.size()];
        for (int i = 0; i < numerosList.size(); i++) {
            numeros[i] = numerosList.get(i);
        }

        return numeros;
    }

    // Función para calcular la suma total de los números
    public static double calcularSumaTotal(double[] numeros) {
        double sumaTotal = 0;

        for (double numero : numeros) {
            sumaTotal += numero;
        }

        return sumaTotal;
    }

}
