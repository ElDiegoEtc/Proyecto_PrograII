public class CommandCargarArchivoPizarra implements Command {

    ArchivoPizarra ar;

    public CommandCargarArchivoPizarra(ArchivoPizarra ar){
        this.ar = ar;
    }

    @Override
    public void execute() {
        ar.cargar();
    }

}
