package proyectostratego.utilidades;

import java.awt.Image;
import javax.swing.ImageIcon;

public class pieza {
    
    public int rango;
    public Image imagen;
    public Image imagenm;
    public String nombre;
    public int movimiento;
    public int fila;
    public int columna;
    public boolean heroe; //Pongamos que true = heroe , false = villano pa no complicarla
    public boolean seleccionada; //Pa saber si esta seleccionada
    public boolean colocada;
    public Image imagenOriginal; // imagen original
    public Image imagenMuertes;
    public Image reverso;
    //public boolean revelada;
    
    
    public pieza(String nombre,String rutaImagen , int rango, int movimiento, int fila, int columna, boolean heroe) 
//    
//Al crear la pieza sera - "Ejemplo" , "/asda/asda/asda.png/",1,1,-1,-1,true;
    {
    Image original = new ImageIcon(getClass().getResource(rutaImagen)).getImage();
    Image reverso = new ImageIcon(getClass().getResource("/proyectostratego/imagenes/Pieza.png")).getImage();
    //Explicacion
    /*
    Basicamente reverso es la imagen reverso , consigue su ruta imagen (Y como son las mismas para todos pues no importa)
    */
    
    
    this.imagen = original.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
    this.imagenm = original.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    this.imagenMuertes = this.imagenm;
    this.imagenOriginal = this.imagen;
    this.reverso = reverso;
    this.nombre = nombre;
    this.heroe = heroe;
    this.rango = rango;
    this.movimiento = movimiento;
    this.fila = fila;
    this.columna = columna;
    this.seleccionada = false;
    this.colocada = false;
    //this.revelada = false;
    //Agrege revelada para ver si no esta revelada la pieza
    }
}
