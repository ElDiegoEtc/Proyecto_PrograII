package logica;
import java.io.Serializable;
import java.util.ArrayList;


import Grafica.PizarraUML;
import logica.command.CommandConfiguracion;
import logica.command.CommandGuardarArchivoPizarra;

import javax.swing.*;

public class main implements Serializable {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PizarraUML editorUML = new PizarraUML();
                editorUML.setVisible(true);
            }
        });
    }

    }



