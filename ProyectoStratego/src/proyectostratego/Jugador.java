/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectostratego;

/**
 *
 * @author user
 */
public class Jugador { //Constructor para el objeto
    String username;
    String password;
    public int puntos = 0;
    public int heroesPartidas = 0;
    public int villanosPartidas = 0; //Inicializar variables mayormente
    
    public Jugador(String username,  String password)
    {
    this.username = username; //Conseguir el user
    this.password = password;//La password del user
    this.puntos = 0;//Puntos user
    this.heroesPartidas = 0;//Partidas jugadas , no ganadas
    this.villanosPartidas = 0;//Lo mismo de arriba
    //Para agregar mas stats o cosas extra , solo es poner this.[variable] = 0;
    }
    
    
    
    public boolean validarPass(String pass)
    {
    return this.password.equals(pass);
    //Es la bool para saber si es la password , solo es una funcion para facilitar login
    }
    
}
