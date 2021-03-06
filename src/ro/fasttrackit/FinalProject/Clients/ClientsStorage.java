package ro.fasttrackit.FinalProject.Clients;

import ro.fasttrackit.FinalProject.Clients.Clients;
import ro.fasttrackit.FinalProject.Dealer.Dealer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class ClientsStorage {
    private static Path STORAGE = Path.of("FinalProject/Clients", "clients.txt");

    public void writeClients(Dealer client) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(STORAGE.toFile()))) {
            writer.write(client.getName());
            writer.newLine();
            for (Clients clients : client.getClients()) {
                writer.write(itemToLine(clients));
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("You cant write in this file!");
        }
    }

    private String itemToLine(Clients clients) {
        return clients.getFirstName() + " | " + clients.getSecondName() + " | " + clients.getPhoneNumber() + " | " +
                clients.getAddress() + " | " + clients.getSsn() + " | " + clients.isAlreadyClient();
    }
}
