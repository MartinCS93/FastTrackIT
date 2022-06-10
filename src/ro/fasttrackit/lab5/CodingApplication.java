package ro.fasttrackit.lab5;

import java.util.Arrays;

public class CodingApplication {


    public static void main(String[] args) {
        System.out.println(countChar("ana", 'a'));
        System.out.println(redact("ana-maria"));
        System.out.println(redact("word"));
        System.out.println(containsInArray(new String[]{"Ana", "are", "mere"}, "are"));
        System.out.println(Arrays.toString(words("Ana are mere")));
        System.out.println(confidential("Ana are mere multe si mere dulci", new String[]{"Ana", "mere"}));

    }

    private static String confidential(String text, String[] taboo) {
        String[] words = words(text);
        String confidential = "";
        for (String word : words) {
            String redacted = detectRedacted(taboo, word);
            confidential += redacted + " ";
        }
        return confidential.trim();
    }

    private static String detectRedacted(String[] taboo, String word) {
        String redacted = word;
        if (containsInArray(taboo, word)) {
            redacted = redact(word);
        }
        return redacted;
    }

    private static String[] words(String phrase) {
        return phrase.split(" ");
    }

    private static boolean containsInArray(String[] strings, String contained) {
        for (String string : strings) {
            if (string.equals(contained)) {
                return true;
            }
        }
        return false;
    }

    private static String redact(String word) {
        String redacted = "";
        for (char c : word.toCharArray()) {
            redacted += "*";
        }
        //redacted = word.replaceAll("[a-zA-Z-]", "*");
        return redacted;
    }

    private static int countChar(String word, char a) {
        int counter = 0;
        for (char c : word.toCharArray()) {
            if (a == c) {
                counter++;
            }
        }
        return counter;
    }
}

