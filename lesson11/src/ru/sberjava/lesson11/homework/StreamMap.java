package ru.sberjava.lesson11.homework;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        Map<String, Double> fightersMap = new HashMap<>();
        fightersMap.put("John", 98.4);
        fightersMap.put("Kevin", 109.3);
        fightersMap.put("Steve", 99.0);
        fightersMap.put("Michael", 82.3);
        fightersMap.put("Mohamad", 83.4);

        Collection<Double> weights = fightersMap.values();
        Stream<Double> stream = weights.stream();

        // Alternative
        Stream<Double> stream2 = fightersMap.values().stream();

        OptionalDouble avgWeight = stream.mapToDouble(x -> x)
                .average();
        avgWeight.ifPresent(System.out::println);
    }
}
