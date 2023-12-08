package logica;
import java.awt.*;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public interface Conector extends Serializable {
    void draw();

    void setSerialNumber(boolean serialNumber);

    void setRelleno(boolean Relleno);

    void setTipoPunta(boolean tipoPunta);
}

