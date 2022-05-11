package ro.fasttrackit.lab11;

public class Desk {
    int drawers;
    int height;
    String color;

    public Desk(int drawers, int height, String color) {
        this.drawers = drawers;
        this.height = height;
        this.color = color;
    }

    public int getDrawers() {
        return drawers;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}
