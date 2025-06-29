package proyectostratego.utilidades;

public class Jugador { //Plantilla para el objeto

    public static int nUsuariosTotal = 0;
    public static int nUsuariosEliminadosTotal = 0;

    public static Jugador jugadorLog = null;
    public static Jugador jugadorContrincante = null;
    public static boolean logged = false;

    public static Jugador[] jugadores = new Jugador[100]; //Crea la cantidad de jugadores y aqui se almacenan los jugadores como tal
    //La razon por la que son 100 , es porque es eso o crear uno que por cada user se vaya actualizando
    public static Jugador[] jugadoresEliminados = new Jugador[100];

    public String username;
    public String password;
    public int puntos = 0;
    public int heroesPartidas = 0;
    public int villanosPartidas = 0; //Inicializar variables mayormente
    public int victorias = 0;
    public int derrotas = 0;
    public int empates = 0;
    public boolean bando = true;
    
    public Jugador(String username, String password) {
        this.username = username; //Conseguir el user
        this.password = password;//La password del user
        this.puntos = 0;//Puntos user
        this.heroesPartidas = 0;//Partidas jugadas , no ganadas
        this.villanosPartidas = 0;//Lo mismo de arriba
        this.victorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        //Para agregar mas stats o cosas extra , solo es poner this.[variable] = 0;
    }
    

//Username get/set
    
    public void setBando(boolean bando){
        this.bando = bando;
    }
    
    public static Jugador getHeroe(){
        return jugadorLog.bando ? jugadorLog : jugadorContrincante;
    }
    
    public static Jugador getVillano(){
        return jugadorLog.bando ? jugadorContrincante : jugadorLog;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

//Puntos get/set
    public void setPuntos(int puntos) {
        this.puntos += puntos;
    }

    public int getPuntos() {
        return puntos;
    }

//Password get/set
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

//Heroes partidas
    public void setHeroesPartidas(int heroesPartidas) {
        this.heroesPartidas += heroesPartidas;
    }

    public int getHeroesPartidas() {
        return heroesPartidas;
    }

//Villanos Partidas
    public void setVillanosPartidas(int villanosPartidas) {
        this.villanosPartidas += villanosPartidas;
    }

    public int getVillanosPartidas() {
        return villanosPartidas;
    }

    public boolean validarPass(String pass) {
        return this.password.equals(pass);
        //Es la bool para saber si es la password , solo es una funcion para facilitar login
    }

    public void nuevaPass(String nuevaPassword) {
        this.password = nuevaPassword;
        //Metodo para cambiar la contraseña
    }
    
    public void setVictorias(int victorias){
        this.victorias += victorias;
    }
    
    public int getVictorias(){
        return victorias;
    }
    
    public void setEmpates(int empates){
        this.empates += empates;
    }
    
    public int getEmpates(){
        return empates;
    }
    
    public void setDerrotas(int derrotas){
        this.derrotas += derrotas;
    }
    
    public int getDerrotas(){
        return derrotas;
    }

    public static void eliminarJugador(String username) {

        // Metdo para eliminar la cuenta (lo hice con metodo para ahorrar espacio en esa clase
        for (int i = 0; i < Jugador.nUsuariosTotal; i++) {
            if (Jugador.jugadores[i].username.equalsIgnoreCase(username)) {

                // Guardar usuarios eliminados
                Jugador.jugadoresEliminados[nUsuariosEliminadosTotal] = jugadores[i];
                nUsuariosEliminadosTotal++;
                
                //Mueve los demas jugadores para que quede de ultimo el usuario a eliminar para facilitar el proceso
                for (int j = i; j < Jugador.nUsuariosTotal - 1; j++) {
                    Jugador.jugadores[j] = Jugador.jugadores[j + 1];
                }
                Jugador.jugadores[Jugador.nUsuariosTotal - 1] = null; //Elimino el usuario de la cantidad total
                Jugador.nUsuariosTotal--;
                break;
            }
        }
    }
}
