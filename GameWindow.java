import javax.swing.*;
import java.awt.*;

public class GameWindow {
    public GameWindow (int width, int height, Sring title, Game game) {
        game.setPreferredSize(new Dimension(width, height));
        
        JFrame frame = new JFrame(title);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        game.start();
    }
}
