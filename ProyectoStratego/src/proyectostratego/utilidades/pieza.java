/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectostratego.utilidades;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class pieza {
    
    public int rango;
    public Image imagen;
    public String nombre;
    public int movimiento;
    public int fila;
    public int columna;
    public boolean heroe; //Pongamos que true = heroe , false = villano pa no complicarla
    public boolean seleccionada; //Pa saber si esta seleccionada
    
    public pieza(String nombre,String rutaImagen , int rango, int movimiento, int fila, int columna, boolean heroe) 
//    
//Al crear la pieza sera - "Ejemplo" , "/asda/asda/asda.png/",1,1,-1,-1,true;
    {
    this.imagen = new ImageIcon(getClass().getResource(rutaImagen)).getImage();
    this.nombre = nombre;
    this.heroe = heroe;
    this.rango = rango;
    this.movimiento = movimiento;
    this.fila = fila;
    this.columna = columna;
    this.seleccionada = false;
    }
    
}
