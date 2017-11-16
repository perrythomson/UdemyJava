package advancedTopics.interfaces;

public interface ITelephone {

    public void powerOn();  //do not need the access modifier "public" because you are in a public interface

    public void dial(int phoneNumber);

    public void answer();

    public boolean callPhone(int phoneNumber);

    public boolean isRinging();




}
