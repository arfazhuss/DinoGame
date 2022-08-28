import javax.swing.*;
import java.awt.*;

public class GameWindow {
    public GameWindow (int width, int height, String title, Game game) {
        game.setPreferredSize(new Dimension(width, height));
        
        JFrame frame = new JFrame(title);
        frame.add(game);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // self-explanatory
        frame.setResizable(false); // self-explanatory
        frame.pack();   // sets every object to it's preferred size
        frame.setLocationRelativeTo(null); //middle screen
        frame.setVisible(true); // self-explanatory

        game.start();
    }
}
