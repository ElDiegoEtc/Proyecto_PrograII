package logica;

import logica.Conector;

public class SimpleConector implements Conector {
    private int x, y;
    private Flecha arrowType;
    private int serialNumber;// enum
    private int x_j;
    private int y_j;


    public SimpleConector(int x_i, int y_i, Flecha arrowType, int serialNumber,int x_j,int y_j) {
        this.x = x_i;
        this.y = y_i;
        this.arrowType = arrowType;
        this.serialNumber = serialNumber;
        this.x_j = x_j;
        this.y_j= y_j;
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