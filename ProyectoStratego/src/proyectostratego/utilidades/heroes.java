/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectostratego.utilidades;

public class heroes {//Codigo para heroes

    public pieza[] heroes; //Public object array heroes

    public heroes() {
        heroes = new pieza[4];//piezas nomas
        //Formato
        //Al crear la pieza sera - "Ejemplo" , "/asda/asda/asda.png/",1,1,-1,-1,true;
        heroes[0] = new pieza("Black Widow", "/proyectostratego/imagenesvillanos/33BlackWidow.png", 1, 1, -1, -1, true);
        heroes[1] = new pieza("Tierra", "/proyectostratego/imagenes/Pieza.png", 4, 0, -1, -1, true);
        heroes[2] = new pieza("Bomba", "/proyectostratego/imagenes/Pieza.png", 3, 0, -1, -1, true);
        heroes[3] = new pieza("Ultron", "/proyectostratego/imagenesvillanos/27Ultron.png", 2, 1, -1, -1, true);

    }

}
