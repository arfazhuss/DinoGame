public class Dino extends GameObject {

    private boolean jumping = false;

    public Dino () {
        super (50, Game.DINOGAME_GROUND_HEIGHT);
        dinoImage=loadDinoImage("assets/dino.png");
    }

    // @Override
    public void tick () {
        if ((jumping) && (y + dy > Game.DINOGAME_GROUND_HEIGHT)) {
            jumping = false;
            y = Game.DINOGAME_GROUND_HEIGHT;
            dy=0;
        } else if (jumping) {
            dy += 0.3f;
        }

        y += dy;
    }

    public void jumpAction () {
        if (!jumping) {
            jumping = true;
            dy = -8;
        }
    }

}
