package logica;

public class ComposicionConectorDecorator extends ConectorDecorator {
    public ComposicionConectorDecorator(Conector decoratedConector) {
        super(decoratedConector);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Añadiendo punta de composición(rombo relleno)");
    }
}