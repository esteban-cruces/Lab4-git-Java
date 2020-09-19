
package lab4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
/*Esta clase representa el objeto repositorio, el cual contiene las 4 zonas de trabajo además del nombre del autor, nombre del repositorio y fecha*/
public class Repositorio {
    /*Este atributo representa la zona de trabajo Workspace*/
    Workspace workspace;
    /*Este atributo representa la zona de trabajo Index*/
    Index index;
    /*Este atributo representa la zona de trabajo Local Repository*/
    LocalRepository lRepository;
    /*Este atributo representa la zona de trabajo Remote Repository*/
    RemoteRepository rRepository;
    /*Este atributo representa el nombre del autor del repositorio*/
    String autor;
    /*Este atributo representa el nombre del repositorio*/
    String nombreRepositorio;
    /*Este atributo representa la fecha de cracion del repositorio*/
    String fecha;
    /*Construnctor repositorio*/
    public Repositorio(String NombreRepositorio, String Autor){
        this.nombreRepositorio = NombreRepositorio;
        this.autor = Autor;
        this.fecha = Fecha.obtenerFechaActual();
        this.workspace = new Workspace();
        this.index = new Index();
        this.lRepository = new LocalRepository();
        this.rRepository = new RemoteRepository();
    }
    /*Metodos-----------------------------------------------
    /*Metodo para crear un repositorio con nombre y autor
    simula el comando gitInit*/
    public static Repositorio gitInit(String NombreRepositorio, String Autor){
        Repositorio repo = new Repositorio(NombreRepositorio, Autor);
        return repo;
    }
    /*Metodo para "mover" los archivos del Index al workspace
    simula el comando gitAdd*/
    public void gitAdd(){
        /*--------------------------------------------------------------------------------
        AQUI SE CREA UN ARREGLO DE STRING SOLO CON LOS NOMBRES DE LOS ARCHIVOS QUE SE ENCUENTRA EN index*/
        int cantidadArchIx = this.index.ix.size();
        int i = 0;
        ArrayList<String> listaNombres = new ArrayList<>();
        while(i < cantidadArchIx){
            listaNombres.add(this.index.ix.get(i).nombreArchivo);
         
            i++;
        }
        /*----------------------------------------------------------------------------------*/
        i = 0;
        int cantidad = this.workspace.ws.size();
        while(i < cantidad){
            if(listaNombres.contains(this.workspace.ws.get(i).nombreArchivo)){
                /*si el archivo ya esta, se omite el agregarlo, ya que, los archivos nunca se editan*/
                i++;
            }
            else{
                this.index.ix.add(this.workspace.ws.get(i));
                i++;
            }
        }
    }    
    public void gitAdd(String nombreArchivosAdd){
        /*aqui se crea un arrayList donde cada posicion es el nombre de un archivo*/
        ArrayList<String> nombresEnArray = new ArrayList<>();        
        String[] contenidoEnStringSeparado = nombreArchivosAdd.split("\n");
        nombresEnArray.addAll(Arrays.asList(contenidoEnStringSeparado));
        /*--------------------------------------------------------------------------------
        AQUI SE CREA UN ARREGLO DE STRING SOLO CON LOS NOMBRES DE LOS ARCHIVOS QUE SE ENCUENTRA EN index*/
        int cantidadArchIx = this.index.ix.size();
        int i = 0;
        ArrayList<String> listaNombres = new ArrayList<>();
        while(i < cantidadArchIx){
            listaNombres.add(this.index.ix.get(i).nombreArchivo);
         
            i++;
        }
        /*----------------------------------------------------------------------------------*/
        int cantidadAdd = nombresEnArray.size();/*este valor es la cantidad de archivos que se desea agregar*/
        i=0;
        while(cantidadAdd > i){
            if(listaNombres.contains(nombresEnArray.get(i))){ 
                i++;
            }
            else{
                int posicionWs = this.workspace.encontrarPosArch(nombresEnArray.get(i));
                if(posicionWs == -1){
                    /*si entra dentro de este 'if', significa que el archivo no pertenece al Workspace, con lo que se omite este archivo
                    y se agregan los siguientes, en caso de que si pertecescan*/
                    i++;
                }
                else{
                    this.index.ix.add(this.workspace.ws.get(posicionWs));
                    i++;
                }
            }                
        }
    }
    /*Metodo crearArchivo
    Este metodo crea un archivoDeTextoPlano y lo agrega en un Repositorio*/
    public void crearArchivo(String nameArchivo, String contenido){
        ArrayList<String> contenidoEnArray = new ArrayList<>();        
        String[] contenidoEnStringSeparado = contenido.split("\n");
        contenidoEnArray.addAll(Arrays.asList(contenidoEnStringSeparado));
        /*hasta aqui se crea un arrayList con el contenido del archivo*/
        ArchivoDeTextoPlano archivo = new ArchivoDeTextoPlano(nameArchivo,contenidoEnArray);/*Esta sera la variable que guarde el archivo que se desea agregar*/
        this.workspace.ws.add(archivo);
    }
    /*Metodo gitCommit
    Este metodo agrega los archivos que se encuentrasn en el index al local repository, esto en formato commit*/
    public void gitCommit(){
        System.out.println("---------------------------------------------------");
        int archIndex = this.index.ix.size();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Autor");
        String autorCommit = entrada.nextLine();
        System.out.println("Ingrese el nombre para su commit");
        String nameCommit = entrada.nextLine();
        Commit nuevoCommit = new Commit(autorCommit,nameCommit,this.index.ix);
        this.lRepository.lR.add(nuevoCommit);
        this.index = new Index();
    }
    /*Metodo gitPush
    Este metodo agrega todos los commits almacenados en el localRepository y los agrega al remoteRepository*/
    public void gitPush(){
        this.rRepository.rR.addAll(this.lRepository.lR);
        this.lRepository = new LocalRepository();      
    }
    /*Metodo gitPull
    Este metodo toma todos los archivos del Remote Repository y los copia en el Workspace.*/
    /*public void gitPull(){
        int cantidadCommit = this.rRepository.rR.size();
        int i =0;
        while(i<cantidadCommit){
            this.workspace = this.workspace.agregarArchCommit(this.workspace,this.rRepository.rR.get(i));
            i++;
        }
        this.rRepository = new RemoteRepository();
    }*/
    /*Metodo gitStatus
    Este metodo transforma a un String la Informacion del repositorio (nombre y autor), Numero de archivos en el Workspace,
    Numero de archivos en el Index, Numero de commits en el Local Repository,
    SI el Remote Repository está al día (o no) con los cambios del Local Repository*/
    public String gitStatus(){        
        String stringStatus = "-----------------------------------------------------------\n####--Información del Repositorio--####\n";
        stringStatus = stringStatus +"Nombre de Autor: " + this.autor + "\nNombre del Repositorio: " + this.nombreRepositorio;        
        stringStatus = stringStatus + "\nNúmero de archivos en el Workspace: " + this.workspace.ws.size();
        stringStatus = stringStatus + "\nNúmero de archivos en el Index: " + this.index.ix.size();
        stringStatus = stringStatus + "\nNúmero de commits en el Local Repository: " + this.lRepository.lR.size();
        if(this.lRepository.lR.isEmpty()){
            stringStatus = stringStatus + "\nRemote Repository si está al día con los cambios en Local Repository";
            return stringStatus;
        }
        else if(this.rRepository.rR.isEmpty() && !this.lRepository.lR.isEmpty()){
            stringStatus = stringStatus + "\nRemote Repository no está al día con los cambios en Local Repository";
            return stringStatus;
        }
        if(this.lRepository.lR.get(this.lRepository.lR.size()-1).nombreCommit.equals(this.rRepository.rR.get(this.rRepository.rR.size()-1).nombreCommit)){
            stringStatus = stringStatus + "\nRemote Repository si está al día con los cambios en Local Repository";            
        }
        else{
            stringStatus = stringStatus + "\nRemote Repository no está al día con los cambios en Local Repository";
        }
        return stringStatus;
    }
    /*Esta funcionalidad debe mostrar una lista con los ultimos 5 commits del Local Repository (indicando fecha, mensaje descriptivo 
    y archivos anadidos). Si hay menos de 5 commits, muestra todos los que estén disponibles.*/
    public String gotLog(){
        String ultimos5Commit = this.lRepository.ultimos5Commit();
        return ultimos5Commit;
    }

}