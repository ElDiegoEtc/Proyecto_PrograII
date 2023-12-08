package logica.clasesdecorator;

import java.io.Serializable;

public class ComponenteBase implements Clase, Serializable {
    private String titulo;

    public ComponenteBase(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String[] modulo() {
        return new String[]{titulo};
    }
}
