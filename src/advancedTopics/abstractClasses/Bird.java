package advancedTopics.abstractClasses;

public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println("The bird is chirping while breathing.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking at the seeds.");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings...");
    }
}
