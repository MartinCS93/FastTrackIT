package ro.fasttrackit.lab7;

public class Product {
    public static void main(String[] args) {
        CreateProduct product1 = new CreateProduct("Snickers", 12.50, 47, "Chocolate");
        CreateProduct product2 = new CreateProduct("Magnum", 9.99, 25, "Ice cream");
        CreateProduct product3 = new CreateProduct("Joe", 5, 0, "Wafers");

        printProduct(product1);
        System.out.println();
        printProduct(product2);
        System.out.println();
        printProduct(product3);
        System.out.println();
        System.out.println(product1.getName() + " category -> " + product1.getCategory() + ": " + product1.isCategory("Chocolate"));
        System.out.println(product2.getName() + " category -> " + product2.getCategory() + ": " + product2.isCategory("Ice cream"));
        System.out.println(product3.getName() + " category -> " + product2.getCategory() + ": " + product3.isCategory("Ice cream"));


    }

    public static void printProduct(CreateProduct product) {
        if (product.hasStock()) {
            System.out.println("In the " + product.getCategory() + " category, we have the following product: " + product.getName() + "." +
                    "\nThe price for one unit is: " + product.getPrice() + " RON." +
                    "\nThere are " + product.getQuantity() + " pieces in stock.");
        } else {
            System.out.println("In the " + product.getCategory() + " category, we have the following product: " + product.getName() + "." +
                    "\nThe price for one unit is: " + product.getPrice() + " RON." +
                    "\nThis item is out of stock.");
        }
    }
}
