/*
 * count() method with functional interface
 * The 10th homework (part 3) on Sber Java Developer Syllabus.
 * @author: Andrei Beseda
 * @version: 1.0 04/06/2021
 * @nickname: mondrew
 */
package ru.sberjava.lesson10.homework.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Count {

    public static <T> Integer count(List<T> origin, Predicate<T> predicate) {
        int counter = 0;

        for (T t : origin) {
            if (predicate.test(t))
                counter++;
        }
        return (counter);
    }

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(
            Arrays.asList("This", "is", "just", "test", "array", "of", "words"));
        int fourLetterWords = count(arrayList, a -> (a.length() == 4));
        System.out.println("Number of words with length 4 is: " + fourLetterWords);
    }
}
