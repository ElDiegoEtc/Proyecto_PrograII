package logica.clasesdecorator;

public class ClaseMetodo extends Decorador {

    private String metodo;
    public ClaseMetodo(Clase clase, String metodo){
        super(clase);
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
