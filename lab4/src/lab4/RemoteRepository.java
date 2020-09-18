
package lab4;

import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
/*Esta es la clase que almacena los Commit, hechos del repositorio, de forma remota*/
public class RemoteRepository {
    /*En este atributo se agregan los archivosa que pertenencen al Remote Repository*/
    ArrayList<Commit> rR;
    /*constructor*/
    public RemoteRepository(){
        this.rR = new ArrayList<>();
    }
}
