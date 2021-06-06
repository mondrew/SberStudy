/*
 * foldRight() method with functional interface
 * The 10th homework (part 3) on Sber Java Developer Syllabus.
 * @author: Andrei Beseda
 * @version: 1.0 04/06/2021
 * @nickname: mondrew
 */
package ru.sberjava.lesson10.homework.part3;

import java.util.*;
import java.util.function.BiFunction;

public class FoldRight {

    public static <T> T foldR(List<T> origin, BiFunction<T, T, T> folder) {
        ListIterator<T> it = origin.listIterator(origin.size());
        int i = 0;

        while (origin.size() > 1 && it.hasPrevious()) {
            T t = it.previous();
            if (i != 0) {
                origin.set(origin.size() - 1, folder.apply(origin.get(origin.size() - 1), t));
                it.remove();
            }
            i++;
        }
        return (origin.get(0));
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3));
        int res = foldR(arrayList, (a, b) -> (a * (b + 1)));
        System.out.println("Fold right result: " + res);
    }
}
