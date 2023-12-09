package Grafica;

import logica.Pizarra;
import logica.command.CommandConfiguracion;

import javax.swing.*;
import java.util.ArrayList;

public class PizarraUML extends JPanel {
    private Pizarra pizarraL;
    public PizarraUML() {
        pizarraL = new Pizarra(new ArrayList<>(), new ArrayList<>()); //arraylist de clases y conectores
        pizarraL.setNombre("Hola"); //La pizarra si o si debe tener un nombre antes de ser GUARDADA O CARGADA
        //asi que al iniciar el programa, hace que siempre se cree una pizarra y que cuando se guarde o
        //carge, pida un nombre con un recuadro de texto


        CommandConfiguracion.CommandConfiguracion(pizarraL); //es necesario llamar a esto para que funcione los botones
        pizarraL.clickBoton1(); //Guarda el archivo
        pizarraL.clickBoton2(); //Carga el archivo
        //pizarraL.clickBoton5(); deberia borrar todos lo que tiene una pizarra, no lo he probado o testeado

        //Si quiere hace vistas, si no dibuja aqui y despues las separo yo
        //Mira la clase pizarra, esta tod0 casi con Javadoc,
        // quizas falten cosas en la logica de pizarra si sigues avanzando

    }
}
