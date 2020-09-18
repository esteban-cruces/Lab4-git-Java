
package lab4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Esteban
 *
 * Esta clase solo es usaada para entregar la fecha actual como un String*/
public class Fecha {
    /*Metodos------------------------------------------------
    Metodo para obtener la hora, la entrega en forma de String*/
    public static String obtenerFechaActual() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date fechaActual = new Date();
        return df.format(fechaActual);
    }
}
