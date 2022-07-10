package ro.fasttrackit.FinalProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class DealersStorage {

    private static Path STORAGE = Path.of("FinalProject", "cars.txt");

    public void writeCars(CreateDealer dealer) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(STORAGE.toFile()))) {
            writer.write(dealer.getName());
            writer.newLine();
            for (Cars cars : dealer.getCars()) {
                writer.write(itemToLine(cars));
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("You cant write in this file!");
        }
    }

    private String itemToLine(Cars cars) {
        return cars.getModel() + " | " + cars.getEquipmentLine() + " | " + cars.getTransmission() + " | " + cars.getEngineCapacity()
                + " | " + cars.getEngineType() + " | " + cars.getHorsePower() + " | " + cars.getColor() + " | " +
                cars.getVinNumber() + " | " + cars.getPrice();
    }


}

