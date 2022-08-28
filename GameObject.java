import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.*;

public abstract class GameObject {
    protected float x, y;
    protected float dx, dy;

    protected BufferedImage dinoImage;

    public GameObject (float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void tick () {
        x += dx;
        y += dy;
    }

    public void render (Graphics g, ImageObserver observer) {
        g.drawImage(dinoImage, (int)x, (int)y - dinoImage.getHeight(), observer);
    }

    public static BufferedImage loadDinoImage (String imagePath) {
        try {
            return ImageIO.read(new File(imagePath));
        } catch (IOException o) {
            System.out.println("Error opening file.");
        }
        return null;
    }
}
