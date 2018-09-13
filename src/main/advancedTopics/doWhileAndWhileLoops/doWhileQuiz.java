package main.advancedTopics.doWhileAndWhileLoops;

/**
 * Created by pthomson on 5/25/17.
 */
public class doWhileQuiz {

    public static void main(String[] args) {

        int count = 0;
        int number = 5;
        int finalNumber = 23;

        while (number <= finalNumber) {
            if (!isEvenNumber(number) && count <= 5) {
                number++;
                continue;

            }
            System.out.println("Even number " + number + " And the count is " + count);
            number++;


            count++;
            if (count >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found is " + count + ".");

    }

    public static boolean isEvenNumber(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
