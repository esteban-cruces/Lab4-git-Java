 
package lab4;

import java.util.ArrayList;

/**
 *
 * @author Esteban
 */
/*Esta es la clase que representa al workspace, es aqui donde el usuario agrega archivos de forma local*/
public class Workspace {
    /*Atributos
    Este atributo se encarga de almacenar todos los archivos que se deseen guardar en el Workspace*/
    ArrayList<ArchivoDeTextoPlano> ws;
    /*constructor*/
    public Workspace(){
        this.ws = new ArrayList<>();
    }
    /*Metodos--------------------------------------------
    Metodo que busca la posicion de un archivo, según el nombre, dentro del workspace*/
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
    /*metodo que entrega una representacion de Workspace como String*/
    @Override
    public String toString(){
        String wsString = "##########\n";
        for(int i = 0; i < this.ws.size(); i++){
            wsString += this.ws.get(i).toString()+"---------------------------------\n";
        }
        return wsString;
    }
    /*Metodo que agrega los archivos de un commit a un workspace, en caso de que el archivo ya se encuentre, lo reemplaza*/
    /*public Workspace agregarArchCommit(Workspace wsAux, Commit esteCommit){
        int i=0;
        while(i < esteCommit.copiaIndex.ix.size()){
            int posicion = this.encontrar(wsAux, esteCommit.copiaIndex.ix.get(i).nombreArchivo);
            if(posicion == -1){
                wsAux.ws.add(esteCommit.copiaIndex.ix.get(i));
            }
            else{
                wsAux.ws.set(posicion,esteCommit.copiaIndex.ix.get(i));
            }
            i++;
        }
        return wsAux;
    }*/
}
