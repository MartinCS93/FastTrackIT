package ro.fasttrackit.FinalProject;

import ro.fasttrackit.FinalProject.Cars.Cars;
import ro.fasttrackit.FinalProject.Clients.Clients;
import ro.fasttrackit.FinalProject.Clients.ClientsStorage;
import ro.fasttrackit.FinalProject.Dealer.Dealer;
import ro.fasttrackit.FinalProject.Dealer.DealersStorage;

public class Main {
    public static void main(String[] args) {
        Dealer newDealer = new Dealer("FastTrack Automotive");

        newDealer.addCars(new Cars("Golf", "Life", "Manual", "Pure White Uni",
                1.5, "TSI", 150, "WVWZZZCDZNW214810", 24500.14));
        newDealer.addCars(new Cars("T-Roc", "Style", "DSG", "Indium Gray Metallic",
                2.0, "TDI", 150, "WVGZZZA1ZNV172270", 32790.7));
        newDealer.addCars(new Cars("T-Cross", "Life", "Manual", "Reflex Silver Metallic",
                1.0, "TSI", 110, "WVGZZZC1ZPY001540",22650.21));
        newDealer.addCars(new Cars("Polo", "Life", "DSG", "Smoky Gray Metallic",
                1.0,"TSI", 95, "WVWZZZAWZNU063917", 16870.99));
        newDealer.addCars(new Cars("Tiguan", "Elegance", "DSG", "Nightshade Blue",
                2.0,"TDI",200,"WVGZZZ5NZNW532863",45700.33));



        newDealer.addClients(new Clients("Cristian","Martin","0722162126", "Oradea"
        , 1930114055077L, true));
        newDealer.addClients(new Clients("Andrea","Ionescu","0770148789", "Cluj"
                , 2960211058669L, false));
        newDealer.addClients(new Clients("Bogdan","Alexandrescu","0722425144", "Timisoara"
                , 1691103789668L, true));

        System.out.println(newDealer);

        DealersStorage dealersStorage = new DealersStorage();
        dealersStorage.writeCars(newDealer);

        ClientsStorage clientsStorage = new ClientsStorage();
        clientsStorage.writeClients(newDealer);

    }
}
