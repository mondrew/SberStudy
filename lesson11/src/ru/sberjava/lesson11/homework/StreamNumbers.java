package ru.sberjava.lesson11.homework;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamNumbers {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, -3, 2, 54, 9, -32, 2, -53, 32, 73, 1023);
        Set<Integer> set = s.filter(x -> (x > 0 && x % 2 == 1))
                .map(x -> x * 2)
                .peek(System.out::println)
                .collect(Collectors.toSet());
        System.out.print("Sum of numbers: ");
        Optional<Integer> sum = set.stream()
                .reduce(Integer::sum);
        sum.ifPresent(System.out::println);
    }
}
