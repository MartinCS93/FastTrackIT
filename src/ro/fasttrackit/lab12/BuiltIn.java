package ro.fasttrackit.lab12;

import java.util.ArrayList;
import java.util.List;

public class BuiltIn {
    public static void main(String[] args) {

        System.out.println("Before exception.");
try {
    List<String> elems = new ArrayList<>();
    elems.get(5);
} catch (IndexOutOfBoundsException e) {
    System.out.println("Index Of Out Bound exception catch.");
} finally {
    System.out.println("This will be printed everytime.");
}
        System.out.println("After exception.");
    }
}
