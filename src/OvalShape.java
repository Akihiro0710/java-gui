import java.awt.*;

/**
 * Created by ta on 2018/04/17.
 */
public class OvalShape extends AbstractShape {
    public OvalShape(int x, int y, int diameter) {
        super(x, y, diameter, diameter);
    }

    @Override
    public void paint(Graphics2D g) {
        g.fillOval(getX(), getY(), getWidth(), getHeight());
    }
}
