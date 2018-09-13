package main.advancedTopics.inheritance.challengeQuiz;

/**
 * Created by pthomson on 6/5/17.
 */
public class Dodge extends Car {

    private int roadServiceMonths;

    public Dodge(int roadServiceMonths) {
        //constructor for extends Car needed, when you set the parameters, you can delete the variable
        // from the parameter list leaving int roadServiceMonths
        super("Dodge", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
            System.out.println("VehicleSampleInheritance called the stop method because there is no velocity.");
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
            System.out.println("current velocity is " + newVelocity);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
            System.out.println("current velocity is " + newVelocity);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
            System.out.println("current velocity is " + newVelocity);
        } else if (newVelocity > 30 && newVelocity <= 40) {
            changeGear(4);
            System.out.println("current velocity is " + newVelocity);
        } else if (newVelocity > 40 && newVelocity <= 50) {
            changeGear(5);
            System.out.println("current velocity is " + newVelocity);
        } else if (newVelocity > 50) {
            changeGear(6);
            System.out.println("current velocity is " + newVelocity);
        } else {
            changeGear(0);
            System.out.println("current gear is reverse");
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

}
