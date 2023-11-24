public class AgregacionDecorator extends ConectorDecorator{
    public AgregacionDecorator(Conector conectorDecorado) {
        super(conectorDecorado);
    }

    @Override
    public void getFlecha() {
        super.getFlecha();
        agregarPuntaAgregacion();
    }


    public void agregarPuntaAgregacion(){
        System.out.println("agregando punta de Agregacion");
    }
}
