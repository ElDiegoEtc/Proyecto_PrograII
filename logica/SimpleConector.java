package logica;

import logica.Conector;

public class SimpleConector implements Conector {
    @Override
    public void draw() {
        System.out.println("Dibujando conector simple sin punta");
    }
}