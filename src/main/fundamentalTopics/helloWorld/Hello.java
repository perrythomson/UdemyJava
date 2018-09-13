package main.fundamentalTopics.helloWorld;


public class Hello {
    public static void main (String[] args) {

        System.out.println("Hello world");

        int myFirstNumber = (10 +5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int myForthNumber = 1000 - myTotal;

        System.out.println("myFirstNumber is " + myFirstNumber);
        System.out.println("mySecondNumber is " + mySecondNumber);
        System.out.println("myThirdNumber is " + myThirdNumber);
        System.out.println("The sum or total of myNumbers are " + myTotal);
        System.out.println("My forth number is " + myForthNumber);
    }
}
