package ro.fasttrackit.lab3;

public class Lab3HomeworkVariables {
    public static void main(String[] args) {
        System.out.println("The variable sum is: " + sumVariables());


    }

    private static double sumVariables() {
        int a = 9;
        double b = 1.78;
        short c = 1004;
        long d = 9726813;

        double sum = a + b + c + d;
        return sum;

    }
}
