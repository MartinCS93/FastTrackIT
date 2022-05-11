package ro.fasttrackit.lab11.classes;

public class Coffee {
    String type;
    char size; //S,M,L
    int price;

    public Coffee(String type, char size, int price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public char getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }
}
