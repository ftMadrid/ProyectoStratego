/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectostratego.utilidades;

public class heroes {//Codigo para heroes

    public pieza[] heroes; //Public object array heroes

    public heroes() {
        heroes = new pieza[9];//piezas nomas
        //Formato
        //Al crear la pieza sera - "Ejemplo" , "/asda/asda/asda.png/",1,1,-1,-1,true;
        heroes[0] = new pieza("Black Widow", "/proyectostratego/imagenesvillanos/33BlackWidow.png", 1, 1, -1, -1, true);
        heroes[1] = new pieza("Tierra", "/proyectostratego/imagenesheroes/Tierra.png", 0, 0, -1, -1, true);
        heroes[2] = new pieza("Bomba 1", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);
        heroes[3] = new pieza("Bomba 2", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);
        heroes[4] = new pieza("Bomba 3", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);
        heroes[5] = new pieza("Bomba 4", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);
        heroes[6] = new pieza("Bomba 5", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);
        heroes[7] = new pieza("Bomba 6", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);
        heroes[8] = new pieza("Ultron", "/proyectostratego/imagenesvillanos/27Ultron.png", 2, 10, -1, -1, true);

    }

}
