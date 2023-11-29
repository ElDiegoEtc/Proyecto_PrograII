package logica;
import logica.clasesfactory.Clase;
import logica.command.Command;
import java.io.Serializable;
import java.util.ArrayList;

public class Pizarra implements Serializable {
    private Command boton1, boton2, boton3, boton4, boton5;
    private ArrayList<Conector> conectores;
    private ArrayList<Clase> clases;


    public void listaconectores(){
        conectores = new ArrayList<>();
    }
    public void listaclases(){
        clases = new ArrayList<>();
    }

    public void addConector(Conector conector) {
        conectores.add(conector);
    }
    public ArrayList<Conector> getArrayconectores() {
        return conectores;
    }


    public void addClases(Clase clase) {
        clases.add(clase);
    }
    public ArrayList<Clase> getArrayclases() {
        return clases;
    }


    public void clickBoton1() {
        boton1.execute();
    }

    public void clickBoton2() {
        boton2.execute();
    }

    public void clickBoton3() {
        boton3.execute();
    }

    public void clickBoton4() {
        boton4.execute();
    }
    public void clickBoton5() {
        boton5.execute();
    }











    public Command getBoton1() {
        return boton1;
    }

    public void setBoton1(Command boton1) {
        this.boton1 = boton1;
    }

    public Command getBoton2() {
        return boton2;
    }
    public void setBoton2(Command boton2) {
        this.boton2 = boton2;
    }
    public Command getBoton3() {
        return boton3;
    }
    public void setBoton3(Command boton3) {
        this.boton3 = boton3;
    }
    public Command getBoton4() {
        return boton4;
    }
    public void setBoton4(Command boton4) {
        this.boton4 = boton4;
    }
    public Command getBoton5() {
        return boton5;
    }
    public void setBoton5(Command boton5) {
        this.boton5 = boton5;
    }


}
