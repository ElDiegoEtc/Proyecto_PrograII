package logica;

import logica.Conector;
import logica.ConectorDecorator;

public class HerenciaConectorDecorator extends ConectorDecorator {
    public HerenciaConectorDecorator(Conector decoratedArrow) {
        super(decoratedArrow);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Añadiendo punta triangular de herencia");
    }
}