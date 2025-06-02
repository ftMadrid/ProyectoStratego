/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectostratego.ventanas;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter; //Libreria para los mouse
import java.awt.event.MouseEvent;
/**
 *
 * @author user
 */
public class GenerarTablero extends JPanel {
    
    private final int rows = 10;
    private final int columnas = 10;
    
    private int celday = -1;
    private int celdax = -1;
    int x = 0;
    int y = 0;
    
    private final int base = 45;//Width
    private final int altura = 45;//Length
    private final int promedio = (base + altura )/2;
    
    public GenerarTablero()
    {
    //El mouse listener para lo de click?
        this.addMouseListener(new MouseAdapter()
        
        {
            
            @Override//No se para que es pero me lo pide el mouseClicked
        public void mouseClicked(MouseEvent click)
        {
        int coordenadax = click.getX();
        int coordenaday = click.getY();
        
        celdax = coordenadax / promedio;//Columna
        celday = coordenaday / promedio;//Fila
        
        
        
            System.out.println("X"+celdax +
                    "\nY"+celday);
            
           }
        });
    }
    
    public void paint(Graphics g) 
    {
        
        super.paint(g);//TODO - Revisar que hace
        x = 0;
        y = 0;
        for (int c = 0;c<columnas;c++)
        {
            for (int r = 0;r<rows;r++)
            {
            g.drawRect(x, y, altura, base);  
            //Draw Rec y no fillRect porque asi solo crea las lineas de un rect y no el rect como tal (Se podria usar una combinacion para eso)
            // Basicamente los primeros son las coordenadas x ,y | los otros dos son los tamanos l*w
            x +=45;
                
            }
            y += 45;
            x=0;
            
        }
        
        //Logica para la celda y pieza proximamente XD
        // Dibujar la imagen si hay una celda seleccionada
    
    }
    
    
}
