/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectostratego.utilidades;

public class villanos {//Codigo para villanos

    public pieza[] villanos; //Public object array heroes

    public villanos() {
        villanos = new pieza[3];//piezas nomas
        //Formato
        //Al crear la pieza sera - "Ejemplo" , "/asda/asda/asda.png/",1,1,-1,-1,true;
        villanos[0] = new pieza("Dr Doom", "/proyectostratego/imagenes/1DrDoom.jpg", 1, 1, -1, -1, false);
        villanos[1] = new pieza("Galactus", "/proyectostratego/imagenes/2Galactus.png", 0, 0, -1, -1, false);
        villanos[2] = new pieza("KingPin", "/proyectostratego/imagenes/7Venom.png", 0, 0, -1, -1, false);

    }

}
