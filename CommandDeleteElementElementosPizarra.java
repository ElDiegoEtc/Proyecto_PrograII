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
