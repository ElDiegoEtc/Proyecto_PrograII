import javax.swing.*;
import java.awt.*;
public class HerenciaConectorDecorator extends ConectorDecorator {
    public HerenciaConectorDecorator(Conector decoratedConector) {
        super(decoratedConector);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Añadiendo punta roja de herencia");
    }
}