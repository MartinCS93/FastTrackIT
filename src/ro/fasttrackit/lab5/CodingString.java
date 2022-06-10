package ro.fasttrackit.lab5;

import java.util.Random;

public class CodingString {
    public static void main(String[] args) {
        String[] names = new String[]{"Ana", "Ionut", "Amalia", "Cosmin",
                "Andrei", "Stefan", "Alin", "Alina", "Matei", "Marcel"};
        containsLetterA(names);
        System.out.println();
        containsGivenString(names, "in");
        System.out.println();
        containsAndReplace(names);
        System.out.println();
        printFirstThreeCharacters(names);
        System.out.println();
        printRandomLetter(names);
        System.out.println();
        abbreviateName("Martin Cristian Stefan");
        abbreviateName("Pop Ioan Dumitru");
        abbreviateName("David Cosmin Petru");
    }

    public static void containsLetterA(String[] names) {
        for (String i : names)
            if (i.charAt(0) == 'A') {
                System.out.println(i);
            }
    }

    public static void containsGivenString(String[] names, String string) {
        for (String i : names) {
            if (i.contains(string)) {
                System.out.println(i);
            }
        }

    }

    public static void containsAndReplace(String[] names) {
        for (String i : names) {
            System.out.println(i.replace('r', '*'));
        }
    }

    public static void printFirstThreeCharacters(String[] names) {
        for (String i : names) {
            System.out.println(i.substring(0, 3));
        }
    }

    public static void printRandomLetter(String[] names) {
        for (String i : names) {
            Random letter = new Random();
            int randomInt = letter.nextInt(i.length());
            char randomChar = i.charAt(randomInt);
            System.out.println(randomChar);
        }

    }

    public static void abbreviateName(String name) {
        String[] string = name.split(" ");
        for (int i = 1; i < string.length - 1; i++) {
            System.out.println(string[0] + " " + string[i].charAt(0) + ". " + string[2]);
        }
    }
}
