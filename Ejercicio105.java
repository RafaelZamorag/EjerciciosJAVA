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
public class Ejercicio105 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese las cuatro notas
        String inputNota1 = JOptionPane.showInputDialog("Ingrese la primera nota:");
        double nota1 = Double.parseDouble(inputNota1);

        String inputNota2 = JOptionPane.showInputDialog("Ingrese la segunda nota:");
        double nota2 = Double.parseDouble(inputNota2);

        String inputNota3 = JOptionPane.showInputDialog("Ingrese la tercera nota:");
        double nota3 = Double.parseDouble(inputNota3);

        String inputNota4 = JOptionPane.showInputDialog("Ingrese la cuarta nota:");
        double nota4 = Double.parseDouble(inputNota4);

        // Calcular el promedio
        double promedio = calcularPromedio(nota1, nota2, nota3, nota4);

        // Determinar el estado del estudiante
        String estado = determinarEstado(promedio);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio + "\nEstado: " + estado);
    }

    // Función para calcular el promedio de cuatro notas
    public static double calcularPromedio(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4.0;
    }

    // Función para determinar el estado del estudiante
    public static String determinarEstado(double promedio) {
        if (promedio > 14.5) {
            return "APROBADO";
        } else if (promedio > 10) {
            return "SUPLETORIO";
        } else {
            return "PERDIDO EL AÑO";
        }
    }

}
