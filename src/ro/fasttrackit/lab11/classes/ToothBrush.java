package ro.fasttrackit.lab11.classes;

public class ToothBrush {
    boolean on;
    int speed;
    int programs;

    public ToothBrush(boolean on, int speed, int programs) {
        this.on = on;
        this.speed = speed;
        this. programs = programs;
    }

    public boolean isOn() {
        return on;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrograms() {
        return programs;
    }
}
