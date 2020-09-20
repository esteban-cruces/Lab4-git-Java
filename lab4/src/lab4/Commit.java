/**
 * @author Esteban Cruces Araneda
 * Rut 20201381-3
 * Ultimo Edit 20/09/2020
 * @version 1.0
 */
package lab4;


import java.util.ArrayList;

/**
* Clase para representar un commit,
* determinada por autor, nombreCommit, archivos y fecha,
* @version 1.0
* @author Esteban Cruces Araneda
*/
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
    /**
     * constructor
     * @param nombreAutor nombre del autor
     * @param nameCommit nombre del commit
     * @param contenido contenido del commit
     */
    public Commit(String nombreAutor, String nameCommit, ArrayList<ArchivoDeTextoPlano> contenido){
        this.autor = nombreAutor;
        this.nombreCommit = nameCommit;
        this.archivos = contenido;
        this.fecha = Fecha.obtenerFechaActual();
    }   
    /**
     * metodo que muestra representacion como string de un commit
     * @return String como representacion del commit
     */
    @Override
    public String toString(){
        String commitString = "Autor Commit: "+this.autor+"\nNombre Commit: "+this.nombreCommit+"\nFecha: "+this.fecha+"\n.............................................\n";
        commitString = this.archivos.stream().map((arch) -> arch.toString()+".............................................\n").reduce(commitString, String::concat);
        return commitString;
    }
}
