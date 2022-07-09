package ro.fasttrackit.lab8.ex4;

public class Student {
    public String name;
    public double grade;
    static double totalStudents = 0;
    static double gradesSum = 0;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        totalStudents++;
        gradesSum = gradesSum + grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public static double averageGrade() {
        return gradesSum / totalStudents;
    }


}
