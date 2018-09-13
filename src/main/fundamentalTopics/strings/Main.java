package main.fundamentalTopics.strings;

/**
 * Created by pthomson on 5/22/17.
 */
public class Main {
    public static void main(String[] args) {
        String myString = "This is my string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("mySring is now " + myString);
        myString = myString + " \u00A9 2017";
        System.out.println("myString is now " + myString);


    }
}
