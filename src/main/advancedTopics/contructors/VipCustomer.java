package main.advancedTopics.contructors;

/**
 * Created by pthomson on 5/31/17.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {                                          //0 parameters default settings
        this("Default Name", 1000000, "Default Email");
        System.out.println("default Vipcustomer called");
    }


    public VipCustomer(String name, double creditLimit) {           //2 parameters defaulting email address
        this(name, creditLimit, "Unknown");
    }

    public VipCustomer(String name, double creditLimit, String email) {  //third constructor holds all 3 fields
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
