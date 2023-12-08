package logica.command;

import logica.ElementosPizarra;
import logica.command.Command;

import java.io.Serializable;

public class CommandAddElementElementosPizarra implements Command, Serializable {

    public ElementosPizarra ep;

    public CommandAddElementElementosPizarra(ElementosPizarra ep){
        this.ep = ep;
    }

    @Override
    public void execute() {
        ep.AddElement();
    }

}
