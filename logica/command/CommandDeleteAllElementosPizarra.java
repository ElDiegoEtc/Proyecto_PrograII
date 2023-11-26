package logica.command;

import logica.ElementosPizarra;
import logica.command.Command;

public class CommandDeleteAllElementosPizarra implements Command {

    ElementosPizarra ep;

    public CommandDeleteAllElementosPizarra(ElementosPizarra ep){
        this.ep = ep;
    }

    @Override
    public void execute() {
        ep.DeleteAll();
    }

}
