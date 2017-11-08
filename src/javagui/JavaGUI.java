/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;
//PASO 8 - IMPORTAR LA CLASE CON LA VENTANA
import interfaces.Window;//Import paquete.clase
import javax.swing.JFrame;
/**
 *
 * @author LC22
 */
public class JavaGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // PASO 9 LLAMADO A LA CLASE JFRAME
        Window ventana = new Window();// Creo un objeto TIPO Window
        ventana.setVisible(true);
        ventana.setBounds(0, 0, 600, 600);
        //La  siguiente intruccion le pone el nombre a la ventana
        ventana.setTitle("Mi primera aplicacion con ventanas");
        //La siguiente sentencia es para finalizar el proyecto al cerrar la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
