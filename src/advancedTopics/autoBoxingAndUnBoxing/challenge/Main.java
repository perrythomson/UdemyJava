package advancedTopics.autoBoxingAndUnBoxing.challenge;

public class Main {
    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("National Australia Bank");

        if (bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch created");
        }
        bank.addBranch("Sydney");
        bank.addBranch("Perth");


        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomer("Sydney", "Daniela", 1000.32);
        bank.addCustomer("Sydney", "Christa", 1200.00);
        bank.addCustomer("Sydney", "JD", 1400.14);

        bank.addCustomer("Perth", "Mark", 2020.20);
        bank.addCustomer("Perth", "Richele", 2500.25);
        bank.addCustomer("Perth", "Braxton", 2302.23);

        bank.addCustomerTransaction("Adelaide", "Tim", 12.12);
        bank.addCustomerTransaction("Adelaide", "Tim", 19.19);
        bank.addCustomerTransaction("Adelaide", "Mike", 2.10);

        bank.addCustomerTransaction("Sydney", "Daniela", 25.00);
        bank.addCustomerTransaction("Sydney", "Daniela", 5.00);
        bank.addCustomerTransaction("Sydney", "Daniela", 70.00);
        bank.addCustomerTransaction("Sydney", "Christa", 1.00);
        bank.addCustomerTransaction("Sydney", "Christa", 2.00);
        bank.addCustomerTransaction("Sydney", "JD", 0.15);

        bank.addCustomerTransaction("Perth", "Mark", 20.00);
        bank.addCustomerTransaction("Perth", "Mark", 2.00);
        bank.addCustomerTransaction("Perth", "Richele", 500.00);
        bank.addCustomerTransaction("Perth", "Braxton", 302.23);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);
        bank.listCustomers("Perth", true);

        bank.addBranch("Melbourne");
        if (!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("\nError Melbourne branch does not exist");
        }

        if (!bank.addBranch("Adelaide")) {
            System.out.println("\nAdelaide branch already exists.");
        }

        if (!bank.addCustomerTransaction("Adelaide", "Fergus", 33.33)) {
            System.out.println("Customer does not exist at branch.");
        }

        if (!bank.addCustomer("Adelaide", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists.");
        }
    }
}
