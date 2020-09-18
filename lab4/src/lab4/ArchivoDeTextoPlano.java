
package lab4;

import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
/*Esta clase es la simulacion de un objeto archivo, el cual almacena texto plano*/
public class ArchivoDeTextoPlano {
    /*Atrubutos-------------------------------------------
    string que representa el nombre del archivo*/
    String nombreArchivo;
    /*Lista de string que representa en contenido del archivo
    cada posición de la lista, es una linea del archivo*/
    ArrayList<String> texto;
    /*String que almacena la fecha de cracion*/
    String fecha;
    /*
    *Construnctor-------------------
    */
    public ArchivoDeTextoPlano(String nameFile, ArrayList<String> contenido){
        this.nombreArchivo = nameFile;
        this.texto = contenido;
        this.fecha = Fecha.obtenerFechaActual();
    }
    
    @Override
    public String toString(){
        String archivoString = "Nombre del Archivo: "+this.nombreArchivo+"\nFecha de cración: "+this.fecha+"\nContenido: \n";
        for(int i = 0; i < this.texto.size() ;i++){
            archivoString = archivoString + "    " + texto.get(i) + "\n";
        }
        return archivoString;
    }
}
