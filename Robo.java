import stanford.karel.Karel;

public class Robo extends Karel {
    @Override
    public void run() {
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        move();
        move();
        move();
        pickBeeper();


    }
}
