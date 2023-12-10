package Grafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

/**
 * este es para crear linear presionaando 2 coordenas
 */

public class DibujoLinea extends JFrame {
    private List<List<Point>> lineas;
    private List<Point> puntos;

    public DibujoLinea() {
        // Configuración básica del JFrame
        setTitle("Dibujo de Línea");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Inicializar la lista de líneas y la lista de puntos actual
        lineas = new ArrayList<>();
        puntos = new ArrayList<>();

        // Agregar un MouseListener al panel de dibujo
        PanelDibujo panelDibujo = new PanelDibujo();
        panelDibujo.addMouseListener(new ManejadorMouse());

        // Agregar el panel al JFrame
        add(panelDibujo);
    }

    // Clase interna para el panel de dibujo
    private class PanelDibujo extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Dibujar líneas utilizando los puntos almacenados en cada lista
            for (List<Point> linea : lineas) {
                if (linea.size() >= 2) {
                    for (int i = 0; i < linea.size() - 1; i++) {
                        Point puntoInicio = linea.get(i);
                        Point puntoFinal = linea.get(i + 1);
                        g.drawLine(puntoInicio.x, puntoInicio.y, puntoFinal.x, puntoFinal.y);
                    }
                }
            }
        }
    }

    // Clase interna para manejar eventos del ratón
    private class ManejadorMouse implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            // Agregar el punto actual a la lista de puntos
            puntos.add(e.getPoint());

            // Si la línea está completa (dos o más puntos), agregarla a la lista de líneas y reiniciar la lista de puntos
            if (puntos.size() >= 2) {
                lineas.add(new ArrayList<>(puntos));
                puntos.clear();
            }

            // Vuelve a dibujar las líneas después de haber seleccionado dos o más puntos
            repaint();
        }

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DibujoLinea ventana = new DibujoLinea();
            ventana.setVisible(true);
        });
    }
}

