package ro.fasttrackit.lab11.classes;

public class Laptop {
    String brand;
    int diagonal;
    String processor;

    public Laptop(String brand, int diagonal, String processor) {
        this.brand = brand;
        this.diagonal = diagonal;
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public String getProcessor() {
        return processor;
    }
}
