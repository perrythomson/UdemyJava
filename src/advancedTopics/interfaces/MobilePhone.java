package advancedTopics.interfaces;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone is powered on.");

    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on desk phone.");
        } else {
            System.out.println("Phone is powered off.");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody playing...");
        } else {
            isRinging = false;
            System.out.println("Mobile phone is not on or it is a different phone number.");
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
