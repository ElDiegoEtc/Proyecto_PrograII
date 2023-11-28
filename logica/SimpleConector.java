package logica;

import logica.Conector;

public class SimpleConector implements Conector {
    private int x, y;
    private Flecha arrowType;
    private int serialNumber;

    public SimpleConector(int x, int y, Flecha arrowType, int serialNumber) {
        this.x = x;
        this.y = y;
        this.arrowType = arrowType;
        this.serialNumber = serialNumber;
    }

    @Override
    public void draw() {
        System.out.println("Dibujando flecha de tipo " + arrowType + " en (" + x + ", " + y + ") con número de serie " + serialNumber);
    }

    @Override
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}