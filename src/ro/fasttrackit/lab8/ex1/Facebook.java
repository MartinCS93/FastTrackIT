package ro.fasttrackit.lab8.ex1;

public class Facebook implements Advertising {
    String products;

    public Facebook(String products) {
        this.products = products;
    }

    @Override
    public String news() {
        return "Check out our new products" + products;
    }

    @Override
    public String vouchers() {
        return "Use the SUMMER20 code to get extra discount on your favourite products" + products;
    }
}
