package logica;

public class ClaseCompleta extends Clasefactory {
    private String atributo;
    private String metodo;

    public ClaseCompleta(String titulo, String atributo, String metodo){
        super(titulo);
        this.atributo = atributo;
        this.metodo = metodo;
    }

    @Override
    public String[] modulo(){
        return new String[]{titulo, atributo, metodo};
    }
}
