/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectostratego.utilidades;

public class heroes {//Codigo para heroes

    public pieza[] heroes; //Public object array heroes

    public heroes() {
        heroes = new pieza[40];//piezas nomas
        //Formato
        //Al crear la pieza sera - "Ejemplo" , "/asda/asda/asda.png/",1,1,-1,-1,true;
        heroes[0] = new pieza("Tierra Heroes", "/proyectostratego/imagenesheroes/Tierra.png", 0, 0, -1, -1, true);//1        
        heroes[1] = new pieza("Bombas Heroes 1", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[2] = new pieza("Bombas Heroes 2", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[3] = new pieza("Bombas Heroes 3", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[4] = new pieza("Bombas Heroes 4", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[5] = new pieza("Bombas Heroes 5", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[6] = new pieza("Bombas Heroes 6", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1
        
        
        heroes[7] = new pieza("Mr Fantastic", "/proyectostratego/imagenesheroes/1_MrFantastic.png", 10, 1, -1, -1, true);//10
        heroes[8] = new pieza("Captain America", "/proyectostratego/imagenesheroes/2_CaptainAmerica.png", 9, 1, -1, -1, true);//9
        heroes[9] = new pieza("Professor x", "/proyectostratego/imagenesheroes/3_ProfessorX.png", 8, 1, -1, -1, true);//8
        heroes[10] = new pieza("Nick Fury", "/proyectostratego/imagenesheroes/4_NickFury.png", 8, 1, -1, -1, true);
        heroes[11] = new pieza("Spider-Man", "/proyectostratego/imagenesheroes/5_Spider-Man.png", 7, 1, -1, -1, true);//7
        heroes[12] = new pieza("Wolverine", "/proyectostratego/imagenesheroes/6_wolverine.png", 7, 1, -1, -1, true);
        heroes[13] = new pieza("Namor", "/proyectostratego/imagenesheroes/7_Namor.png", 7, 1, -1, -1, true);
        heroes[14] = new pieza("DareDevil", "/proyectostratego/imagenesheroes/8_DareDevil.png", 6, 1, -1, -1, true);//6
        heroes[15] = new pieza("Silver Surfer", "/proyectostratego/imagenesheroes/9_SilverSufer.png", 6, 1, -1, -1, true);
        heroes[16] = new pieza("Hulk", "/proyectostratego/imagenesheroes/10_Hulk.png", 6, 1, -1, -1, true);
        heroes[17] = new pieza("Iron Man", "/proyectostratego/imagenesheroes/11_IronMan.png", 6, 1, -1, -1, true);
        heroes[18] = new pieza("Thor", "/proyectostratego/imagenesheroes/12_Thor.png", 5, 1, -1, -1, true);//5
        heroes[19] = new pieza("Human Torch", "/proyectostratego/imagenesheroes/13_HumanTorch.png", 5, 1, -1, -1, true);
        heroes[20] = new pieza("Cyclops", "/proyectostratego/imagenesheroes/14_Cyclops.png", 5, 1, -1, -1, true);
        heroes[21] = new pieza("Invisible Woman", "/proyectostratego/imagenesheroes/15_InvisibleWoman.png", 5, 1, -1, -1, true);
        heroes[22] = new pieza("Ghost Rider", "/proyectostratego/imagenesheroes/16_GhostRider.png", 4, 1, -1, -1, true);//4
        heroes[23] = new pieza("Punisher", "/proyectostratego/imagenesheroes/17_Punisher.png", 4, 1, -1, -1, true);
        heroes[24] = new pieza("Blade", "/proyectostratego/imagenesheroes/18_Blade.png", 4, 1, -1, -1, true);
        heroes[25] = new pieza("The Thing", "/proyectostratego/imagenesheroes/19_TheThing.png", 4, 1, -1, -1, true);
        heroes[26] = new pieza("Emma Frost", "/proyectostratego/imagenesheroes/20_EmmaFrost.png", 3, 1, -1, -1, true);//3
        heroes[27] = new pieza("She-Hulk", "/proyectostratego/imagenesheroes/21_She-Hulk.png", 3, 1, -1, -1, true);
        heroes[28] = new pieza("Giant Man", "/proyectostratego/imagenesheroes/22_GiantMan.png", 3, 1, -1, -1, true);
        heroes[29] = new pieza("Beast", "/proyectostratego/imagenesheroes/23_Beast.png", 3, 1, -1, -1, true);
        heroes[30] = new pieza("Colossus", "/proyectostratego/imagenesheroes/24_Colossus.png", 3, 1, -1, -1, true);
        heroes[31] = new pieza("Gambit", "/proyectostratego/imagenesheroes/25_Gambit.png", 2, 10, -1, -1, true);//2
        heroes[32] = new pieza("Spider-Girl", "/proyectostratego/imagenesheroes/26_SpiderGirl.png", 2, 10, -1, -1, true);
        heroes[33] = new pieza("Ice Man", "/proyectostratego/imagenesheroes/27_IceMan.png", 2, 10, -1, -1, true);
        heroes[34] = new pieza("Storm", "/proyectostratego/imagenesheroes/28_Storm.png", 2, 10, -1, -1, true);
        heroes[35] = new pieza("Phoenix", "/proyectostratego/imagenesheroes/29_Phoenix.png", 2, 10, -1, -1, true);
        heroes[36] = new pieza("Elektra", "/proyectostratego/imagenesheroes/30_Elektra.png", 2, 10, -1, -1, true);
        heroes[37] = new pieza("Nightcrawler", "/proyectostratego/imagenesheroes/31_Nightcrawler.png", 2, 10, -1, -1, true);
        heroes[38] = new pieza("Dr Strange", "/proyectostratego/imagenesheroes/32_DrStrange.png", 2, 10, -1, -1, true);
        heroes[39] = new pieza("Black Widow", "/proyectostratego/imagenesheroes/33_BlackWidow.png", 1, 1, -1, -1, true);//1
        
        
        //heroes[40] = new pieza("Tierra Heroes", "/proyectostratego/imagenesheroes/Tierra.png", 0, 0, -1, -1, true);//1        
        /*heroes[34] = new pieza("Bombas Heroes 1", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[35] = new pieza("Bombas Heroes 2", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[36] = new pieza("Bombas Heroes 3", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[37] = new pieza("Bombas Heroes 4", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[38] = new pieza("Bombas Heroes 5", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1        
        heroes[39] = new pieza("Bombas Heroes 6", "/proyectostratego/imagenesheroes/novablast.png", -1, 0, -1, -1, true);//1*/
        
     

    }

}
