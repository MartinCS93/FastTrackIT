package ro.fasttrackit.lab7;

public class CreateBottle {
    private String name;
    private int totalCapacity;
    private int availableLiquid;
    private boolean open;

    public CreateBottle(String name, int totalCapacity, int availableLiquid, boolean open) {
        this.name = name;
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public String getName() {
        return name;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean hasLiquid() {
        if (availableLiquid != 0) {
            return true;
        } else {
            return false;
        }
    }

    public int emptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public void openTheBottle() {
        if (isOpen()) {
            System.out.println("Bottle is already open.");
        } else {
            System.out.println("Bottle is now open.");
            open = true;
        }
    }

    public void closeTheBottle() {
        if (isOpen()) {
            System.out.println("Bottle is now closed.");
            open = false;
        } else {
            System.out.println("Bottle is already closed.");
        }
    }

    public void drinkLiquid(int amount) {
        if(isOpen()){
            if(availableLiquid>= amount){
                System.out.println("You drank " + amount + " ml from " + getName() + " bottle." +
                        "\nRemaining liquid: " + (availableLiquid -amount));
                availableLiquid = availableLiquid - amount;
            } else {
                System.out.println("The amount you requested to drink is more than available liquid." +
                        "\nMaximum amount you can drink is: " + availableLiquid);
            }
        } else {
            System.out.println("The bottle is closed. Please open before drinking.");
        }
    }
}
