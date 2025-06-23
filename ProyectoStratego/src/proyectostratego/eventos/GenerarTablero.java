package proyectostratego.eventos;

import proyectostratego.utilidades.Jugador;
import java.awt.Color;
import proyectostratego.utilidades.Piezas;
import proyectostratego.utilidades.Villanos;
import proyectostratego.utilidades.Heroes;
import java.util.Random;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter; //Libreria para los mouse
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import proyectostratego.utilidades.StatsGlobales;
import proyectostratego.ventanas.Juego;
import proyectostratego.ventanas.LogPartidas;
import proyectostratego.ventanas.MenuPrincipal;
import proyectostratego.utilidades.Fecha;
import proyectostratego.utilidades.jframe;

public class GenerarTablero extends JPanel {

    Random random = new Random();
    boolean darClick = true;
    private Piezas piezaSeleccionada = null;
    private int seleccionFila = -1;
    private int seleccionColumna = -1;

    private final int rows = 10;
    private final int columnas = 10;

    private int celday = -1;
    private int celdax = -1;
    private boolean turno = true; //true = Heroes, false = Villanos;
    Jugador heroe = Jugador.getHeroe();
    Jugador villano = Jugador.getVillano();

    private int heroesC = 0;
    private int villanosC = 0;

    private final int base = 60;//Width
    private final int altura = 60;//Length
    private final int promedio = (base + altura) / 2;
    private Piezas[][] tablero = new Piezas[rows][columnas]; // 10x10 Guarda el objeto como tal (Osea la pieza)

    //Variables individuales para cuanto debe de haber min de cada rango (Se podria mejorar pero despues se intenta)
    /* TESTING
    private final int bombas = 6;
    private final int tierra = 1;

    private final int rango1 = 2;
    private final int rango2 = 2;
    private final int rango3 = 2;
    private final int rango4 = 0;
    private final int rango5 = 0;
    private final int rango6 = 0;
    private final int rango7 = 0;
    private final int rango8 = 0;
    private final int rango9 = 0;
    private final int rango10 = 0;*/
 /* ORIGINAL */
    private final int bombas = 6;
    private final int tierra = 1;

    private final int rango1 = 1;
    private final int rango2 = 8;
    private final int rango3 = 5;
    private final int rango4 = 4;
    private final int rango5 = 4;
    private final int rango6 = 4;
    private final int rango7 = 3;
    private final int rango8 = 2;
    private final int rango9 = 1;
    private final int rango10 = 1;

    private boolean[][] zonaProhibida = new boolean[rows][columnas];

    private void reiniciarSeleccion() {
        if (piezaSeleccionada != null) {
            piezaSeleccionada.seleccionada = false; // Quitar la marca visual
        }
        piezaSeleccionada = null;
        seleccionFila = -1;
        seleccionColumna = -1;
    }

    private void colocarTierraYBombas(Piezas[] grupo, int filaTierra, int filaFrente, boolean heroe) {
        int columna = 1 + random.nextInt(8); // columna entre 1 y 8

        // aqui busco la tierra
        Piezas tierra = null;
        for (Piezas p : grupo) {
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
            if (!heroe) {
                tierra.imagen = tierra.reversoVillanos;

            }
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
                Piezas bomba = null;
                for (Piezas p : grupo) {
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
                    if (!heroe) {
                        bomba.imagen = bomba.reversoVillanos;

                    }
                }
            }
        }
    }

    public GenerarTablero(Juego juego) {

        zonaProhibida[4][2] = true;
        zonaProhibida[4][3] = true;
        zonaProhibida[5][2] = true;
        zonaProhibida[5][3] = true;
        zonaProhibida[4][6] = true;
        zonaProhibida[4][7] = true;
        zonaProhibida[5][6] = true;
        zonaProhibida[5][7] = true;

        Heroes heroes = new Heroes();//Llama el array
        Villanos villanos = new Villanos();//Llama el array

        colocarTierraYBombas(villanos.villanos, 0, 1, false);//False para villano
        colocarTierraYBombas(heroes.heroes, 9, 8, true);//True para heroe

        //eleccion de rangos VILLANOS
        for (int rango = -1; rango <= 10; rango++) {

            if (rango == 0) {
                continue; // para que se salte la logica en el rango de la tierra
            }
            int colocados = 0;//Variable para saber cuantos han sido colocados
            int minRan = getMinimoPorRango(rango);//Una funcione que esta al finaaaaal del .java

            while (colocados < minRan) {//While piezas colocadas sean menores al max permitido por rango
                Piezas[] posibles = new Piezas[40];//No hay mas de 20 fichas posibles nunca
                int contador = 0;

                for (int i = 0; i < villanos.villanos.length; i++) {//Recorrer toooooodo el array
                    Piezas p = villanos.villanos[i];

                    if (p.rango == rango && p.colocada == false) {//colocada nueva booleana para saber si fue puesta en el tablero o no
                        posibles[contador] = p;
                        contador++;
                    }
                }
                if (contador == 0) {

                    break;
                }
                int posicionRandom = random.nextInt(contador);
                Piezas eleccion = posibles[posicionRandom];

                //Conseguir una pieza basado en el numero del contador (Cuantas piezas hay de ese rango)
                int randomr, randomc;
                do {
                    if (eleccion.rango == -1) {
                        randomr = random.nextInt(2);
                        randomc = random.nextInt(columnas);

                    } else if (eleccion.rango == 2) {
                        randomr = 2 + random.nextInt(2);
                        randomc = random.nextInt(columnas);

                    } else {
                        randomr = 0 + random.nextInt(4);
                        randomc = random.nextInt(columnas);
                    }
                } while (tablero[randomr][randomc] != null); //Para que no exista ya una pieza ahi
                tablero[randomr][randomc] = eleccion;
                eleccion.fila = randomr;
                eleccion.columna = randomc;
                eleccion.imagen = eleccion.reversoVillanos;//Para que spawnee dada vuelta

                eleccion.colocada = true;
                if (eleccion.rango >= 1) {
                    villanosC++;

                }
                colocados++;
            }
        }

        //HEROES
        for (int rango = -1; rango <= 10; rango++) {

            if (rango == 0) {
                continue; // para que se salte la logica en el rango de la tierra y bomba
            }
            int colocados = 0;//Variable para saber cuantos han sido colocados
            int minRan = getMinimoPorRango(rango);//Una funcione que esta al finaaaaal del .java

            while (colocados < minRan) {//While piezas colocadas sean menores al max permitido por rango
                Piezas[] posibles = new Piezas[40];//No hay mas de 20 fichas posibles nunca
                int contador = 0;

                for (int i = 0; i < heroes.heroes.length; i++) {//Recorrer toooooodo el array
                    Piezas p = heroes.heroes[i];
                    if (p == null) {

                        continue;
                    }
                    if (p.rango == rango && p.colocada == false) {//colocada nueva booleana para saber si fue puesta en el tablero o no
                        posibles[contador] = p;
                        contador++;

                        if (p.rango == -1) {

                        }
                    }
                }
                if (contador == 0) {
                    System.out.println("Debug(No hay de ese rango):" + rango);
                    break;
                }
                int posicionRandom = random.nextInt(contador);
                Piezas eleccion = posibles[posicionRandom];
                //Conseguir una pieza basado en el numero del contador (Cuantas piezas hay de ese rango)

                int randomr, randomc;

                do {
                    int intentos = 0;
                    if (eleccion.rango == -1) {
                        randomr = 8 + random.nextInt(2);
                        randomc = random.nextInt(columnas);
                    } else if (eleccion.rango == 2) {
                        randomr = 6 + random.nextInt(2);
                        randomc = random.nextInt(columnas);

                    } else {
                        randomr = 6 + random.nextInt(4);
                        randomc = random.nextInt(columnas);
                    }
                    intentos++;

                    if (intentos > 100) {

                        break; // rompe el bucle para evitar ciclo infinito
                    }
                } while (tablero[randomr][randomc] != null);
                if (tablero[randomr][randomc] != null) {
                    System.out.println("DEBUG - Agarro una pieza no nula");
                    break;
                }
                tablero[randomr][randomc] = eleccion;
                eleccion.fila = randomr;
                eleccion.columna = randomc;
                eleccion.colocada = true;
                if (eleccion.rango >= 1) {
                    heroesC++;
                }
                colocados++;
            }
        }

        //El mouse listener para lo de click?
        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent click) {

                if (!darClick) {
                    return;
                }
                int coordenadax = click.getX();
                int coordenaday = click.getY();

                celdax = coordenadax / promedio;
                celday = coordenaday / promedio;

                if (piezaSeleccionada == null) {
                    // Seleccionar pieza si existe en la celda

                    for (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero[i].length; j++) {
                            if (tablero[i][j] != null) {
                                tablero[i][j].seleccionada = false;
                            }
                        }
                    }
                    Piezas seleccion = tablero[celday][celdax];
                    if (seleccion != null && seleccion.heroe == turno && seleccion.rango != 0 && seleccion.rango != -1) {
                        piezaSeleccionada = seleccion;
                        seleccionFila = celday;
                        seleccionColumna = celdax;
                        System.out.println("Seleccionada pieza: " + seleccion.nombre);
                        piezaSeleccionada.seleccionada = true;
                    } else if (seleccion != null) {

                        System.out.println("No es turno de este bando!");//O tambien cuando sea rango 0,-1

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
                                if (tablero[i][piezaSeleccionada.columna] != null || zonaProhibida[i][piezaSeleccionada.columna]) {
                                    esMovimientoValido = false;
                                    break;
                                }
                            }

                        } else if (distanciaColumna > 1 && distanciaFila == 0) //Para Horizontal ----
                        {
                            int inicioRecorrido = Math.min(seleccionColumna, celdax) + 1;//+1 Para poder evitar nuestra ficha
                            int finalRecorrido = Math.max(seleccionColumna, celdax);
                            for (int i = inicioRecorrido; i < finalRecorrido; i++) {

                                if (tablero[piezaSeleccionada.fila][i] != null || zonaProhibida[piezaSeleccionada.fila][i]) {
                                    esMovimientoValido = false;
                                    break;
                                }
                            }

                        }
                    }
                    Piezas objetivo = tablero[celday][celdax];

                    if (esMovimientoValido) {
                        if (zonaProhibida[celday][celdax]) { // Zona Prohibida check
                            JOptionPane.showMessageDialog(null, "No puedes moverte en zonas prohibidas!", "ADVERTENCIA", JOptionPane.INFORMATION_MESSAGE);
                            reiniciarSeleccion();
                            repaint();
                            return;//Salia un error en consola entonces con el return se soluciono

                        } else if ((objetivo != null) && piezaSeleccionada.heroe == objetivo.heroe) {
                            JOptionPane.showMessageDialog(null, "No puedes atacar a tu propio equipo!", "ADVERTENCIA", JOptionPane.INFORMATION_MESSAGE);
                            //No deberia contarte el turno realmente
                            reiniciarSeleccion();
                            repaint();
                            return;

                        } else if (objetivo != null && objetivo.rango == -1 && objetivo.heroe != piezaSeleccionada.heroe) {//Bombas
                            if (piezaSeleccionada.rango == 3 && objetivo.heroe != piezaSeleccionada.heroe) {
                                Juego.setPelea(piezaSeleccionada.nombre + " desarmó una " + objetivo.nombre);
                                piezaSeleccionada.seleccionada = false;

                                JOptionPane.showMessageDialog(null, piezaSeleccionada.nombre + " desarmo una " + objetivo.nombre);
                                piezaSeleccionada.colocada = true;
                                tablero[celday][celdax] = piezaSeleccionada;

                                if (tablero[seleccionFila][seleccionColumna] != null) {
                                    tablero[seleccionFila][seleccionColumna].colocada = false;
                                }

                                tablero[seleccionFila][seleccionColumna].colocada = false;

                                tablero[seleccionFila][seleccionColumna] = null;

                                tablero[celday][celdax] = piezaSeleccionada;
                                piezaSeleccionada.colocada = true;
                                piezaSeleccionada.fila = celday;
                                piezaSeleccionada.columna = celdax;

                            } else {
                                if (piezaSeleccionada.heroe) {
                                    heroesC--;
                                } else {
                                    villanosC--;
                                }

                                Juego.setPelea(piezaSeleccionada.nombre + " exploto por " + objetivo.nombre);
                                JOptionPane.showMessageDialog(null, piezaSeleccionada.nombre + " exploto por una  " + objetivo.nombre, "VERSUS", JOptionPane.INFORMATION_MESSAGE);
                                piezaSeleccionada.seleccionada = false;
                                tablero[piezaSeleccionada.fila][piezaSeleccionada.columna].colocada = false;
                                tablero[piezaSeleccionada.fila][piezaSeleccionada.columna] = null;
                                tablero[celday][celdax].colocada = false;
                                tablero[celday][celdax] = null; //"Explota" la bomba

                                Juego.setPelea(piezaSeleccionada.nombre + " explotó por " + objetivo.nombre);
                                piezaSeleccionada.seleccionada = false;

                                if (tablero[piezaSeleccionada.fila][piezaSeleccionada.columna] != null) {
                                    tablero[piezaSeleccionada.fila][piezaSeleccionada.columna].colocada = false;
                                }
                                tablero[piezaSeleccionada.fila][piezaSeleccionada.columna] = null;

                                if (tablero[celday][celdax] != null) {
                                    tablero[celday][celdax].colocada = false;
                                }
                                tablero[celday][celdax] = null;
                            }
                        } else if (objetivo != null && objetivo.rango == 0) {//Logica captura de tierra
                            //Comer/Destruir tierra
                            Juego.setPelea(piezaSeleccionada.nombre + " captura a " + objetivo.nombre);

                            if (!piezaSeleccionada.heroe) {
                                getGanador(villano, heroe);//Ganador , perdedor

                            } else if (piezaSeleccionada.heroe) {
                                getGanador(heroe, villano);
                            }

                        } else if (objetivo == null) {
                            // Movimiento normal a celda vacía

                            Piezas piezaMovida = piezaSeleccionada;
                            piezaMovida.seleccionada = false; // Quitar remarcado visual antes de mover

                            tablero[celday][celdax] = piezaMovida;
                            tablero[seleccionFila][seleccionColumna] = null;

                            piezaMovida.fila = celday;
                            piezaMovida.columna = celdax;

                        } else if (piezaSeleccionada.heroe != objetivo.heroe) {
                            // Ataca a enemigo

                            if (objetivo.rango == 0) {

                                esMovimientoValido = false;
                                JOptionPane.showMessageDialog(null, "No puedes capturar la tierra con este personaje.", "ADVERTENCIA", JOptionPane.INFORMATION_MESSAGE);
                                piezaSeleccionada.colocada = true;
                                reiniciarSeleccion();
                                repaint();

                                return;//Talvez quitar esto despues

                            } else if (piezaSeleccionada.rango > objetivo.rango || (piezaSeleccionada.rango == 1 && objetivo.rango == 10)) {//Gana pieza Seleccionada
                                //Comer Piezas con excepcion de black widow y rango 10
                                JOptionPane.showMessageDialog(null, piezaSeleccionada.nombre + " vs " + objetivo.nombre + "\nGano " + piezaSeleccionada.nombre, "VERSUS", JOptionPane.INFORMATION_MESSAGE);
                                Juego.setPelea(piezaSeleccionada.nombre + " se come a " + objetivo.nombre);
                                juego.agregarPiezaMuerta(objetivo);
                                tablero[celday][celdax] = piezaSeleccionada;
                                //Logica de revelacion TODO

                                tablero[seleccionFila][seleccionColumna].colocada = false;
                                tablero[seleccionFila][seleccionColumna] = null;
                                piezaSeleccionada.fila = celday;
                                piezaSeleccionada.columna = celdax;
                                piezaSeleccionada.colocada = true;
                                //La pieza seleccionada se come al a pieza objetivo
                                jframe panel = new jframe((JFrame) SwingUtilities.getWindowAncestor(GenerarTablero.this), true);
                                panel.setForm(piezaSeleccionada, objetivo, piezaSeleccionada);
                                panel.setVisible(true);

                               
                                
                                //darClick = false;
                                if (piezaSeleccionada.heroe) {
                                    villanosC -= 1;
                                } else {
                                    heroesC -= 1;
                                }

                                empate();

                            } else if (piezaSeleccionada.rango < objetivo.rango) {//Gana objetivo
                                JOptionPane.showMessageDialog(null, piezaSeleccionada.nombre + " vs " + objetivo.nombre + "\nGano " + objetivo.nombre, "VERSUS", JOptionPane.INFORMATION_MESSAGE);
                                Juego.setPelea(objetivo.nombre + " se come a atacante " + piezaSeleccionada.nombre);
                                tablero[piezaSeleccionada.fila][piezaSeleccionada.columna].colocada = false;
                                tablero[piezaSeleccionada.fila][piezaSeleccionada.columna] = null;

                                juego.agregarPiezaMuerta(piezaSeleccionada);

                                if (piezaSeleccionada.heroe) {
                                    heroesC -= 1;

                                } else {
                                    villanosC -= 1;
                                }

                                empate();//Ineficiente pero 
                            } else if (piezaSeleccionada.rango == objetivo.rango) {//Derrota mutua
                                JOptionPane.showMessageDialog(null, piezaSeleccionada.nombre + " vs " + objetivo.nombre + "\nEmpate", "VERSUS", JOptionPane.INFORMATION_MESSAGE);

                                Juego.setPelea(objetivo.nombre + " y " + piezaSeleccionada.nombre + " Se derrotan mutuamente");
                                objetivo.colocada = false;

                                tablero[piezaSeleccionada.fila][piezaSeleccionada.columna] = null;
                                tablero[objetivo.fila][objetivo.columna] = null;

                                juego.agregarPiezaMuerta(piezaSeleccionada);
                                juego.agregarPiezaMuerta(objetivo);

                                heroesC -= 1;
                                villanosC -= 1;
                                //jframe panel = new jframe();
                                //panel.setEmpate(piezaSeleccionada, objetivo);
                                //panel.setVisible(true);

                                empate();
                                reiniciarSeleccion();

                            }

                        } else {
                            // Mismo bando
                            JOptionPane.showMessageDialog(null, "No puedes atacar a tu propio equipo!", "ADVERTENCIA", JOptionPane.INFORMATION_MESSAGE);
                            //No deberia contarte el turno realmente
                            reiniciarSeleccion();
                            repaint();
                            return;

                        }
                        //Siempre entra aqui?
                        reiniciarSeleccion();
                        getGanadorPiezas();

                        turno = !turno; //Cambio de turno
                        System.out.println("Turno de: " + (turno ? "Heroes" : "Villanos")); //Aviso en consola del cambio de turno
                        if (turno) {

                            Juego.setTurno(heroe.username);

                            for (int i = 0; i < 40; i++) {
                                if (heroes.heroes[i].colocada) {

                                    heroes.heroes[i].imagen = heroes.heroes[i].imagenOriginal;

                                }
                                if (villanos.villanos[i].colocada) {

                                    villanos.villanos[i].imagen = villanos.villanos[i].reversoVillanos;

                                }
                            }
                        } else {
                            Juego.setTurno(villano.username);

                            for (int i = 0; i < 40; i++) {
                                if (heroes.heroes[i].colocada) {

                                    heroes.heroes[i].imagen = heroes.heroes[i].reversoHeroes;

                                }
                                if (villanos.villanos[i].colocada) {
                                    villanos.villanos[i].imagen = villanos.villanos[i].imagenOriginal;

                                }
                            }
                        }
                    } else {

                        JOptionPane.showMessageDialog(null, "Movimiento invalido!", "ADVERTENCIA", JOptionPane.INFORMATION_MESSAGE);
                        reiniciarSeleccion();

                    }
                    System.out.println("Villanos piezas:" + villanosC);
                    System.out.println("Heroes peizas:" + heroesC);
                }

                repaint();
                System.out.println("X" + celdax + "\nY" + celday);
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columnas; c++) {
                final int x = c * base;
                final int y = r * altura;

                if (zonaProhibida[r][c]) {
                    continue;
                }

                g.setColor(Color.BLACK);
                g.drawRect(x, y, base, altura);

                // Mostrar posibles movimientos si hay una pieza seleccionada
                if (piezaSeleccionada != null) {
                    final int distFila = Math.abs(r - seleccionFila);
                    final int distCol = Math.abs(c - seleccionColumna);

                    boolean esMovimientoLineal
                            = (distFila <= piezaSeleccionada.movimiento && distCol == 0)
                            || (distCol <= piezaSeleccionada.movimiento && distFila == 0);
                    boolean noEsLaSeleccionada = !(r == seleccionFila && c == seleccionColumna);

                    if (esMovimientoLineal && noEsLaSeleccionada) {
                        boolean disponible = true;

                        // Revisa si el camino está libre
                        if (distFila > 0) {
                            for (int i = Math.min(seleccionFila, r) + 1; i < Math.max(seleccionFila, r); i++) {
                                if (tablero[i][c] != null || zonaProhibida[i][c]) {
                                    disponible = false;
                                    break;
                                }
                            }
                        } else if (distCol > 0) {
                            for (int i = Math.min(seleccionColumna, c) + 1; i < Math.max(seleccionColumna, c); i++) {
                                if (tablero[r][i] != null || zonaProhibida[r][i]) {
                                    disponible = false;
                                    break;
                                }
                            }
                        }

                        // Casilla final
                        if (zonaProhibida[r][c]) {
                            disponible = false;
                        }

                        boolean esEnemigo = tablero[r][c] != null && tablero[r][c].heroe != piezaSeleccionada.heroe;

                        if (disponible || esEnemigo) {
                            dibujarBordeVerde(g, x, y);
                        }
                    }

                    // Chequeo extendido en líneas hasta movimiento máximo
                    final int[][] direcciones = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

                    for (int[] dir : direcciones) {
                        for (int dist = 1; dist <= piezaSeleccionada.movimiento; dist++) {
                            int f = piezaSeleccionada.fila + dir[0] * dist;
                            int col = piezaSeleccionada.columna + dir[1] * dist;

                            if (f < 0 || f >= rows || col < 0 || col >= columnas || zonaProhibida[f][col]) {
                                break;
                            }

                            Piezas p = tablero[f][col];
                            if (p != null) {
                                if (p.heroe != piezaSeleccionada.heroe) {
                                    dibujarBordeVerde(g, col * base, f * altura);
                                }
                                break; // Se detiene con cualquier pieza
                            }
                        }
                    }
                }

                // Dibuja imagen si hay una pieza
                Piezas p = tablero[r][c];
                if (p != null && p.imagen != null) {
                    g.drawImage(p.imagen, x, y, base, altura, this);
                }

                // Dibuja borde azul si está seleccionada
                if (p != null && p.seleccionada) {
                    g.setColor(Color.BLUE);
                    dibujarBorde(g, x, y);
                } else {
                    g.setColor(Color.BLACK);
                    g.drawRect(x, y, base, altura); // Reafirma borde negro
                }
            }
        }
    }

    private void dibujarBordeVerde(Graphics g, int x, int y) {
        g.setColor(Color.GREEN);
        dibujarBorde(g, x, y);
    }

    private void dibujarBorde(Graphics g, int x, int y) {
        g.drawRect(x, y, base, altura);
        g.drawRect(x + 1, y + 1, base - 2, altura - 2);
        g.drawRect(x + 2, y + 2, base - 4, altura - 4);
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

    private void itemsPartidas(Jugador ganador, Jugador perdedor) {
        if (ganador == heroe) {
            heroe.setVictorias(1);
            heroe.setPuntos(3);
            StatsGlobales.setVictoriasHeroes();
            villano.setDerrotas(1);
        } else {
            villano.setVictorias(1);
            villano.setPuntos(3);
            StatsGlobales.setVictoriasVillanos();
            heroe.setDerrotas(1);
        }

    }

    public void Rendirse() {
        if (turno) {
            LogPartidas.agregarRegistro(villano.getUsername() + " usando VILLANOS ha ganado ya que " + heroe.getUsername()
                    + " usando HEROES se ha retirado del juego. - " + Fecha.getFecha());
            System.out.println("[CONSOLE LOG] " + villano.getUsername() + " usando VILLANOS ha ganado ya que " + heroe.getUsername()
                    + " usando HEROES se ha retirado del juego. - " + Fecha.getFecha());
            itemsPartidas(villano, heroe);
            JOptionPane.showMessageDialog(this, heroe.username + " [Heroes] se ha rendido! \n \n" + villano.username
                    + " [Villanos] es el ganador de la partida. \nLos villanos capturaron la Tierra!", "PARTIDA FINALIZADA", JOptionPane.INFORMATION_MESSAGE);

        } else {
            LogPartidas.agregarRegistro(heroe.getUsername() + " usando HEROES ha ganado ya que " + villano.getUsername()
                    + " usando VILLANOS se ha retirado del juego. - " + Fecha.getFecha());
            System.out.println("[CONSOLE LOG] " + heroe.getUsername() + " usando HEROES ha ganado ya que " + villano.getUsername()
                    + " usando VILLANOS se ha retirado del juego. - " + Fecha.getFecha());
            itemsPartidas(heroe, villano);
            JOptionPane.showMessageDialog(this, villano.username + " [Villanos] se ha rendido! \n \n" + heroe.username + " [Heroes] es el ganador de la partida. \nLos heroes salvaron la Tierra!", "PARTIDA FINALIZADA", JOptionPane.INFORMATION_MESSAGE);
        }

        turno = true;
        heroe = Jugador.getHeroe();
        villano = Jugador.getVillano();

        JFrame ventana = (JFrame) SwingUtilities.getWindowAncestor(this); // o pasá 'Juego' al constructor
        if (ventana != null) {
            MenuPrincipal m = new MenuPrincipal();
            m.setVisible(true);
            m.setLocationRelativeTo(null);
            ventana.dispose();
        }

    }

    private void getGanadorPiezas() {
        if (villanosC == 0 && heroesC != 0) {
            LogPartidas.agregarRegistro(villano.getUsername() + " usando VILLANOS ha perdido por no tener movimientos disponibles ante "
                    + heroe.getUsername() + " - " + Fecha.getFecha());
            System.out.println("[CONSOLE LOG] " + villano.getUsername() + " usando VILLANOS ha perdido por no tener movimientos disponibles ante "
                    + heroe.getUsername() + " - " + Fecha.getFecha());
            itemsPartidas(heroe, villano);
            JOptionPane.showMessageDialog(this, villano.username + " [Villanos] se ha quedado sin fichas! \n \n"
                    + heroe.username + " [Heroes] es el ganador de la partida. \nLos heroes salvaron la Tierra!", "PARTIDA FINALIZADA", JOptionPane.INFORMATION_MESSAGE);
            JFrame ventana = (JFrame) SwingUtilities.getWindowAncestor(this);//Para conseguir esta ventana
            if (ventana != null) {

                MenuPrincipal ventanas = new MenuPrincipal();
                ventanas.setVisible(true);
                ventanas.setLocationRelativeTo(null);
                ventana.dispose();

            }
        } else if (heroesC == 0 && villanosC != 0) {
            LogPartidas.agregarRegistro(heroe.getUsername() + " usando HEROES ha perdido por no tener movimientos disponibles ante "
                    + villano.getUsername() + " - " + Fecha.getFecha());
            System.out.println("[CONSOLE LOG] " + heroe.getUsername() + " usando HEROES ha perdido por no tener movimientos disponibles ante "
                    + villano.getUsername() + " - " + Fecha.getFecha());
            itemsPartidas(villano, heroe);
            JOptionPane.showMessageDialog(this, heroe.username + " [Heroes] se ha quedado sin fichas! \n \n" + villano.username + " [Villanos] es el ganador de la partida. \nLos villanos capturaron la Tierra!", "PARTIDA FINALIZADA", JOptionPane.INFORMATION_MESSAGE);
            JFrame ventana = (JFrame) SwingUtilities.getWindowAncestor(this);//Para conseguir esta ventana
            if (ventana != null) {

                MenuPrincipal ventanas = new MenuPrincipal();
                ventanas.setVisible(true);
                ventanas.setLocationRelativeTo(null);
                ventana.dispose();

            }
        }

    }

    private void getGanador(Jugador ganador, Jugador perdedor) {

        if (ganador == villano) {
            itemsPartidas(villano, heroe);

            LogPartidas.agregarRegistro(ganador.getUsername() + " usando los VILLANOS ha CAPTURADO la TIERRA! Venciendo a "
                    + perdedor.getUsername() + " [" + Fecha.getFecha() + "]");
            System.out.println("[CONSOLE LOG] " + ganador.getUsername() + " usando los VILLANOS ha CAPTURADO la TIERRA! "
                    + "Venciendo a " + perdedor.getUsername() + " [" + Fecha.getFecha() + "]");

            JOptionPane.showMessageDialog(this, villano.username + " [Villanos] es el ganador de la partida. "
                    + "\nLos villanos capturaron la Tierra!", "PARTIDA FINALIZADA", JOptionPane.INFORMATION_MESSAGE);
        } else {

            itemsPartidas(heroe, villano);

            LogPartidas.agregarRegistro(ganador.getUsername() + " usando los HEROES ha SALVADO la TIERRA! Venciendo a "
                    + perdedor.getUsername() + " [" + Fecha.getFecha() + "]");
            System.out.println("[CONSOLE LOG] " + ganador.getUsername() + " usando los HEROES ha SALVADO la TIERRA! Venciendo a "
                    + perdedor.getUsername() + " [" + Fecha.getFecha() + "]");

            JOptionPane.showMessageDialog(this, heroe.username + " [Heroes] es el ganador de la partida. "
                    + "\nLos heroes salvaron la Tierra!", "PARTIDA FINALIZADA", JOptionPane.INFORMATION_MESSAGE);

        }

        JFrame ventana = (JFrame) SwingUtilities.getWindowAncestor(this);//Para conseguir esta ventana
        if (ventana != null) {

            MenuPrincipal ventanas = new MenuPrincipal();
            ventanas.setVisible(true);
            ventanas.setLocationRelativeTo(null);
            ventana.dispose();

        }

    }

    private void empate() {

        if (villanosC == 0 && heroesC == 0) {
            // Empate
            StatsGlobales.setEmpates();
            Jugador.jugadorLog.setEmpates(1);
            Jugador.jugadorContrincante.setEmpates(1);
            JOptionPane.showMessageDialog(this, "Los Jugadores " + Jugador.jugadorLog.username + " y " + Jugador.jugadorContrincante.username + " han empatado!", "PARTIDA EMPATADA", JOptionPane.INFORMATION_MESSAGE);

            LogPartidas.agregarRegistro(heroe.getUsername() + " usando HEROES ha quedado empatado con " + villano.getUsername()
                    + " usando VILLANOS. [" + Fecha.getFecha() + "]");
            System.out.println("[CONSOLE LOG] " + heroe.getUsername() + " usando HEROES ha quedado empatado con " + villano.getUsername()
                    + " usando VILLANOS. [" + Fecha.getFecha() + "]");

            JFrame ventana = (JFrame) SwingUtilities.getWindowAncestor(this);//Para conseguir esta ventana
            if (ventana != null) {

                MenuPrincipal ventanas = new MenuPrincipal();
                ventanas.setVisible(true);
                ventanas.setLocationRelativeTo(null);
                ventana.dispose();

            }
        }
    }

}
