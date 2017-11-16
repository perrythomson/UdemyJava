package advancedTopics.singleton;

/**
 * Created by pthomson on 6/5/17.
 */
public class ScrabbleTestThreads {
    public static void main(String[] args) {
        Runnable getTiles = new GetTheTiles();
        Runnable getTilesAgain = new GetTheTiles();

        new Thread(getTiles).start();
        new Thread(getTilesAgain).start();
    }
}
