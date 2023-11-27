package logica.command;

import logica.ArchivoPizarra;
import logica.command.Command;

public class CommandCargarArchivoPizarra implements Command {

    public ArchivoPizarra ar;

    public CommandCargarArchivoPizarra(ArchivoPizarra ar){
        this.ar = ar;
    }

    @Override
    public void execute() {
        ar.cargar();
    }

}
