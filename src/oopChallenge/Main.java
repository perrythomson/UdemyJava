package oopChallenge;

/**
 * Created by pthomson on 6/19/17.
 */
public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.64, "White");
//        double price = hamburger.itemizedHamburger();
        hamburger.addHamburgerAddition1("tomato", 0.45);
        hamburger.addHamburgerAddition2("lettuce", 0.40);
        hamburger.addHamburgerAddition3("cheese", 0.75);
        hamburger.addHamburgerAddition4("onion", .5);
        hamburger.addHamburgerAddition5("bacon", 1.25);
//        price = hamburger.itemizedHamburger();
        System.out.println("Hamburger cost is now $" + hamburger.itemizedHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("turkey", 5.09);
        healthyBurger.addHealthAddition1("advocado", 1.49);
        healthyBurger.addHamburgerAddition2("lettuce", 0.4);
        healthyBurger.addHealthAddition2("sprouts", .85);
        System.out.println("The healthy burger cost is now $" + healthyBurger.itemizedHamburger());
//        healthyBurger.itemizedHamburger();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizedHamburger();
        System.out.println("The deluxe burger combo cost is " );

    }
}
