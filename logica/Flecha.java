package logica;

public enum Flecha {

    SIMPLE(false, true),  // Triangular: false, Relleno: true
    INHERITANCE(false, true),  // Triangular: false, Relleno: true
    ASSOCIATION(true, true),  // Triangular: true(es  rombo), Relleno: true
    AGGREGATION(true, false),  // Triangular: true, Relleno: false
    COMPOSITION(false, true);  // Triangular: false, Relleno: true

    private final boolean tipoPuntaPredeterminado;
    private final boolean rellenoPredeterminado;

    Flecha(boolean tipoPuntaPredeterminado, boolean rellenoPredeterminado) {
        this.tipoPuntaPredeterminado = tipoPuntaPredeterminado;
        this.rellenoPredeterminado = rellenoPredeterminado;
    }
    public boolean getTipoPuntaPredeterminado() {
        return tipoPuntaPredeterminado;
    }

    public boolean getRellenoPredeterminado() {
        return rellenoPredeterminado;
    }
}