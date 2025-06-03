/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectostratego.ventanas;


public class villanos {//Codigo para villanos
        public pieza[] villanos; //Public object array heroes
    public villanos()
    {
    villanos = new pieza[3];//piezas nomas
    //Formato
    //Al crear la pieza sera - "Ejemplo" , "/asda/asda/asda.png/",1,1,-1,-1,true;
    villanos[0] = new pieza("Black Widow","/proyectostratego/imagenes/Pieza.png",1,1,-1,-1,false);
    villanos[1] = new pieza("Tierra", "/proyectostratego/imagenes/Pieza.png", 0, 0, -1, -1, false);
    villanos[2] = new pieza("Bomba", "/proyectostratego/imagenes/Pieza.png", 0, 0, -1, -1, false);
    
    }
    
}
