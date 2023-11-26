public class main {
    public static void main(String[] args) {

        Conector simpleConector = new SimpleConector();

        Conector herenciaConector1 = new SerieDireccionDecorator(new HerenciaConectorDecorator(simpleConector), 1, 3);
        herenciaConector1.draw();

        Conector conectorasociacion1 = new SerieDireccionDecorator(new AsociationConectorDecorator(simpleConector), 2, 1);
        conectorasociacion1.draw();

        Conector conectoragregacion1 = new SerieDireccionDecorator(new AgregationConectorDecorator(simpleConector), 3, 2);
        conectoragregacion1.draw();


    }
}
