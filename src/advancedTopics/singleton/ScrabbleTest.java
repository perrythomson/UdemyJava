package advancedTopics.singleton;
import java.util.LinkedList;
/**
 * Created by pthomson on 6/5/17.
 */
public class ScrabbleTest {
    public static void main(String[] args) {
        Singleton newInstance = Singleton.getInstance();
        System.out.println("Instance 1 ID: " + System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTiles = newInstance.getTiles(7);
        System.out.println("Player 1: " + playerOneTiles);
        System.out.println(newInstance.getLetterList());

        Singleton instanceTwo = Singleton.getInstance();
        System.out.println("Instance 2 ID: " + System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
        System.out.println("Player 2: " + playerOneTiles);
        System.out.println(newInstance.getLetterList());
    }

}
