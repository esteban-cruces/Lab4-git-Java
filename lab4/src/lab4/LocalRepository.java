/**
 * @author Esteban Cruces Araneda
 * Rut 20201381-3
 * Ultimo Edit 20/09/2020
 * @version 1.2
 */
package lab4;

import java.util.ArrayList;

/**
* Clase para representar la zona local repository,
* determinada po lR,
* @version 1.2
* @author Esteban Cruces Araneda
*/
public class LocalRepository {
    /*En este atributo se irán agregando los distintos commits que se almacenen en localRepository*/
    ArrayList<Commit> lR;     
    /**
     * constructor
     */
    public LocalRepository(){
        this.lR = new ArrayList<>();
    }
    /**
     * metodo que muestra representacion como string del local repository
     * @return String como representacion del local repository
     */
    @Override
    public String toString(){
        String lRString = "##########\n";
        lRString = this.lR.stream().map((commit) -> commit.toString()+"---------------------------------\n").reduce(lRString, String::concat);
        return lRString;
    }
}
