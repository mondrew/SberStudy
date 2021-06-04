package ru.sberjava.lesson10.homework.part2;

public class TriFunctionTest {
    public static void main(String[] args) {
        Animal giraffe = new Animal("giraffe", 5);
        Animal tiger = new Animal("tiger", 3);

        giraffe.action(2, 4, 0, (a, b, c) -> a + b + c);
        tiger.action(0, 0, 3, (a, b, c) -> a + b + c);
    }
}
