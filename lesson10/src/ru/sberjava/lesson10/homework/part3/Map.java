/*
 * map() method with functional interface
 * The 10th homework (part 3) on Sber Java Developer Syllabus.
 * @author: Andrei Beseda
 * @version: 1.0 04/06/2021
 * @nickname: mondrew
 */
package ru.sberjava.lesson10.homework.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Map {

    public static <T, R> List<R> map(List<T> origin, Function<T, R> mapper) {
        List<R> newList = new ArrayList<>();

        for (T t : origin) {
            newList.add(mapper.apply(t));
        }
        return newList;
    }

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(Arrays.asList("HellO", "mY", "deaR", "wORld", "!"));

        System.out.println("Initial list: " + arrayList);
        List<String> upperCaseList = map(arrayList, String::toUpperCase);
        List<String> lowerCaseList = map(arrayList, str -> str.toLowerCase());

        System.out.println("Uppercase: " + upperCaseList);
        System.out.println("Lowercase: " + lowerCaseList);
    }
}
