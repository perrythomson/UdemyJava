package advancedTopics.interfaces;

public class Main {
    public static void main(String[] args) {

        ITelephone timsPhone;
//        DeskPhone timsPhone;  //can use this instead of ITelephone when...

        timsPhone = new DeskPhone(12345);
        timsPhone.powerOn();
        timsPhone.callPhone(12345);
        timsPhone.answer();


        timsPhone = new MobilePhone(53333);
        timsPhone.powerOn();
        timsPhone.callPhone(53333);
        timsPhone.answer();
    }
}
