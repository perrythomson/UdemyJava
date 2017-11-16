package advancedTopics.switchMethods;

import javax.sound.midi.Soundbank;

/**
 * Created by pthomson on 5/23/17.
 */
public class switchQuiz {
    public static void main(String[] args) {
        String switchValue = "a";

        switch (switchValue.toUpperCase()) {
            case "A":
                System.out.println("Letter was A");
                break;
            case "B":
                System.out.println("Letter was B");
                break;
            case "C":
                System.out.println("Letter was C");
                break;
            case "D":
                System.out.println("Letter was D");
                break;
            case "E":
                System.out.println("Letter was E");
                break;
            default:
                System.out.println("The letter wasn't A, B, C, D, or E.");
                break;
        }

        char charValue = 'a';
        switch (charValue) {
            case 'A':
                System.out.println("Letter was A");
                break;
            case 'B':
                System.out.println("Letter was B");
                break;
            case 'C':case 'D':case'E':
                System.out.println(charValue + "was found.");
                break;
            default:
                System.out.println("The letter wasn't A, B, C, D, or E.");
                break;
        }

        String month = "January";

        switch (month.toUpperCase()) {
            case "JANUARY":
                System.out.println("Letter was January");
                break;
            case "JUN":
                System.out.println("Letter was Jun");
                break;
            default:
                System.out.println("Not sure.");
                break;
        }
    }
}
