package Grafica;

import logica.Pizarra;
import logica.clasesdecorator.Clase;
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
    private int numeroClases;

    public PizarraUML() {
        pizarraL = new Pizarra(new ArrayList<>(), new ArrayList<>());
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
        JPanel clasesPanel = new JPanel();
        clasesPanel.setLayout(new BoxLayout(clasesPanel, BoxLayout.Y_AXIS));

        JButton guardarButton = new JButton("Guardar Pizarra");
        JButton cargarButton = new JButton("Cargar Pizarra");
        JButton botonBorrarTodo = new JButton("Borrar todo");
        JButton anadirClase = new JButton("Clase Completa");
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
                String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nombre EXACTO de pizarra a cargar:");
                pizarraL.setNombre(nuevoNombre);
                nombrePizarraLabel.setText(pizarraL.getNombre());
                pizarraL.clickBoton2();
                pizarraPanel.repaint();
            }
        });

        /**
         * Escucha si se presiona el boton, si lo hace, entonces crea una nueva clase, se le asigna su vista
         * y deja arrastrarlo visualmente
         */
        anadirClase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizarraL.clickBoton6(); //crea un objeto en un arraylist
                numeroClases = pizarraL.getArrayclases().size();
                Clase actual = pizarraL.getArrayclases().get(numeroClases -1);
                ClaseCompletaVista cv = new ClaseCompletaVista();
                //cv.paint(g, actual);

                pizarraPanel.repaint();
            }
        });


        botonBorrarTodo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizarraL.clickBoton5();
                pizarraPanel.repaint();
            }
        });


        botonesPanel.add(guardarButton);
        botonesPanel.add(cargarButton);
        botonesPanel.add(botonBorrarTodo);
        add(botonesPanel, BorderLayout.SOUTH);

        clasesPanel.add(anadirClase);
        add(clasesPanel, BorderLayout.WEST);

        /**Se hace un Jcombobox para seleccionar que conector dibujar, tomando de base
         * las caracteristicas de las flechas definidas en la logica
         */
        tipoFlechaComboBox = new JComboBox<>(Flecha.values());
        tipoFlechaComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Flecha selectedFlecha = (Flecha) tipoFlechaComboBox.getSelectedItem();
                // Acciones según la selección
            }
        });
        clasesPanel.add(tipoFlechaComboBox);
        add(clasesPanel, BorderLayout.WEST);

    }
}
