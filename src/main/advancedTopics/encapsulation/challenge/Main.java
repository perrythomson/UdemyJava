package main.advancedTopics.encapsulation.challenge;

/**
 * Created by pthomson on 6/14/17.
 */
public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(50, false);
        System.out.println("initial page count is: " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(3);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}
