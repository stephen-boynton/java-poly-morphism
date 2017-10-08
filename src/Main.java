/**
 * Created by stephenboynton on 6/30/17.
 */

//Polymorphism is when Java looks at the goes from the subclass and if doesn't have a
    // method available will look at the super class and take it from there. Look at #5

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "no plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws (){
        super("Jaws");
    }

    public String plot () {
        return "Shark eats people.";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay (){
        super("Independence Day");
    }

    public String plot () {
        return "Aliens attack planet.";
    }
}


class MazeRunner extends Movie {
    public MazeRunner (){
        super("Maze Runner");
    }

    public String plot () {
        return "Escape a maze.";
    }
}


class StarWars extends Movie {
    public StarWars (){
        super("Star Wars");
    }

    public String plot () {
        return "Stop the empire.";
    }
}

class ForgetableMovie extends Movie {
    public ForgetableMovie () {
        super("Forgetable");
    }
}


public class Main {

    public static void main (String[] args) {

        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "is playing." + "\n" +
                                "Plot: " + movie.plot() + "\n"
            );
        }

    }

    public static Movie randomMovie () {

        int randomNumber = (int) (Math.random() * 5 + 1);
        System.out.println(randomNumber);

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
        } return null;

    }


}
