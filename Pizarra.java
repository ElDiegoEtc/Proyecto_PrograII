public class Pizarra {
    private Command boton1;
    private Command boton2;


    public void clickBoton1() {
        boton1.execute();
    }

    public void clickBoton2() {
        boton2.execute();
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

}
