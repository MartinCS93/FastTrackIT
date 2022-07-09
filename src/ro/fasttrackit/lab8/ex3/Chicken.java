package ro.fasttrackit.lab8.ex3;

public class Chicken implements Behaviour{
    @Override
    public String walk() {
        return "Chicken walking";
    }

    @Override
    public String talk() {
        return "Bwak-bwak-bwak!";
    }

    @Override
    public String eat() {
        return "Chicken eating";
    }
}
