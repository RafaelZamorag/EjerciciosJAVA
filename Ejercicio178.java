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
public class Ejercicio178 {
    public static void main(String[] args) {
        // Obtener la duración de la llamada del usuario
        String duracionStr = JOptionPane.showInputDialog("Ingrese la duración de la llamada en minutos:");

        // Convertir la entrada a un número entero
        int duracion = Integer.parseInt(duracionStr);

        // Calcular el costo de la llamada
        double costo = calcularCostoLlamada(duracion);

        // Mostrar el resultado utilizando JOptionPane
        JOptionPane.showMessageDialog(null, "El costo de la llamada es: $" + costo);
    }

    // Método para calcular el costo de la llamada
    private static double calcularCostoLlamada(int duracion) {
        final double costoBase = 3.00;
        double costoTotal = 0;

        if (duracion <= 3) {
            // El costo de los primeros 3 minutos es de $3.00
            costoTotal = costoBase;
        } else if (duracion > 3 && duracion <= 7) {
            // Después de 3 minutos, se agrega un 50% al costo base por minuto
            costoTotal = costoBase + (duracion - 3) * (costoBase * 0.5);
        } else {
            // Después de 7 minutos, cada minuto adicional se cobra al 100% del costo base
            costoTotal = costoBase + 4 * (costoBase * 0.5) + (duracion - 7) * costoBase;
        }

        return costoTotal;
    }

}
