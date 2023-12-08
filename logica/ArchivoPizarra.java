package logica;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ArchivoPizarra {

    public void guardar(){
        File archivo = new File("LaPizarra");

    }
    public void cargar(){

    }

}


   /* public void guardar(Pizarra pizarra, String nombreArchivo){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            out.writeObject(pizarra);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/