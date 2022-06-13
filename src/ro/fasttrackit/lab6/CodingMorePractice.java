package ro.fasttrackit.lab6;

import java.util.Arrays;
import java.util.Random;

public class CodingMorePractice {
    public static void main(String[] args) {
        System.out.println(productInt(new int[]{2, 4, 6, 8}));
        System.out.println();
        System.out.println(oddElements(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}));
        System.out.println();
        System.out.println(Arrays.toString(numbersSmallerThanInt(new int[]{7, 25, 49, 2, 11, 125, 80, 14}, 30)));
        System.out.println();
        System.out.println(targetDonations(500));
        System.out.println();
        System.out.println(maxNumberOfDonations(500, 5));
        System.out.println();
        System.out.println(eachSentenceOnAnewLine("Ana are mere.Maria are pere.Ion are cirese.Gheorghe are gutui."));
    }

    public static String productInt(int[] array) {
        int product = 1;
        for (int i : array) {
            product *= i;
        }
        return "Product of the integers from the given array is " + product + ".";
    }

    public static String oddElements(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return "There are " + count + " odd elements in the given array.";
    }

    public static int[] numbersSmallerThanInt(int[] array, int referenceNumber) {
        int count = 0;
        for (int i : array) {
            if (i < referenceNumber) {
                count++;
            }
        }
        Arrays.sort(array);
        int[] result;
        result = Arrays.copyOf(array, count);
        return result;
    }

    public static String targetDonations(int target) {
        int totalDonations = 0;
        Random random = new Random();
        while (totalDonations <= target) {
            totalDonations += random.nextInt(target);
        }
        return "Success! Total donations = " + totalDonations;
    }

    public static String maxNumberOfDonations(int target, int maxAttempts) {
        int totalDonations = 0;
        int count = 0;
        Random random = new Random();
        while (totalDonations < target || maxAttempts == count) {
            totalDonations += random.nextInt(500);
            count++;
        }
        return "Total donations = " + totalDonations + " in " + count + " attempts.";
    }

    public static String eachSentenceOnAnewLine(String sentences) {
        String string = "";
        string = sentences.replace(".", "\n");
        return string;
    }
}
