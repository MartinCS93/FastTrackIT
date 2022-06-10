package ro.fasttrackit.lab5;

public class ExtraCoding {
    public static void main(String[] args) {
        countToOneHundred();
        System.out.println();
        printArrayToConsole(new String[]{"Ion", "Maria", "Costel"});
        System.out.println();
        printEveryThirdElementFromArray(new String[]{"Romania", "Ukraine", "Hungary",
                "Poland", "Slovakia", "Slovenia",
                "Germany", "France", "Austria", "Spain",
                "Italy", "Czech Republic", "Belgium", "Portugal"});
        System.out.println();
        printTwoElementsPerLine(new String[]{"Volkswagen", "Audi", "Skoda", "Seat", "Dacia",
                "Volvo", "Opel", "BMW", "Mercedes", "Citroen"});
        System.out.println();

    }

    public static void countToOneHundred() {
        int x = 0;
        do {
            System.out.print(x + " ");
            x++;
        } while (x <= 100);
        System.out.println();

        int y = 0;
        while (y <= 100) {
            System.out.print(y + " ");
            y++;
        }
        System.out.println();

        for (int z = 0; z <= 100; z++) {
            System.out.print(z + " ");
        }
        System.out.println();

    }

    public static void printArrayToConsole(String[] names) {
        for (String i : names) {
            System.out.println(i);
        }
    }

    public static void printEveryThirdElementFromArray(String[] countries) {
        for (int i = 2; i < countries.length; i += 3) {
            System.out.println(countries[i]);
        }
    }

    public static void printTwoElementsPerLine(String[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
            if (i % 2 == 1) {
                System.out.println();
            }
        }
    }

}
