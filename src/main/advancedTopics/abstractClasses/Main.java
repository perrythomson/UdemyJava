package main.advancedTopics.abstractClasses;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Shih Tzu");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("blue parrot");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
