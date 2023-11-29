package logica.clasesfactory;

public class ComponenteBase implements Clase {
    private String titulo;

    public ComponenteBase(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String[] modulo() {
        return new String[]{titulo};
    }
}
