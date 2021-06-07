package ru.sberjava.lesson7.homework.MyIntegerUniqueDigits;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MyIntegerUniqueDigits implements Comparable<MyIntegerUniqueDigits> {

    private int intNum;
    private int uniqueDigits;

    public MyIntegerUniqueDigits() {
        this.intNum = 0;
        this.uniqueDigits = 0;
    }
    public MyIntegerUniqueDigits(int intNum) {
        this.intNum = intNum;
        this.uniqueDigits = 0;
    }

    public int getUniqueDigits() {
        Set<Integer>    set = new HashSet<>();
        int             num = this.intNum;

        if (this.uniqueDigits != 0)
            return (this.uniqueDigits);
        if (num == 0) {
            this.uniqueDigits = 1;
            return (1);
        }
        while (num != 0) {
            set.add(num % 10);
            num /= 10;
        }
        this.uniqueDigits = set.size();
        return (this.uniqueDigits);
    }

    public int getIntNum() {
        return intNum;
    }

    public void setIntNum(int intNum) {
        this.intNum = intNum;
    }

    @Override
    public int compareTo(MyIntegerUniqueDigits o) {
        int result = Integer.compare(getUniqueDigits(), o.getUniqueDigits());

        if (result == 0)
            return (this.getIntNum() - o.getIntNum());
        return result;
    }
}
