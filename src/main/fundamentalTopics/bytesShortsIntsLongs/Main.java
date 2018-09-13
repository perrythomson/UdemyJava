package main.fundamentalTopics.bytesShortsIntsLongs;

/**
 * Created by pthomson on 5/22/17.
 */
public class Main {

    public static void main(String[] args) {

        //byte has a width of 8
        byte myByteMinValue = -128; //if you type 129 it errors out...it's beyond its max
        byte myByteMaxValue = 127; //if you type 128 it errors out...it's beyond its max
        byte myNewByteValue = (byte) (myByteMinValue/2);  //This is called casting...putting byte in front..treat it as a byte
        System.out.println("myNewbyteValue = " + myNewByteValue);

        //short has a width of 16
        short myShortMinValue = -32768; //if you type 32769 it errors out...it's beyond its max
        short myShortMaxValue = 32767; //if you type 32768 it errors out...it's beyond its max
        short myNewShortValue = (short) (myShortMinValue);
        System.out.println("myNewShortValue = " + myNewShortValue);

        // int has a width of 32
        int myMinValue = -2_147_483_648;       //if you type 2147483649 it errors out...it's beyond its max...this number is 2^31 = 2147483647
        int myMaxValue = 2147483647;        //if you type 2147483648 it errors out ...it's too big

        //long has a width of 64
        long myLongMinValue = -9223372036854775808L;//if you type 9223372036854775809 it errors out...it's beyond its max...this number is 2^63 =
        long myLongMaxValue = 9223372036854775807L;//if you type 9223372036854775808 it errors out...it's beyond its max...this number is 2^63 =

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;


        //exercise
        long myNewLong = 50000L + (10L)*(byteValue + shortValue + intValue);
        System.out.println("myNewLong = " + myNewLong);

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("shortTotal = " + shortTotal);
    }
}
