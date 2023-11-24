public abstract class ConectorDecorator extends Conector {
    protected Conector conectorDecorado;

    public ConectorDecorator(Conector conectorDecorado) {
        this.conectorDecorado = conectorDecorado;
    }
    @Override
    public void getFlecha() {
        conectorDecorado.getFlecha();

    }
}
