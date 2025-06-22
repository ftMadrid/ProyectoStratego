/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectostratego.utilidades;

public class yQueFueHeroes {//Codigo para heroes

    public yQueFuePiezas[] heroes; //Public object array heroes

    public yQueFueHeroes() {
        heroes = new yQueFuePiezas[40];//piezas nomas
        //Formato
        //Al crear la pieza sera - "Ejemplo" , "/asda/asda/asda.png/",1,1,-1,-1,true;
        heroes[0] = new yQueFuePiezas("Tierra", "/proyectostratego/imagenesheroes/Tierra.png", 0, 0, -1, -1, true);//1        
        heroes[1] = new yQueFuePiezas("Nova Blast", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[2] = new yQueFuePiezas("Nova Blast", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[3] = new yQueFuePiezas("Nova Blast", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[4] = new yQueFuePiezas("Nova Blast", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[5] = new yQueFuePiezas("Nova Blast", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[6] = new yQueFuePiezas("Nova Blast", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1
        
        
        heroes[7] = new yQueFuePiezas("Mr Fantastic[10]", "/proyectostratego/imagenesheroes/1_MrFantastic.png", 10, 1, -1, -1, true);//10
        heroes[8] = new yQueFuePiezas("Captain America[9]", "/proyectostratego/imagenesheroes/2_CaptainAmerica.png", 9, 1, -1, -1, true);//9
        heroes[9] = new yQueFuePiezas("Professor x[8]", "/proyectostratego/imagenesheroes/3_ProfessorX.png", 8, 1, -1, -1, true);//8
        heroes[10] = new yQueFuePiezas("Nick Fury[8]", "/proyectostratego/imagenesheroes/4_NickFury.png", 8, 1, -1, -1, true);
        heroes[11] = new yQueFuePiezas("Spider-Man[7]", "/proyectostratego/imagenesheroes/5_Spider-Man.png", 7, 1, -1, -1, true);//7
        heroes[12] = new yQueFuePiezas("Wolverine[7]", "/proyectostratego/imagenesheroes/6_wolverine.png", 7, 1, -1, -1, true);
        heroes[13] = new yQueFuePiezas("Namor[7]", "/proyectostratego/imagenesheroes/7_Namor.png", 7, 1, -1, -1, true);
        heroes[14] = new yQueFuePiezas("DareDevil[6]", "/proyectostratego/imagenesheroes/8_DareDevil.png", 6, 1, -1, -1, true);//6
        heroes[15] = new yQueFuePiezas("Silver Surfer[6]", "/proyectostratego/imagenesheroes/9_SilverSufer.png", 6, 1, -1, -1, true);
        heroes[16] = new yQueFuePiezas("Hulk[6]", "/proyectostratego/imagenesheroes/10_Hulk.png", 6, 1, -1, -1, true);
        heroes[17] = new yQueFuePiezas("Iron Man[6]", "/proyectostratego/imagenesheroes/11_IronMan.png", 6, 1, -1, -1, true);
        heroes[18] = new yQueFuePiezas("Thor[5]", "/proyectostratego/imagenesheroes/12_Thor.png", 5, 1, -1, -1, true);//5
        heroes[19] = new yQueFuePiezas("Human Torch[5]", "/proyectostratego/imagenesheroes/13_HumanTorch.png", 5, 1, -1, -1, true);
        heroes[20] = new yQueFuePiezas("Cyclops[5]", "/proyectostratego/imagenesheroes/14_Cyclops.png", 5, 1, -1, -1, true);
        heroes[21] = new yQueFuePiezas("Invisible Woman[5]", "/proyectostratego/imagenesheroes/15_InvisibleWoman.png", 5, 1, -1, -1, true);
        heroes[22] = new yQueFuePiezas("Ghost Rider[4]", "/proyectostratego/imagenesheroes/16_GhostRider.png", 4, 1, -1, -1, true);//4
        heroes[23] = new yQueFuePiezas("Punisher[4]", "/proyectostratego/imagenesheroes/17_Punisher.png", 4, 1, -1, -1, true);
        heroes[24] = new yQueFuePiezas("Blade[4]", "/proyectostratego/imagenesheroes/18_Blade.png", 4, 1, -1, -1, true);
        heroes[25] = new yQueFuePiezas("The Thing[4]", "/proyectostratego/imagenesheroes/19_TheThing.png", 4, 1, -1, -1, true);
        heroes[26] = new yQueFuePiezas("Emma Frost[3]", "/proyectostratego/imagenesheroes/20_EmmaFrost.png", 3, 1, -1, -1, true);//3
        heroes[27] = new yQueFuePiezas("She-Hulk[3]", "/proyectostratego/imagenesheroes/21_She-Hulk.png", 3, 1, -1, -1, true);
        heroes[28] = new yQueFuePiezas("Giant Man[3]", "/proyectostratego/imagenesheroes/22_GiantMan.png", 3, 1, -1, -1, true);
        heroes[29] = new yQueFuePiezas("Beast[3]", "/proyectostratego/imagenesheroes/23_Beast.png", 3, 1, -1, -1, true);
        heroes[30] = new yQueFuePiezas("Colossus[3]", "/proyectostratego/imagenesheroes/24_Colossus.png", 3, 1, -1, -1, true);
        heroes[31] = new yQueFuePiezas("Gambit[2]", "/proyectostratego/imagenesheroes/25_Gambit.png", 2, 10, -1, -1, true);//2
        heroes[32] = new yQueFuePiezas("Spider-Girl[2]", "/proyectostratego/imagenesheroes/26_SpiderGirl.png", 2, 10, -1, -1, true);
        heroes[33] = new yQueFuePiezas("Ice Man[2]", "/proyectostratego/imagenesheroes/27_IceMan.png", 2, 10, -1, -1, true);
        heroes[34] = new yQueFuePiezas("Storm[2]", "/proyectostratego/imagenesheroes/28_Storm.png", 2, 10, -1, -1, true);
        heroes[35] = new yQueFuePiezas("Phoenix[2]", "/proyectostratego/imagenesheroes/29_Phoenix.png", 2, 10, -1, -1, true);
        heroes[36] = new yQueFuePiezas("Elektra[2]", "/proyectostratego/imagenesheroes/30_Elektra.png", 2, 10, -1, -1, true);
        heroes[37] = new yQueFuePiezas("Nightcrawler[2]", "/proyectostratego/imagenesheroes/31_Nightcrawler.png", 2, 10, -1, -1, true);
        heroes[38] = new yQueFuePiezas("Dr Strange[2]", "/proyectostratego/imagenesheroes/32_DrStrange.png", 2, 10, -1, -1, true);
        heroes[39] = new yQueFuePiezas("Black Widow[1]", "/proyectostratego/imagenesheroes/33_BlackWidow.png", 1, 1, -1, -1, true);//1
    }
}
