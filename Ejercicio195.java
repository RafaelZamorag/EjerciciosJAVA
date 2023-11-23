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
public class Ejercicio195 {
    public static void main(String[] args) {
        // Declarar e inicializar un arreglo ordenado de 20 elementos
        int[] arreglo = { 1, 5, 8, 10, 15, 18, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85 };

        // Solicitar al usuario el elemento a buscar
        int elementoABuscar = obtenerNumero("Ingrese el elemento a buscar:");

        // Realizar la búsqueda binaria
        int comparaciones = buscarBinaria(arreglo, elementoABuscar);

        // Mostrar el resultado en un cuadro de diálogo
        if (comparaciones != -1) {
            JOptionPane.showMessageDialog(null, "Elemento encontrado: " + elementoABuscar +
                    "\nComparaciones realizadas: " + comparaciones);
        } else {
            JOptionPane.showMessageDialog(null, "Elemento no encontrado.");
        }
    }

    private static int obtenerNumero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(input);
    }

    private static int buscarBinaria(int[] arreglo, int elementoABuscar) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;
        int comparaciones = 0;

        while (izquierda <= derecha) {
            comparaciones++;

            int medio = izquierda + (derecha - izquierda) / 2;

            // Si el elemento está en la mitad
            if (arreglo[medio] == elementoABuscar) {
                return comparaciones;
            }

            // Si el elemento es mayor, ignoramos la mitad izquierda
            if (arreglo[medio] < elementoABuscar) {
                izquierda = medio + 1;
            } else { // Si el elemento es menor, ignoramos la mitad derecha
                derecha = medio - 1;
            }
        }

        // Si llegamos aquí, el elemento no está en el arreglo
        return -1;
    }

}
