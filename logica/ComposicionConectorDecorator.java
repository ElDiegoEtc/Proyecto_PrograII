package logica;

public class ComposicionConectorDecorator extends ConectorDecorator {
    /**
     *
     * @param decoratedArrow
     */
    public ComposicionConectorDecorator(Conector decoratedArrow) {
        super(decoratedArrow);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Añadiendo rombo de composición");
    }
}