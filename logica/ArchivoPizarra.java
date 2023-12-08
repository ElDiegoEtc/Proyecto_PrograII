package logica;

import java.io.*;

public class ArchivoPizarra implements Serializable {


    public void cargar() {

    }

    public void guardar(Pizarra pizarra, String nombreArchivo) {
        try (FileOutputStream fileOut = new FileOutputStream(nombreArchivo);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(pizarra);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}