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
public class Ejercicio182 {
    public static void main(String[] args) {
        // Obtener el número del usuario
        String numeroStr = JOptionPane.showInputDialog("Ingrese un número entero (menor o igual a 1000):");
        int numero = Integer.parseInt(numeroStr);

        // Validar que el número esté en el rango permitido
        if (numero > 0 && numero <= 1000) {
            // Convertir el número a número romano
            String numeroRomano = convertirANumeroRomano(numero);

            // Mostrar el resultado utilizando JOptionPane
            JOptionPane.showMessageDialog(null, "El número " + numero + " en números romanos es: " + numeroRomano);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido en el rango de 1 a 1000.");
        }
    }

    // Método para convertir un número a número romano
    private static String convertirANumeroRomano(int numero) {
        String[] unidadesRomanas = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        String[] decenasRomanas = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] centenasRomanas = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };

        // Obtener las partes del número (unidades, decenas y centenas)
        int unidades = numero % 10;
        int decenas = (numero / 10) % 10;
        int centenas = (numero / 100) % 10;

        // Construir el número romano
        return centenasRomanas[centenas] + decenasRomanas[decenas] + unidadesRomanas[unidades];
    }
}
