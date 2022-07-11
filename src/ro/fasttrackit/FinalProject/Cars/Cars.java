package ro.fasttrackit.FinalProject.Cars;

import ro.fasttrackit.FinalProject.Cars.Type.EngineType;
import ro.fasttrackit.FinalProject.Cars.Type.ModelType;
import ro.fasttrackit.FinalProject.Cars.Type.TransmissionType;

public class Cars {
    private final ModelType model;
    private final String equipmentLine;
    private final String color;
    private final TransmissionType transmission;
    private final double engineCapacity;
    private final EngineType engine;
    private final int horsePower;
    private final String vinNumber;
    private final double price;

    public Cars(ModelType model, String equipmentLine, TransmissionType transmission, String color,
                double engineCapacity, EngineType engineType, int horsePower, String vinNumber, double price) {
        this.model = model;
        this.equipmentLine = equipmentLine;
        this.transmission = transmission;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.engine = engineType;
        this.horsePower = horsePower;
        this.vinNumber = vinNumber;
        this.price = price;
    }


    public ModelType getModel() {
        return model;
    }

    public String getEquipmentLine() {
        return equipmentLine;
    }

    public TransmissionType getTransmission() {
        return transmission;
    }

    public String getColor() {
        return color;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public EngineType getEngine() {
        return engine;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n" + "Cars{" +
                "model=" + model +
                ", equipmentLine='" + equipmentLine + '\'' +
                ", color='" + color + '\'' +
                ", transmission=" + transmission +
                ", engineCapacity=" + engineCapacity +
                ", engine=" + engine +
                ", horsePower=" + horsePower +
                ", vinNumber='" + vinNumber + '\'' +
                ", price=" + price +
                '}';
    }
}
