package logica;
import java.io.Serializable;
import java.util.ArrayList;
import logica.command.CommandConfiguracion;
import logica.command.CommandGuardarArchivoPizarra;

public class main implements Serializable {
    public static void main(String[] args) {
        /*ArrayList<Conector> arrows = new ArrayList<>();


        Conector flecha1 = new SimpleConector(10, 20, Flecha.INHERITANCE, 3,3,20);
        flecha1.setSerialNumber(1);
        Conector herenciaConectorDecorator = new HerenciaConectorDecorator(flecha1);
        arrows.add(flecha1);
        Conector flecha2 = new SimpleConector(15, 25, Flecha.AGGREGATION, 3,4,30);
        flecha2.setSerialNumber(2);
        Conector agregationConectorDecorator = new AgregationConectorDecorator(flecha2);
        arrows.add(flecha2);

        for (Conector arrow : arrows) {
            arrow.draw();
        }*/

        Pizarra pizarra = new Pizarra(new ArrayList<>(), new ArrayList<>());
        CommandConfiguracion.CommandConfiguracion(pizarra);
        pizarra.clickBoton1();
    }
}
