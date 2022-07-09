package ro.fasttrackit.lab9.ex1;

public class Cosmetics extends Product{
    public String color;
    public double weight;

    public Cosmetics(int price, String name, String description, int quantity, String color, double weight) {
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

}
