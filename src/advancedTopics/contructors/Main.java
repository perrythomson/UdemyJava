package advancedTopics.contructors;

/**
 * Created by pthomson on 5/31/17.
 */
public class Main {
    public static void main(String[] args) {

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Lisa", 100);
        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());
        System.out.println(person2.getEmail());

        VipCustomer person3 = new VipCustomer("Carletta", 6969, "letonego@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
        System.out.println(person3.getCreditLimit());
    }
}
