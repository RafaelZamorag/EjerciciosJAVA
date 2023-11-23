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
public class Ejercicio97 {
    public static void main(String[] args) {
        // Ingresar el consumo de la Termoeléctrica Manta en Kw
        double consumo = Double
                .parseDouble(JOptionPane.showInputDialog("Ingrese el consumo de la Termoeléctrica Manta en Kw:"));

        // Calcular el porcentaje de consumo en relación con 10000 Kw
        double porcentajeConsumo = (consumo / 10000) * 100;

        // Determinar la eficiencia energética
        String mensaje;
        if (porcentajeConsumo >= 80 && porcentajeConsumo <= 100) {
            mensaje = "CONSUMO MEDIO";
        } else {
            mensaje = "ALTO CONSUMO DE ENERGÍA";
        }

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
