import java.util.ArrayList;
import java.util.Random;

public class Obstacle extends GameObject {
    private ArrayList<String> dinoImagePaths = new ArrayList<>();

    public Obstacle () {
        super (Game.DINOGAME_WIDTH, Game.DINOGAME_GROUND_HEIGHT);

        dinoImagePaths.add("assets/cactus1.png");
        dinoImagePaths.add("assets/cactus2.png");
        dinoImagePaths.add("assets/cactus3.png");

        dinoImage = loadDinoImage(dinoImagePaths.get(new Random().nextInt(dinoImagePaths.size())));
    }
    
}
