/**
 * @author Esteban Cruces Araneda
 * Rut 20201381-3
 * Ultimo Edit 20/09/2020
 * @version 1.0
 */
package lab4;

import java.util.ArrayList;

/**
* Clase para representar un archivo de texto plano,
* determinada por nombreArchivo, texto y fecha,
* @version 1.0
* @author Esteban Cruces Araneda
*/
public class ArchivoDeTextoPlano {
    /*Atrubutos-------------------------------------------
    string que representa el nombre del archivo*/
    String nombreArchivo;
    /*Lista de string que representa en contenido del archivo
    cada posición de la lista, es una linea del archivo*/
    ArrayList<String> texto;
    /*String que almacena la fecha de cracion*/
    String fecha;
    /**
     * constructor
     * @param nameFile nombre del archivo
     * @param contenido contenido del archivo
     */
    public ArchivoDeTextoPlano(String nameFile, ArrayList<String> contenido){
        this.nombreArchivo = nameFile;
        this.texto = contenido;
        this.fecha = Fecha.obtenerFechaActual();
    }
    
    @Override
    /**
     * metodo que muestra representacion como string de un archivo
     * @return string como representacion del archivo
     */
    public String toString(){
        String archivoString = "Nombre del Archivo: "+this.nombreArchivo+"\nFecha de cración: "+this.fecha+"\nContenido: \n";
        for(int i = 0; i < this.texto.size() ;i++){
            archivoString = archivoString + "    " + texto.get(i) + "\n";
        }
        return archivoString;
    }
}
