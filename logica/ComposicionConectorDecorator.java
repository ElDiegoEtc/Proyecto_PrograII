package logica;

public class ComposicionConectorDecorator extends ConectorDecorator {
    public ComposicionConectorDecorator(Conector decoratedArrow) {
        super(decoratedArrow);
    }

    @Override
    public void draw() {
        super.draw();
        setRelleno(true);
        setTipoPunta(false);
        System.out.println("Añadiendo rombo o punta triangular de composición");
    }
}
