package ro.fasttrackit.lab11.ex4;

import ro.fasttrackit.lab11.ex3.Person;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new CompanyEmployee("Maria", 15, "blonde", "Plexus", 5000));
        person.add(new CompanyEmployee("Ion", 29, "brunette", "Comau", 7000));
        person.add(new CompanyEmployee("Andrea", 27, "brunette", "PWC", 15000));
    }
}
