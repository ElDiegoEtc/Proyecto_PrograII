import javax.swing.*;
import java.awt.*;
public abstract class ConectorDecorator implements Conector {
    protected Conector decoratedConector;

    public ConectorDecorator(Conector decoratedConector) {
        this.decoratedConector = decoratedConector;
    }

    @Override
    public void draw() {
        decoratedConector.draw();
    }
}