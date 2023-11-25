public class CommandConfiguracion {

    public static void CommandConfiguracion(Pizarra p) {
        ArchivoPizarra ar = new ArchivoPizarra();

        p.setBoton1(new CommandGuardarArchivoPizarra(ar));
        p.setBoton2(new CommandCargarArchivoPizarra(ar));

    }

}
