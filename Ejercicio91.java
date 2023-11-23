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
public class Ejercicio91 {
        public static void main(String[] args) {
                // Ingresar datos de la persona utilizando JOptionPane
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
                String apellido = JOptionPane.showInputDialog("Ingrese el apellido:");
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));
                String numeroCelular = JOptionPane.showInputDialog("Ingrese el número de celular:");

                // Mostrar los datos ingresados
                String mensaje = "Datos ingresados:\n" +
                                "Nombre: " + nombre + "\n" +
                                "Apellido: " + apellido + "\n" +
                                "Edad: " + edad + "\n" +
                                "Número de celular: " + numeroCelular;

                JOptionPane.showMessageDialog(null, mensaje);

        }

}
