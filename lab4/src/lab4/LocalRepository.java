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
/*Esta clase es la encargada de almacenar los commit hehcos desde el index que aun no llegan al remote repository*/
public class LocalRepository {
    /*En este atributo se irán agregando los distintos commits que se almacenen en localRepository*/
    ArrayList<Commit> lR; 
    /*Constructo*/
    public LocalRepository(){
        this.lR = new ArrayList<>();
    }
    /*metodo que entrega un String con la representacion del Local REpository*/
    @Override
    public String toString(){
        String lRString = "##########\n";
        lRString = this.lR.stream().map((commit) -> commit.toString()+"---------------------------------\n").reduce(lRString, String::concat);
        return lRString;
    }
}
