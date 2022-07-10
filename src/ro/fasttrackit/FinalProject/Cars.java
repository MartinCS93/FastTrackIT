package ro.fasttrackit.FinalProject;

public class Cars {
    private final String model;
    private final String equipmentLine;
    private final String color;
    private final String transmission;
    private final double engineCapacity;
    private final String engineType;
    private final int horsePower;
    private final String vinNumber;
    private final double price;

    public Cars(String model, String equipmentLine, String transmission, String color, double engineCapacity, String engineType, int horsePower, String vinNumber, double price) {
        this.model = model;
        this.equipmentLine = equipmentLine;
        this.transmission = transmission;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.engineType = engineType;
        this.horsePower = horsePower;
        this.vinNumber = vinNumber;
        this.price = price;
    }


    public String getModel() {
        return model;
    }

    public String getEquipmentLine() {
        return equipmentLine;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getColor() {
        return color;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getEngineType() {
        return engineType;
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
        return "\n"+ "Cars{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", engineType='" + engineType + '\'' +
                ", horsePower=" + horsePower +
                ", vinNumber='" + vinNumber + '\'' +
                ", price=" + price  +
                '}' ;
    }
}
