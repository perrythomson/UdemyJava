package main.fundamentalTopics.gettersAndSetters;

/**
 * Created by pthomson on 5/25/17.
 */
public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();            //building a new object of data type Car defined and called porsche and initialized it to new Car();
        Car holden = new Car();

        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());


    }
}
