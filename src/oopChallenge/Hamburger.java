package oopChallenge;

/**
 * Created by pthomson on 6/19/17.
 */
public class Hamburger {

    private String name;
    private String meat;
    public Double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    private String addition5Name;
    private double addition5Price;

    public Hamburger(String name, String meat, Double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public void addHamburgerAddition5(String name, double price) {
        this.addition5Name = name;
        this.addition5Price = price;
    }

    public double itemizedHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger is on a " + this.breadRollType + " roll with " + this.meat + ". The price of the hamburger " +
                "is $" +  this.price + ".");

        if (this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " +  this.addition1Name + " for an extra charge of $" + this.addition1Price + ".");
        }
        if (this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " +  this.addition2Name + " for an extra charge of $" + this.addition2Price + ".");
        }
        if (this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " +  this.addition1Name + " for an extra charge of $" + this.addition3Price + ".");
        }
        if (this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " +  this.addition4Name + " for an extra charge of $" + this.addition4Price + ".");
        }
        if (this.addition5Name != null) {
            hamburgerPrice += this.addition5Price;
            System.out.println("Added " +  this.addition5Name + " for an extra charge of $" + this.addition5Price + ".");
        }
        return hamburgerPrice;
    }
}