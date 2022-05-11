package ro.fasttrackit.lab11;

public class Animal {
    String species;
    String classification; //herbivores, omnivores or carnivores
    int lifeExpectancy;


    public Animal(String species, String classification, int lifeExpectancy) {
        this.species = species;
        this.classification = classification;
        this.lifeExpectancy = lifeExpectancy;
    }

    public String getSpecies() {
        return species;
    }

    public String getClassification() {
        return classification;
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }
}