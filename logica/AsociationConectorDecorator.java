package logica;

public class AsociationConectorDecorator extends ConectorDecorator {
    public AsociationConectorDecorator(Conector decoratedArrow) {
        super(decoratedArrow);
    }

    @Override
    public void draw() {
        super.draw();
        setRelleno(true);
        setTipoPunta(true);
        System.out.println("Añadiendo rombo o punta triangular de Agregación");
    }
}