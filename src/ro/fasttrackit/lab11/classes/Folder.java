package ro.fasttrackit.lab11.classes;

public class Folder {
    int size;
    String location;
    String name;

    public Folder(int size, String location, String name) {
        this.size = size;
        this.location = location;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
