public class AsosiacionDecorator extends ConectorDecorator{

    public AsosiacionDecorator(Conector conectorDecorado) {
        super(conectorDecorado);
    }

    @Override
    public void getFlecha() {
        super.getFlecha();
        agregarPuntaAsociacion();
    }


    public void agregarPuntaAsociacion(){
        System.out.println("agregando punta de Asociacion");
    }
}
