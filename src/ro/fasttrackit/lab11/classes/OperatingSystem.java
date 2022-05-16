package ro.fasttrackit.lab11.classes;

public class OperatingSystem {
    boolean on;
    int memory;
    String network;

    public OperatingSystem(boolean on, int memory, String network) {
        this.on = on;
        this.memory = memory;
        this.network = network;
    }

    public boolean isOn() {
        return on;
    }

    public int getMemory() {
        return memory;
    }

    public String getNetwork() {
        return network;
    }
}
