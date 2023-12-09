package Grafica;

import logica.Pizarra;
import logica.command.CommandConfiguracion;

import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import logica.*;
public class PizarraUML extends JFrame {
    private Pizarra pizarraL;
    private PizarraPanel pizarraPanel;
    private JComboBox<Flecha> tipoFlechaComboBox;

    public PizarraUML() {
        pizarraL = new Pizarra(new ArrayList<>(), new ArrayList<>());
        pizarraL.setNombre("Hola");

        Componentesinicial();
    }
    private void Componentesinicial() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Editor de Diagrama UML");

        /**
         * Crear el panel de la pizarra y agregarlo al JFrame
         */

        pizarraPanel = new PizarraPanel(pizarraL);
        getContentPane().add(pizarraPanel, BorderLayout.CENTER);
        /**
         *Crear el panel de botones y agregarlo al JFrame
         */

        JPanel botonesPanel = new JPanel();
        JButton guardarButton = new JButton("Guardar Pizarra");
        JButton cargarButton = new JButton("Cargar Pizarra");
        JButton BotonBorrarTodo = new JButton("Borrar todo");

        /**
         * Configurar los ActionListener para el botón de guardar
         */

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * Llama al método clickBoton1 en la lógica de la pizarra
                 */
                pizarraL.clickBoton1();
                /**
                 * Actualiza la interfaz grafica
                 */
                pizarraPanel.repaint();
            }
        });

        /**
         * Configurar los ActionListener para el botón de cargar
         */
        cargarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * Llama al método clickBoton2 en la lógica de la pizarra
                 */
                pizarraL.clickBoton2();
                /**
                 * Actualiza la interfaz grafica
                 */
                pizarraPanel.repaint();
            }
        });

        /**
         * Configurar los ActionListener para el botón de borrar
         */
        BotonBorrarTodo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /**
                 * Llama al método clickBoton3 en la lógica de la pizarra
                 */
                pizarraL.clickBoton3();
                /**
                 * Actualiza la interfaz grafica
                 */
                pizarraPanel.repaint();
            }
        });
        /**
         * agregamos los botones al panel
         */

        botonesPanel.add(guardarButton);
        botonesPanel.add(cargarButton);
        botonesPanel.add(BotonBorrarTodo);

        /**
         * Agregamos el panel de botones al JFrame
         */

        getContentPane().add(botonesPanel, BorderLayout.SOUTH);

        /**
         * creamos la lista de opciones de flecha para crear en la parte izquierda
         */
        tipoFlechaComboBox = new JComboBox<>(Flecha.values());
        tipoFlechaComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Flecha selectedFlecha = (Flecha) tipoFlechaComboBox.getSelectedItem();
                /**
                 * aqui actuara segun la eleccion
                 */

            }
        });
        /**
         * Agregamos la lista desplegable al panel  a la izquierda
         */

        getContentPane().add(tipoFlechaComboBox, BorderLayout.WEST);

        pack();
        setLocationRelativeTo(null);
    }

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