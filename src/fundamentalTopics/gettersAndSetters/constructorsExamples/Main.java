package fundamentalTopics.gettersAndSetters.constructorsExamples;

/**
 * Created by pthomson on 5/31/17.
 */
public class Main {

    public static void main(String[] args) {
//        settersGettersBankAccount bobsAccount = new settersGettersBankAccount("12341234", 5000000,
//                "Bob Bob", "bob@gmail.com", "8019490095");
        settersGettersBankAccount bobsAccount = new settersGettersBankAccount();

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

//        bobsAccount.setBalance(50000000.00);                  //added contructor to getters and setters
//        bobsAccount.setNumber("12341234");
//        bobsAccount.setCustomerEmailAddress("bob@gmail.com");
//        bobsAccount.setCustomerName("Bob bob");
//        bobsAccount.setCustomerPhoneNumber("18019490095");

        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);


        settersGettersBankAccount timsAccount = new settersGettersBankAccount("Tim",
                "tim@gamil.com", "123412431234");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName() );
        System.out.println("Current balance is " +  timsAccount.getBalance());
        timsAccount.withdrawal(990.00);
    }

}
