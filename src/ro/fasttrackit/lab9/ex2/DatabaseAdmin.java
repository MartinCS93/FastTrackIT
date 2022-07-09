package ro.fasttrackit.lab9.ex2;

import java.time.LocalDateTime;

public class DatabaseAdmin extends Employee {
    private String dbTechnology;

    public DatabaseAdmin(String firstName, String lastName, LocalDateTime birthday, String address,
                         LocalDateTime dateOfEmployment, String position, String dbTechnology) {
        super(firstName, lastName, birthday, address, dateOfEmployment, position);
        this.dbTechnology = dbTechnology;
    }

    @Override
    public String getAddress() {
        return "dbAdmin" + super.getAddress();
    }

    public String getDbTechnology() {
        return dbTechnology;
    }
}
