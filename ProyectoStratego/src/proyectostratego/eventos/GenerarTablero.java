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
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import proyectostratego.utilidades.StatsGlobales;
import proyectostratego.ventanas.Juego;
import proyectostratego.ventanas.MenuPrincipal;

public class GenerarTablero extends JPanel {

    Random random = new Random();

    private pieza piezaSeleccionada = null;
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

    private final int base = 70;//Width
    private final int altura = 70;//Length
    private final int promedio = (base + altura) / 2;
    private pieza[][] tablero = new pieza[rows][columnas]; // 10x10 Guarda el objeto como tal (Osea la pieza)
//Variables individuales para cuanto debe de haber min de cada rango (Se podria mejorar pero despues se intenta)
    private final int bombas = 3;
    private final int tierra = 1;
    private final int rango1 = 1;
    private final int rango2 = 1;
    private final int rango3 = 1;
    private final int rango4 = 1;
    private final int rango5 = 1;
    private final int rango6 = 1;
    private final int rango7 = 1;
    private final int rango8 = 1;
    private final int rango9 = 1;
    private final int rango10 = 1;

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

    private void colocarTierraYBombas(pieza[] grupo, int filaTierra, int filaFrente, boolean heroe) {
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
            if (!heroe) {
                tierra.imagen = tierra.reverso;

            }
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
                    if (!heroe) {
                        bomba.imagen = bomba.reverso;

                    }
                    System.out.println("Se colocó bomba en (" + r + "," + c + ")");
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

        heroes heroes = new heroes();//Llama el array
        villanos villanos = new villanos();//Llama el array

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
                pieza[] posibles = new pieza[40];//No hay mas de 20 fichas posibles nunca
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
                    if (eleccion.rango == -1) {
                        randomr = random.nextInt(2);
                        randomc = random.nextInt(columnas);
                        System.out.println("A");
                    } else if (eleccion.rango == 2) {
                        randomr = 2 + random.nextInt(2);
                        randomc = random.nextInt(columnas);
                        System.out.println("A");

                    } else {
                        randomr = 0 + random.nextInt(4);
                        randomc = random.nextInt(columnas);
                    }
                } while (tablero[randomr][randomc] != null); //Para que no exista ya una pieza ahi
                tablero[randomr][randomc] = eleccion;
                eleccion.fila = randomr;
                eleccion.columna = randomc;
                eleccion.imagen = eleccion.reverso;//Para que spawnee dada vuelta
                System.out.println("Se coloco villano:" + eleccion.nombre + "En " + randomr + "," + randomc);
                eleccion.colocada = true;
                if (eleccion.rango >= 1) {
                    villanosC++;
                    System.out.println("Villano ++");
                }
                colocados++;
            }
        }//Fin for rango

        //HEROES
        for (int rango = -1; rango <= 10; rango++) {

            if (rango == 0) {
                continue; // para que se salte la logica en el rango de la tierra y bomba
            }
            int colocados = 0;//Variable para saber cuantos han sido colocados
            int minRan = getMinimoPorRango(rango);//Una funcione que esta al finaaaaal del .java

            while (colocados < minRan) {//While piezas colocadas sean menores al max permitido por rango
                pieza[] posibles = new pieza[40];//No hay mas de 20 fichas posibles nunca
                int contador = 0;

                for (int i = 0; i < heroes.heroes.length; i++) {//Recorrer toooooodo el array
                    pieza p = heroes.heroes[i];
                    if (p == null) {
                        System.out.println("NULL");
                        continue;
                    }
                    if (p.rango == rango && p.colocada == false) {//colocada nueva booleana para saber si fue puesta en el tablero o no
                        posibles[contador] = p;
                        contador++;
                        System.out.println("Contador DEBUG");
                        if (p.rango == -1) {
                            System.out.println("BOMBOCLAAAT");
                        }
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
                    System.out.println("Entro al do");

                    if (intentos > 50) {
                        System.out.println("No hay espacio para colocar heroe de rango" + rango);

                        break; // rompe el bucle para evitar ciclo infinito
                    }
                } while (tablero[randomr][randomc] != null);
                if (tablero[randomr][randomc] != null) {
                    System.out.println(tablero[randomr][randomc].nombre);
                    System.out.println("DEBUG - Agarro una pieza no nula");
                    break;
                }
                tablero[randomr][randomc] = eleccion;
                eleccion.fila = randomr;
                eleccion.columna = randomc;
                System.out.println("Se coloco heroe:" + eleccion.nombre + "En " + randomr + "," + randomc);
                eleccion.colocada = true;
                if (eleccion.rango >= 1) {
                    heroesC++;
                    System.out.println("Heroes++");
                }
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

                        /*if (esMovimientoValido && (distanciaColumna > 1 || distanciaFila > 1)) {
                            piezaSeleccionada.revelada = true;
                        }*/
                        //Talvez se mantiene?
                    }
                    pieza objetivo = tablero[celday][celdax];

                    if (esMovimientoValido) {
                        if (zonaProhibida[celday][celdax]) {
                            System.out.println("Zona Prohibida");
                            reiniciarSeleccion();
                            return;//Salia un error en consola entonces con el return se soluciono

                        } else if (objetivo != null && objetivo.rango == -1) {//Bombas
                            //Logica para que explote la pieza a menos que sea rango 3
                            if (piezaSeleccionada.rango == 3) {
                                Juego.setPelea(piezaSeleccionada.nombre + "[" + piezaSeleccionada.rango + "] desarma a " + objetivo.nombre);
                                System.out.println("Come la bomba");//Desarma la bomba
                                piezaSeleccionada.seleccionada = false;

                                tablero[celday][celdax] = piezaSeleccionada;
                                tablero[seleccionFila][seleccionColumna].colocada = false;
                                tablero[seleccionFila][seleccionColumna] = null;

                                /*if (piezaSeleccionada.heroe) {
                                    heroesC--;
                                } else if (!piezaSeleccionada.heroe) {
                                    villanosC--;
                                }*/
                            } else {
                                if (piezaSeleccionada.heroe) {
                                    heroesC--;
                                } else if (!piezaSeleccionada.heroe) {
                                    villanosC--;
                                }
                                Juego.setPelea(piezaSeleccionada.nombre + "[" + piezaSeleccionada.rango + "] es explotada por " + objetivo.nombre);
                                piezaSeleccionada.seleccionada = false;
                                tablero[piezaSeleccionada.fila][piezaSeleccionada.columna].colocada = false;
                                tablero[piezaSeleccionada.fila][piezaSeleccionada.columna] = null;
                                tablero[celday][celdax].colocada = false;
                                tablero[celday][celdax] = null; //"Explota" la bomba

                            }
                        } else if (piezaSeleccionada.rango == 1 && objetivo != null && objetivo.rango == 0) {//Logica captura de tierra
                            //Comer/Destruir tierra
                            Juego.setPelea(piezaSeleccionada.nombre + "[" + piezaSeleccionada.rango + "] captura " + objetivo.nombre);
                            if (!piezaSeleccionada.heroe) {
                                getGanador(villano, heroe);//Ganador , perdedor

                            } else if (piezaSeleccionada.heroe) {
                                getGanador(heroe, villano);
                            }

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

                            if (objetivo.rango == 0) {

                                esMovimientoValido = false;
                                System.out.println("Cancela el movimiento");
                                reiniciarSeleccion();
                                return;//Talvez quitar esto despues

                            } else if (piezaSeleccionada.rango > objetivo.rango || (piezaSeleccionada.rango == 1 && objetivo.rango == 10)) {
                                //La parte es por la excepcion de black widow , despues agregar las de rango 3
                                System.out.println(piezaSeleccionada.nombre + " se come a " + objetivo.nombre);
                                Juego.setPelea(piezaSeleccionada.nombre + "[" + piezaSeleccionada.rango + "] se come a  " + objetivo.nombre);
                                juego.agregarPiezaMuerta(objetivo);
                                tablero[celday][celdax] = piezaSeleccionada;
                                //piezaSeleccionada.revelada = true;
                                //objetivo.revelada = true;
                                //Logica de revelacion TODO
                                
                                tablero[seleccionFila][seleccionColumna].colocada = false;
                                tablero[seleccionFila][seleccionColumna] = null;
                                piezaSeleccionada.fila = celday;
                                piezaSeleccionada.columna = celdax;
                                piezaSeleccionada.colocada = true;
                                //La pieza seleccionada se come al a pieza objetivo
                                if (piezaSeleccionada.heroe) {
                                    villanosC -= 1;
                                    System.out.println("Heroes--");
                                } else {
                                    heroesC -= 1;
                                    System.out.println("Villanos--");
                                }
                                /*if (villanosC == 0 && heroesC != 0) {
                                    getGanador(heroe, villano);
                                } else if (heroesC == 0 && villanosC != 0) {
                                    getGanador(villano, heroe);
                                }*/

                                empate();

                            } else if (piezaSeleccionada.rango < objetivo.rango) {
                                Juego.setPelea(objetivo.nombre + "[" + objetivo.rango + "] se come a atacante  " + piezaSeleccionada.nombre + "[" + piezaSeleccionada.rango + "]");
                                tablero[piezaSeleccionada.fila][piezaSeleccionada.columna].colocada = false;
                                tablero[piezaSeleccionada.fila][piezaSeleccionada.columna] = null;

                                juego.agregarPiezaMuerta(piezaSeleccionada);
                                System.out.println("Gano la otra pieza");
                                if (piezaSeleccionada.heroe) {
                                    heroesC -= 1;
                                    System.out.println("Heroes--");
                                } else {
                                    villanosC -= 1;
                                }
                                /*if (villanosC == 0 && heroesC != 0) {
                                    getGanador(heroe, villano);
                                } else if (heroesC == 0 && villanosC != 0) {
                                    getGanador(villano, heroe);
                                }*/
                                empate();
                            } else if (piezaSeleccionada.rango == objetivo.rango) {
                                Juego.setPelea(objetivo.nombre + "[" + objetivo.rango + "] y " + piezaSeleccionada.nombre + "[" + piezaSeleccionada.rango + "]" + " Se derrotan mutuamente");
                                objetivo.colocada = false;

                                tablero[piezaSeleccionada.fila][piezaSeleccionada.columna] = null;
                                tablero[objetivo.fila][objetivo.columna] = null;

                                System.out.println("Mismo rango , las dos mueren");

                                juego.agregarPiezaMuerta(piezaSeleccionada);
                                juego.agregarPiezaMuerta(objetivo);

                                heroesC -= 1;
                                villanosC -= 1;

                                /*if (villanosC == 0 && heroesC != 0) {
                                    getGanador(heroe, villano);
                                } else if (heroesC == 0 && villanosC != 0) {
                                    getGanador(villano, heroe);
                                }*/
                                

                                empate();
                                reiniciarSeleccion();

                            }

                        } else {
                            // Mismo bando
                            System.out.println("No puedes atacar a tu propio equipo.");
                            //No deberia contarte el turno realmente
                            return;

                        }
                        //Siempre entra aqui?
                        reiniciarSeleccion();
                        if (villanosC == 0 && heroesC != 0) {//Revisar si gano heroe Por falta de piezas
                            getGanador(heroe, villano);
                            System.out.println("Gano heroe");
                        } else if (heroesC == 0 && villanosC != 0) {//Revisar si gano villanos Por falta de piezas
                            getGanador(villano, heroe);
                        }

                        turno = !turno; //Cambio de turno
                        System.out.println("Turno de: " + (turno ? "Heroes" : "Villanos")); //Aviso en consola del cambio de turno
                        if (turno) {

                            Juego.setTurno(heroe.username);

                            for (int i = 0; i < 40; i++) {
                                if (heroes.heroes[i].colocada) {
                                    
                                    heroes.heroes[i].imagen = heroes.heroes[i].imagenOriginal;
                                    System.out.println(heroes.heroes[i].nombre);
                                    
                                }
                                if (villanos.villanos[i].colocada ) {
                                    villanos.villanos[i].imagen = villanos.villanos[i].reverso;
                                    System.out.println(villanos.villanos[i].nombre);
                                   
                                }
                            }
                        } else {
                            Juego.setTurno(villano.username);

                            for (int i = 0; i < 40; i++) {
                                if (heroes.heroes[i].colocada ) {
                                    
                                    heroes.heroes[i].imagen = heroes.heroes[i].reverso;
                                    System.out.println(heroes.heroes[i].nombre);
                                }
                                if (villanos.villanos[i].colocada) {
                                    villanos.villanos[i].imagen = villanos.villanos[i].imagenOriginal;
                                    System.out.println(villanos.villanos[i].nombre);
                                    
                                }
                            }
                        }
                    } else {
                        System.out.println(piezaSeleccionada.movimiento);
                        System.out.println("Movimiento inválido.");
                        reiniciarSeleccion();

                    }
                    System.out.println("Villanos piezas:" + villanosC);
                    System.out.println("Heroes peizas:" + heroesC);
                }

                repaint();
                System.out.println("X" + celdax
                        + "\nY" + celday);

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

                    // verificar distancia (horizontal o vertical)
                    if (((distFila <= piezaSeleccionada.movimiento && distCol == 0)
                            || (distCol <= piezaSeleccionada.movimiento && distFila == 0))
                            && !(r == seleccionFila && c == seleccionColumna)) {

                        boolean disponible = true;

                        // mirar si hay algo en el camino (piezas o zona prohibida)
                        if (distFila > 0 && distCol == 0) { // Movimiento vertical
                            int inicio = Math.min(seleccionFila, r) + 1;//No tomar en cuenta la de inicio
                            int fin = Math.max(seleccionFila, r);
                            for (int i = inicio; i < fin; i++) {
                                if (tablero[i][c] != null || zonaProhibida[i][c]) {
                                    disponible = false;
                                    break;
                                }
                            }
                        } else if (distCol > 0 && distFila == 0) { // Horizontal
                            int inicio = Math.min(seleccionColumna, c) + 1;//No tomar en cuenta la de inicio
                            int fin = Math.max(seleccionColumna, c);
                            for (int i = inicio; i < fin; i++) {
                                if (tablero[r][i] != null || zonaProhibida[r][i]) {
                                    disponible = false;
                                    break;
                                }
                            }
                        }

                        // verificar zona prohibida :D
                        if (zonaProhibida[r][c]) {
                            disponible = false;
                        }

                        // Si esta disponible o no
                        if (disponible) {
                            g.setColor(Color.GREEN);
                            g.drawRect(x, y, base, altura);
                            g.drawRect(x + 1, y + 1, base - 2, altura - 2);
                            g.drawRect(x + 2, y + 2, base - 4, altura - 4);
                        }
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

    public void Rendirse() {
        if (turno) {
            getGanador(villano, heroe);
            System.out.println("Se rindio: " + heroe.username + " y " + villano.username + " recibio 3 puntos");
        } else {
            getGanador(heroe, villano);
            System.out.println("Se rindio: " + villano.username + " y " + heroe.username + " recibio 3 puntos");
        }

        turno = true;
        heroe = Jugador.getHeroe();
        villano = Jugador.getVillano();
    }

    private void getGanador(Jugador ganador, Jugador perdedor) {
        if (ganador == villano) {
            System.out.println("Gano villano");
            ganador.setVictorias(1);
            ganador.setPuntos(3);
            StatsGlobales.setVictoriasVillanos();
            System.out.println(ganador.villanosPartidas);
            System.out.println(ganador.victorias);

            perdedor.setDerrotas(1);
            System.out.println(perdedor.heroesPartidas);
            System.out.println(perdedor.derrotas);
        } else {
            System.out.println("Gano heroe!!!");

            ganador.setVictorias(1);
            ganador.setPuntos(3);
            StatsGlobales.setVictoriasHeroes();
            System.out.println(ganador.heroesPartidas);
            System.out.println(ganador.victorias);

            perdedor.setDerrotas(+1);
            System.out.println(perdedor.villanosPartidas);
            System.out.println(perdedor.derrotas);

        }

        JFrame ventana = (JFrame) SwingUtilities.getWindowAncestor(this);//Para conseguir esta ventana
        if (ventana != null) {
            //Falta poner cosas como "Gano tal jugador pero se hace despues"
            MenuPrincipal ventanas = new MenuPrincipal();
            ventanas.setVisible(true);
            ventanas.setLocationRelativeTo(null);
            ventana.dispose();

        }

    }

    private void empate() {
        if (villanosC == 0 && heroesC == 0) {
            // Empate
            System.out.println("EMPATE");

            JFrame ventana = (JFrame) SwingUtilities.getWindowAncestor(this);//Para conseguir esta ventana
            if (ventana != null) {
                //Falta poner cosas como "Gano tal jugador pero se hace despues"
                MenuPrincipal ventanas = new MenuPrincipal();
                ventanas.setVisible(true);
                ventanas.setLocationRelativeTo(null);
                ventana.dispose();

            }
        }
    }

}
