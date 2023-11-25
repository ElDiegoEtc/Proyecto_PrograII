public class CommandGuardarArchivoPizarra implements Command {

    ArchivoPizarra ar;

    public CommandGuardarArchivoPizarra(ArchivoPizarra ar){
        this.ar = ar;
    }

    @Override
    public void execute() {
        ar.guardar();
    }

}
