import javax.swing.*;
import java.awt.*;
public class SimpleConector implements Conector {
    @Override
    public void draw() {
        System.out.println("Dibujando conector simple sin punta");
    }
}