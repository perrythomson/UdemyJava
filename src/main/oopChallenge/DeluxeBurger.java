package main.oopChallenge;

/**
 * Created by pthomson on 6/19/17.
 */
public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage and Bacon", 9.50, "Hawaian Roll");
        super.addHamburgerAddition1("chips", 2.75);
        super.addHamburgerAddition2("drink", 1.81);

    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add items to the burger.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add items to the burger.");

    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add items to the burger.");

    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add items to the burger.");

    }

    @Override
    public void addHamburgerAddition5(String name, double price) {
        System.out.println("Cannot add items to the burger.");

    }
}
