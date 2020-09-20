/**
 * @author Esteban Cruces Araneda
 * Rut 20201381-3
 * Ultimo Edit 20/09/2020
 * @version 1.8
 */ 
package lab4;


import java.util.ArrayList;
import java.util.Arrays;

/**
* Clase para representar un repositorio,
* determinada por workspace,index,lRepository,rRepository,autor,nombreRepositorio y fecha
* @version 1.8
* @author Esteban Cruces Araneda
*/
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
    /**
     * constructor
     * @param NombreRepositorio nombre del repositorio
     * @param Autor nombre del autor
     */
    public Repositorio(String NombreRepositorio, String Autor){
        this.nombreRepositorio = NombreRepositorio;
        this.autor = Autor;
        this.fecha = Fecha.obtenerFechaActual();
        this.workspace = new Workspace();
        this.index = new Index();
        this.lRepository = new LocalRepository();
        this.rRepository = new RemoteRepository();
    }
    /**
     * metodo para crear un repositorio con nombre y autor
     * @param NombreRepositorio nombre del repositorio
     * @param Autor nombre del autor
     * @return Repositorio entrega el repositorio creado con los correspondientes parametros
     */
    public static Repositorio gitInit(String NombreRepositorio, String Autor){
        Repositorio repo = new Repositorio(NombreRepositorio, Autor);
        return repo;
    }
    /**
     * metodo que agrega todos los archivos del workspace al index, si es que aun no estan ahi
     */
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
    /**
     * metodo que agrega determinada cantidad de archivos del workspace al index, si es que aun no estan ahi
     * @param nombreArchivosAdd nombres de los archivos a agregar
     * @return int indicando con un 0 si todos los archivos pertenecian al workspace
     */
    public int gitAdd(String nombreArchivosAdd){
        int estado = 0;/*si este numero permacene en 0 significa que todos los archivos existen en el workspace*/
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
                    /*si entra dentro de este 'if', significa que el archivo no pertenece al Workspace, con lo que 
                    la variable estado cambia*/
                    i++;
                    estado = 1;
                }
                else{
                    this.index.ix.add(this.workspace.ws.get(posicionWs));
                    i++;
                }
            }                
        }
        return estado;
    }
    /**
     * metodo que crea un archivo y lo agrega al workspace
     * @param nameArchivo nombre del archivo
     * @param contenido contenido del archivo
     * @return int que indica con 0 si el archivo no existia previamente
     */
    public int crearArchivo(String nameArchivo, String contenido){
        int estado = 0;/*esta variable indica si el nombre del archivo ya existe, 1 si existe*/
        for(ArchivoDeTextoPlano arch : this.workspace.ws){
            if(arch.nombreArchivo.equals(nameArchivo)){
                estado = 1;
            }
        }
        /*en caso de que la variable estado no cambie, se crea y agrega el archivo, caso contrario, no se crea ni se agrega*/
        if(estado == 0){        
            ArrayList<String> contenidoEnArray = new ArrayList<>();        
            String[] contenidoEnStringSeparado = contenido.split("\n");
            contenidoEnArray.addAll(Arrays.asList(contenidoEnStringSeparado));
            /*hasta aqui se crea un arrayList con el contenido del archivo*/
            ArchivoDeTextoPlano archivo = new ArchivoDeTextoPlano(nameArchivo,contenidoEnArray);/*Esta sera la variable que guarde el archivo que se desea agregar*/
            this.workspace.ws.add(archivo);
        }
        return estado;
    }
    /**
     * metodo que crea un commit en el local repository a partir del contenido del index
     * @param nombreCommit
     * @param nombreAutorCommit
     * @return int que indica con 0 si el commit no existia previamente
     */
    public int gitCommit(String nombreCommit, String nombreAutorCommit){
        int estado = 0;/*esta variable servirá para revisar si el nombre del commit ya existe, 1 es que ya existe*/
        for(Commit commit : this.lRepository.lR){
            if(commit.autor.equals(nombreAutorCommit)){
                estado = 1;
            }
        }
        /*hasta aqui solo se reviso si el nombre del commit ya existe*/
        if(this.index.ix.size()>0){
            if(estado == 0){
                Commit nuevoCommit = new Commit(nombreAutorCommit,nombreCommit,this.index.ix);
                this.lRepository.lR.add(nuevoCommit);
                this.index = new Index();
            }
        }
        else{
            return 3;/*este valor indicara que el index esta vacio*/
        }
        /*con lo arterior se reviso si existen archivos en el index*/
        return estado;
    }
    /**
     * metodo que agrega los commit del local repository en el remote repository
     */
    public void gitPush(){
        int estado = 0;/*esta variable indica si un commit ya existe en el remote, un 1 significa que ya existe*/
        for(Commit commitLR : this.lRepository.lR){
            for(Commit commitRR : this.rRepository.rR){
                if(commitLR.nombreCommit.equals(commitRR.nombreCommit)){
                    estado =  1;
                }
            }
            if(estado == 0){
                this.rRepository.rR.add(commitLR);
            }
            /*esto es en caso de que el estado haya cambiado a 1*/
            estado = 0;
        }
    }
    /**
     * metodo que toma todos los archivos del Remote Repository y los copia en el Workspace
     * @return int con un 1 si el remote repository esta vacio
     */
    public int gitPull(){
        int estado = 0;/*si esta variable no cambia, significa que el remote no esta vacio*/
        if(this.rRepository.rR.size()>0){
            for(Commit commitRR : this.rRepository.rR){
                for(ArchivoDeTextoPlano archRR : commitRR.archivos){
                    for(ArchivoDeTextoPlano archWS : this.workspace.ws){
                        if(archWS.nombreArchivo.equals(archRR.nombreArchivo)){
                            estado = 3;/*este estado se usa para revisar si un archivo ya se encuentra en el workspace*/
                        }
                    }
                    if(estado != 3){
                        this.workspace.ws.add(archRR);
                    }
                    else{
                        estado = 0;
                    }
                }
            }
        }
        else{
            estado = 1;/*este estado indica que el remote esta vacio*/
        }
        return estado;
        
        
        
        /*int cantidadCommit = this.rRepository.rR.size();
        int i =0;
        while(i<cantidadCommit){
            this.workspace = this.workspace.agregarArchCommit(this.workspace,this.rRepository.rR.get(i));
            i++;
        }
        this.rRepository = new RemoteRepository();*/
    }
    /**
     * metodo que debe mostrar una lista con los ultimos 5 commits del Local Repository
     * @return string con la representacion de los ultimos 5 commits
     */
    public String gitLog(){
        String ultimos5Commit = "####--ÚLTIMO-5-COMMITS--####\n";
        for(int i = this.lRepository.lR.size(); i > this.lRepository.lR.size() - 5; i--){
            if(i >= 1){
                ultimos5Commit += "*********************************\n" + this.lRepository.lR.get(i-1).toString();
            }
        }
        return ultimos5Commit;
    }

}