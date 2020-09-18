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
    /*Método que entrega un string con los ultimos 5 commits o todos en caso de que hayan menos de 5, 
    con sus fechas, mensaje descriptivo y archivos añadidos*/
    public String ultimos5Commit(){
        String commitString = "-------------------------------------------------\n";
        commitString = commitString + "####--ÚLTIMOS 5 COMMIT EN LOCAL REPOSITORY--####\n";
        /*en caso de tener menos de 5 elementos se ejecuta este if*/
        if(this.lR.size()<5){
            for(int i = 0; i < this.lR.size(); i++){
                commitString = commitString + "  Nombre Commit: " + this.lR.get(i).nombreCommit + "\n";
                commitString = commitString + "    Nombre Autor: " + this.lR.get(i).autor + "\n";
                commitString = commitString + "    Fecha: " + this.lR.get(i).fecha + "\n";
                int cantidadArchLR = this.lR.get(i).archivos.size();
                int j = 0;
                commitString = commitString + "    Archivos:\n";
                while(j < cantidadArchLR){
                    commitString = commitString + "      " + this.lR.get(i).archivos.get(j).nombreArchivo + "\n";
                    j++;
                }
            }
        }
        /*en caso de tener mas o igual a 5 commit, se ejecuta el esle*/
        else{          
            for(int i = this.lR.size() - 5; i < this.lR.size(); i++){
                commitString = commitString + "  Nombre Commit: " + this.lR.get(i).nombreCommit + "\n";
                commitString = commitString + "    Nombre Autor: " + this.lR.get(i).autor + "\n";
                commitString = commitString + "    Fecha: " + this.lR.get(i).fecha + "\n";
                int cantidadArchLR = this.lR.get(i).archivos.size();
                int j = 0;
                commitString = commitString + "    Archivos:\n";
                while(j < cantidadArchLR){
                    commitString = commitString + "      " + this.lR.get(i).archivos.get(j).nombreArchivo + "\n";
                    j++;
                }
            }
        }
        return commitString;
    }
}
