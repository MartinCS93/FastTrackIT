package ro.fasttrackit.lab11.ex4;

import ro.fasttrackit.lab11.ex3.Person;

public class CompanyEmployee extends Person {
    private String company;
    private int salary;
    public CompanyEmployee(String name, int age, String hairColor, String company, int salary) {
        super(name, age, hairColor);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "CompanyEmployee{" +
                "company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
