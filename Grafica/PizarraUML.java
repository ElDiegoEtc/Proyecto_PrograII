package Grafica;

import logica.Pizarra;
import logica.command.CommandConfiguracion;

import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import logica.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import logica.command.CommandCargarArchivoPizarra;
import java.io.ObjectInputStream;
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
                /**
                 * creamos un cuadro para seleccionar el archivo
                 */
                JFileChooser fileChooser = new JFileChooser();
                /**
                 *  Esto muestra el cuadro de diálogo para que el usuario elija y obtener su opcion
                 */
                int result = fileChooser.showOpenDialog(PizarraUML.this);

                if (result == JFileChooser.APPROVE_OPTION) {
                    /**
                     * obtenemos el aarchivo seleccionado por el usuario
                     */
                    File selectedFile = fileChooser.getSelectedFile();
                    /**
                     * creamos instanciaa de pizrra
                     * y comaando para caargar archivo de pizarra
                     */

                    ArchivoPizarra archivoPizarra = new ArchivoPizarra();
                    CommandCargarArchivoPizarra commandCargarArchivo = new CommandCargarArchivoPizarra(archivoPizarra, pizarraL);
/**
 * creamos la exception
 */
                    try {
                        /**
                         * abre y lee los archivos seleccionados
                         */
                        FileInputStream fileInputStream = new FileInputStream(selectedFile);
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                        /**
                         * Ejecutar el comando para cargar la pizarra desde el archivo
                         */
                        commandCargarArchivo.execute();
                        /**
                         * cierra flujos de entrada
                         */

                        objectInputStream.close();
                        fileInputStream.close();
                    }catch (IOException ex) {
                        /**
                         * maneja errores cuando el archivo no se puede leer
                         */
                        ex.printStackTrace();
                        System.err.println("Error de IO al cargar la pizarra desde el archivo: " + ex.getMessage());
                    }
                    /**
                     * actualiza interfaz grafica luego de guardar pizarra
                     */

                    nombrePizarraLabel.setText(pizarraL.getNombre());
                    pizarraPanel.repaint();
                } else {
                    /**
                     * no hace nada si el usuario cancela la ejecucion
                     */
                }
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
