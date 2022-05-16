package ro.fasttrackit.lab11.classes;

public class TV {
    String brand;
    int diagonal;
    boolean open;

    public TV(String brand, int diagonal, boolean open) {
        this.brand = brand;
        this.diagonal = diagonal;
        this.open = open;
    }

    public String getBrand() {
        return brand;
    }

    public int getDiagonal() {
        return  diagonal;
    }

    public boolean isOpen() {
        return open;
    }
}
