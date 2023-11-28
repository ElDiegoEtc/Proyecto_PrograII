package logica;

public class AsociationConectorDecorator extends ConectorDecorator {
    public AsociationConectorDecorator(Conector decoratedArrow) {
        super(decoratedArrow);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Añadiendo rombo de Agregacion");
    }
}