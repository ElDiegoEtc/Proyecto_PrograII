package logica;
import java.util.List;
import java.util.ArrayList;
import logica.AgregationConectorDecorator;
import logica.AsociationConectorDecorator;
import logica.Conector;
import logica.HerenciaConectorDecorator;

public class main {
    public static void main(String[] args) {
        ArrayList<Conector> arrows = new ArrayList<>();


        Conector flecha1 = new SimpleConector(10, 20, Flecha.INHERITANCE, 3);
        flecha1.setSerialNumber(1);
        Conector herenciaConectorDecorator = new HerenciaConectorDecorator(flecha1);
        arrows.add(flecha1);
        Conector flecha2 = new SimpleConector(15, 25, Flecha.AGGREGATION, 3);
        flecha2.setSerialNumber(2);
        Conector agregationConectorDecorator = new AgregationConectorDecorator(flecha2);
        arrows.add(flecha2);

        for (Conector arrow : arrows) {
            arrow.draw();
        }


    }
}
