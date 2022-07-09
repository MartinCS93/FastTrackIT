package ro.fasttrackit.lab9.ex2;

import java.time.LocalDateTime;

public class Employee implements Person {
    private String firstName;
    private String lastName;
    private LocalDateTime birthday;
    private String address;
    private LocalDateTime dateOfEmployment;
    private String position;

    public Employee(String firstName, String lastName, LocalDateTime birthday, String address, LocalDateTime dateOfEmployment, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDateTime getBirthday() {
        return birthday;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public LocalDateTime getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }
}
