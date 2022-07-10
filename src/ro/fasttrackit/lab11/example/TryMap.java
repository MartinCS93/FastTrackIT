package ro.fasttrackit.lab11.example;

import java.util.HashMap;
import java.util.Map;

public class TryMap {
    public static void main(String[] args) {
        Map<String, Fruit> pantry = new HashMap<>();
        pantry.put("favourite", new Fruit("pears", 2));
        pantry.put("fresh", new Fruit("strawberries", 101));
        pantry.put("rotten", new Fruit("banana", 2));

        System.out.println(pantry.get("favourite"));
        System.out.println(pantry.put("favourite", new Fruit("grapes", 20)));
        System.out.println(pantry.get("favourite"));

        pantry.putAll(Map.of("rotten", new Fruit("tomatoes", 5)));
        System.out.println(pantry.get("rotten"));

        for (String key : pantry.keySet()) {
            System.out.println(key);
        }

        for (Fruit value : pantry.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, Fruit> stringFruitEntry : pantry.entrySet()) {
            System.out.println(stringFruitEntry.getKey() + " -> " + stringFruitEntry.getValue());
        }

        System.out.println(pantry);
    }
}
