package ro.fasttrackit.lab10.ex1;

import java.util.ArrayList;
import java.util.List;

public class BasketMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Strawberry");
        list.add("Kiwi");
        list.add("Orange");

        Basket basket = new Basket(list);


        System.out.println(basket.find("Banana"));
        System.out.println(basket.distinct());
        System.out.println(basket.count());
        System.out.println(basket.position("Apple"));
        System.out.println(basket.find("Water Melon"));
        System.out.println(basket.remove("Banana"));
        System.out.println(basket.count());
        System.out.println(basket.customCount());
        System.out.println(basket.find("Banana"));
        System.out.println(basket.position("Apple"));
        list.add("Water Melon");
        System.out.println(basket.count());
        System.out.println(basket.customCount());
        System.out.println(basket.distinct());
        list.add(3, "Pear");
        System.out.println(basket.count());
        System.out.println(basket.customCount());
        System.out.println(basket.distinct());
    }
}
