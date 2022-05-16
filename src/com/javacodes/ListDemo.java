package com.javacodes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {

    public static void main(String[] args) {
        List<String> students = Arrays.asList(
                "Shubham",
                "Ankur",
                "Arun",
                "Kartik"
        );
        Collections.sort(students);
        System.out.println(students);
        students = students.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(students);
    }
}
