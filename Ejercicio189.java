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
public class Ejercicio189 {
    public static void main(String[] args) {
        // Captura de la coordenada de inicio
        int xInicio = obtenerEntero("Ingrese la coordenada x de inicio (1-8):");
        int yInicio = obtenerEntero("Ingrese la coordenada y de inicio (1-8):");

        // Captura de la coordenada de destino
        int xDestino = obtenerEntero("Ingrese la coordenada x de destino (1-8):");
        int yDestino = obtenerEntero("Ingrese la coordenada y de destino (1-8):");

        // Validar movimiento del caballo
        if (esMovimientoCaballoValido(xInicio, yInicio, xDestino, yDestino)) {
            JOptionPane.showMessageDialog(null, "El movimiento del caballo es válido.");
        } else {
            JOptionPane.showMessageDialog(null, "El movimiento del caballo no es válido.");
        }
    }

    private static int obtenerEntero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

    private static boolean esMovimientoCaballoValido(int xInicio, int yInicio, int xDestino, int yDestino) {
        int deltaX = Math.abs(xDestino - xInicio);
        int deltaY = Math.abs(yDestino - yInicio);

        // Verificar el patrón característico del movimiento del caballo
        return (deltaX == 1 && deltaY == 2) || (deltaX == 2 && deltaY == 1);
    }
}
