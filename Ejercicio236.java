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
public class Ejercicio236 {
    public static void main(String[] args) {
        // Solicitar al usuario ingresar dos números
        int primerNumero = obtenerEntero("Ingrese el primer número:");
        int segundoNumero = obtenerEntero("Ingrese el segundo número:");

        // Verificar que los valores son correctos
        if (primerNumero > segundoNumero) {
            JOptionPane.showMessageDialog(null,
                    "El primer número debe ser menor o igual al segundo número. Intente de nuevo.");
            System.exit(0);
        }

        // Mostrar todos los números pares en el rango
        StringBuilder resultado = new StringBuilder("Números pares en el rango:\n");
        for (int i = primerNumero; i <= segundoNumero; i++) {
            if (i % 2 == 0) {
                resultado.append(i).append(", ");
            }
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    private static int obtenerEntero(String mensaje) {
        // Solicitar al usuario ingresar un número entero y convertir a int
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

}
