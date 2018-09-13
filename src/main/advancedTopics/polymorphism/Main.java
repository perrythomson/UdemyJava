package main.advancedTopics.polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here.";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");  //this inherits the string this.name from Movie class which is why it knows its a string
    }

    public String plot() {
        return "shark attacks/eats people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over the world.";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot(){
        return "Kids try to escape death in a maze.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Learn the force Luke.";
    }
}

class ForgetableMovie extends Movie {
    public ForgetableMovie() {
        super("ForgetableMovie");
    }
}



public class Main {
    public static void main(String[] args) {

        for(int i = 1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " +  movie.getName() + "\n" +
            "Plot: " + movie.plot() + "\n");
        }

    }


    //Polymorphism is assigning different functionality depending upon the type of object created which are inherited
    // from the base movie class but assigned a unique functionality in each plot methods in each class
    public static Movie randomMovie() {
                                  //this Math.random returns an int from 1-4 then adding 1 completes the range to 5
        int randomNumber = (int) (Math.random() * 5) + 1;  //Math.random returns a double...we cast it to an (int) so it becomes an integer
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgetableMovie();

//            default:
//                return null; //could be used instead of return null
        }
        return null;
    }
}
