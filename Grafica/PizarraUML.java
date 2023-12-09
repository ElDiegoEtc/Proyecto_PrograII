package Grafica;

import logica.Pizarra;
import logica.command.CommandConfiguracion;

import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import logica.*;

public class PizarraUML extends JPanel {
    private Pizarra pizarraL;
    private PizarraPanel pizarraPanel;
    private JComboBox<Flecha> tipoFlechaComboBox;
    private JLabel nombrePizarraLabel;
    private boolean primeraVez = true;

    public PizarraUML() {
        pizarraL = new Pizarra(new ArrayList<>(), new ArrayList<>());
        pizarraL.setNombre("Hola");
        CommandConfiguracion.CommandConfiguracion(pizarraL);
        ComponentesInicial();
    }

    private void ComponentesInicial() {
        setLayout(new BorderLayout());

        pizarraPanel = new PizarraPanel(pizarraL);
        add(pizarraPanel, BorderLayout.CENTER);

        nombrePizarraLabel = new JLabel("Nombre de la Pizarra: " + pizarraL.getNombre());
        add(nombrePizarraLabel, BorderLayout.NORTH);

        JPanel botonesPanel = new JPanel();
        JButton guardarButton = new JButton("Guardar Pizarra");
        JButton cargarButton = new JButton("Cargar Pizarra");
        JButton botonBorrarTodo = new JButton("Borrar todo");

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (primeraVez) {
                    String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre de la pizarra:");

                    if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
                        pizarraL.setNombre(nuevoNombre);
                        primeraVez = false;
                    }
                }
                nombrePizarraLabel.setText(pizarraL.getNombre());
                pizarraL.clickBoton1();
                pizarraPanel.repaint();
            }
        });

        cargarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizarraL.clickBoton2();
                pizarraPanel.repaint();
            }
        });

        botonBorrarTodo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizarraL.clickBoton3();
                pizarraPanel.repaint();
            }
        });

        botonesPanel.add(guardarButton);
        botonesPanel.add(cargarButton);
        botonesPanel.add(botonBorrarTodo);

        add(botonesPanel, BorderLayout.SOUTH);

        tipoFlechaComboBox = new JComboBox<>(Flecha.values());
        tipoFlechaComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Flecha selectedFlecha = (Flecha) tipoFlechaComboBox.getSelectedItem();
                // Acciones según la selección
            }
        });

        add(tipoFlechaComboBox, BorderLayout.WEST);
    }


}
