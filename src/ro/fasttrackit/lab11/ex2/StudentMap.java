package ro.fasttrackit.lab11.ex2;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        Map<String, Integer> classroom = new HashMap<>();
        classroom.put("Ion", 5);
        classroom.put("Maria", 7);
        classroom.put("Marcel", 9);
        classroom.put("Stefan", 10);
        classroom.put("Ana", 8);

        System.out.println(classroom);
        System.out.println();
        printAll(classroom);
        printStudentWithHighestGrade(classroom);
        System.out.println();
        printSortedMapByIncreasingGrade(classroom);

    }

    public static void printAll(Map<String, Integer> classroom) {
        for (Map.Entry<String, Integer> classroomEntry : classroom.entrySet()) {
            System.out.println("Name: " + classroomEntry.getKey() + "\nGrade: " + classroomEntry.getValue());
            System.out.println();
        }
    }

    private static void printStudentWithHighestGrade(Map<String, Integer> classroom) {
        String student = Collections.max(classroom.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Student with the highest grade is: " + student);
    }

    public static void printSortedMapByIncreasingGrade(Map<String, Integer> classroom) {
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        classroom.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x -> sortedMap.put(x.getKey(),x.getValue()));
        System.out.println("Sorted map: " + sortedMap);
    }
}


