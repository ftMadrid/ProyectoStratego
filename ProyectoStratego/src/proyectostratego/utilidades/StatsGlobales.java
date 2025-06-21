package proyectostratego.utilidades;

public class StatsGlobales {
    
    private static int partidas = 0;
    private static int victoriasHeroes = 0;
    private static int victoriasVillanos = 0;
    
    public static void setPartidas(){
        partidas++;
    }
    
    public static int getPartidas(){
        return partidas;
    }
    public static void setVictoriasHeroes(){
        victoriasHeroes++;
    }
    
    public static int getVictoriasHeroes(){
        return victoriasHeroes;
    }
    
    public static void setVictoriasVillanos(){
        victoriasVillanos++;
    }
    
    public static int getVictoriasVillanos(){
        return victoriasVillanos;
    }
    
}
