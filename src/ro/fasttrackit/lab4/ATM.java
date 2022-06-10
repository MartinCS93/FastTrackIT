package ro.fasttrackit.lab4;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        System.out.println("Welcome to FastTrackIT Bank!");
        int pin = 1177;
        int availableAmount = 3400791;

        System.out.println("Please enter your PIN number bellow:");
        Scanner scanner = new Scanner(System.in);
        int writePIN = scanner.nextInt();
        if (writePIN == pin) {
            System.out.println("Success!");
        } else {
            System.out.println("You have entered an incorrect PIN! Access denied!");
        }

        System.out.println("Enter the amount you wish to withdraw:");
        Scanner withdrawal = new Scanner(System.in);
        int amount = withdrawal.nextInt();
        if (amount <= availableAmount) {
            System.out.println("Withdrawal Request Successful! Remaining balance: " + (availableAmount - amount));

        } else {
            System.out.println("Insufficient funds! Your balance is:" + availableAmount);
        }
    }


}
