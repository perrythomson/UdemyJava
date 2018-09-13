package main.advancedTopics.inheritance;

/**
 * Created by pthomson on 6/5/17.
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long and silky");
        dog.eat();  //dog class can see this method because it is public
        dog.walk();
        dog.run();

    }
}
