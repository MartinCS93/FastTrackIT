package ro.fasttrackit.lab5;

import java.util.Random;
import java.util.Scanner;

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
        System.out.println(sumOddDigits(987654321));
        System.out.println();
        generateRandomNumber();
        System.out.println();
        buildArrayWithTwoInt();
        System.out.println();
        //guessTheRandomNumber();


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

    public static int sumOddDigits(int number) {
        int lastDigit = 0;
        int oddDigitSum = 0;
        while (number != 0) {
            lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                oddDigitSum += lastDigit;
            }
            number = number / 10;
        }
        return oddDigitSum;

    }

    public static void generateRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(5);
        System.out.println("Guess the number. Please enter a value from 0 to 5");
        Scanner scanner = new Scanner(System.in);
        int guessedNumber = scanner.nextInt();
        if(guessedNumber == randomNumber) {
            System.out.println("You win!");
        } else if (guessedNumber>randomNumber) {
            System.out.println("Sorry, you are too high. Try again!");
        } else {
            System.out.println("Sorry, you are too low. Try again!");
        }

    }

    public static void buildArrayWithTwoInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n = ");
        int n = scanner.nextInt();
        System.out.println("k = ");
        int k = scanner.nextInt();

        int[] array = new int[n];
        for(int i = 1; i<n; i++) {
            array[i] = i;
            if(array[i] % k == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    /*public static void guessTheRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        int guessedNumber = scanner.nextInt();
        int attempts = 0;
        System.out.println("Guess the number");*/



}


