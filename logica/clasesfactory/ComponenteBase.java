package logica.clasesfactory;

public class ComponenteBase implements Component {
    private String titulo;

    public ComponenteBase(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String[] modulo() {
        return new String[]{titulo};
    }
}
