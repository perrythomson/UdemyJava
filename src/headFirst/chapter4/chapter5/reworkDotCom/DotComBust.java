package headFirst.chapter4.chapter5.reworkDotCom;


import java.util.*;

public class DotComBust{
    // declare and intitialize the variable we'll need
    private GameHelper2 helper = new GameHelper2();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();  //make an arraylist of DotCom objects which will only hold DotCom Objects
    private int numOfGuesses = 0;

    private void setUpGame() {
        // first make 3 DotCom objects, give them names and place into an array
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        // print brief instructions for user
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");


        for (DotCom dotComToSet : dotComsList) {        // repeat with each DotCom type in the list

            ArrayList<String> newLocation = helper.placeDotCom(3);            // ask the helper for a DotCom location
            dotComToSet.setLocationCells(newLocation);                // call the setter method on this DotCom to give it the location you just got from the helper
        }
    }

    public void startPlaying(){
        while (!dotComsList.isEmpty()) {              // as long as the DotCom list is Not empty

            String userGuess = helper.getUserInput("Enter a guess");             // get the user input
            checkUserGuess(userGuess);	                                        // call our own checkUserGuess method
        }
        finishGame();
    }

    public void checkUserGuess(String userGuess){

        numOfGuesses++;            // increment the number of guesses the user has made
        String result = "miss";            // assume its a 'miss', unless told otherwise

        for (DotCom dotComToTest : dotComsList) {  // repeat with all DotComs in the list

            result = dotComToTest.checkYourself(userGuess);     // ask the DotCom to check the user guess, looking for a hit (or kill)

            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dotComToTest);                  // this guy's dead, so take him out of the DotComs list then get out of the loop
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println(" You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

    public static void main(String[] args){
        DotComBust game = new DotComBust();        //create the game object

        game.setUpGame();        // tell the game object to set up the game

        game.startPlaying();        // tell the game object to start the main game play loop (keeps asking user input and checking the guess)

    }
}



