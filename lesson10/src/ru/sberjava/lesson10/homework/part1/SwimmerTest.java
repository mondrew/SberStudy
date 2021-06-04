/*
 * SwimmerTest program - testing Functional Interfaces
 * (Consumer, Supplier, BiConsumer)
 * The 10th homework (part 1) on Sber Java Developer Syllabus.
 * @author: Andrei Beseda
 * @version: 1.0 04/06/2021
 * @nickname: mondrew
 */
package ru.sberjava.lesson10.homework.part1;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class SwimmerTest {
    public static void main(String[] args) {
        Swimmer swimmer1 = new Swimmer("Michael", 25);
        Swimmer swimmer2 = new Swimmer("Alex", 25);
        System.out.println("Initial swimmers: " + swimmer1 + " " + swimmer2);

        System.out.println("=== Consumers test ===");
        swimmer1.swim(System.out::println);
        swimmer2.swim(name -> System.out.println(name));

        System.out.println("=== Suppliers test ===");
        Supplier<String> supplier1 = () -> swimmer1.getName();
        Supplier<String> supplier2 = swimmer2::getName;

        System.out.println(supplier1.get());
        System.out.println(supplier2.get());

        System.out.println("=== BiConsumer test ===");
        BiConsumer<String, Integer> biConsumer1 = (name, age) -> {
            swimmer1.setName(name);
            swimmer1.setAge(age);
        };

        BiConsumer<String, Integer> biConsumer2 = Swimmer::new;

        biConsumer1.accept("Jason", 30);
        biConsumer2.accept("Sam", 21);
        swimmer1.swim(System.out::println);
        swimmer2.swim(System.out::println);
    }
}