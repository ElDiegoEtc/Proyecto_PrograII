package logica;
import java.io.Serializable;
import java.util.ArrayList;

import Grafica.PizarraUML;
import logica.command.CommandConfiguracion;
import logica.command.CommandGuardarArchivoPizarra;

import javax.swing.*;

public class main implements Serializable {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pizarra");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PizarraUML p = new PizarraUML();
        frame.add(p);
        frame.setSize(550, 600);
        frame.setVisible(true);
        /*ArrayList<Conector> arrows = new ArrayList<>();
        List<Conector> arrows = new ArrayList<>();

        Conector flecha1 = new SimpleConector(10, 20, Flecha.INHERITANCE, true, 3, 20);
        Conector herenciaConectorDecorator = new HerenciaConectorDecorator(flecha1);
        arrows.add(herenciaConectorDecorator);

        Conector flecha2 = new SimpleConector(15, 25, Flecha.AGGREGATION, false, 4, 30);
        Conector agregationConectorDecorator = new AgregationConectorDecorator(flecha2);
        arrows.add(agregationConectorDecorator);

        Conector flecha3 = new SimpleConector(5, 15, Flecha.COMPOSITION, true, 2, 10);
        Conector composicionConectorDecorator = new ComposicionConectorDecorator(flecha3);
        arrows.add(composicionConectorDecorator);

        Conector flecha4 = new SimpleConector(8, 18, Flecha.ASSOCIATION, false, 5, 25);
        Conector associationConectorDecorator = new AsociationConectorDecorator(flecha4);
        arrows.add(associationConectorDecorator);

        ListConectores listConectores = new ListConectores();
        listConectores.addArrow(flecha1);
        listConectores.addArrow(flecha2);
        listConectores.addArrow(flecha3);
        listConectores.addArrow(flecha4);

        System.out.println("Dibujando flechas individualmente:");
        for (Conector arrow : arrows) {
            arrow.draw();
        }
        }

        System.out.println("\nDibujando todas las flechas en la lista:");
        listConectores.drawAllArrows();

        ConectorManager.serializarConectores(arrows, "conectores.ser");
        List<Conector> deserializedArrows = ConectorManager.deserializarConectores("conectores.ser");

        for (Conector conector : deserializedArrows) {
            conector.draw();
        }*/

    }


}
