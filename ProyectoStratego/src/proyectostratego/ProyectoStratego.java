package proyectostratego;

import proyectostratego.ventanas.Principal;

public class ProyectoStratego {
    
    public static void main(String[] args) {
        
        Principal ventana = new Principal();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        System.out.println("[CONSOLE LOG] Iniciando el juego.\n");
        
    }
}
