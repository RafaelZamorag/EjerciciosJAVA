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
public class Ejercicio185 {

    public static void main(String[] args) {
        // Captura de datos
        String apellidoPaterno = JOptionPane.showInputDialog("Ingrese su apellido paterno:");
        String apellidoMaterno = JOptionPane.showInputDialog("Ingrese su apellido materno:");
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String fechaNacimiento = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento (YYYY-MM-DD):");
        String sexo = JOptionPane.showInputDialog("Ingrese su sexo (F/M):");
        String entidadNacimiento = JOptionPane.showInputDialog("Ingrese la entidad de nacimiento (dos letras):");

        // Generar CURP
        String curp = generarCURP(apellidoPaterno, apellidoMaterno, nombre, fechaNacimiento, sexo, entidadNacimiento);

        // Mostrar la CURP
        JOptionPane.showMessageDialog(null, "Su CURP es: " + curp);
    }

    private static String generarCURP(String apellidoPaterno, String apellidoMaterno, String nombre,
            String fechaNacimiento, String sexo, String entidadNacimiento) {
        // Obtener primera letra del segundo apellido
        char letraApellidoMaterno = obtenerPrimeraLetra(apellidoMaterno);

        // Obtener primera letra del nombre
        char letraNombre = obtenerPrimeraLetra(nombre);

        // Obtener fecha de nacimiento (2 últimos dígitos del año, 2 del mes y 2 del
        // día)
        String fechaNacCURP = fechaNacimiento.substring(2, 4) + fechaNacimiento.substring(5, 7)
                + fechaNacimiento.substring(8, 10);

        // Obtener letra del sexo
        char letraSexo = sexo.toUpperCase().charAt(0);

        // Obtener letras correspondientes a la entidad de nacimiento
        String letrasEntidad = (entidadNacimiento.length() == 2) ? entidadNacimiento : "NE";

        // Obtener primera consonante interna del primer apellido
        char consonanteInternaApellidoPaterno = obtenerPrimeraConsonanteInterna(apellidoPaterno);

        // Obtener primera consonante interna del segundo apellido
        char consonanteInternaApellidoMaterno = obtenerPrimeraConsonanteInterna(apellidoMaterno);

        // Obtener primera consonante interna del nombre
        char consonanteInternaNombre = obtenerPrimeraConsonanteInterna(nombre);

        // Dígito verificador (0-9 para fechas de nacimiento hasta el año 1999, A-Z para
        // fechas de nacimiento a partir del 2000)
        char digitoVerificador = obtenerDigitoVerificador(fechaNacimiento);

        // Homoclave (puedes modificar esto según tus necesidades)
        String homoclave = "A1";

        // Combinar todos los componentes para formar la CURP
        return letraApellidoMaterno + "" + letraNombre + fechaNacCURP + letraSexo + letrasEntidad
                + consonanteInternaApellidoPaterno + consonanteInternaApellidoMaterno + consonanteInternaNombre
                + digitoVerificador + homoclave;
    }

    private static char obtenerPrimeraLetra(String palabra) {
        // Obtener la primera letra de la palabra
        return palabra.toUpperCase().charAt(0);
    }

    private static char obtenerPrimeraConsonanteInterna(String palabra) {
        // Obtener la primera consonante interna de la palabra
        for (int i = 1; i < palabra.length(); i++) {
            char letra = palabra.toUpperCase().charAt(i);
            if (letra != 'A' && letra != 'E' && letra != 'I' && letra != 'O' && letra != 'U') {
                return letra;
            }
        }
        // Si no hay consonantes internas, devolver la primera letra
        return palabra.toUpperCase().charAt(0);
    }

    private static char obtenerDigitoVerificador(String fechaNacimiento) {
        // Obtener el año de nacimiento
        int anio = Integer.parseInt(fechaNacimiento.substring(0, 4));

        // Calcular el dígito verificador
        if (anio < 2000) {
            int digito = Integer.parseInt(fechaNacimiento.substring(8, 10));
            return (char) ('0' + digito);
        } else {
            char letra = (char) ('A' + (anio - 2000));
            return letra;
        }
    }

}
