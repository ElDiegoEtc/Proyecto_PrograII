package Grafica.antes;

import javax.swing.*;
import java.awt.*;

public class ClaseVista extends JPanel {

    public ClaseVista() {
        setLayout(new BorderLayout());

        // Crea un JTextArea dentro de un JScrollPane
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Habilita el ajuste automático del tamaño del JTextArea
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        add(scrollPane, BorderLayout.CENTER);
    }
}

