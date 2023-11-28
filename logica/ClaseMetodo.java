package logica;

public class ClaseMetodo extends Clasefactory {

    private String metodo;
    public ClaseMetodo(String titulo, String metodo){
        super(titulo);
        this.metodo = metodo;
    }
    @Override
    public String[] modulo(){
        return new String[]{titulo, metodo};
    }
}
