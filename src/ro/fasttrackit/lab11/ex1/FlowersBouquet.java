package ro.fasttrackit.lab11.ex1;

import java.util.Collection;
import java.util.HashSet;

public class FlowersBouquet {
    private final HashSet<String> flowersBouquet;

    public FlowersBouquet(HashSet<String> flowersBouquet) {
        this.flowersBouquet = flowersBouquet;
    }

    public HashSet<String> getFlowersBouquet(){
        return flowersBouquet;
    }

    public Collection<String> getAll() {
        return new HashSet<>(this.flowersBouquet);
    }

    public void addFlower(String flower) {
        flowersBouquet.add(flower);
    }

    public void removeFlower(String flower) {
        flowersBouquet.remove(flower);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlowersBouquet that = (FlowersBouquet) o;

        return flowersBouquet != null ? flowersBouquet.equals(that.flowersBouquet) : that.flowersBouquet == null;
    }

    @Override
    public int hashCode() {
        return flowersBouquet != null ? flowersBouquet.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "FlowersBouquet{" +
                "flowersBouquet=" + flowersBouquet +
                '}';
    }
}
