package main.advancedTopics.singleton;
import java.util.LinkedList;

/**
 * Created by pthomson on 6/5/17.
 */
public class GetTheTiles implements Runnable {

    public void run() {

        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instance ID: " + System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());

        LinkedList<String>  playerOneTiles = newInstance.getTiles(7);

        System.out.println("Player :" + playerOneTiles);
        System.out.println("Got tiles.");

    }



}
