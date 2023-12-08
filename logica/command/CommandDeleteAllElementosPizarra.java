package logica.command;

import logica.ElementosPizarra;
import logica.command.Command;

import java.io.Serializable;

public class CommandDeleteAllElementosPizarra implements Command, Serializable {

    public ElementosPizarra ep;

    public CommandDeleteAllElementosPizarra(ElementosPizarra ep){
        this.ep = ep;
    }

    @Override
    public void execute() {
        ep.DeleteAll();
    }

}
