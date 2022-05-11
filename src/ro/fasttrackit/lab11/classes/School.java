package ro.fasttrackit.lab11.classes;

public class School {
    String name;
    String specialization; //IT, economic etc.
    int classrooms;

    public School(String name, String specialization, int classrooms) {
        this.name = name;
        this.specialization = specialization;
        this.classrooms = classrooms;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getClassrooms() {
        return classrooms;
    }
}
