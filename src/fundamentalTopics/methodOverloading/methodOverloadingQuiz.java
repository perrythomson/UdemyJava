package fundamentalTopics.methodOverloading;

/**
 * Created by pthomson on 5/23/17.
 */
public class methodOverloadingQuiz {

    public static void main(String[] args) {
        double centimeters = calculateFeetAndInchesToCentimeters(6, 12);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters.");
        }

        calculateFeetAndInchesToCentimeters(100);

    }

    public static double calculateFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        } else {
            System.out.println("Invalid input.");
            return -1;                  //check for validation returns -1
        }

    }

    public static double calculateFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;

        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calculateFeetAndInchesToCentimeters(feet, remainingInches);
    }


}
