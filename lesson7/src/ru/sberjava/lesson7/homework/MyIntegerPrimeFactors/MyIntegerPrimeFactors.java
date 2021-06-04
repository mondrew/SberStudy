/*
 * MyIntegerPrimeFactors program - Comparator testing
 * The 7th homework on Sber Java Developer Syllabus.
 * @author: Andrei Beseda
 * @version: 1.0 25/04/2021
 * @nickname: mondrew
 */

package ru.sberjava.lesson7.homework.MyIntegerPrimeFactors;

import java.util.List;
import java.util.ArrayList;

public class MyIntegerPrimeFactors implements Comparable<MyIntegerPrimeFactors> {

    private int intNum;
    private int numOfPrimeFactors;

    public MyIntegerPrimeFactors() {
        this.intNum = 0;
        this.numOfPrimeFactors = -1;
    }

    public MyIntegerPrimeFactors(int intNum) {
        this.intNum = intNum;
        this.numOfPrimeFactors = -1;
    }

    public int getInteger() {
        return (intNum);
    }
    public void setInteger(int intNum) {
        this.intNum = intNum;
    }

    private boolean isPrime(int n) {
        if (n <= 0 || n == 1)
            return (false);
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return (false);
        }
        return (true);
    }

    public int getNumberOfPrimeFactors() {
        List<Integer> array = new ArrayList<>();

        if (this.numOfPrimeFactors != -1)
            return (this.numOfPrimeFactors);

        for (int i = 2; i <= this.intNum; i++) {
            if (this.intNum % i == 0 && isPrime(i) && !array.contains(i))
                array.add(i);
        }
        this.numOfPrimeFactors = array.size();
        return (array.size());
    }

    @Override
    public int compareTo(MyIntegerPrimeFactors o) {
        int result = Integer.compare(getNumberOfPrimeFactors(),
                                    o.getNumberOfPrimeFactors());
        if (result == 0)
            return (this.intNum - o.intNum);
        else
            return (result);
    }
}