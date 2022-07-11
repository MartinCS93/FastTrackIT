package ro.fasttrackit.FinalProject;

import ro.fasttrackit.FinalProject.Cars.Cars;
import ro.fasttrackit.FinalProject.Cars.Type.EngineType;
import ro.fasttrackit.FinalProject.Cars.Type.ModelType;
import ro.fasttrackit.FinalProject.Cars.Type.TransmissionType;
import ro.fasttrackit.FinalProject.Clients.Clients;
import ro.fasttrackit.FinalProject.Clients.ClientsStorage;
import ro.fasttrackit.FinalProject.Dealer.Dealer;
import ro.fasttrackit.FinalProject.Dealer.DealersStorage;

public class Main {
    public static void main(String[] args) {
        Dealer newDealer = new Dealer("FastTrack Automotive");

        newDealer.addCars(new Cars(ModelType.GOLF, "Life", TransmissionType.MANUAL, "Pure White Uni",
                1.5, EngineType.TSI, 150, "WVWZZZCDZNW214810", 24500.14));
        newDealer.addCars(new Cars(ModelType.TROC, "Style", TransmissionType.DSG, "Indium Gray Metallic",
                2.0, EngineType.TDI, 150, "WVGZZZA1ZNV172270", 32790.7));
        newDealer.addCars(new Cars(ModelType.TCROSS, "Life", TransmissionType.DSG, "Reflex Silver Metallic",
                1.0, EngineType.TSI, 110, "WVGZZZC1ZPY001540", 22650.21));
        newDealer.addCars(new Cars(ModelType.POLO, "Life", TransmissionType.DSG, "Smoky Gray Metallic",
                1.0, EngineType.TSI, 95, "WVWZZZAWZNU063917", 16870.99));
        newDealer.addCars(new Cars(ModelType.TIGUAN, "Elegance", TransmissionType.DSG, "Nightshade Blue",
                2.0, EngineType.TDI, 200, "WVGZZZ5NZNW532863", 45700.33));


        newDealer.addClients(new Clients("Cristian", "Martin", "0722162126", "Oradea"
                , 1930114055077L, true));
        newDealer.addClients(new Clients("Andrea", "Ionescu", "0770148789", "Cluj"
                , 2960211058669L, false));
        newDealer.addClients(new Clients("Bogdan", "Alexandrescu", "0722425144", "Timisoara"
                , 1691103789668L, true));

        System.out.println(newDealer);

        DealersStorage dealersStorage = new DealersStorage();
        dealersStorage.writeCars(newDealer);

        ClientsStorage clientsStorage = new ClientsStorage();
        clientsStorage.writeClients(newDealer);

    }
}
