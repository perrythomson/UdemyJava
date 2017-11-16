package fundamentalTopics.floatAndDouble;

/**
 * Created by pthomson on 5/22/17.
 */
public class Main {
    public static void main(String[] args) {

        //width of int = 32 (4 bytes)
        int myIntValue = 5/2;

        //width of float = 32 (4 bytes)
        float myFloatValue = 5.25f/2f;  //floats handle 7 precision numbers after decimal or cast (float) 5.25

        //width of double = 64 (8 bytes)
        double myDoubleValue = 5.33d/3;  //doubles handle 16 precision numbers after the decimal...note if you don't specify d for double it defaults to d

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double myPounds = 245d;
        double kiloConversionNumber = 0.45359237d;  //setting it as a literal
        double myKilos = (double) (myPounds * kiloConversionNumber);  //if you use int instead of double you end up with only a whole number not the precision of a double
        System.out.println("myKilos = " + myKilos);
    }
}
