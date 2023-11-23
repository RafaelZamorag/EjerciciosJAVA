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
public class Ejercicio172 {
    public static void main(String[] args) {
        // Obtener el periodo del usuario en formato MM AAAA
        String periodoUsuario = JOptionPane.showInputDialog("Ingrese el periodo en formato MM AAAA:");

        // Validar el formato del periodo
        if (validarFormatoPeriodo(periodoUsuario)) {
            // Mostrar los 12 meses anteriores
            mostrarMesesAnteriores(periodoUsuario);
        } else {
            JOptionPane.showMessageDialog(null, "Formato de periodo incorrecto. Ingrese en formato MM AAAA.");
        }
    }

    // Método para validar el formato del periodo
    private static boolean validarFormatoPeriodo(String periodo) {
        // El formato debe ser MM AAAA
        return periodo.matches("\\d{2}-\\d{4}");
    }

    // Método para mostrar los 12 meses anteriores al periodo dado
    private static void mostrarMesesAnteriores(String periodo) {
        int mes = Integer.parseInt(periodo.substring(0, 2));
        int ano = Integer.parseInt(periodo.substring(3));

        for (int i = 0; i < 12; i++) {
            if (mes == 1) {
                mes = 12;
                ano--;
            } else {
                mes--;
            }

            // Formatear el mes y año para mostrar
            String mesFormateado = String.format("%02d", mes);
            String resultado = mesFormateado + "-" + ano;

            // Mostrar el resultado usando JOptionPane
            JOptionPane.showMessageDialog(null, resultado);
        }
    }

}
