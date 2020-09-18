
package lab4;


import java.util.ArrayList;


/**
 *
 * @author Esteban
 */
/*Esta clase es la representacion del objeto commit, en esta se encuantran los archivos modificados con una fecha de creacion, autor, y nombre representativo*/
public class Commit {
    /*Atributos----------------------------------------------
    String con el nombre del autor*/
    String autor;
    /*String que representa el nombre representativo del commit*/
    String nombreCommit;
    /*archivo con el contenido*/
    ArrayList<ArchivoDeTextoPlano> archivos;
    /*string que indica la hora*/
    String fecha;
    /*
    *constructor
    */
    public Commit(String nombreAutor, String nameCommit, ArrayList<ArchivoDeTextoPlano> contenido){
        this.autor = nombreAutor;
        this.nombreCommit = nameCommit;
        this.archivos = contenido;
        this.fecha = Fecha.obtenerFechaActual();
    }   
}
