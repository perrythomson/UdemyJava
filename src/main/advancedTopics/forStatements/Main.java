package main.advancedTopics.forStatements;

/**
 * Created by pthomson on 5/23/17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2.0));


        //for(init; termination; increment)
        for(double i = 2; i <= 8; i++ ) {

            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
            i -=  0.5;
        }

        System.out.println("*******************");

        for(double i = 8; i >= 2; i-- ) {

            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
            i +=  0.5;
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
