import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        Timer timer = new Timer(30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shape.update(getWidth(), getHeight());
                repaint();
            }
        });
        timer.start();
        return shape;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintable.paint((Graphics2D) g);
    }
}
