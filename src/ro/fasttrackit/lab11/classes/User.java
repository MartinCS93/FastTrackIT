package ro.fasttrackit.lab11.classes;

public class User {
    String username;
    String password;
    boolean connected;

    public User(String username, String password, boolean connected) {
        this.username = username;
        this.password = password;
        this.connected = connected;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isConnected() {
        return connected;
    }
}
