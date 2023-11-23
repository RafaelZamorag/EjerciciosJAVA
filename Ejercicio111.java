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
public class Ejercicio111 {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número de día
        int numeroDia = obtenerNumeroDia();

        // Convertir el número de día a formato de texto
        String nombreDia = convertirDiaATexto(numeroDia);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El número " + numeroDia + " corresponde a: " + nombreDia);
    }

    // Función para obtener un número de día válido
    public static int obtenerNumeroDia() {
        int numeroDia = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                // Solicitar al usuario que ingrese un número de día
                String inputNumeroDia = JOptionPane.showInputDialog("Ingrese un número de día (1-7):");
                numeroDia = Integer.parseInt(inputNumeroDia);

                // Verificar si el número de día está en el rango válido
                if (numeroDia >= 1 && numeroDia <= 7) {
                    entradaValida = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número de día válido (entre 1 y 7).");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor numérico válido.");
            }
        }

        return numeroDia;
    }

    // Función para convertir un número de día a formato de texto
    public static String convertirDiaATexto(int numeroDia) {
        switch (numeroDia) {
            case 1:
                return "Domingo";
            case 2:
                return "Lunes";
            case 3:
                return "Martes";
            case 4:
                return "Miércoles";
            case 5:
                return "Jueves";
            case 6:
                return "Viernes";
            case 7:
                return "Sábado";
            default:
                return "Número de día no válido";
        }
    }

}
