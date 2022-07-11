package ro.fasttrackit.lab13;

public enum CardinalPoints {
    NORTH("N"),
    SOUTH("S"),
    EAST("E"),
    WEST("W");

    private String abbreviation;

     CardinalPoints(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}


