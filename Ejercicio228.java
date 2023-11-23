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
public class Ejercicio228 {
    public static void main(String[] args) {
        // Definir el código y la contraseña correcta
        final String CODIGO_CORRECTO = "1";
        final String CONTRASENA_CORRECTA = "1234";

        // Bucle para solicitar código de usuario y contraseña
        while (true) {
            // Solicitar al usuario ingresar el código de usuario
            String codigoUsuario = obtenerTexto("Ingrese el código de usuario:");

            // Solicitar al usuario ingresar la contraseña
            String contrasena = obtenerTexto("Ingrese la contraseña:");

            // Verificar si el código y la contraseña son correctos
            if (codigoUsuario.equals(CODIGO_CORRECTO) && contrasena.equals(CONTRASENA_CORRECTA)) {
                // Mostrar mensaje de éxito y salir del bucle
                JOptionPane.showMessageDialog(null, "Acceso concedido. Bienvenido.");
                break;
            } else {
                // Mostrar mensaje de error y continuar en el bucle
                JOptionPane.showMessageDialog(null, "Código de usuario o contraseña incorrectos. Intente de nuevo.");
            }
        }
    }

    private static String obtenerTexto(String mensaje) {
        // Solicitar al usuario ingresar un texto
        return JOptionPane.showInputDialog(mensaje);
    }

}
