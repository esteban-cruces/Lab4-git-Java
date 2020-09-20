/**
 * @author Esteban Cruces Araneda
 * Rut 20201381-3
 * Ultimo Edit 20/09/2020
 * @version 1.4
 */ 
package lab4;

import java.util.ArrayList;

/**
* Clase para representar la zona workspace,
* determinada por ws,
* @version 1.4
* @author Esteban Cruces Araneda
*/
public class Workspace {
    /*Atributos
    Este atributo se encarga de almacenar todos los archivos que se deseen guardar en el Workspace*/
    ArrayList<ArchivoDeTextoPlano> ws;
    /**
     * constructor
     */
    public Workspace(){
        this.ws = new ArrayList<>();
    }
    /**
     * metodo que encuentra la posicion de un archivo si existe
     * @param nombreDocumento archivo
     * @return int con la posicion del archivo, -1 si no existe
     */
    public int encontrarPosArch(String nombreDocumento){
        int posicion = 0;
        while(posicion < this.ws.size()){
            if(nombreDocumento.equals(this.ws.get(posicion).nombreArchivo)){
                return posicion;
            }
            else{
                posicion++;
            }
        }      
        return -1;
    }
    /**
     * metodo que muestra representacion como string de la zona workspace
     * @return String como representacion de la zona workspace
     */
    @Override
    public String toString(){
        String wsString = "##########\n";
        for(int i = 0; i < this.ws.size(); i++){
            wsString += this.ws.get(i).toString()+"---------------------------------\n";
        }
        return wsString;
    }
}
