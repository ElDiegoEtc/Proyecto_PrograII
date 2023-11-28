package logica;

public abstract class Clasefactory {
    public String titulo;

    protected Clasefactory(String titulo) {
        this.titulo = titulo;
    }
    public abstract String[] modulo();
}
