public class HerenciaDecorator extends ConectorDecorator {
    public HerenciaDecorator(Conector conectorDecorado) {
        super(conectorDecorado);
    }

    @Override
    public void getFlecha() {
        super.getFlecha();
        agregarPuntaHerencia();
    }


    public void agregarPuntaHerencia(){
        System.out.println("agregando punta de herencia");
    }
}
