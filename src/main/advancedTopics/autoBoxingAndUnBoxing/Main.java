package main.advancedTopics.autoBoxingAndUnBoxing;

import java.util.ArrayList;

/**
 * Created by pthomson on 7/19/17.
 */

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Tim");

//        ArrayList<int> intArrayLIst = new ArrayList<int>();  //cannot do with a primitive
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));                    //this results in a lot of code
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i < intArrayList.size(); i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56;  //when it compiles it coverts it to = Integer.valueOf(56)
        Double myIntValueToo = 56.56;  //when it compiles it coverts it to = Integer.valueOf(56)
        int myInt = myIntValue;     //myInt.intValue() when it compiles
        int myIntToo = myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl= 0.0; dbl <= 10.0; dbl += 0.5) {
//            myDoubleValues.add(Double.valueOf(dbl));    //same as line below inferred when compiled
            myDoubleValues.add(dbl);
        }

        for(int i = 1; i < myDoubleValues.size(); i++) {
//            double value = myDoubleValues.get(i).doubleValue(); //same as line below inferred when compiled
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);

        }


    }
}
