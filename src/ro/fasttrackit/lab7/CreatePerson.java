package ro.fasttrackit.lab7;

public class CreatePerson {
    private String name;
    private int age;
    private boolean married;

    public CreatePerson(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }

}
