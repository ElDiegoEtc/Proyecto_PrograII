public class CommandAddElementElementosPizarra implements Command {

    ElementosPizarra ep;

    public CommandAddElementElementosPizarra(ElementosPizarra ep){
        this.ep = ep;
    }

    @Override
    public void execute() {
        ep.AddElement();
    }

}
