package advancedTopics.composition.challengeTime;

/**
 * Created by pthomson on 6/14/17.
 */
public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Oak", 4, 30, 2, 1);
        Lamp lamp = new Lamp("Modern", false, 75);

        Bedroom bedroom = new Bedroom("Master", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
