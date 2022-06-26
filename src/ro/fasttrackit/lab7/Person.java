package ro.fasttrackit.lab7;

public class Person {
    public static void main(String[] args) {
        CreatePerson person1 = new CreatePerson("Maria", 18, false);
        CreatePerson person2 = new CreatePerson("Ion", 28, true);
        CreatePerson person3 = new CreatePerson("Ana", 24, false);

        System.out.println("Name: " + person1.getName() + "\nAge: " + person1.getAge() + "\nMarried: " + person1.isMarried());
        System.out.println();
        System.out.println("Name: " + person2.getName() + "\nAge: " + person2.getAge() + "\nMarried: " + person2.isMarried());
        System.out.println();
        System.out.println("Name: " + person3.getName() + "\nAge: " + person3.getAge() + "\nMarried: " + person3.isMarried());
    }
}

