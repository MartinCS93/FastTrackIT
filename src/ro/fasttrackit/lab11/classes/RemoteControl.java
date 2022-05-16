package ro.fasttrackit.lab11.classes;

public class RemoteControl {
    int programs;
    int volume;
    boolean open;

    public RemoteControl(int programs, int volume, boolean open) {
        this.programs = programs;
        this.volume = volume;
        this.open = open;
    }

    public int getPrograms() {
        return programs;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOpen() {
        return open;
    }
}
