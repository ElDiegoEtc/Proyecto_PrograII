package logica.clasesfactory;

public class ClaseMetodo extends Decorador {

    private String metodo;
    public ClaseMetodo(Component componente, String metodo){
        super(componente);
        this.metodo = metodo;
    }
    @Override
    public String[] modulo(){
        String[] moduloBase = super.modulo();
        String[] moduloConMetodo = new String[moduloBase.length + 1];
        System.arraycopy(moduloBase, 0, moduloConMetodo, 0, moduloBase.length);
        moduloConMetodo[moduloBase.length] = metodo;
        return moduloConMetodo;
    }
}
