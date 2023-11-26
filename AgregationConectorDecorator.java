public class AgregationConectorDecorator extends ConectorDecorator {
    public AgregationConectorDecorator(Conector decoratedConector) {
        super(decoratedConector);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Añadiendo punta  de agregación(rombo vacio)");
    }
}