package ro.fasttrackit.lab11.classes;

public class Chair {
    String material;
    String color;
    int price;

    public Chair(String material, String color, int price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}
