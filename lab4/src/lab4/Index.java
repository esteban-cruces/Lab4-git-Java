/**
 * @author Esteban Cruces Araneda
 * Rut 20201381-3
 * Ultimo Edit 20/09/2020
 * @version 1.2
 */
package lab4;

import java.util.ArrayList;

/**
* Clase para representar la zona index,
* determinada por ix,
* @version 1.2
* @author Esteban Cruces Araneda
*/
public class Index {
    /*Este atributo almacena los archivos que se envien desde el workspace al index */
    ArrayList<ArchivoDeTextoPlano> ix;
    /**
     * constructor
     */
    public Index(){
        this.ix = new ArrayList<>();
    }
    /**
     * metodo que muestra representacion como string del index
     * @return string como representacion del index
     */
    @Override
    public String toString(){
        String ixString = "##########\n";
        for(int i = 0; i < this.ix.size(); i++){
            ixString += this.ix.get(i).toString()+"---------------------------------\n";
        }
        return ixString;
    }
}
