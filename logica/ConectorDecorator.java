package logica;
import java.io.Serializable;

public abstract class ConectorDecorator implements Conector, Serializable  {
    protected Conector decoratedArrow;
    protected boolean tipoPunta;
    protected boolean Relleno;

    public ConectorDecorator(Conector decoratedArrow) {
        this.decoratedArrow = decoratedArrow;
    }

    @Override
    public void draw() {
        decoratedArrow.draw();
        setRelleno(Relleno);
        setTipoPunta(tipoPunta);
    }

    @Override
    public void setSerialNumber(boolean serialNumber) {
        decoratedArrow.setSerialNumber(serialNumber);
    }

    @Override
    public void setRelleno(boolean Relleno) {
        this.Relleno = Relleno;
    }

    @Override
    public void setTipoPunta(boolean tipoPunta) {
        this.tipoPunta = tipoPunta;
    }
}
