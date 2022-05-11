package ro.fasttrackit.lab11.classes;

public class Bike {
    String model;
    int gears;
    String frameSize; //XS,S,M,L,XL,XXL

    public Bike(String model, int gears, String frameSize) {
        this.model = model;
        this.gears = gears;
        this.frameSize = frameSize;
    }

    public String getModel() {
        return model;
    }

    public int getGears() {
        return gears;

    }

    public String getFraneSize() {
        return frameSize;
    }
}
