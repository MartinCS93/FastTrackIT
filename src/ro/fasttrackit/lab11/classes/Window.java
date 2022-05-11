package ro.fasttrackit.lab11.classes;

public class Window {
    String material;
    int size;
    boolean open;

    public Window(String material, int size, boolean open) {
        this.material = material;
        this.size = size;
        this.open = open;
    }

    public String getMaterial() {
        return material;
    }

    public int getSize() {
        return size;
    }

    public boolean isOpen() {
        return open;
    }
}
