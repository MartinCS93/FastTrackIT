package ro.fasttrackit.lab8.ex3;

public class Duck implements Behaviour{
    @Override
    public String walk() {
        return "Duck walking";
    }

    @Override
    public String talk() {
        return "Quak-quak!";
    }

    @Override
    public String eat() {
        return "Duck eating";
    }
}
