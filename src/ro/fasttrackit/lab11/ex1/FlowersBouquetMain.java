package ro.fasttrackit.lab11.ex1;

import java.util.HashSet;

public class FlowersBouquetMain {
    public static void main(String[] args) {
        FlowersBouquet bouquet = new FlowersBouquet(new HashSet<>());
        bouquet.addFlower("Rose");
        bouquet.addFlower("Lavender");
        bouquet.addFlower("Primrose");
        bouquet.addFlower("Begonia");
        bouquet.addFlower("Cornflower");
        System.out.println(bouquet.getAll());
        bouquet.removeFlower("Begonia");
        System.out.println(bouquet.getAll());
        bouquet.addFlower("Tulip");
        bouquet.addFlower("Lily");
        System.out.println(bouquet.getAll());
    }
}
