package logica;

import logica.clasesdecorator.Clase;
import logica.clasesdecorator.ClaseAtributo;
import logica.clasesdecorator.ClaseMetodo;
import logica.clasesdecorator.ComponenteBase;

import java.io.Serializable;
import java.util.ArrayList;

public class ElementosPizarra implements Serializable {
    public void AddClaseAtrbuto(Pizarra p){
        Clase componenteBase = new ComponenteBase("<Titulo>");
        p.addClase(new ClaseAtributo(componenteBase, "<Atributos>"));
    }
    public void AddClaseMetodo(Pizarra p){
        Clase componenteBase = new ComponenteBase("<Titulo>");
        p.addClase(new ClaseMetodo(componenteBase, "<Metodos>"));
    }
    public void AddClaseCompleta(Pizarra p){
        Clase componenteBase = new ComponenteBase("<Titulo>");
        Clase claseAtributo = new ClaseAtributo(componenteBase, "<Atrivuto>");
        p.addClase(new ClaseMetodo(claseAtributo, "<Metodos>"));
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
