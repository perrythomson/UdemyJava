package main.advancedTopics.composition;

/**
 * Created by pthomson on 6/5/17.
 */
public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(25, 20, 5);


        //thePC hasA case, monitor, and motherboard

        Case theCase = new Case("220B", "Dell", "240", dimensions);

        //new Resolution class has been created  without a variable as done in line 9 to line 8
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-2000", "Intel", 4, 5, "v2.44");




        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        //thePC method calls the getMonitor which returns the Monitor class and then in the monitor class the drawPixel
        //method is called
        //these are all the classes we created to extend from the PC.java
        //todo this was erased along with the getters from thePC
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();

        thePC.powerUp();

    }
}
