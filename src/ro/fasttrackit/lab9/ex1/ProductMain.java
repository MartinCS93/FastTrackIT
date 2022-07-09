package ro.fasttrackit.lab9.ex1;

public class ProductMain {
    public static void main(String[] args) {
        Cosmetics cosmetics1 = new Cosmetics(107, "MAC", "Matte Lipstick", 200, "Red", 27);
        Cosmetics cosmetics2 = new Cosmetics(60, "MAC", "Mixing Medium Eyeliner", 11, "Black",
                60);
        Electronics electronics1 = new Electronics(1500, "Whirlpool", "Heating and Grilling", 15,
                "Microwave Oven", 45.5, 30, 20.3, 8);
        Electronics electronics2 = new Electronics(2400, "LG", "Washing and Drying", 7,
                "Washing Machine", 60, 60.5, 85, 50);
        Fridge fridge1 = new Fridge(2999, "Samsung", "No frost cooling", 21,
                "Fridge", 70, 60, 201, 60, -20);
        Fridge fridge2 = new Fridge(3500, "Grundig", "No frost cooling", 3,
                "Fridge", 75, 70, 205, 61, -25.5);
        Product product1 = new Product(15, "Kinder", "Brown chocolate", 111);
        Product product2 = new Product(7, "Aquavia", "Alkaline water", 347);
        printCosmetics(cosmetics1);
        System.out.println();
        printCosmetics(cosmetics2);
        System.out.println();
        printElectronics(electronics1);
        System.out.println();
        printElectronics(electronics2);
        System.out.println();
        printFridge(fridge1);
        System.out.println();
        printFridge(fridge2);
        System.out.println();
        printProduct(product1);
        System.out.println();
        printProduct(product2);
    }

    public static void printCosmetics(Cosmetics product) {
        System.out.println("Name: " + product.getName() + "\nDescription: " + product.getDescription() + "\nPrice: "
                + product.getPrice() + "\nColor: " + product.getColor() + "\nQuantity: " + product.getQuantity() +
                "\nWeight: " + product.getWeight());
    }

    public static void printElectronics(Electronics product) {
        System.out.println("Name: " + product.getName() + "\nType: " + product.getType() + "\nDescription: " +
                product.getDescription() + "\nPrice: " + product.getPrice() + "\nQuantity: " + product.getQuantity() +
                "\nLength: " + product.getLength() + "\nWidth: " + product.getWidth() + "\nHeight: " + product.getHeight() +
                "\nWeight: " + product.getWeight());
    }

    public static void printFridge(Fridge product) {
        System.out.println("Name: " + product.getName() + "\nType: " + product.getType() + "\nDescription: "
                + product.getDescription() + "\nPrice: " + product.getPrice() + "\nQuantity: " + product.getQuantity()
                + "\nTemperature: " + product.getTemperature() + "\nLength: " + product.getLength() + "\nWidth: " + product.getWidth()
                + "\nHeight: " + product.getHeight() + "\nWeight: " + product.getWeight());
    }

    public static void printProduct(Product product) {
        System.out.println("Name: " + product.getName() + "\nDescription: " + product.getDescription() + "\nPrice: " + product.getPrice()
        + "\nQuantity: " + product.getQuantity());
    }


}
