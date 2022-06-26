package ro.fasttrackit.lab7;

public class Bottle {
    public static void main(String[] args) {
        CreateBottle bottle1 = new CreateBottle("Granini", 500, 350, true);
        CreateBottle bottle2 = new CreateBottle("Santal", 300, 0, false);
        CreateBottle bottle3 = new CreateBottle("Capi", 700, 700, true);

        System.out.println("Name: " + bottle1.getName() + "\nCapacity: "+ bottle1.getTotalCapacity() +
                "\nAvailable liquid: " + bottle1.getAvailableLiquid()+ "\nOpen: " + bottle1.isOpen());
        System.out.println("Bottle has liquid: " + bottle1.hasLiquid());
        System.out.println("Empty capacity: " + bottle1.emptyCapacity());
        bottle1.closeTheBottle();
        bottle1.openTheBottle();
        bottle1.openTheBottle();
        bottle1.drinkLiquid(300);
        System.out.println();

        System.out.println("Name: " + bottle2.getName() + "\nCapacity: "+ bottle2.getTotalCapacity() +
                "\nAvailable liquid: " + bottle2.getAvailableLiquid()+ "\nOpen: " + bottle2.isOpen());
        System.out.println("Bottle has liquid: " + bottle2.hasLiquid());
        System.out.println("Empty capacity: " + bottle2.emptyCapacity());
        bottle2.closeTheBottle();
        bottle2.openTheBottle();
        bottle2.closeTheBottle();
        bottle2.drinkLiquid(50);
        bottle2.openTheBottle();
        bottle2.drinkLiquid(50);
        System.out.println();

        System.out.println("Name: " + bottle3.getName() + "\nCapacity: "+ bottle3.getTotalCapacity() +
                "\nAvailable liquid: " + bottle3.getAvailableLiquid()+ "\nOpen: " + bottle3.isOpen());
        System.out.println("Bottle has liquid: " + bottle3.hasLiquid());
        System.out.println("Empty capacity: " + bottle3.emptyCapacity());
        bottle3.drinkLiquid(300);
        bottle3.drinkLiquid(400);
        bottle3.closeTheBottle();

    }


}
