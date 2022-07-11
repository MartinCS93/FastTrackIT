package ro.fasttrackit.FinalProject.Dealer;

import ro.fasttrackit.FinalProject.Cars.Cars;
import ro.fasttrackit.FinalProject.Clients.Clients;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer {
    private String name;
    private final List<Cars> cars;
    private List<Clients> clients;


    public Dealer(String name) {
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
        return "Dealer{" +
                "name='" + name + '\'' +
                ", cars=" + cars +
                ", clients=" + clients +
                '}';
    }

    public void addCars(Cars car) {
        cars.add(car);
    }

    public void addClients(Clients client) {
        clients.add(client);
    }
}
