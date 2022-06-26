package ro.fasttrackit.lab7;

public class CreateProduct {
    String name;
    double price;
    int quantity;
    String category;

    public CreateProduct(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock() {
        if (this.quantity != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isCategory(String category) {
        if (this.category == category) {
            return true;
        } else {
            return false;
        }
    }
}
