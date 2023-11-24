public class ComposicionDecorator extends ConectorDecorator {
    public ComposicionDecorator(Conector conectorDecorado) {
        super(conectorDecorado);
    }

    @Override
    public void getFlecha() {
        super.getFlecha();
        agregarPuntaComposicion();
    }


    public void agregarPuntaComposicion(){
        System.out.println("agregando punta de Composicion");
    }
}
