package Grafica;
import logica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Clase que representa la interfaz gráfica
/*public class VistaHerencia {
    private JFrame frame;
    private JPanel drawingPanel;
    private JButton inheritanceButton;
    private int currentConnectorType;

    public VistaHerencia() {
        // Inicializar la interfaz gráfica
        frame = new JFrame("prueba de herencia");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawConnectors(g);
            }
        };

        inheritanceButton = new JButton("Dibujar Flechas de Herencia");
        inheritanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cambiar el tipo de conector al hacer clic en el botón
                if (currentConnectorType == 0) {
                    currentConnectorType = Flecha.INHERITANCE.ordinal();
                    inheritanceButton.setText("Dejar de Dibujar Flechas de Herencia");
                } else {
                    currentConnectorType = 0;
                    inheritanceButton.setText("Dibujar Flechas de Herencia");
                }
                drawingPanel.repaint();
            }
        });

        frame.setLayout(new BorderLayout());
        frame.add(inheritanceButton, BorderLayout.NORTH);
        frame.add(drawingPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    // Método para dibujar los conectores en el panel
    private void drawConnectors(Graphics g) {
        Conector connector;

        switch (currentConnectorType) {
            case 0:
                break;  // No hacer nada si no se está dibujando flechas de herencia
            case 1:
                // Dibujar flechas de herencia con punta solo a la derecha
                connector = new SerieDireccionDecorator(new HerenciaConectorDecorator(new SimpleConector()), 1, 1);
                connector.draw();
                break;
            case 2:
                // Dibujar flechas de herencia con punta solo a la izquierda
                connector = new SerieDireccionDecorator(new HerenciaConectorDecorator(new SimpleConector()), 1, 2);
                connector.draw();
                break;
            case 3:
                // Dibujar flechas de herencia con punta en ambas direcciones
                connector = new SerieDireccionDecorator(new HerenciaConectorDecorator(new SimpleConector()), 1, 3);
                connector.draw();
                break;
            default:
                break;
        }
    }

    );
    }
}
*/
