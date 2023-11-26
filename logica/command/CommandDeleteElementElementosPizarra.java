package logica.command;

import logica.ElementosPizarra;
import logica.command.Command;

public class CommandDeleteElementElementosPizarra implements Command {

    ElementosPizarra ep;

    public CommandDeleteElementElementosPizarra(ElementosPizarra ep){
        this.ep = ep;
    }

    @Override
    public void execute() {
        ep.DeleteElement();
    }

}
