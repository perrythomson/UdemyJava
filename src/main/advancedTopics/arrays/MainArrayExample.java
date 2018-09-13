package main.advancedTopics.arrays;

/**
 * Created by pthomson on 6/19/17.
 */
public class MainArrayExample {
    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];

        System.out.println(myIntArray[5]);

        int[] anotherIntArray = new int[20];
        for(int i = 0; i < anotherIntArray.length; i++) {
            anotherIntArray[i] = i * 10;
        }


        printArray(myIntArray);
        printArray(anotherIntArray);

    }

    private static void printArray(int[] anotherIntArray) {
        for(int i = 0; i < anotherIntArray.length; i++) {
            System.out.println("Element " + i + ", value is " + anotherIntArray[i]);
        }
    }
}
