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
public class Ejercicio171 {
    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            // Mostrar menú
            String opcionStr = JOptionPane.showInputDialog(
                    "Seleccione la conversión que desea realizar:\n"
                            + "1 - Libras a Kilogramos\n"
                            + "2 - Millas a Kilómetros\n"
                            + "3 - Galones a Litros\n"
                            + "4 - Fahrenheit a Celsius\n"
                            + "5 - Salir");

            // Convertir la opción a entero
            int opcion = Integer.parseInt(opcionStr);

            // Realizar la conversión según la opción seleccionada
            switch (opcion) {
                case 1:
                    convertirLibrasAKilogramos();
                    break;
                case 2:
                    convertirMillasAKilometros();
                    break;
                case 3:
                    convertirGalonesALitros();
                    break;
                case 4:
                    convertirFahrenheitACelsius();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    private static void convertirLibrasAKilogramos() {
        double libras = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en libras:"));
        double kilogramos = libras * 0.453592;
        JOptionPane.showMessageDialog(null, libras + " libras es igual a " + kilogramos + " kilogramos.");
    }

    private static void convertirMillasAKilometros() {
        double millas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en millas:"));
        double kilometros = millas * 1.60934;
        JOptionPane.showMessageDialog(null, millas + " millas es igual a " + kilometros + " kilómetros.");
    }

    private static void convertirGalonesALitros() {
        double galones = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en galones:"));
        double litros = galones * 3.78541;
        JOptionPane.showMessageDialog(null, galones + " galones es igual a " + litros + " litros.");
    }

    private static void convertirFahrenheitACelsius() {
        double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en Fahrenheit:"));
        double celsius = (fahrenheit - 32) * 5 / 9;
        JOptionPane.showMessageDialog(null,
                fahrenheit + " grados Fahrenheit es igual a " + celsius + " grados Celsius.");
    }

}
