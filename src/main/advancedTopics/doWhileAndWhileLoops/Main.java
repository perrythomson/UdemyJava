package main.advancedTopics.doWhileAndWhileLoops;

/**
 * Created by pthomson on 5/25/17.
 */
public class Main {
    public static void main(String[] args) {

        int count = 0;
        while (count != 6) {
            System.out.println("count value is " + count);
            count++;
        }

        //same as while loop above
        for (int x = 1; x < 7; x++) {
            System.out.println("x value is " + count);
        }

        count = 1;
        while (true) {
            if (count == 6) {  //breaks out of the loop
                break;
            }

            System.out.println("count value is " + count);
            count++;

        }

        count = 9;
        do {                                    //do while loops always used once
            System.out.println("count value is " + count);
            count++;

                                    //catches exceptions of count greater than 9
            if (count > 100) {
                break;
            }
        } while (count!=9);

    }
}
