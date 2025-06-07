/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectostratego.utilidades;

public class heroes {//Codigo para heroes

    public pieza[] heroes; //Public object array heroes

    public heroes() {
        heroes = new pieza[3];//piezas nomas
        //Formato
        //Al crear la pieza sera - "Ejemplo" , "/asda/asda/asda.png/",1,1,-1,-1,true;
        heroes[0] = new pieza("Black Widow", "/proyectostratego/imagenes/Pieza.png", 5, 1, -1, -1, true);
        heroes[1] = new pieza("Tierra", "/proyectostratego/imagenes/Pieza.png", 0, 0, -1, -1, true);
        heroes[2] = new pieza("Bomba", "/proyectostratego/imagenes/Pieza.png", 0, 0, -1, -1, true);

    }

}
