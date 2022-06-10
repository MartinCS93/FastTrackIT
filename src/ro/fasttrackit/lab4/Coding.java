package ro.fasttrackit.lab4;

import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        System.out.println(greaterThan((byte) -15));
        System.out.println(twoIntegers(1993, 2022));
        System.out.println(threeIntegers(1, 2, 3));
        System.out.println(taxPercentage(7100));
        System.out.println(successiveAdditions(6, 6));


    }

    public static String greaterThan(byte a) {
        if (a > 10) {
            return a + " is greater than 10";
        }
        return a + " is smaller than 10";
    }

    public static int twoIntegers(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
        //return Math.max(a, b);
    }

    public static int threeIntegers(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else {
            return z;
        }
    }

    public static String taxPercentage(int income) {
        if (income <= 2000) {
            return "Taxes = 0";
        } else if (income > 2000 && income <= 5000) {
            return "Taxes = " + income * 20 / 100;
        } else {
            return "Taxes = " + income * 35 / 100;
        }
    }

    public static int successiveAdditions(int a, int b) {
        int result = 0;
        for (int i = 1; i <= b; i++) {
            result += a;
        }
        return result;
    }


}