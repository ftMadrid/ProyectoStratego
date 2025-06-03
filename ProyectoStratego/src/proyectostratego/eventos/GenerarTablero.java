package proyectostratego.eventos;

import java.awt.Color;
import proyectostratego.utilidades.pieza;
import proyectostratego.utilidades.villanos;
import proyectostratego.utilidades.heroes;
import java.util.Random;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter; //Libreria para los mouse
import java.awt.event.MouseEvent;

public class GenerarTablero extends JPanel {

    Random random = new Random();

    private final int rows = 10;
    private final int columnas = 10;

    private int celday = -1;
    private int celdax = -1;
    int x = 0;
    int y = 0;

    private final int base = 45;//Width
    private final int altura = 45;//Length
    private final int promedio = (base + altura) / 2;
    private pieza[][] tablero = new pieza[rows][columnas]; // 10x10 Guarda el objeto como tal (Osea la pieza)

    public GenerarTablero() {
        heroes heroes = new heroes();//Llama el array
        villanos villanos = new villanos();//Llama el array

        // Colocar villanos en filas 0 y 1
        int indexVillanos = 0;//Cuantos villanos hay
        while (indexVillanos < villanos.villanos.length) {
            int randomr = random.nextInt(2); // 0 o 1
            int randomc = random.nextInt(columnas);
            if (tablero[randomr][randomc] == null) {
                tablero[randomr][randomc] = villanos.villanos[indexVillanos];
                villanos.villanos[indexVillanos].fila = randomr;
                villanos.villanos[indexVillanos].columna = randomc;
                indexVillanos++;
            }
        }

        // Colocar heroes en filas 8 y 9
        int indexHeroes = 0;//Cuantos heroes hay
        while (indexHeroes < heroes.heroes.length) {
            int randomr = 8 + random.nextInt(2); // 8 o 9
            int randomc = random.nextInt(columnas);
            if (tablero[randomr][randomc] == null) {
                tablero[randomr][randomc] = heroes.heroes[indexHeroes];
                heroes.heroes[indexHeroes].fila = randomr;
                heroes.heroes[indexHeroes].columna = randomc;
                indexHeroes++;
            }
        }

        //El mouse listener para lo de click?
        this.addMouseListener(new MouseAdapter() {

            @Override//No se para que es pero me lo pide el mouseClicked
            public void mouseClicked(MouseEvent click) {
                int coordenadax = click.getX();
                int coordenaday = click.getY();

                celdax = coordenadax / promedio;//Columna
                celday = coordenaday / promedio;//Fila

                System.out.println("X" + celdax
                        + "\nY" + celday);
                
                if (tablero[celday][celdax]!= null)
                {
                    System.out.println("Pieza aqui");
                    System.out.println(tablero[celday][celdax].nombre);
                    tablero[celday][celdax].seleccionada = true;
                }
                
                
                repaint();

            }
        });
    }

    public void paint(Graphics g) {

        super.paint(g);//TODO - Revisar que hace
        x = 0;
        y = 0;
        
        
        
        for (int c = 0; c < columnas; c++) {
            for (int r = 0; r < rows; r++) {
                g.drawRect(x, y, altura, base);

                //Draw Rec y no fillRect porque asi solo crea las lineas de un rect y no el rect como tal (Se podria usar una combinacion para eso)
                // Basicamente los primeros son las coordenadas x ,y | los otros dos son los tamanos l*w
                x += 45;

                pieza p = tablero[r][c];//Referenciando objeto osea la pieza
                if (p != null && p.imagen != null) {
                    g.drawImage(p.imagen, c * base, r * altura, base, altura, this); //usa la imagen de p (la pieza)
                }

            }
            y += 45;
            x = 0;

        }//
        
        
        
        if (celday >= 0 && celdax >=0 && celday < rows && celdax < columnas)
        {
            if (tablero[celday][celdax]!= null)
            {
        if (tablero[celday][celdax].seleccionada) {
        System.out.println(tablero[celday][celdax].nombre);
        g.setColor(Color.blue);
        g.drawRect(celdax * base, celday * altura, altura, base);
        g.setColor(Color.black);
        }
    }

        }
        //Logica para la celda y pieza proximamente XD
        //TODO - Ocupo buscar la manera de conseguir que se mueva la pieza ya que tengo arreglos bidimensionales
        // Dibujar la imagen si hay una celda seleccionada
    }

}
