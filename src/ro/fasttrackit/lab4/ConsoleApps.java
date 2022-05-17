package ro.fasttrackit.lab4;

import java.util.Scanner;

public class ConsoleApps {
    public static void main(String[] args) {
        scannerPractice();
    }

    public static void scannerPractice() {
        Scanner console = new Scanner(System.in);
        System.out.println("a = ");
        int a = console.nextInt();
        System.out.println("b = ");
        int b = console.nextInt();
        int c = a / b;
        int d = a % b;
        System.out.println(a + " divided by " + b + " is " + c + " reminder " + d);
    }


}
