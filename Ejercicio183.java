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
public class Ejercicio183 {
    public static void main(String[] args) {
        // Obtener el nombre completo del usuario
        String nombreCompleto = JOptionPane.showInputDialog("Ingrese su nombre completo:");

        // Convertir el nombre completo a minúsculas para facilitar el conteo de vocales
        nombreCompleto = nombreCompleto.toLowerCase();

        // Inicializar un arreglo para almacenar el nombre
        char[] nombreArray = nombreCompleto.toCharArray();

        // Inicializar contadores para cada vocal
        int totalVocales = 0;
        int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;

        // Contar vocales y actualizar contadores
        for (char letra : nombreArray) {
            if (esVocal(letra)) {
                totalVocales++;
                switch (letra) {
                    case 'a':
                        aCount++;
                        break;
                    case 'e':
                        eCount++;
                        break;
                    case 'i':
                        iCount++;
                        break;
                    case 'o':
                        oCount++;
                        break;
                    case 'u':
                        uCount++;
                        break;
                }
            }
        }

        // Mostrar resultados utilizando JOptionPane
        JOptionPane.showMessageDialog(null,
                "Total de vocales: " + totalVocales +
                        "\n'a' aparece " + aCount + " veces" +
                        "\n'e' aparece " + eCount + " veces" +
                        "\n'i' aparece " + iCount + " veces" +
                        "\n'o' aparece " + oCount + " veces" +
                        "\n'u' aparece " + uCount + " veces");
    }

    // Método para verificar si un caracter es una vocal
    private static boolean esVocal(char letra) {
        return "aeiou".indexOf(letra) != -1;
    }

}
