package ro.fasttrackit.lab11.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Marcel", 25, "black"));
        person.add(new Person("Carina", 29, "red"));
        person.add(new Person("Ion", 31, "brunette"));
        person.add(new Person("Maria", 21, "blonde"));

        printList(person);
        System.out.println();
        extractPersonsName(person);
        System.out.println();
        createMapFromNameToAge(person);

    }

    public static void printList(List<Person> person) {
        System.out.println(person);
    }

    public static void extractPersonsName(List<Person> persons) {
        List<String> personsName = new ArrayList<>();
        for (Person person : persons) {
            personsName.add(person.getName());
        }
        System.out.println(personsName);
    }

    public static void createMapFromNameToAge(List<Person> person) {
        Map<String, Integer> nameAgeMap = new HashMap<>();
        for(Person persons : person) {
            nameAgeMap.put(persons.getName(), persons.getAge());
        }
        System.out.println(nameAgeMap);
    }

}
