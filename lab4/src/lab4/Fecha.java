/**
 * @author Esteban Cruces Araneda
 * Rut 20201381-3
 * Ultimo Edit 20/09/2020
 * @version 1.0
 */
package lab4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
* Clase para representar la fecha,
* @version 1.0
* @author Esteban Cruces Araneda
*/
public class Fecha {
    /**
     * metodo que entrega la fecha como string
     * @return string con representacion de la fecha
     */
    public static String obtenerFechaActual() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date fechaActual = new Date();
        return df.format(fechaActual);
    }
}
