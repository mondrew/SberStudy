package ru.sberjava.lesson11.homework;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamNames {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Lana", "George", "Michael", "Steve");
        List<String> list2 = Arrays.asList("Kevin", "Pam", "Creed", "Laura", "Dwight");
        List<String> list3 = Arrays.asList("Barney", "Ted", "Robin", "Marshal", "Lilly");
        List<String> list4 = Arrays.asList("Jim", "April", "Margo", "Jessica");

        Stream<List<String>> namesStream = Stream.of(list1, list2, list3, list4);
        List<String> names1 = namesStream.flatMap(l -> l.stream())
                .collect(Collectors.toList());
        // Alternative
        List<String> names2 = namesStream.flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(names1);
    }
}
