/*
 * TriFunction - testing
 * The 10th homework (part 2) on Sber Java Developer Syllabus.
 * @author: Andrei Beseda
 * @version: 1.0 04/06/2021
 * @nickname: mondrew
 */
package ru.sberjava.lesson10.homework.part2;

public class Animal {
    private String species;
    private Integer age;

    public Animal() {
    }

    public Animal(String species, Integer age) {
        this.species = species;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", age=" + age +
                '}';
    }

    public void action(Integer fruits, Integer vegetables, Integer meat,
                                TriFunction<Integer, Integer, Integer, Integer> triFunction) {
        System.out.println("The " + species + " eats " +
                triFunction.apply(fruits, vegetables, meat) + " kgs of food a day");
    }
}
