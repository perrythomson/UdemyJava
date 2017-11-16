package fundamentalTopics.charAndBoolean;

/**
 * Created by pthomson on 5/22/17.
 */
public class Main {
    public static void main(String[] args) {
        //width of 16 (2 bytes)
        char myChar = '\u00A9';  //literally only 1 character  unicode character at unicode-table.com/en/#control-character
        System.out.println("Unicode output is: " + myChar);


        boolean myBoolean = false;
        boolean isMale = true;
        System.out.println("isMale is: " + isMale);


        char registeredChar = '\u00AE';
        System.out.println("Unicode output is: " + registeredChar);
    }
}
