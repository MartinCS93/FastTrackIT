package ro.fasttrackit.lab11.classes;

public class Guitar {
    String type; //electric or acoustic
    double size;
    String material;

    public Guitar(String type, double size, String material) {
        this.type = type;
        this.size = size;
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public double getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }
}
