package logica;

public class ClaseAtributo extends Clasefactory {
    private String atributo;
    public ClaseAtributo(String titulo, String atributo){
        super(titulo);
        this.atributo = atributo;
    }

    @Override
    public String[] modulo(){
        return new String[]{titulo, atributo};
    }
}
