public class main {
    public static void main(String[] args) {

        Conector simpleConector = new SimpleConector();

        Conector inheritanceConector = new SerieDireccionDecorator(new HerenciaConectorDecorator(simpleConector), 1, 3);
        inheritanceConector.draw();

        Conector associationConector = new SerieDireccionDecorator(new AsociationConectorDecorator(simpleConector), 2, 1);
        associationConector.draw();

        Conector aggregationConector = new SerieDireccionDecorator(new AgregationConectorDecorator(simpleConector), 3, 2);
        aggregationConector.draw();

        Conector compositionConector = new SerieDireccionDecorator(new ComposicionConectorDecorator(simpleConector), 4, 1);
        compositionConector.draw();


    }
}
