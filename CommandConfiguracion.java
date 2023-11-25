public class CommandConfiguracion {

    public static void CommandConfiguracion(Pizarra p) {
        ArchivoPizarra ar = new ArchivoPizarra();
        ElementosPizarra ep = new ElementosPizarra();

        p.setBoton1(new CommandGuardarArchivoPizarra(ar));
        p.setBoton2(new CommandCargarArchivoPizarra(ar));

        p.setBoton3(new CommandAddElementElementosPizarra(ep));
        p.setBoton4(new CommandDeleteElementElementosPizarra(ep));
        p.setBoton5(new CommandDeleteAllElementosPizarra(ep));

    }
}
