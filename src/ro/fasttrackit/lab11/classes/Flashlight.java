package ro.fasttrackit.lab11.classes;

public class Flashlight {
    boolean on;
    int battery;
    int lumen;

    public Flashlight(boolean on, int battery, int lumen) {
        this.on = on;
        this.battery = battery;
        this.lumen = lumen;
    }

    public boolean isOn() {
        return on;
    }

    public int getBattery() {
        return battery;
    }

    public int getLumen() {
        return lumen;
    }

}
