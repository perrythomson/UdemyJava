//package main.miscellaneousTopics.chapter4.chapter5;
//
//import java.util.ArrayList;
//
//public class DotComBust {
//    private GameHelper helper = new GameHelper();
//    private ArrayList<DotCom> dotComsList = new ArrayList<>();
//    private int numOfGuesses;
//
//    public static void main(String[] args) {
//        DotComBust game = new DotComBust();
//        game.setUpGame();
//        game.startPlaying();
//    }
//
//    private void setUpGame() {
//        DotCom one = new DotCom();
//        one.setName("Pets.com");
//        DotCom two = new DotCom();
//        two.setName("Go2.com");
//        DotCom three = new DotCom();
//        three.setName("AskMe.com");
//
//        dotComsList.add(one);
//        dotComsList.add(two);
//        dotComsList.add(three);
//
//        System.out.println("Your goal is to sink three ships...");
//        System.out.println("Pet.com, Go2.com, and AskMe.com...");
//        System.out.println("Try to sink them all..");
//
//        for (DotCom dotComToSet : dotComsList) {
//            ArrayList<String> newLocation = helper.placeDotCom(3);
//            dotComToSet.setLocationCells(newLocation);
//        }
//    }
//
//    private void startPlaying() {
//        while (dotComsList.isEmpty() != true) {
//            String userGuess = helper.getUserInput("Enter a guess?");
//            checkUserGuess(userGuess);
//        }
//    }
//
//    private void checkUserGuess(String userGuess) {
//        numOfGuesses++;
//        String result = "miss";
//
//        //ArrayName/type(int, String)... new cellName : ArrayCellNameValue   ....for(declaration : expression)
//        //represents the type of variable you plan on accessing in the array and used within the for block
//        //and will be replaced each time with the array value that is being processed
////        for(int u : numericals){
////            System.out.print( u );
////            System.out.print(",");
////        }
//
//        for (DotCom dotComToTest : dotComsList) {
//            result = dotComToTest.checkYourself(userGuess);
//            if (result.equals("hit")) {
//                break;
//            }
//            if (result.equals("kill")) {
//                dotComsList.remove(dotComToTest);
//                break;
//            }
//        }
//        System.out.println(result);
//    }
//
//    private void finishGame() {
//        System.out.println("All DotComs are dead! Your score is " + numOfGuesses);
//        if (numOfGuesses <= 18) {
//            System.out.println("It only took you " + numOfGuesses);
//            System.out.println("You got out before it was too late.");
//        } else {
//            System.out.println("You took long enough! Your number of guesses is " + numOfGuesses);
//            System.out.println("Fish are dancing with you!");
//        }
//    }
//}
