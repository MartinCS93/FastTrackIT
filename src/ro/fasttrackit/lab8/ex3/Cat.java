package ro.fasttrackit.lab8.ex3;

public class Cat implements Behaviour {
    @Override
    public String walk() {
        return "Cat walking";
    }

    @Override
    public String talk() {
        return "Meow!";
    }

    @Override
    public String eat() {
        return "Cat eating";
    }
}
