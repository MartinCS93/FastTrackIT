package ro.fasttrackit.lab8.ex4;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Mihai", 9.5);
        Student student2 = new Student("George", 7.4);
        Student student3 = new Student("Maria",6.7);
        Student student4 = new Student("Andrea", 10);
        Student student5 = new Student("Ion", 9);

        System.out.println("Name: " + student1.getName() + " - Grade: " + student1.getGrade());
        System.out.println("Name: " + student2.getName() + " - Grade: " + student2.getGrade());
        System.out.println("Name: " + student3.getName() + " - Grade: " + student3.getGrade());
        System.out.println("Name: " + student4.getName() + " - Grade: " + student4.getGrade());
        System.out.println("Name: " + student5.getName() + " - Grade: " + student5.getGrade());
        System.out.println("Number of students: " + Student.totalStudents);
        System.out.println("Grades average: " + Student.averageGrade());

    }
}
