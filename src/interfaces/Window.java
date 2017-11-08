/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
// PASO 1-IMPORTAMOS LAS LIBRERIAS
import javax.swing.*;//Importamos TODO de swing
import java.awt.*;
/**
 *
 * @author LC22
 */
// PASO 2- HEREDAR LA CLASE DESDE JFRAME
public class Window extends JFrame
{
  //PASO 3 - DECLARAR ELEMENTOS A UTILIZAR
    JPanel panel;
    JLabel label;
    JTextField text;
    JButton boton;
    
    // PASO 4- DEFINIR EL CONTRUCTOR
    public Window()
    {
        //PASO 5 - CREAR E INICIALIZAR LOS OBJETOS
        panel = new JPanel();//Creo un objeto tipo JPanel
        label = new JLabel();
        text = new JTextField(20);// en los parentesis se agregan la cantidad de caracteres
        boton = new JButton();
        
        // PASO 6- AGREGAR LOS ELEMENTOS AL JFRAME
        
        this.add(panel);//Recomendable agregar el JPanel al JFrame
        panel.add(label);//Agrego UN OBJETO LABEL al JPanel
        panel.add(text);
        panel.add(boton);
        
        //PASO 7- PROPIEDADES DE LOS OBJETOS
        
        label.setText("Nombre");
        boton.setText("Enviar");
        panel.setBackground(Color.red);//Color del fondo del
        
    }
}
