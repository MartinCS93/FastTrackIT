package ro.fasttrackit.lab9.ex2;

import java.time.LocalDateTime;

public interface Person {
    String getFirstName();

    String getLastName();

    LocalDateTime getBirthday();

    String getAddress();
}
