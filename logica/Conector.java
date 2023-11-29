package logica;
import java.awt.*;

import javax.swing.*;
import java.awt.*;
public interface Conector {

    void draw();

    /**
     *
     * @param serialNumber establece el numero de serie(1 para unicamente la derecha, 2 para la izquierda y
     *                    3 para ambos lados)
     */
    void setSerialNumber(int serialNumber);
}