package ro.fasttrackit.FinalProject;

public class Clients {

    private final String firstName;
    private final String secondName;
    private String phoneNumber;
    private String address;
    private final long ssn;
    private boolean alreadyClient;

    public Clients(String firstName, String secondName, String phoneNumber, String address, long ssn,boolean alreadyClient) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.ssn = ssn;
        this.alreadyClient = alreadyClient;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public long getSsn() {
        return ssn;
    }

    public boolean isAlreadyClient() {
        return true;
    }

    @Override
    public String toString() {
        return "\n" + "Clients{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", ssn=" + ssn +
                ", alreadyClient=" + alreadyClient +
                '}';
    }
}
