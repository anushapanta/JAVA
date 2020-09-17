package shapes;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Ellipse extends JPanel {

    public Ellipse() { }
    
    private int x_radius = 0;
    private int y_radius = 0;

    public int get_xRadius() {
        return x_radius;
    }

    public void set_xRadius(int xradius) {
        x_radius = xradius;
        repaint();
    }
    
    public int get_yRadius() {
        return y_radius;
    }

    public void set_yRadius(int yradius) {
        y_radius = yradius;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (x_radius <= 0 || y_radius <= 0) 
            return;
        

        int cx = getWidth() / 2, cy = getHeight() / 2;
        int x = cx - x_radius, y = cy - y_radius;
        int w = 2 * x_radius, h = 2*y_radius;
        g.drawOval(x, y, w, h);
    }
}

