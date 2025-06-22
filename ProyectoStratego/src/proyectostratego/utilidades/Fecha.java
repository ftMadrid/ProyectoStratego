package proyectostratego.utilidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Fecha {

    private static final DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // seteo el formato de la fecha
    private static final DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss"); // seteo el formato de la hora

    public static String getFecha() {
        return fecha.format(LocalDate.now());
    }

    public static String getHora() {
        return hora.format(LocalTime.now());
    }

    public static String getFechaHora() {
        return getFecha() + " - " + getHora();
    }
    
}
