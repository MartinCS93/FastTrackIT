package ro.fasttrackit.FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateDealer {
    private String name;
    private final List<Cars> cars;
    private List<Clients> clients;


    public CreateDealer(String name) {
        this.name = name;
        cars = new ArrayList<>();
        clients = new ArrayList<>();
    }

    public List<Cars> getCars() {
        return Collections.unmodifiableList(cars);
    }

    public List<Clients> getClients() {
        return Collections.unmodifiableList(clients);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DealerAuto{" +
                "cars=" + cars +
                ", clients=" + clients +
                ", name='" + name + '\'' +
                '}';
    }

    public void addCars(Cars car) {
        cars.add(car);
    }

    public void addClients(Clients client) {
        clients.add(client);
    }
}
