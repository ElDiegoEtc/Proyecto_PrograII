package logica;

public abstract class ConectorDecorator implements Conector {
    protected Conector decoratedArrow;

    public ConectorDecorator(Conector decoratedArrow) {
        this.decoratedArrow = decoratedArrow;
    }

    @Override
    public void draw() {
        decoratedArrow.draw();
    }

    @Override
    public void setSerialNumber(int serialNumber) {
        decoratedArrow.setSerialNumber(serialNumber);
    }
}

