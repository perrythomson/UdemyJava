package advancedTopics.polymorphism.challenge;

class Car {
    public boolean engine;
    public int cylinders;
    private String name;
    public int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> start engine!";
    }

    public String accelerate() {
        return "Car -> accelerate";
    }

    public String brake() {
        return "Car -> slow down";
    }

}
public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Dodge dodge = new Dodge(8, "Ram Hemi");
        System.out.println(dodge.startEngine());
        System.out.println(dodge.accelerate());
        System.out.println(dodge.brake());

        Holden holden = new Holden(4, "Crap Car");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        Toyota toyota = new Toyota(6, "Sienna");
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());

    }
}

class Dodge extends Car{
    public Dodge(int cylinders, String name) {
        super(8, "HemiRam");
    }

    @Override
    public String startEngine() {
        return "Dodge -> startEngine()";    }
    @Override
    public String accelerate() {
        return "Dodge -> accelerate()";
    }

    @Override
    public String brake() {
        return "Dodge -> brake()";
    }

}

class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders,name);
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " & Holden -> startEngine()";    }

    @Override
    public String accelerate() {
        return getClass().getName() + " && Holden -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " &&& Holden -> brake()";
    }

}

class Toyota extends Car{
    public Toyota(int cylinders, String name) {
        super(cylinders,name);
    }

    @Override
    public String startEngine() {
        return "Toyota -> startEngine()";    }

    @Override
    public String accelerate() {
        return "Toyota -> accelerate()";
    }

    @Override
    public String brake() {
        return "Toyota -> brake()";
    }
}

