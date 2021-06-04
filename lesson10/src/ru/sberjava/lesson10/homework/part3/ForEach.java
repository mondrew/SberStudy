/*
 * forEach() method with functional interface
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
import java.util.function.Consumer;

public class ForEach {

    public static <T> void forEach(List<T> origin, Consumer<T> consumer) {
        Iterator<T> it = origin.iterator();

        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        forEach(arrayList, System.out::println);
    }
}
