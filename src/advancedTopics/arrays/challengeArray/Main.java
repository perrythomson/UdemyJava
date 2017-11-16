package advancedTopics.arrays.challengeArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by pthomson on 7/4/17.
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int size) {
        int[] array = new int[size];
        System.out.println("Enter " + size + " integer values. \r");

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);

        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i<array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array, array.length); // same as 3 lines above


        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for(int i=0; i<sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
