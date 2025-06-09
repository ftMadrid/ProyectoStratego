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
        piezaSeleccionada.seleccionada = false;
        piezaSeleccionada = null;
        seleccionFila = -1;
        seleccionColumna = -1;
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

        //sorteo de villanos 
        int colocadosVillanos = 0;
        for (int i = 0; i < villanos.villanos.length; i++) {
            pieza p = villanos.villanos[i];
            if (!p.colocada) {
                boolean colocada = false;
                for (int intentos = 0; intentos < 100 && !colocada; intentos++) {
                    int randomr = random.nextInt(2); // filas 0 a 1 (puedes ajustar)
                    int randomc = random.nextInt(columnas);
                    if (tablero[randomr][randomc] == null && !zonaProhibida[randomr][randomc]) {
                        tablero[randomr][randomc] = p;
                        p.fila = randomr;
                        p.columna = randomc;
                        p.colocada = true;
                        colocadosVillanos++;
                        System.out.println("Se colocó villano: " + p.nombre + " (rango " + p.rango + ")");
                        colocada = true;
                    }
                }
                if (!colocada) {
                    System.out.println("No se pudo colocar villano: " + p.nombre);
                }
            }
        }//Fin for rango

        int colocadosHeroes = 0;
        for (int i = 0; i < heroes.heroes.length; i++) {
            pieza p = heroes.heroes[i];
            if (!p.colocada) {
                boolean colocada = false;
                for (int intentos = 0; intentos < 100 && !colocada; intentos++) {
                    int randomr = 6 + random.nextInt(2); // filas 0 a 1(puedes ajustar)
                    int randomc = random.nextInt(columnas);
                    if (tablero[randomr][randomc] == null && !zonaProhibida[randomr][randomc]) {
                        tablero[randomr][randomc] = p;
                        p.fila = randomr;
                        p.columna = randomc;
                        p.colocada = true;
                        colocadosHeroes++;
                        System.out.println("Se colocó heroe: " + p.nombre + " (rango " + p.rango + ")");
                        colocada = true;
                    }
                }
                if (!colocada) {
                    System.out.println("No se pudo colocar heroe: " + p.nombre);
                }
            }
        }//Fin for rango

        //-------------------------------------------------------------------
        // Colocar villanos en filas 0 y 1 
        /*int indexVillanos = 0;//Cuantos villanos hay
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
         */
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

                            tablero[celday][celdax] = piezaSeleccionada;
                            tablero[seleccionFila][seleccionColumna] = null;
//
                            piezaSeleccionada.fila = celday;
                            piezaSeleccionada.columna = celdax;

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
                                tablero[piezaSeleccionada.fila][piezaSeleccionada.columna].colocada = false;
                                tablero[seleccionFila][seleccionColumna].colocada = false;

                                tablero[piezaSeleccionada.fila][piezaSeleccionada.columna] = null;
                                tablero[seleccionFila][seleccionColumna] = null;

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
                        if(turno){
                            juego.getTurno("Heroes");
                        }else{
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

                if (piezaSeleccionada == null && tablero[celday][celdax] != null) {
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
                if (zonaProhibida[r][c]) //No dibuja el cuadrito
                {
                    continue;
                }
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

    private int getMinimoPorRango(int rango) {
        switch (rango) {
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
