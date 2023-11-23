/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segunda.parte;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Ejercicio188 {
    public static void main(String[] args) {
        // Captura de la dirección de correo electrónico
        String correo = JOptionPane.showInputDialog("Ingrese su dirección de correo electrónico:");

        // Validar la dirección de correo electrónico
        if (validarCorreoElectronico(correo)) {
            JOptionPane.showMessageDialog(null, "La dirección de correo electrónico es válida.");
        } else {
            JOptionPane.showMessageDialog(null, "La dirección de correo electrónico no es válida.");
        }
    }

    private static boolean validarCorreoElectronico(String correo) {
        // Patrón para validar la dirección de correo electrónico
        String patronCorreo = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";

        // Compilar el patrón
        Pattern pattern = Pattern.compile(patronCorreo);

        // Validar la dirección de correo electrónico con el patrón
        Matcher matcher = pattern.matcher(correo);

        return matcher.matches();
    }

}
