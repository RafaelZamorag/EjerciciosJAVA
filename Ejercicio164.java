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
public class Ejercicio164 {
    public static void main(String[] args) {
        int totalBoletosVendidos = 0;
        double ventaBruta = 0;
        int boletosAdulto = 0;
        int boletosNino = 0;
        int boletosPromocion = 0;

        // Pedir datos al menos en 10 ocasiones
        for (int i = 0; i < 10; i++) {
            // Solicitar al usuario que ingrese el tipo de boleto vendido
            String[] opcionesBoletos = { "Adulto", "Niño", "Promociones" };
            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione el tipo de boleto vendido:",
                    "Taquilla de Cine",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcionesBoletos,
                    opcionesBoletos[0]);

            // Solicitar al usuario que ingrese la cantidad de boletos vendidos
            String inputCantidad = JOptionPane.showInputDialog("Ingrese la cantidad de boletos vendidos:");

            // Convertir la cadena a un número entero
            try {
                int cantidadBoletos = Integer.parseInt(inputCantidad);

                // Actualizar datos
                totalBoletosVendidos += cantidadBoletos;

                switch (seleccion) {
                    case 0: // Adulto
                        boletosAdulto += cantidadBoletos;
                        ventaBruta += cantidadBoletos * 60.0;
                        break;
                    case 1: // Niño
                        boletosNino += cantidadBoletos;
                        ventaBruta += cantidadBoletos * 30.0;
                        break;
                    case 2: // Promociones
                        boletosPromocion += cantidadBoletos;
                        ventaBruta += cantidadBoletos * 20.0;
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese una cantidad válida.");
                i--; // Disminuir el contador para repetir la entrada
            }
        }

        // Mostrar el resumen utilizando JOptionPane.showMessageDialog
        String resumen = "Resumen de la Taquilla:\n" +
                "Total de boletos vendidos: " + totalBoletosVendidos + "\n" +
                "Venta bruta: $" + ventaBruta + "\n" +
                "Boletos vendidos por tipo:\n" +
                "  Adulto: " + boletosAdulto + "\n" +
                "  Niño: " + boletosNino + "\n" +
                "  Promociones: " + boletosPromocion;

        JOptionPane.showMessageDialog(null, resumen);
    }

}
