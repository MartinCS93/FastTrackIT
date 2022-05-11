package ro.fasttrackit.lab11;

public class Car {
    String brand;
    String model;
    int engine;
    String propulsion; //electric, hybrid, diesel, petrol

    public Car(String brand, String model, int engine, String propulsion) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.propulsion = propulsion;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getEngine() {
        return engine;
    }

    public String getPropulsion() {
        return propulsion;
    }
}
