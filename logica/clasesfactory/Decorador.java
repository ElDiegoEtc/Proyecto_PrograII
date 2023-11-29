package logica.clasesfactory;

public abstract class Decorador implements Clase {
    public Clase component;

    public Decorador(Clase component){
        this.component = component;
    }
    @Override
    public String[] modulo(){
        return component.modulo();
    }
}
