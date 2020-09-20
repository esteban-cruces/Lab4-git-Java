/**
 * @author Esteban Cruces Araneda
 * Rut 20201381-3
 * Ultimo Edit 20/09/2020
 * @version 1.2
 */
package lab4;

import java.util.ArrayList;

/**
* Clase para representar la zona remote repository,
* determinada por rR,
* @version 1.2
* @author Esteban Cruces Araneda
*/
public class RemoteRepository {
    /*En este atributo se agregan los archivosa que pertenencen al Remote Repository*/
    ArrayList<Commit> rR;
    /**
     * constructor
     */
    public RemoteRepository(){
        this.rR = new ArrayList<>();
    }
    /**
     * metodo que muestra representacion como string del remote repository
     * @return String como representacion del remote repository
     */
    @Override
    public String toString(){
        String lRString = "##########\n";
        lRString = this.rR.stream().map((commit) -> commit.toString()+"---------------------------------\n").reduce(lRString, String::concat);
        return lRString;
    }
}
