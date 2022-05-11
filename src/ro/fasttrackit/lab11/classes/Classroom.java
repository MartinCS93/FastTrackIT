package ro.fasttrackit.lab11.classes;

public class Classroom {
    int grade;
    int chairs;
    int students;

    public Classroom(int grade, int chairs, int students) {
        this.grade = grade;
        this.chairs = chairs;
        this.students = students;
    }

    public int getGrade() {
        return grade;
    }

    public int getChairs() {
        return chairs;
    }

    public int getStudents() {
        return students;
    }
}
