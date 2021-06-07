/*
 * QuadFunction - own Functional Interface
 * The 10th homework (part 2) on Sber Java Developer Syllabus.
 * @author: Andrei Beseda
 * @version: 1.0 04/06/2021
 * @nickname: mondrew
 */
package ru.sberjava.lesson10.homework.part2;

public interface QuadFunction<T, U, S, P, R> {
    R apply(T t, U u, S s, P p);
}
