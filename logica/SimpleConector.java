package logica;
import java.io.Serializable;

import logica.Conector;

public class SimpleConector implements Conector, Serializable {
    private int x, y;
    private Flecha arrowType;
    private boolean serialNumber;
    private int x_j;
    private int y_j;
    private boolean Relleno;
    private boolean tipoPunta;

    public SimpleConector(int x_i, int y_i, Flecha arrowType, boolean serialNumber, int x_j, int y_j) {
        this.x = x_i;
        this.y = y_i;
        this.arrowType = arrowType;
        this.serialNumber = serialNumber;
        this.x_j = x_j;
        this.y_j = y_j;
        this.Relleno = arrowType.getRellenoPredeterminado();
        this.tipoPunta = arrowType.getTipoPuntaPredeterminado();
    }

    @Override
    public void draw() {
        System.out.println("Dibujando flecha de tipo " + arrowType + " inicia en coordenada(" + x + ", " + y + ") con número de serie " +
                serialNumber + " con relleno " + Relleno + " y tipo de punta " + (tipoPunta ? "triangular" : "rombo")+", finaliza en la coordenada ("+x_j+","+y_j+")");
    }

    @Override
    public void setSerialNumber(boolean serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void setRelleno(boolean setRelleno) {
        this.Relleno = setRelleno;
    }

    @Override
    public void setTipoPunta(boolean tipoPunta) {
        this.tipoPunta = tipoPunta;
    }

    public boolean isSerialNumber() {
        return serialNumber;
    }
}
