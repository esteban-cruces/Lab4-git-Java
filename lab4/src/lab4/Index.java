/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
/*esta es la clase encargada de guardar los cambios en los archivos que se hagan en el workspace, todo esto a traves de un gitAdd*/
public class Index {
    /*Este atributo almacena los archivos que se envien desde el workspace al index */
    ArrayList<ArchivoDeTextoPlano> ix;
    /*constructor*/
    public Index(){
        this.ix = new ArrayList<>();
    }
}
