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
import proyectostratego.ventanas.Juego;

public class GenerarTablero extends JPanel {

    Random random = new Random();
    private Juego juego;

    private pieza piezaSeleccionada = null;
    private int seleccionFila = -1;
    private int seleccionColumna = -1;

    private final int rows = 10;
    private final int columnas = 10;

    private int celday = -1;
    private int celdax = -1;
    private boolean turno = true; //true = Heroes, false = Villanos;

    private final int base = 70;//Width
    private final int altura = 70;//Length
    private final int promedio = (base + altura) / 2;
    private pieza[][] tablero = new pieza[rows][columnas]; // 10x10 Guarda el objeto como tal (Osea la pieza)
//Variables individuales para cuanto debe de haber min de cada rango (Se podria mejorar pero despues se intenta)
    private final int bombas = 6;
    private final int tierra = 1;
    private final int rango1 = 2;
    private final int rango2 = 2;
    private final int rango3 = 2;
    private final int rango4 = 2;
    private final int rango5 = 2;
    private final int rango6 = 2;
    private final int rango7 = 2;
    private final int rango8 = 2;
    private final int rango9 = 2;
    private final int rango10 = 2;

    private boolean[][] zonaProhibida = new boolean[rows][columnas];
    //Zona prohibida

    private void reiniciarSeleccion() {
        if (piezaSeleccionada != null) {
            piezaSeleccionada.seleccionada = false; // Quitar la marca visual
        }
        piezaSeleccionada = null;
        seleccionFila = -1;
        seleccionColumna = -1;
    }

    private void colocarTierraYBombas(pieza[] grupo, int filaTierra, int filaFrente) {
        int columna = 1 + random.nextInt(8); // columna entre 1 y 8

        // aqui busco la tierra
        pieza tierra = null;
        for (pieza p : grupo) {
            if (p.rango == 0 && !p.colocada) {
                tierra = p;
                break;
            }
        }

        // aqui coloco la tierra
        if (tierra != null) {
            tablero[filaTierra][columna] = tierra;
            tierra.fila = filaTierra;
            tierra.columna = columna;
            tierra.colocada = true;
            System.out.println("Se colocó Tierra en (" + filaTierra + "," + columna + ")");
        }

        // setear coords para poner las bombas
        int[][] bombasCoords = {
            {filaTierra, columna - 1},
            {filaTierra, columna + 1},
            {filaFrente, columna}
        };

        // aqui coloco las bombas
        for (int[] pos : bombasCoords) {
            int r = pos[0];
            int c = pos[1];

            if (r >= 0 && r < rows && c >= 0 && c < columnas && tablero[r][c] == null) {
                pieza bomba = null;
                for (pieza p : grupo) {
                    if (p.rango == -1 && !p.colocada) {
                        bomba = p;
                        break;
                    }
                }

                if (bomba != null) {
                    tablero[r][c] = bomba;
                    bomba.fila = r;
                    bomba.columna = c;
                    bomba.colocada = true;
                    System.out.println("Se colocó bomba en (" + r + "," + c + ")");
                }
            }
        }
    }

    public GenerarTablero(Juego juego) {

        this.juego = juego;

        zonaProhibida[4][2] = true;
        zonaProhibida[4][3] = true;
        zonaProhibida[5][2] = true;
        zonaProhibida[5][3] = true;
        zonaProhibida[4][6] = true;
        zonaProhibida[4][7] = true;
        zonaProhibida[5][6] = true;
        zonaProhibida[5][7] = true;

        heroes heroes = new heroes();//Llama el array
        villanos villanos = new villanos();//Llama el array

        colocarTierraYBombas(villanos.villanos, 0, 1);
        colocarTierraYBombas(heroes.heroes, 9, 8);

        //eleccion de rangos 
        for (int rango = -1; rango <= 10; rango++) {
            
            if(rango == 0) continue; // para que se salte la logica en el rango de la tierra

            int colocados = 0;//Variable para saber cuantos han sido colocados
            int minRan = getMinimoPorRango(rango);//Una funcione que esta al finaaaaal del .java

            while (colocados < minRan) {//While piezas colocadas sean menores al max permitido por rango
                pieza[] posibles = new pieza[20];//No hay mas de 20 fichas posibles nunca
                int contador = 0;

                for (int i = 0; i < villanos.villanos.length; i++) {//Recorrer toooooodo el array
                    pieza p = villanos.villanos[i];

                    if (p.rango == rango && p.colocada == false) {//colocada nueva booleana para saber si fue puesta en el tablero o no
                        posibles[contador] = p;
                        contador++;
                    }
                }
                if (contador == 0) {
                    System.out.println("Debug(No hay de ese rango):" + rango);
                    break;
                }
                int posicionRandom = random.nextInt(contador);
                pieza eleccion = posibles[posicionRandom];
                //Conseguir una pieza basado en el numero del contador (Cuantas piezas hay de ese rango)

                int randomr, randomc;
                do {
                    randomr = random.nextInt(4);
                    randomc = random.nextInt(columnas);
                } while (tablero[randomr][randomc] != null); //Para que no exista ya una pieza ahi
                tablero[randomr][randomc] = eleccion;
                eleccion.fila = randomr;
                eleccion.columna = randomc;
                System.out.println("Se coloco villano:" + eleccion.nombre);
                eleccion.colocada = true;
                colocados++;
            }
        }//Fin for rango

        for (int rango = -1; rango <= 10; rango++) {
            
            if(rango == 0) continue; // para que se salte la logica en el rango de la tierra

            int colocados = 0;//Variable para saber cuantos han sido colocados
            int minRan = getMinimoPorRango(rango);//Una funcione que esta al finaaaaal del .java

            while (colocados < minRan) {//While piezas colocadas sean menores al max permitido por rango
                pieza[] posibles = new pieza[20];//No hay mas de 20 fichas posibles nunca
                int contador = 0;

                for (int i = 0; i < heroes.heroes.length; i++) {//Recorrer toooooodo el array
                    pieza p = heroes.heroes[i];

                    if (p.rango == rango && p.colocada == false) {//colocada nueva booleana para saber si fue puesta en el tablero o no
                        posibles[contador] = p;
                        contador++;
                    }
                }
                if (contador == 0) {
                    System.out.println("Debug(No hay de ese rango):" + rango);
                    break;
                }
                int posicionRandom = random.nextInt(contador);
                pieza eleccion = posibles[posicionRandom];
                //Conseguir una pieza basado en el numero del contador (Cuantas piezas hay de ese rango)

                int randomr, randomc;
                do {
                    randomr = 8 + random.nextInt(2);
                    randomc = random.nextInt(columnas);
                } while (tablero[randomr][randomc] != null); //Para que no exista ya una pieza ahi
                tablero[randomr][randomc] = eleccion;
                eleccion.fila = randomr;
                eleccion.columna = randomc;
                System.out.println("Se coloco heroe:" + eleccion.nombre);
                eleccion.colocada = true;
                colocados++;
            }
        }//Fin for rango

        //El mouse listener para lo de click?
        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent click) {

                int coordenadax = click.getX();
                int coordenaday = click.getY();

                celdax = coordenadax / promedio;
                celday = coordenaday / promedio;
                //Creo que hay que hacer que las bombas y la tierra no se puedan seleccionar 
                //Para evitar problemas mas a futuro

                if (piezaSeleccionada == null) {
                    // Seleccionar pieza si existe en la celda

                    for (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero[i].length; j++) {
                            if (tablero[i][j] != null) {
                                tablero[i][j].seleccionada = false;
                            }
                        }
                    }
                    pieza seleccion = tablero[celday][celdax];
                    if (seleccion != null && seleccion.heroe == turno) {
                        piezaSeleccionada = seleccion;
                        seleccionFila = celday;
                        seleccionColumna = celdax;
                        System.out.println("Seleccionada pieza: " + seleccion.nombre);
                        piezaSeleccionada.seleccionada = true;
                    } else if (seleccion != null) {
                        System.out.println("No es turno de este bando!");
                    }
                } else {
                    // Intentar mover la pieza
                    int distanciaFila = Math.abs(celday - seleccionFila);
                    int distanciaColumna = Math.abs(celdax - seleccionColumna);

                    // Solo permitir si se mueve una casilla en una dirección (no diagonal)
                    boolean esMovimientoValido
                            = (distanciaFila == piezaSeleccionada.movimiento && distanciaColumna == 0)
                            || (distanciaFila == 0 && distanciaColumna == piezaSeleccionada.movimiento);

                    if (piezaSeleccionada.rango == 2) {
                        esMovimientoValido
                                = (distanciaFila <= piezaSeleccionada.movimiento && distanciaColumna == 0)
                                || (distanciaFila == 0 && distanciaColumna <= piezaSeleccionada.movimiento);

                        if (distanciaFila > 1 && distanciaColumna == 0) //Para vertical |
                        {
                            int inicioRecorrido = Math.min(seleccionFila, celday) + 1;//+1 Para poder evitar nuestra ficha
                            int finalRecorrido = Math.max(seleccionFila, celday);
                            for (int i = inicioRecorrido; i < finalRecorrido; i++) {
                                System.out.println(tablero[i][piezaSeleccionada.columna]);
                                if (tablero[i][piezaSeleccionada.columna] != null || zonaProhibida[i][piezaSeleccionada.columna]) {
                                    esMovimientoValido = false;
                                    System.out.println("Columa " + piezaSeleccionada.columna + "  " + i);
                                    System.out.println("No aceptada");
                                    break;
                                }
                            }

                        } else if (distanciaColumna > 1 && distanciaFila == 0) //Para Horizontal ----
                        {
                            int inicioRecorrido = Math.min(seleccionColumna, celdax) + 1;//+1 Para poder evitar nuestra ficha
                            int finalRecorrido = Math.max(seleccionColumna, celdax);
                            for (int i = inicioRecorrido; i < finalRecorrido; i++) {
                                System.out.println(tablero[i][piezaSeleccionada.columna]);
                                if (tablero[piezaSeleccionada.fila][i] != null || zonaProhibida[piezaSeleccionada.fila][i]) {
                                    esMovimientoValido = false;
                                    System.out.println(piezaSeleccionada.fila + "  " + i);
                                    System.out.println("No aceptada");
                                    break;
                                }
                            }

                        }
                    }
                    pieza objetivo = tablero[celday][celdax];

                    if (esMovimientoValido) {
                        if (zonaProhibida[celday][celdax]) {
                            System.out.println("Zona Prohibida");
                            reiniciarSeleccion();
                            return;//Salia un error en consola entonces con el return se soluciono
                        } else if (objetivo == null) {
                            // Movimiento normal a celda vacía

                            pieza piezaMovida = piezaSeleccionada;
                            piezaMovida.seleccionada = false; // Quitar remarcado visual antes de mover

                            tablero[celday][celdax] = piezaMovida;
                            tablero[seleccionFila][seleccionColumna] = null;

                            piezaMovida.fila = celday;
                            piezaMovida.columna = celdax;

                            System.out.println("Movida a: " + celday + ", " + celdax);

                        } else if (piezaSeleccionada.heroe != objetivo.heroe) {
                            // Ataca a enemigo

                            if (piezaSeleccionada.rango > objetivo.rango || (piezaSeleccionada.rango == 1 && objetivo.rango == 10)) {
                                //La parte es por la excepcion de black widow , despues agregar las de rango 3
                                System.out.println(piezaSeleccionada.nombre + " se come a " + objetivo.nombre);

                                tablero[celday][celdax] = piezaSeleccionada;
                                tablero[seleccionFila][seleccionColumna].colocada = false;
                                tablero[seleccionFila][seleccionColumna] = null;

                                piezaSeleccionada.fila = celday;
                                piezaSeleccionada.columna = celdax;

                            } else if (piezaSeleccionada.rango < objetivo.rango) {
                                //Si son del mismo rango pierden las dos , si la que esta atacando es menor pierde
                                //Falta agregar la logica que se den vuelta y asi (Parecido a lo del juego)
                                tablero[piezaSeleccionada.fila][piezaSeleccionada.columna].colocada = false;
                                tablero[piezaSeleccionada.fila][piezaSeleccionada.columna] = null;

                                System.out.println("Gano la otra pieza");
                            } else if (piezaSeleccionada.rango == objetivo.rango) {
                                piezaSeleccionada.colocada = false;
                                objetivo.colocada = false;

                                tablero[piezaSeleccionada.fila][piezaSeleccionada.columna] = null;
                                tablero[objetivo.fila][objetivo.columna] = null;

                                System.out.println("Mismo rango , las dos mueren");
                            }

                        } else {
                            // Mismo bando
                            System.out.println("No puedes atacar a tu propio equipo.");
                            //No deberia contarte el turno realmente
                            return;

                        }
                        reiniciarSeleccion();
                        turno = !turno; //Cambio de turno
                        System.out.println("Turno de: " + (turno ? "Heroes" : "Villanos")); //Aviso en consola del cambio de turno
                        if (turno) {
                            juego.getTurno("Heroes");
                        } else {
                            juego.getTurno("Villanos");
                        }
                    } else {
                        System.out.println(piezaSeleccionada.movimiento);
                        System.out.println("Movimiento inválido.");
                        reiniciarSeleccion();

                    }
                }

                repaint();
                System.out.println("X" + celdax
                        + "\nY" + celday);

                /*if (piezaSeleccionada == null && tablero[celday][celdax] != null) {
                    System.out.println("Pieza aqui");
                    System.out.println(tablero[celday][celdax].nombre);
                    tablero[celday][celdax].seleccionada = true;
                }*/
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
                if (zonaProhibida[r][c]) //No dibuja el cuadrito
                {
                    continue;
                }
                g.setColor(Color.BLACK);
                g.drawRect(x, y, altura, base); // Dibuja celda

                if (piezaSeleccionada != null) {
                    int distFila = Math.abs(r - seleccionFila);
                    int distCol = Math.abs(c - seleccionColumna);

                    // verificar que está a distancia permitida (horizontal o vertical)
                    if (((distFila <= piezaSeleccionada.movimiento && distCol == 0)
                            || (distCol <= piezaSeleccionada.movimiento && distFila == 0))
                            && !(r == seleccionFila && c == seleccionColumna)) {

                        // pintar el fondo semitransparente verde para posible movimiento
                        g.setColor(Color.GREEN);
                        g.drawRect(x, y, base, altura);
                        g.drawRect(x + 1, y + 1, base - 2, altura - 2);
                        g.drawRect(x + 2, y + 2, base - 4, altura - 4);
                    }
                }

                pieza p = tablero[r][c];

                if (p != null && p.imagen != null) {

                    g.drawImage(p.imagen, x, y, base, altura, this); // Dibuja imagen de la pieza
                }

                if (tablero[r][c] != null && tablero[r][c].seleccionada) {
                    g.setColor(Color.BLUE);
                    // dibujo mas cuadritos encimas para remarcarlos mas
                    g.drawRect(x, y, base, altura);
                    g.drawRect(x + 1, y + 1, base - 2, altura - 2);
                    g.drawRect(x + 2, y + 2, base - 4, altura - 4);
                } else {
                    g.setColor(Color.BLACK);
                    g.drawRect(x, y, altura, base);
                }
            }
        }
    }

    private int getMinimoPorRango(int rango) {
        switch (rango) {
            case -1:
                return bombas;
            case 0:
                return tierra;
            case 1:
                return rango1;
            case 2:
                return rango2;
            case 3:
                return rango3;
            case 4:
                return rango4;
            case 5:
                return rango5;
            case 6:
                return rango6;
            case 7:
                return rango7;
            case 8:
                return rango8;
            case 9:
                return rango9;
            case 10:
                return rango10;
            default:
                return 0;//Por si por alguna razon se bugea
        }
    }
}
