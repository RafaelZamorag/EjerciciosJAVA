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
public class Ejercicio200 {
    public static void main(String[] args) {
        // Solicitar al usuario el capital inicial
        double capitalInicial = obtenerCantidad("Ingrese el capital inicial:");

        // Calcular el capital después de 2 meses con un interés del 1.5% mensual
        double capitalFinal = calcularInteres(capitalInicial, 2, 1.5);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El capital después de 2 meses será: $" + capitalFinal);
    }

    private static double obtenerCantidad(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }

    private static double calcularInteres(double capitalInicial, int meses, double tasaInteres) {
        // Fórmula del interés compuesto: A = P(1 + r/n)^(nt)
        // Donde:
        // A = Monto total (capital final)
        // P = Capital inicial
        // r = Tasa de interés anual (en decimal)
        // n = Número de veces que se capitaliza al año
        // t = Tiempo en años

        double tasaInteresDecimal = tasaInteres / 100.0; // Convertir la tasa a decimal
        int vecesCapitalizadoAlAno = 12; // Mensualmente en este caso
        double tiempoEnAnos = meses / 12.0; // Convertir el tiempo a años

        double montoTotal = capitalInicial * Math.pow(1 + tasaInteresDecimal / vecesCapitalizadoAlAno,
                vecesCapitalizadoAlAno * tiempoEnAnos);

        return montoTotal;
    }

}
