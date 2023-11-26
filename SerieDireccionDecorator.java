public class SerieDireccionDecorator extends ConectorDecorator {
    private int serieNumber;
    private int direction;

    public SerieDireccionDecorator(Conector decoratedConector, int serialNumber, int direction) {
        super(decoratedConector);
        this.serieNumber = serialNumber;
        this.direction = direction;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Número de serie: " + serieNumber);
        System.out.println("Dirección de la punta: " + direction);
    }
}