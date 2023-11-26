package logica;

import logica.Conector;
import logica.ConectorDecorator;

public class HerenciaConectorDecorator extends ConectorDecorator {
    public HerenciaConectorDecorator(Conector decoratedConector) {
        super(decoratedConector);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Añadiendo punta de herencia(triengulo vacio) ");
    }
}