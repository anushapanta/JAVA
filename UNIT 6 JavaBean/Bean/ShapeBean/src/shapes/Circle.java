package shapes;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Circle extends JPanel {

    public Circle() { }
    
    private int r = 0;

    public int getRadius() {
        return r;
    }

    public void setRadius(int radius) {
        r = radius;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (r <= 0) return;

        int cx = getWidth() / 2, cy = getHeight() / 2;
        int x = cx - r, y = cy - r;
        int w = 2 * r, h = w;
        g.drawOval(x, y, w, h);
    }
}
