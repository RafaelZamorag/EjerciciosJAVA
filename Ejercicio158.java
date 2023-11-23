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
public class Ejercicio158 {
    public static void main(String[] args) {
        // Pedir al usuario que ingrese una cadena de números enteros
        String cadenaEnteros = JOptionPane.showInputDialog("Ingrese una cadena de números enteros:");

        // Pedir al usuario que ingrese una cadena de números reales
        String cadenaReales = JOptionPane.showInputDialog("Ingrese una cadena de números reales:");

        // Convertir las cadenas a valores numéricos
        try {
            // Convertir la cadena de enteros a un valor entero
            int numeroEntero = Integer.parseInt(cadenaEnteros);

            // Convertir la cadena de reales a un valor real
            double numeroReal = Double.parseDouble(cadenaReales);

            // Sumar los números enteros y reales
            double suma = numeroEntero + numeroReal;

            // Mostrar la suma utilizando JOptionPane.showMessageDialog
            JOptionPane.showMessageDialog(null, "La suma de los números es: " + suma);
        } catch (NumberFormatException e) {
            // Manejar la excepción si la conversión no es posible
            JOptionPane.showMessageDialog(null,
                    "Error al convertir las cadenas a números. Asegúrese de ingresar valores válidos.");
        }

        // Leer una cadena de caracteres de la entrada estándar
        String cadenaEntrada = JOptionPane.showInputDialog("Ingrese una cadena de caracteres:");

        // Contar ocurrencias de cada vocal en la cadena
        contarVocales(cadenaEntrada);
    }

    // Función para contar ocurrencias de cada vocal en una cadena
    private static void contarVocales(String cadena) {
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        // Convertir la cadena a minúsculas para hacer la comparación insensible a
        // mayúsculas/minúsculas
        cadena = cadena.toLowerCase();

        // Contar ocurrencias de cada vocal
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            switch (caracter) {
                case 'a':
                    contadorA++;
                    break;
                case 'e':
                    contadorE++;
                    break;
                case 'i':
                    contadorI++;
                    break;
                case 'o':
                    contadorO++;
                    break;
                case 'u':
                    contadorU++;
                    break;
                // Otras vocales o caracteres no se cuentan
            }
        }

        // Mostrar los resultados
        JOptionPane.showMessageDialog(null,
                "Ocurrencias de vocales:\n" +
                        "A: " + contadorA + "\n" +
                        "E: " + contadorE + "\n" +
                        "I: " + contadorI + "\n" +
                        "O: " + contadorO + "\n" +
                        "U: " + contadorU);
    }

}
