package logica;

public class AgregationConectorDecorator extends ConectorDecorator {
    public AgregationConectorDecorator(Conector decoratedArrow) {
        super(decoratedArrow);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Añadiendo punta triangular o rombo de agregación");
    }
}