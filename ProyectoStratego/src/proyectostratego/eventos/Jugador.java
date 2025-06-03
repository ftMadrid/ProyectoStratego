package proyectostratego.eventos;

import proyectostratego.ventanas.MenuInicial;

public class Jugador { //Constructor para el objeto

    public String username;
    public String password;
    public int puntos = 0;
    public int heroesPartidas = 0;
    public int villanosPartidas = 0; //Inicializar variables mayormente

    public Jugador(String username, String password) {
        this.username = username; //Conseguir el user
        this.password = password;//La password del user
        this.puntos = 0;//Puntos user
        this.heroesPartidas = 0;//Partidas jugadas , no ganadas
        this.villanosPartidas = 0;//Lo mismo de arriba
        //Para agregar mas stats o cosas extra , solo es poner this.[variable] = 0;
    }

    public boolean validarPass(String pass) {
        return this.password.equals(pass);
        //Es la bool para saber si es la password , solo es una funcion para facilitar login
    }

    public void nuevaPass(String nuevaPassword) {
        this.password = nuevaPassword;
        //Metodo para cambiar la contraseña
    }

    public static void eliminarJugador(String username) {

        //Metodo para eliminar la cuenta (lo hice con metodo para ahorrar espacio en esa clase
        for (int i = 0; i < MenuInicial.nUsuariosTotal; i++) {
            if (MenuInicial.jugadores[i].username.equalsIgnoreCase(username)) {

                //Mueve los demas jugadores para que quede de ultimo el usuario a eliminar para facilitar el proceso
                for (int j = i; j < MenuInicial.nUsuariosTotal - 1; j++) {
                    MenuInicial.jugadores[j] = MenuInicial.jugadores[j + 1];
                }
                MenuInicial.jugadores[MenuInicial.nUsuariosTotal - 1] = null; //Elimino el usuario de la cantidad total
                MenuInicial.nUsuariosTotal--;
                break;
            }
        }
    }
}
