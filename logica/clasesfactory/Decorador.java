package logica.clasesfactory;

public abstract class Decorador implements Component {
    public Component component;

    public Decorador(Component component){
        this.component = component;
    }
    @Override
    public String[] modulo(){
        return component.modulo();
    }
}
