package fundamentalTopics.gettersAndSetters.constructorsExamples;

/**
 * Created by pthomson on 5/31/17.
 */
public class settersGettersBankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;


    public settersGettersBankAccount() {

        this("987987", 75000, "Default Name",                //has to be the first line called this()
                "Default Email", "Default Phone");  //this contructor calls the initialization
        System.out.println("Empty contructor called.");
    }

    public settersGettersBankAccount(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber ) {
        System.out.println("Account constructor with parameters has been called.");
        this.number = number;  //or setNumber(number);   this method initializes the variables
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }


    public settersGettersBankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("555555", 990, customerName, customerEmailAddress, customerPhoneNumber);  //setting defaults
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("$" + depositAmount + " was deposited into your account.  Your account balance is now $" + this.balance + ".");
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Your account has insufficient funds to process the withdrawal amount of $" + withdrawalAmount + ".");

        } else {
            this.balance -= withdrawalAmount;
            System.out.println("$" + withdrawalAmount + " was removed from your account. Your account balance is now $" + this.balance + ".");
        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
