package proyectostratego.utilidades;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class Fondos extends JPanel {

    private Image imagen;

    public Fondos(String ruta) {
        imagen = new ImageIcon(getClass().getResource(ruta)).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setOpaque(false);
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }

}
