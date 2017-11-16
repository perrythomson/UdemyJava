package advancedTopics.inheritance;

/**
 * Created by pthomson on 6/5/17.
 */
public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;


    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);  //by giving values to int brain & body,
                                                    // we can remove those parameters from the method call line
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void res() {

    }

    private void swim(int speed) {
        moveBackFin();
        moveMuscles();
        super.move(speed);
    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }


}

