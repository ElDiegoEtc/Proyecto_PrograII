package logica;

import java.util.List;
import java.util.ArrayList;

public class ListConectores {
    private List<Conector> conectorList = new ArrayList<>();

    public void addArrow(Conector conector) {
        conectorList.add(conector);
    }

    public void drawAllArrows() {
        for (Conector arrow : conectorList) {
            arrow.draw();
        }
    }
}