package ro.fasttrackit.lab11.classes;

public class Application {
    String name;
    int size;
    boolean on;

    public Application(String name, int size, boolean o) {
        this.name = name;
        this.size = size;
        this.on = on;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public boolean isOn() {
        return on;
    }
}
