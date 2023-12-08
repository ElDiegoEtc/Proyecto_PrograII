package logica;

import java.io.Serializable;
import java.util.ArrayList;

public class ElementosPizarra implements Serializable {
    public void AddElement(){

    }
    public void DeleteElement(){

    }

    /** Metodo que sirve para borrar todas las clases y conectores del UML almacenadas en sus arraylists
     * en la pizarra p
     * @param p: instancia de la pizarra donde se borrara sus contenidos
     */
    public void DeleteAll(Pizarra p){
        ArrayList conectores = p.getArrayconectores();
        ArrayList clases = p.getArrayclases();
        for (int i = 0; i < conectores.size(); i++) {
            conectores.remove(i);
        }
        for (int i = 0; i < clases.size(); i++) {
            clases.remove(i);
        }
    }
}
