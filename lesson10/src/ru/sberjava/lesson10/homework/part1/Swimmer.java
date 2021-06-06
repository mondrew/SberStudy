/*
 * SwimmerTest program - testing Functional Interfaces
 * (Consumer, Supplier, BiConsumer)
 * The 10th homework (part 1) on Sber Java Developer Syllabus.
 * @author: Andrei Beseda
 * @version: 1.0 04/06/2021
 * @nickname: mondrew
 */
package ru.sberjava.lesson10.homework.part1;

import java.util.function.Consumer;

public class Swimmer {
    private String name;
    private Integer age;

    Swimmer() {
        name = "";
        age = 0;
    }

    Swimmer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Swimmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void swim(Consumer<String> c) {
        c.accept(name);
    }
}
