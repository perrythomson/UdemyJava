package main.fundamentalTopics.operators;

/**
 * Created by pthomson on 5/22/17.
 */
public class Main {
    public static void main(String[] args) {

        //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html

        int result = 1 +  2;            // 1 and 2 represent the operands
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result =  result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result+=2;
        System.out.println("Result is now " + result);
        result*=10;
        System.out.println("Result is now " + result);
        result-=10;
        System.out.println("Result is now " + result);
        result /=10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)  //change between true and false
            System.out.println("It is not an alien!");

        int topScore = 100;
        if (topScore == 100)
            System.out.println("You got the top score.");

        if (topScore != 100)
            System.out.println("You got the top score.");

        if (topScore >= 100)
            System.out.println("You got the top score.");

        if (topScore <= 100)
            System.out.println("You got the top score.");

        topScore -=20;
        if (topScore <= 100)
            System.out.println("You got the top score which is " + topScore + ".");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than top score and less than 100.");

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("One of these tests is true.");
        }


        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true.");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not supposed to happen.");

        if (isCar)
            System.out.println("This is not supposed to happen.");

        isCar = true;
        boolean wasCar = isCar ? true : false;  //if isCar evaluated to true
        if(wasCar)
            System.out.println("wasCar is true");


        double myFirstDouble = 20d;
        double mySecondDouble = 80d;
        double totalDouble = (myFirstDouble + mySecondDouble) * 25;
        System.out.println("totalDouble = " + totalDouble);

        double totalRemainder = totalDouble % 40;
        if (totalRemainder <= 20)
        System.out.println("Total was over the limit.");


    }
}
