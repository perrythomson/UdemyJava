package main.advancedTopics.forStatements;

/**
 * Created by pthomson on 5/23/17.
 */
public class forStatementQuiz {
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

        System.out.println("*******************");

        int count = 0;
        for(int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number.");

                //this code dictates # of times it displays prime...without code it runs through the loop to 50 or parameters set
                if (count == 10) {
                    System.out.println("Exiting for loop.");
                    break;
                }
            }
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++){
            System.out.println("Looping " + i);

//        for(int i = 2; i <= n/2; i++) {  //looks for prime number

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
