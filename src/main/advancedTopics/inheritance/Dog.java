package main.advancedTopics.inheritance;

/**
 * Created by pthomson on 6/5/17.
 */
public class Dog extends Animal {   //you need to call the constructor class when extending one -
                                    // so create a contructor for that other class

    private int eyes;           //dog has these characteristics AND the animal characteristics and methods (eat move)
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


//    public Dog(String name, int brain, int body, int size, int weight) {  //constructor parameters added to dog class
//        super(name, brain, body, size, weight);                           //this also initializes the animal class
//    }


    //this adds the initialization for the Dog class and super Animal class, changed size weight parameter
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }

    private void chew() {
        System.out.println("Dog.chew() called.");
    }

    @Override                   //two eat methods
    public void eat() {
        System.out.println("Dog.eat called from override");  //this was called from main indicating eat method called
        chew();                                              //chew method called inside of PUBLIC method
        super.eat();                                         //super or parent class eat method called
    }

    public void walk() {
        System.out.println("Dog.walk called");
        super.move(2);  //calls from parent
        move(2);        //calls from dog
    }

    public void run() {
        System.out.println("Dog.run called");
        move(10);
    }

    public void moveLegs(int speed) {
        System.out.println("Dog.moveLegs method has been called");

    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move method has been called");
        moveLegs(speed);
        super.move(speed);
    }
}
