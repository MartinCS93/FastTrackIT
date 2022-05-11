package ro.fasttrackit.lab11;

public class Person {

    String name;
    int age;
    int weight;

    public Person(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
}

