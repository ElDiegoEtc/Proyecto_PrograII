package logica.command;

import logica.ArchivoPizarra;
import logica.command.Command;

import java.io.Serializable;

public class CommandCargarArchivoPizarra implements Command, Serializable {

    public ArchivoPizarra ar;

    public CommandCargarArchivoPizarra(ArchivoPizarra ar){
        this.ar = ar;
    }

    @Override
    public void execute() {
        ar.cargar();
    }

}
