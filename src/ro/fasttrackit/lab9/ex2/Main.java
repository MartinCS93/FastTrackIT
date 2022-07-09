package ro.fasttrackit.lab9.ex2;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ionel", "Tudorache", LocalDateTime.parse("1993-01-14T19:34:50.630"),
                "Oradea", LocalDateTime.parse("2018-12-30T19:34:50.630"), "administrator");
        printName(employee);
        printAge(employee);
    }

    public static void printName(Person person) {
        System.out.println("First name: " + person.getFirstName() + "\nLast name: " + person.getLastName());
    }

    public static void printAge(Person person) {
        LocalDateTime birthday = person.getBirthday();
        LocalDateTime now = LocalDateTime.now();
        int age = now.getYear() - birthday.getYear();
        System.out.println("Age: " + age);
    }
}
