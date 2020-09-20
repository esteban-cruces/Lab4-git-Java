
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
    /*metodo que entrega un String con la representacion del Remote REpository*/
    @Override
    public String toString(){
        String lRString = "##########\n";
        lRString = this.rR.stream().map((commit) -> commit.toString()+"---------------------------------\n").reduce(lRString, String::concat);
        return lRString;
    }
}
