/*
 * foldLeft() method with functional interface
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
import java.util.function.BiFunction;

public class FoldLeft {

    public static <T> T foldL(List<T> origin, BiFunction<T, T, T> folder) {

        Iterator<T> it = origin.iterator();
        int i = 0;
        while (origin.size() > 1 && it.hasNext()) {
            T t = it.next();
            if (i != 0) {
                origin.set(0, folder.apply(origin.get(0), t));
                it.remove();
            }
            i++;
        }
        return (origin.get(0));
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3));

        int res = foldL(arrayList, (a, b) -> (a * (b + 1)));
        System.out.println("Fold left result: " + res);
    }
}
