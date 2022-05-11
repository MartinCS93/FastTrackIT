package ro.fasttrackit.lab11.classes;

public class Milk {
    String provenance;
    int fatPercentage;
    String wrapping;

    public Milk(String provenance, int fatPercentage, String wrapping) {
        this.provenance = provenance;
        this.fatPercentage = fatPercentage;
        this.wrapping = wrapping;
    }

    public String getProvenance() {
        return provenance;
    }

    public int getFatPercentage() {
        return fatPercentage;
    }

    public String getWrapping() {
        return wrapping;
    }
}
