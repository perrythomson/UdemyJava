package fundamentalTopics.methods;

/**
 * Created by pthomson on 5/22/17.
 */
public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore();  //method call

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }

    public static void calculateScore() {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " +  finalScore + ".");
        }
    }

    //same as
//    public static void main(String[] args) {
//
//        calculateScore(true, 800, 5, 100);  //method call
//        calculateScore(true, 10000, 8, 200);
//
//    }
//
//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore + ".");
//        } else {
//            return -1;
//    }
}
