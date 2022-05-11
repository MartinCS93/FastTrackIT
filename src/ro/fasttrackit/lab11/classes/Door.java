package ro.fasttrackit.lab11.classes;

public class Door {
    String material;
    String color;
    boolean open;

    public Door(String material, String color, boolean open) {
        this.material = material;
        this.color = color;
        this.open = open;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public boolean isOpen() {
        return open;
    }
}
