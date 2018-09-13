package main.advancedTopics.inheritance.challengeQuiz;

/**
 * Created by pthomson on 6/5/17.
 */
public class Main {
    public static void main(String[] args) {
        Dodge dodge = new Dodge(36);
        dodge.steer(45);
        dodge.accelerate(30);
        dodge.steer(45);
        dodge.accelerate(21);
        dodge.accelerate(-52);
    }
}
