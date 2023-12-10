package Grafica.antes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DibujoLinea3 extends JPanel {
    private int xInicial, yInicial;
    private int xFinal, yFinal;

    public void establecerPuntoInicial(int x, int y) {
        xInicial = x;
        yInicial = y;
    }

    public void establecerPuntoFinal() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                xFinal = e.getX();
                yFinal = e.getY();
                repaint(); // Vuelve a pintar el panel para mostrar la línea actualizada
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(xInicial, yInicial, xFinal, yFinal);
    }
}

