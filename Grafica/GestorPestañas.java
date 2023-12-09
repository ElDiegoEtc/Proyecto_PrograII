package Grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestorPestañas extends JFrame {
    private JTabbedPane tabbedPane;

    public GestorPestañas() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Editor de Diagrama UML");

        tabbedPane = new JTabbedPane();
        getContentPane().add(tabbedPane, BorderLayout.CENTER);

        JButton addButton = new JButton("+ Nueva Pestaña");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PizarraUML nuevaPizarra = new PizarraUML();
                tabbedPane.addTab("Pestaña " + (tabbedPane.getTabCount() + 1), nuevaPizarra);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }
}
