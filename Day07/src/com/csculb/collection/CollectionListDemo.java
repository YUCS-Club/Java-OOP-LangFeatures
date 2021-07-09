package com.csculb.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionListDemo {

    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>();
        subjects.add("English");
        subjects.add("Physics");
        subjects.add("Maths");
        subjects.add("Programming");
        subjects.add("Biology");

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers = new ArrayList<>(list);
        numbers.add(11);

        // Creation, Manipulation, Terminating
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .map(number -> number - 1)
                .forEach(System.out::println);

        numbers.forEach(System.out::println);

        List<String> subjectsWithI = new ArrayList<>();

        subjectsWithI = subjects.stream() // English, Physics, Maths, Programming, Biology
                .filter((subject) -> subject.contains("i")) // true, true, false, true, true
//                .forEach(System.out::println);
                .collect(Collectors.toList());

        subjectsWithI.forEach(System.out::println);
//        subjectsWithI.forEach((subject) -> System.out.println(subject));

//        for (String subject : subjectsWithI) {
//            System.out.println(subject);
//        }

//        subjects.forEach((str) -> System.out.println(str));
    }
}
