package ro.fasttrackit.lab3;

public class ExtraMile {
    public static void main(String[] args) {
        extraMile1("short");
        extraMile1("byte");
        extraMile1("int");
        extraMile1("float");
        extraMile1("double");
        extraMile1("char");
        extraMile1("boolean");
        System.out.println();
        extraMile2(1);
        extraMile2(4);
        extraMile2(8);
        extraMile2(10);
        System.out.println();
        extraMile3(0, 1);
        extraMile3(1, 0);
        extraMile3(2, 2);

    }

    public static void extraMile1(String variables) {
        System.out.println(variables);
    }

    public static void extraMile2(int i) {
        int[] array = new int[]{10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
        System.out.println(array[i - 1]);
    }

    public static void extraMile3(int i, int j) {
        String[] names = new String[]{"Ana", "Maria", "Andrea"};
        int[] age = new int[]{18, 21, 30};
        System.out.println(names[i] + " has " + age[j] + " years.");
    }
}
