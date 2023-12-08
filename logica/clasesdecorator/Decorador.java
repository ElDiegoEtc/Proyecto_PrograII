package logica.clasesdecorator;

import java.io.Serializable;

public abstract class Decorador implements Clase, Serializable {

    public Clase component;

    public Decorador(Clase component){
        this.component = component;
    }
    @Override
    public String[] modulo(){
        return component.modulo();
    }
}
