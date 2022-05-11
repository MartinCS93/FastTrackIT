package ro.fasttrackit.lab11.classes;

public class Telephone {
    String brand;
    int capacity;
    int price;

    public Telephone(String brand, int capacity, int price) {
        this.brand = brand;
        this.capacity = capacity;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }
}
