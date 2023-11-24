public class main {
    public static void main(String[] args) {
        Conector c1=new ComposicionDecorator(new ConectorSimple());
        c1.getFlecha();

    }
}
