import javax.swing.*;

/**
 * Created by ta on 2018/04/17.
 */
public class Screen extends JFrame {
    public Screen(String title) {
        super(title);
        setSize(400, 300);
        setLocation(100, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
