/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectostratego.utilidades;

public class villanos {//Codigo para villanos

    public pieza[] villanos; //Public object array heroes

    public villanos() {
        villanos = new pieza[40];//piezas nomas
        //Formato
        //Al crear la pieza sera - "Ejemplo" , "/asda/asda/asda.png/",1,1,-1,-1,true;
        villanos[0] = new pieza("Dr Doom", "/proyectostratego/imagenesvillanos/1DrDoom.jpg", 10, 1, -1, -1, false);//10
        villanos[1] = new pieza("Galactus", "/proyectostratego/imagenesvillanos/2Galactus.png", 9, 1, -1, -1, false);//9
        villanos[2] = new pieza("Kingpin", "/proyectostratego/imagenesvillanos/3KingPin.png", 8, 1, -1, -1, false);//8
        villanos[3] = new pieza("Magneto", "/proyectostratego/imagenesvillanos/4Magneto.png", 8, 1, -1, -1, false);
        villanos[4] = new pieza("Apocalypse", "/proyectostratego/imagenesvillanos/5Apocalypse.png", 7, 1, -1, -1, false);//7
        villanos[5] = new pieza("Green Goblin", "/proyectostratego/imagenesvillanos/6GreenGoblin.png", 7, 1, -1, -1, false);
        villanos[6] = new pieza("Venom", "/proyectostratego/imagenesvillanos/7Venom.png", 7, 1, -1, -1, false);
        villanos[7] = new pieza("Bullseye", "/proyectostratego/imagenesvillanos/8Bullseye.png", 6, 1, -1, -1, false);//6
        villanos[8] = new pieza("Omega Red", "/proyectostratego/imagenesvillanos/9OmegaRed.png", 6, 1, -1, -1, false);
        villanos[9] = new pieza("Onslaught", "/proyectostratego/imagenesvillanos/10Onslaught.png", 6, 1, -1, -1, false);
        villanos[10] = new pieza("Red Skull", "/proyectostratego/imagenesvillanos/11RedSkull.png", 6, 1, -1, -1, false);
        villanos[11] = new pieza("Mystique", "/proyectostratego/imagenesvillanos/12Mystique.png", 5, 1, -1, -1, false);//5
        villanos[12] = new pieza("Mysterio", "/proyectostratego/imagenesvillanos/13Mysterio.png", 5, 1, -1, -1, false);
        villanos[13] = new pieza("Dr.Octopus", "/proyectostratego/imagenesvillanos/14DrOctopus.png", 5, 1, -1, -1, false);
        villanos[14] = new pieza("Deadpool", "/proyectostratego/imagenesvillanos/15Deadpool.png", 5, 1, -1, -1, false);
        villanos[15] = new pieza("Abomination", "/proyectostratego/imagenesvillanos/16Abomination.png", 4, 1, -1, -1, false);//4
        villanos[16] = new pieza("Thanos", "/proyectostratego/imagenesvillanos/17Thanos.png", 4, 1, -1, -1, false);
        villanos[17] = new pieza("Black Cat", "/proyectostratego/imagenesvillanos/18BlackCat.png", 4, 1, -1, -1, false);
        villanos[18] = new pieza("Sabretooth", "/proyectostratego/imagenesvillanos/19SabreTooth.png", 4, 1, -1, -1, false);
        villanos[19] = new pieza("Juggernaut", "/proyectostratego/imagenesvillanos/20Juggernaut.png", 3, 1, -1, -1, false);//3
        villanos[20] = new pieza("Rhino", "/proyectostratego/imagenesvillanos/21Rhino.png", 3, 1, -1, -1, false);
        villanos[21] = new pieza("Carnage", "/proyectostratego/imagenesvillanos/22Carnage.png", 3, 1, -1, -1, false);
        villanos[22] = new pieza("MoleMan", "/proyectostratego/imagenesvillanos/23moleman.png", 3, 1, -1, -1, false);
        villanos[23] = new pieza("Lizard", "/proyectostratego/imagenesvillanos/24Lizard.png", 3, 1, -1, -1, false);
        villanos[24] = new pieza("Mr Sinister", "/proyectostratego/imagenesvillanos/25MrSinister.png", 2, 10, -1, -1, false);//2
        villanos[25] = new pieza("Sentinel 1", "/proyectostratego/imagenesvillanos/26Sentinel1.png", 2, 10, -1, -1, false);
        villanos[26] = new pieza("Ultron", "/proyectostratego/imagenesvillanos/27Ultron.png", 2, 10, -1, -1, false);
        villanos[27] = new pieza("Sandman", "/proyectostratego/imagenesvillanos/28SandMan.png", 2, 10, -1, -1, false);
        villanos[28] = new pieza("Leader", "/proyectostratego/imagenesvillanos/29Leader.png", 2, 10, -1, -1, false);
        villanos[29] = new pieza("Viper", "/proyectostratego/imagenesvillanos/30Viper.png", 2, 10, -1, -1, false);
        villanos[30] = new pieza("Sentinel 2", "/proyectostratego/imagenesvillanos/31Sentinel2.png", 2, 10, -1, -1, false);
        villanos[31] = new pieza("Elektro", "/proyectostratego/imagenesvillanos/32Elektro.png", 2, 10, -1, -1, false);
        villanos[32] = new pieza("Black Widow", "/proyectostratego/imagenesvillanos/33BlackWidow.png", 1, 1, -1, -1, false);//1
        villanos[33] = new pieza("Tierra Villanos", "/proyectostratego/imagenesheroes/Tierra.png", 0, 0, -1, -1, false);//1        
        villanos[34] = new pieza("Bombas Villanos 1", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, false);//1        
        villanos[35] = new pieza("Bombas Villanos 2", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, false);//1        
        villanos[36] = new pieza("Bombas Villanos 3", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, false);//1        
        villanos[37] = new pieza("Bombas Villanos 4", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, false);//1        
        villanos[38] = new pieza("Bombas Villanos 5", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, false);//1        
        villanos[39] = new pieza("Bombas Villanos 6", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, false);//1        
     
    }

}
