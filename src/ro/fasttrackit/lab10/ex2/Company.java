package ro.fasttrackit.lab10.ex2;

import java.util.ArrayList;
import java.util.List;

public class Company {
    public static void main(String[] args) {
        Person manager = new Person("Ion", 25, "manager");
        Person accountant1 = new Person("Costel", 26, "accountant");
        Person welder = new Person("Gheorghe", 30, "welder");
        Person carpenter = new Person("Vasile", 44, "carpenter");
        Person plumber = new Person("Dan", 55, "plumber");
        Person accountant2 = new Person("Sorin", 60, "accountant");

        List<Person> employees = new ArrayList<>();
        employees.add(manager);
        employees.add(accountant1);
        employees.add(accountant2);
        employees.add(welder);
        employees.add(carpenter);
        employees.add(plumber);

        System.out.println("Employees with position manager:");
        getManager(employees);
        System.out.println();
        System.out.println("Employees with position accountant:");
        getPerson(employees);
        System.out.println();
        System.out.println("Employees younger than given age:");
        getPersonsOlder(employees, 50);
        System.out.println();
        System.out.println("All employees:");
        printEmployees(employees);
        System.out.println();
        System.out.println("New hired person: ");
        employ(employees, new Person("Bucur", 30, "sales person"));
        System.out.println();
        System.out.println("All employees:");
        printEmployees(employees);
        System.out.println();
        roster(employees);
    }

    private static void getManager(List<Person> list) {
        for (Person person : list) {
            if (person.getPosition().equals("manager")) {
                System.out.println(person);
            }
        }
    }

    private static void getPerson(List<Person> list) {
        for (Person person : list) {
            if (person.getPosition().equals("accountant")) {
                System.out.println(person);
            }
        }
    }

    private static void getPersonsOlder(List<Person> list, int age) {
        for (Person person : list) {
            if (person.getAge() < age) {
                System.out.println(person);
            }
        }
    }

    public static void printEmployees(List<Person> list) {
        for (Person person : list) {
            System.out.println(person);
        }
    }

    public static void employ(List<Person> list, Person newPerson) {
        list.add(newPerson);
        System.out.println(newPerson);
    }

    public static void roster(List<Person> list) {
        for (Person person : list) {
            System.out.println(person.getName() + ", " + person.getAge() + " years old, is employed as " + person.getPosition() + ".");
        }
    }

}
