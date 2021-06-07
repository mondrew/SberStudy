package ru.sberjava.lesson11.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLists {
    public static void main(String[] args) {
        List<Long> list1 = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 4L, 5L));
        List<Long> list2 = new ArrayList<>(Arrays.asList(4L, 7L, 3L, 9L, 10L));

        List<Long> intersection = list1.stream()
                .filter(x -> list2.contains(x))
                .collect(Collectors.toList());
        System.out.println(intersection);
    }
}
