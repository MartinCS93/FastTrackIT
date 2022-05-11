package ro.fasttrackit.lab11.classes;

public class Pen {
    String type;
    String color;
    String brand;

    public Pen(String type, String color, String brand) {
        this.type = type;
        this.color = color;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
}
