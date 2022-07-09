package ro.fasttrackit.lab8.ex3;

public class Dog implements Behaviour{
    @Override
    public String walk() {
        return "Dog walking";
    }

    @Override
    public String talk() {
        return "Woof-woof!";
    }

    @Override
    public String eat() {
        return "Dog eating";
    }
}
