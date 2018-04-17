import javax.swing.*;
import java.awt.*;

/**
 * Created by ta on 2018/04/17.
 */
public class Panel extends JPanel {
    private Paintable paintable;

    public Panel() {
        super();
        paintable = initShape();
    }

    private Paintable initShape() {
        OvalShape shape = new OvalShape(10, 10, 10);
        int dx = 10;
        int dy = 10;
        new Timer(100, e -> {
            int x = shape.getX() + dx;
            int y = shape.getY() + dy;
            shape.setX(x);
            shape.setY(y);
            repaint();
        }).start();
        return shape;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintable.paint((Graphics2D) g);
    }
}
