package ro.fasttrackit.lab2;

public class Functions {
    public static void main(String[] args) {

        method1(" niciodata");
        method2("nu s-ar programa");
        method1(" in povesti");
        method4("Un programel uitat acasa");
        System.out.println("---");
        method3("Confuz, a", " lasat ", "m singur");
        System.out.println("Cand incerca sa compileze");
        method2("erori, desigur");
        method4("Reusea si el sa mai ruleze");

    }

    public static void method1(String text) {
        method3("A ", " odata ", text);
    }

    public static void method2(String text) {
        System.out.println("Ca de nu ar fi " + text);
    }

    public static void method3(String text1, String text2, String text3) {
        System.out.println(text1 + " fost" + text2 + "ca" + text3);

    }

    public static void method4(String text){
        System.out.println(text + ".");
    }

}
