/*
 * filter() method with functional interface
 * The 10th homework (part 3) on Sber Java Developer Syllabus.
 * @author: Andrei Beseda
 * @version: 1.0 04/06/2021
 * @nickname: mondrew
 */
package ru.sberjava.lesson10.homework.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static <T> List<T> filter(List<T> origin, Predicate<T> predicate) {
        Iterator<T> iterator = origin.iterator();

        while (iterator.hasNext()) {
            T t = iterator.next();
            if (!predicate.test(t))
                iterator.remove();
        }
        return (origin);
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(
                                    -1, 0, 1, 2, -3, 4, 5, -6, 7, 8, 9));
        System.out.println("Initial array list: " + arrayList);
        filter(arrayList, a -> a > 1);
        System.out.println("Array list after filtration: " + arrayList);
    }
}
