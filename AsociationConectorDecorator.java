public class AsociationConectorDecorator extends ConectorDecorator {
    public AsociationConectorDecorator(Conector decoratedConector) {
        super(decoratedConector);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Añadiendo punta verde de asociación");
    }
}