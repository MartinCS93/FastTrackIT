package ro.fasttrackit.lab10.ex1;

import java.util.List;

public class Basket {
    private List<String> basket;

    public Basket(List<String> basket) {
        this.basket = basket;
    }

    public boolean find(String fruit) {
        return basket.contains(fruit);
    }

    public boolean remove(String fruit) {
        return basket.remove(fruit);
    }

    public int position(String fruit) {
        return basket.indexOf(fruit)+1;
    }

    public List<String> distinct() {
        return basket;
    }

    public void addFruit(String fruit) {
        basket.add(fruit);
    }

    public int count() {
        return basket.size();
    }

    public int customCount() {
        int counter;
        counter = 0;
        for(String s : basket) {
            counter ++;
        }
        return counter;
    }

}
