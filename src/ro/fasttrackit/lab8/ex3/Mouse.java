package ro.fasttrackit.lab8.ex3;

public class Mouse implements Behaviour {
    @Override
    public String walk() {
        return "Mouse walking";
    }

    @Override
    public String talk() {
        return "Squeak!";
    }

    @Override
    public String eat() {
        return "Mouse eating";
    }
}
