package ru.sberjava.lesson7.homework.MyIntegerPrimeFactors;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyIntegerPrimeFactorsTest {
    public static void main(String[] args) {

        List<MyIntegerPrimeFactors> lst = new LinkedList<>();
        lst.add(new MyIntegerPrimeFactors(32987));
        lst.add(new MyIntegerPrimeFactors(56));
        lst.add(new MyIntegerPrimeFactors(47));
        lst.add(new MyIntegerPrimeFactors(4));
        lst.add(new MyIntegerPrimeFactors(234));

        Collections.sort(lst);
        for (MyIntegerPrimeFactors i : lst)
            System.out.println(i.getInteger() + ": " + i.getNumberOfPrimeFactors());
    }
}
