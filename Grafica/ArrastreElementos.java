package Grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * esto es para arraastrar elementos
 */
public class ArrastreElementos extends JFrame {
    private JPanel pizarra;
    private JLabel elementoArrastrable;

    private int offsetX, offsetY;

    public ArrastreElementos() {
        setTitle("Arrastre de Elementos");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pizarra = new JPanel();
        pizarra.setLayout(null);

        // Crear un elemento arrastrable (en este caso, un JLabel)
        elementoArrastrable = new JLabel("Arrastra este texto");
        elementoArrastrable.setBounds(50, 50, 150, 30);
        elementoArrastrable.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                offsetX = e.getX();
                offsetY = e.getY();
            }
        });
        elementoArrastrable.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen() - offsetX;
                int y = e.getYOnScreen() - offsetY;
                elementoArrastrable.setLocation(x, y);
            }
        });

        pizarra.add(elementoArrastrable);
        add(pizarra);

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ArrastreElementos ventana = new ArrastreElementos();
            ventana.setVisible(true);
        });
    }
}