package ro.fasttrackit.lab5;

import java.util.Scanner;

public class CoffeeMenu {
    public static void main(String[] args) {
        System.out.println("Choose your option:");
        String[] coffeeOption = new String[]{"1.Espresso", "2.Cappuccino", "3.Latte", "4.Smoothie", "5.Exit"};
        availableMenu(coffeeOption);
        Scanner choice = new Scanner(System.in);
        int choose = choice.nextInt();


        if (choose == 1) {
            System.out.println("You ordered Espresso. Thank you!");
        } else if (choose == 2) {
            System.out.println("You ordered Cappuccino. Thank you!");
        } else if (choose == 3) {
            System.out.println("You ordered Latte. Thank you!");
        } else if (choose == 4) {
            System.out.println("You ordered Smoothie. Thank you!");
        } else if (choose == 5) {

        }

    }

    public static void availableMenu(String[] menu) {
        for (String i : menu) {
            System.out.println(i);
        }
    }
}

