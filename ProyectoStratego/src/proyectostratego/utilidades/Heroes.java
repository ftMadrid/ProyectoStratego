/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectostratego.utilidades;

public class Heroes {//Codigo para heroes

    public Piezas[] heroes; //Public object array heroes

    public Heroes() {
        heroes = new Piezas[40];//piezas nomas
        //Formato
        //Al crear la pieza sera - "Ejemplo" , "/asda/asda/asda.png/",1,1,-1,-1,true;
        heroes[0] = new Piezas("Tierra", "/proyectostratego/imagenesheroes/TierraHeroes.png", 0, 0, -1, -1, true);//1        
        heroes[1] = new Piezas("Nova Blast", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[2] = new Piezas("Nova Blast", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[3] = new Piezas("Nova Blast", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[4] = new Piezas("Nova Blast", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[5] = new Piezas("Nova Blast", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[6] = new Piezas("Nova Blast", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1
        
        
        heroes[7] = new Piezas("Mr Fantastic[10]", "/proyectostratego/imagenesheroes/1_MrFantastic.png", 10, 1, -1, -1, true);//10
        heroes[8] = new Piezas("Captain America[9]", "/proyectostratego/imagenesheroes/2_CaptainAmerica.png", 9, 1, -1, -1, true);//9
        heroes[9] = new Piezas("Professor x[8]", "/proyectostratego/imagenesheroes/3_ProfessorX.png", 8, 1, -1, -1, true);//8
        heroes[10] = new Piezas("Nick Fury[8]", "/proyectostratego/imagenesheroes/4_NickFury.png", 8, 1, -1, -1, true);
        heroes[11] = new Piezas("Spider-Man[7]", "/proyectostratego/imagenesheroes/5_Spider-Man.png", 7, 1, -1, -1, true);//7
        heroes[12] = new Piezas("Wolverine[7]", "/proyectostratego/imagenesheroes/6_wolverine.png", 7, 1, -1, -1, true);
        heroes[13] = new Piezas("Namor[7]", "/proyectostratego/imagenesheroes/7_Namor.png", 7, 1, -1, -1, true);
        heroes[14] = new Piezas("DareDevil[6]", "/proyectostratego/imagenesheroes/8_DareDevil.png", 6, 1, -1, -1, true);//6
        heroes[15] = new Piezas("Silver Surfer[6]", "/proyectostratego/imagenesheroes/9_SilverSufer.png", 6, 1, -1, -1, true);
        heroes[16] = new Piezas("Hulk[6]", "/proyectostratego/imagenesheroes/10_Hulk.png", 6, 1, -1, -1, true);
        heroes[17] = new Piezas("Iron Man[6]", "/proyectostratego/imagenesheroes/11_IronMan.png", 6, 1, -1, -1, true);
        heroes[18] = new Piezas("Thor[5]", "/proyectostratego/imagenesheroes/12_Thor.png", 5, 1, -1, -1, true);//5
        heroes[19] = new Piezas("Human Torch[5]", "/proyectostratego/imagenesheroes/13_HumanTorch.png", 5, 1, -1, -1, true);
        heroes[20] = new Piezas("Cyclops[5]", "/proyectostratego/imagenesheroes/14_Cyclops.png", 5, 1, -1, -1, true);
        heroes[21] = new Piezas("Invisible Woman[5]", "/proyectostratego/imagenesheroes/15_InvisibleWoman.png", 5, 1, -1, -1, true);
        heroes[22] = new Piezas("Ghost Rider[4]", "/proyectostratego/imagenesheroes/16_GhostRider.png", 4, 1, -1, -1, true);//4
        heroes[23] = new Piezas("Punisher[4]", "/proyectostratego/imagenesheroes/17_Punisher.png", 4, 1, -1, -1, true);
        heroes[24] = new Piezas("Blade[4]", "/proyectostratego/imagenesheroes/18_Blade.png", 4, 1, -1, -1, true);
        heroes[25] = new Piezas("The Thing[4]", "/proyectostratego/imagenesheroes/19_TheThing.png", 4, 1, -1, -1, true);
        heroes[26] = new Piezas("Emma Frost[3]", "/proyectostratego/imagenesheroes/20_EmmaFrost.png", 3, 1, -1, -1, true);//3
        heroes[27] = new Piezas("She-Hulk[3]", "/proyectostratego/imagenesheroes/21_She-Hulk.png", 3, 1, -1, -1, true);
        heroes[28] = new Piezas("Giant Man[3]", "/proyectostratego/imagenesheroes/22_GiantMan.png", 3, 1, -1, -1, true);
        heroes[29] = new Piezas("Beast[3]", "/proyectostratego/imagenesheroes/23_Beast.png", 3, 1, -1, -1, true);
        heroes[30] = new Piezas("Colossus[3]", "/proyectostratego/imagenesheroes/24_Colossus.png", 3, 1, -1, -1, true);
        heroes[31] = new Piezas("Gambit[2]", "/proyectostratego/imagenesheroes/25_Gambit.png", 2, 10, -1, -1, true);//2
        heroes[32] = new Piezas("Spider-Girl[2]", "/proyectostratego/imagenesheroes/26_SpiderGirl.png", 2, 10, -1, -1, true);
        heroes[33] = new Piezas("Ice Man[2]", "/proyectostratego/imagenesheroes/27_IceMan.png", 2, 10, -1, -1, true);
        heroes[34] = new Piezas("Storm[2]", "/proyectostratego/imagenesheroes/28_Storm.png", 2, 10, -1, -1, true);
        heroes[35] = new Piezas("Phoenix[2]", "/proyectostratego/imagenesheroes/29_Phoenix.png", 2, 10, -1, -1, true);
        heroes[36] = new Piezas("Elektra[2]", "/proyectostratego/imagenesheroes/30_Elektra.png", 2, 10, -1, -1, true);
        heroes[37] = new Piezas("Nightcrawler[2]", "/proyectostratego/imagenesheroes/31_Nightcrawler.png", 2, 10, -1, -1, true);
        heroes[38] = new Piezas("Dr Strange[2]", "/proyectostratego/imagenesheroes/32_DrStrange.png", 2, 10, -1, -1, true);
        heroes[39] = new Piezas("Black Widow[1]", "/proyectostratego/imagenesheroes/33_BlackWidow.png", 1, 1, -1, -1, true);//1
    }
}
