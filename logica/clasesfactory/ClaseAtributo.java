package logica.clasesfactory;

public class ClaseAtributo extends Decorador {
    private String atributo;
    public ClaseAtributo(Component componente, String atributo){
        super(componente);
        this.atributo = atributo;
    }

    @Override
    public String[] modulo(){
        String[] moduloBase = super.modulo();
        String[] moduloConAtributo = new String[moduloBase.length + 1];
        System.arraycopy(moduloBase, 0, moduloConAtributo, 0, moduloBase.length);
        moduloConAtributo[moduloBase.length] = atributo;
        return moduloConAtributo;
    }
}
