package logica.command;

import logica.ArchivoPizarra;
import logica.Pizarra;

import java.io.Serializable;

public class CommandGuardarArchivoPizarra implements Command, Serializable {

    private ArchivoPizarra ar;
    private Pizarra pi;
    private String nombre;



    public CommandGuardarArchivoPizarra(ArchivoPizarra ar, Pizarra pi, String nombre){
        this.ar = ar;
        this.pi = pi;
        this.nombre = nombre;
    }

    @Override
    public void execute() {
        ar.guardar(pi, nombre);
    }

}
