/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectostratego.utilidades;

public class yQueFueVillanos {//Codigo para villanos

    public yQueFuePiezas[] villanos; //Public object array heroes

    public yQueFueVillanos() {
        villanos = new yQueFuePiezas[40];//piezas nomas
        //Formato
        //Al crear la pieza sera - "Ejemplo" , "/asda/asda/asda.png/",1,1,-1,-1,true;
        villanos[0] = new yQueFuePiezas("Dr Doom[10]", "/proyectostratego/imagenesvillanos/1DrDoom.jpg", 10, 1, -1, -1, false);//10
        villanos[1] = new yQueFuePiezas("Galactus[9]", "/proyectostratego/imagenesvillanos/2Galactus.png", 9, 1, -1, -1, false);//9
        villanos[2] = new yQueFuePiezas("Kingpin[8]", "/proyectostratego/imagenesvillanos/3KingPin.png", 8, 1, -1, -1, false);//8
        villanos[3] = new yQueFuePiezas("Magneto[8]", "/proyectostratego/imagenesvillanos/4Magneto.png", 8, 1, -1, -1, false);
        villanos[4] = new yQueFuePiezas("Apocalypse[7]", "/proyectostratego/imagenesvillanos/5Apocalypse.png", 7, 1, -1, -1, false);//7
        villanos[5] = new yQueFuePiezas("Green Goblin[7]", "/proyectostratego/imagenesvillanos/6GreenGoblin.png", 7, 1, -1, -1, false);
        villanos[6] = new yQueFuePiezas("Venom[7]", "/proyectostratego/imagenesvillanos/7Venom.png", 7, 1, -1, -1, false);
        villanos[7] = new yQueFuePiezas("Bullseye[6]", "/proyectostratego/imagenesvillanos/8Bullseye.png", 6, 1, -1, -1, false);//6
        villanos[8] = new yQueFuePiezas("Omega Red[6]", "/proyectostratego/imagenesvillanos/9OmegaRed.png", 6, 1, -1, -1, false);
        villanos[9] = new yQueFuePiezas("Onslaught[6]", "/proyectostratego/imagenesvillanos/10Onslaught.png", 6, 1, -1, -1, false);
        villanos[10] = new yQueFuePiezas("Red Skull[6]", "/proyectostratego/imagenesvillanos/11RedSkull.png", 6, 1, -1, -1, false);
        villanos[11] = new yQueFuePiezas("Mystique[5]", "/proyectostratego/imagenesvillanos/12Mystique.png", 5, 1, -1, -1, false);//5
        villanos[12] = new yQueFuePiezas("Mysterio[5]", "/proyectostratego/imagenesvillanos/13Mysterio.png", 5, 1, -1, -1, false);
        villanos[13] = new yQueFuePiezas("Dr.Octopus[5]", "/proyectostratego/imagenesvillanos/14DrOctopus.png", 5, 1, -1, -1, false);
        villanos[14] = new yQueFuePiezas("Deadpool[5]", "/proyectostratego/imagenesvillanos/15Deadpool.png", 5, 1, -1, -1, false);
        villanos[15] = new yQueFuePiezas("Abomination[4]", "/proyectostratego/imagenesvillanos/16Abomination.png", 4, 1, -1, -1, false);//4
        villanos[16] = new yQueFuePiezas("Thanos[4]", "/proyectostratego/imagenesvillanos/17Thanos.png", 4, 1, -1, -1, false);
        villanos[17] = new yQueFuePiezas("Black Cat[4]", "/proyectostratego/imagenesvillanos/18BlackCat.png", 4, 1, -1, -1, false);
        villanos[18] = new yQueFuePiezas("Sabretooth[4]", "/proyectostratego/imagenesvillanos/19SabreTooth.png", 4, 1, -1, -1, false);
        villanos[19] = new yQueFuePiezas("Juggernaut[3]", "/proyectostratego/imagenesvillanos/20Juggernaut.png", 3, 1, -1, -1, false);//3
        villanos[20] = new yQueFuePiezas("Rhino[3]", "/proyectostratego/imagenesvillanos/21Rhino.png", 3, 1, -1, -1, false);
        villanos[21] = new yQueFuePiezas("Carnage[3]", "/proyectostratego/imagenesvillanos/22Carnage.png", 3, 1, -1, -1, false);
        villanos[22] = new yQueFuePiezas("MoleMan[3]", "/proyectostratego/imagenesvillanos/23moleman.png", 3, 1, -1, -1, false);
        villanos[23] = new yQueFuePiezas("Lizard[3]", "/proyectostratego/imagenesvillanos/24Lizard.png", 3, 1, -1, -1, false);
        villanos[24] = new yQueFuePiezas("Mr Sinister[2]", "/proyectostratego/imagenesvillanos/25MrSinister.png", 2, 10, -1, -1, false);//2
        villanos[25] = new yQueFuePiezas("Sentinel 1[2]", "/proyectostratego/imagenesvillanos/26Sentinel1.png", 2, 10, -1, -1, false);
        villanos[26] = new yQueFuePiezas("Ultron[2]", "/proyectostratego/imagenesvillanos/27Ultron.png", 2, 10, -1, -1, false);
        villanos[27] = new yQueFuePiezas("Sandman[2]", "/proyectostratego/imagenesvillanos/28SandMan.png", 2, 10, -1, -1, false);
        villanos[28] = new yQueFuePiezas("Leader[2]", "/proyectostratego/imagenesvillanos/29Leader.png", 2, 10, -1, -1, false);
        villanos[29] = new yQueFuePiezas("Viper[2]", "/proyectostratego/imagenesvillanos/30Viper.png", 2, 10, -1, -1, false);
        villanos[30] = new yQueFuePiezas("Sentinel 2[2]", "/proyectostratego/imagenesvillanos/31Sentinel2.png", 2, 10, -1, -1, false);
        villanos[31] = new yQueFuePiezas("Elektro[2]", "/proyectostratego/imagenesvillanos/32Elektro.png", 2, 10, -1, -1, false);
        villanos[32] = new yQueFuePiezas("Black Widow[1]", "/proyectostratego/imagenesvillanos/33BlackWidow.png", 1, 1, -1, -1, false);//1
        
        villanos[33] = new yQueFuePiezas("Tierra", "/proyectostratego/imagenesheroes/Tierra.png", 0, 0, -1, -1, false);//1        
        villanos[34] = new yQueFuePiezas("Pumpkin Bomb", "/proyectostratego/imagenesvillanos/pumpkinbomb.png", -1, 0, -1, -1, false);//1        
        villanos[35] = new yQueFuePiezas("Pumpkin Bomb", "/proyectostratego/imagenesvillanos/pumpkinbomb.png", -1, 0, -1, -1, false);//1        
        villanos[36] = new yQueFuePiezas("Pumpkin Bomb", "/proyectostratego/imagenesvillanos/pumpkinbomb.png", -1, 0, -1, -1, false);//1        
        villanos[37] = new yQueFuePiezas("Pumpkin Bomb", "/proyectostratego/imagenesvillanos/pumpkinbomb.png", -1, 0, -1, -1, false);//1        
        villanos[38] = new yQueFuePiezas("Pumpkin Bomb", "/proyectostratego/imagenesvillanos/pumpkinbomb.png", -1, 0, -1, -1, false);//1        
        villanos[39] = new yQueFuePiezas("Pumpkin Bomb", "/proyectostratego/imagenesvillanos/pumpkinbomb.png", -1, 0, -1, -1, false);//1        
     
    }

}
