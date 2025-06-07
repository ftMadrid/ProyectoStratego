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

    private pieza piezaSeleccionada = null;
    private int seleccionFila = -1;
    private int seleccionColumna = -1;

    private final int rows = 10;
    private final int columnas = 10;

    private int celday = -1;
    private int celdax = -1;

    private final int base = 60;//Width
    private final int altura = 60;//Length
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

            @Override
            public void mouseClicked(MouseEvent click) {
                int coordenadax = click.getX();
                int coordenaday = click.getY();

                celdax = coordenadax / promedio;
                celday = coordenaday / promedio;

                if (piezaSeleccionada == null) {
                    // Seleccionar pieza si existe en la celda
                    pieza seleccion = tablero[celday][celdax];
                    if (seleccion != null) {
                        piezaSeleccionada = seleccion;
                        seleccionFila = celday;
                        seleccionColumna = celdax;
                        System.out.println("Seleccionada pieza: " + seleccion.nombre);
                        piezaSeleccionada.seleccionada = true;
                    }
                } else {
                    // Intentar mover la pieza
                    int distanciaFila = Math.abs(celday - seleccionFila);
                    int distanciaColumna = Math.abs(celdax - seleccionColumna);

                    // Solo permitir si se mueve una casilla en una dirección (no diagonal)
                    boolean esMovimientoValido
                            = (distanciaFila == 1 && distanciaColumna == 0)
                            || (distanciaFila == 0 && distanciaColumna == 1);

                    pieza objetivo = tablero[celday][celdax];

                    if (esMovimientoValido) {
                        if (objetivo == null) {
                            // Movimiento normal a celda vacía
                            tablero[celday][celdax] = piezaSeleccionada;
                            tablero[seleccionFila][seleccionColumna] = null;
//
                            piezaSeleccionada.fila = celday;
                            piezaSeleccionada.columna = celdax;
                            

                            System.out.println("Movida a: " + celday + ", " + celdax);
                        } else if (piezaSeleccionada.heroe != objetivo.heroe) {
                            // Ataca a enemigo
                            System.out.println(piezaSeleccionada.nombre + " se come a " + objetivo.nombre);

                            tablero[celday][celdax] = piezaSeleccionada;
                            tablero[seleccionFila][seleccionColumna] = null;

                            piezaSeleccionada.fila = celday;
                            piezaSeleccionada.columna = celdax;
                            
                        } else {
                            // Mismo bando
                            System.out.println("No puedes atacar a tu propio equipo.");
                            
                        }
                    } else {
                        System.out.println("Movimiento inválido.");
                        
                    }
                    piezaSeleccionada.seleccionada = false;
                    piezaSeleccionada = null;
                    seleccionFila = -1;
                    seleccionColumna = -1;
                }

                repaint();
                System.out.println("X" + celdax
                        + "\nY" + celday);

                if (tablero[celday][celdax] != null) {
                    System.out.println("Pieza aqui");
                    System.out.println(tablero[celday][celdax].nombre);
                    tablero[celday][celdax].seleccionada = true;
                }

                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columnas; c++) {
                int x = c * base;
                int y = r * altura;

                g.setColor(Color.BLACK);
                g.drawRect(x, y, altura, base); // Dibuja celda

                pieza p = tablero[r][c];
                if (p != null && p.imagen != null) {
                    g.drawImage(p.imagen, x, y, base, altura, this); // Dibuja imagen de la pieza
                }

                /*if (tablero[r][c] != null && tablero[r][c].seleccionada) {
                    g.setColor(Color.BLUE);
                    g.drawRect(x, y, altura, base); // Resalta selección
                    g.setColor(Color.BLACK);
                }
                else
                {
                g.setColor(Color.black);
                g.drawRect(x, y, altura, base);
                }
                */
            }
        }
    }
}
