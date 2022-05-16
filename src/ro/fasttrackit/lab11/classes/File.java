package ro.fasttrackit.lab11.classes;

public class File {
    String extension;
    String location;
    int size;

    public File(String extension, String location, int size) {
        this.extension = extension;
        this.location = location;
        this.size = size;
    }

    public String getExtension() {
        return extension;
    }

    public String getLocation() {
        return location;
    }

    public int getSize() {
        return size;
    }
}
