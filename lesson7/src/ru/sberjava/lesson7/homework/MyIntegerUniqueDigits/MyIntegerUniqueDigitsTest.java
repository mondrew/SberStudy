package ru.sberjava.lesson7.homework.MyIntegerUniqueDigits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyIntegerUniqueDigitsTest {

    public static void main(String[] args) {
        List<MyIntegerUniqueDigits> array = new ArrayList<>();
        array.add(new MyIntegerUniqueDigits(0));
        array.add(new MyIntegerUniqueDigits(1));
        array.add(new MyIntegerUniqueDigits(111101010));
        array.add(new MyIntegerUniqueDigits(1542345555));
        array.add(new MyIntegerUniqueDigits(543210));
        array.add(new MyIntegerUniqueDigits(987654321));
        array.add(new MyIntegerUniqueDigits(-1000000000));

        Collections.sort(array);
        for (MyIntegerUniqueDigits mi : array)
            System.out.println(mi.getIntNum() + ": " + mi.getUniqueDigits());
    }
}
