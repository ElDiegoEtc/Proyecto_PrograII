package logica.command;

import logica.ArchivoPizarra;
import logica.command.Command;

public class CommandGuardarArchivoPizarra implements Command {

    public ArchivoPizarra ar;

    public CommandGuardarArchivoPizarra(ArchivoPizarra ar){
        this.ar = ar;
    }

    @Override
    public void execute() {
        ar.guardar();
    }

}
