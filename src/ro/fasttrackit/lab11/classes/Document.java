package ro.fasttrackit.lab11.classes;

public class Document {
    String name;
    int size;
    int date;

    public Document(String name, int size, int date) {
        this.name = name;
        this.size = size;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getDate() {
        return date;
    }
}
