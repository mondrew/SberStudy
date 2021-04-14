package ru.sbrf.school.java.classwork;
import java.util.ArrayList;
import java.util.Collections;

public class MaxMinLesson2 {

    public static Integer maxNumber(ArrayList<Integer> list) {

        Integer n = list.get(0);//
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > n)
                n = list.get(i);
        }
        return (n);
    }

    public static Integer minNumber(ArrayList<Integer> list) {

        Integer n = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < n)
                n = list.get(i);
        }
        return (n);
    }

    public static Integer meanNumber(ArrayList<Integer> list) {

        Integer n = 0;

        for (int i = 0; i < list.size(); i++) {
            n += list.get(i);
        }
        return (n / list.size());
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println("Min: " + maxNumber(list));
        System.out.println("Min: " + minNumber(list));
        System.out.println("Arithmetic mean: " + meanNumber(list));
    }

}
