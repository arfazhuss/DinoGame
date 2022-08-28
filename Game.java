import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements KeyListener {
    public static final int DINOGAME_WIDTH = 800;
    public static final int DINOGAME_HEIGHT = 400;
    public static final int DINOGAME_GROUND_HEIGHT = 250;

    private boolean running = false;

    private Dino dino;

    public Game() {
        dino = new Dino(); // 2
        addKeyListener(this);
    }

    public static void main (String[] args) {
        new GameWindow(DINOGAME_WIDTH, DINOGAME_HEIGHT, "DINO GAME", new Game());
    }

    public void start () {
        long lastTime = System.nanoTime();
        double amountOfTicks = 100.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int updates = 0;
        int frames = 0;
    
            running = true;
    
        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
    
            while (delta >= 1) {
                tick();
                updates++;
                delta--;
            }
            render();
            frames++;
    
                    // this prints the tick and frame rate to the console
            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("fps: " + frames + " ticks: " + updates);
                frames = 0;
                updates = 0;
            }
        }
    }

    public void tick () {
        dino.tick(); // 2
    }

    public void render () {
        BufferStrategy buffer = this.getBufferStrategy();

        if (buffer==null) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = buffer.getDrawGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, DINOGAME_WIDTH, DINOGAME_HEIGHT);
        g.setColor(Color.black);
        g.drawLine(0, DINOGAME_GROUND_HEIGHT, DINOGAME_WIDTH, DINOGAME_GROUND_HEIGHT);

        dino.render(g, this); // 2

        g.dispose();
        buffer.show();
    }

    public void keyTyped(KeyEvent e) {
        int key = e.getKeyCode();
        if (key==KeyEvent.VK_ESCAPE) System.exit(0);
    }

    public void keyPressed (KeyEvent e) {
        int key = e.getKeyCode();
        if(key==KeyEvent.VK_SPACE) {
            dino.jumpAction();
        }
    }

    public void keyReleased (KeyEvent e) {}
}
