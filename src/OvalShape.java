import java.awt.*;

/**
 * Created by ta on 2018/04/17.
 */
public class OvalShape extends AbstractShape {
    public OvalShape(int x, int y, int diameter) {
        super(x, y, diameter, diameter);
    }

    @Override
    public void update(int width, int height) {
        int x = getX() + dx;
        int y = getY() + dy;
        if (x < 0 || x > width - getWidth()) {
            dx = -dx;
            x += dx;
        }
        if (x < 0) {
            x = 0;
        }
        if (x > width) {
            x = width - getWidth();
        }
        if (y < 0 || y > height - getHeight()) {
            dy = -dy;
            y += dy;
        }

        if (y < 0) {
            y = 0;
        }
        if (y > height) {
            y = height - getHeight();
        }
        setX(x);
        setY(y);
    }

    @Override
    public void paint(Graphics2D g) {
        g.fillOval(getX(), getY(), getWidth(), getHeight());
    }
}
