package ro.fasttrackit.lab11.classes;

public class House {
    String street;
    int number;
    boolean open;

    public House(String street, int number, boolean open) {
        this.street = street;
        this.number = number;
        this.open = open;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public boolean isOpen() {
        return open;
    }
}
