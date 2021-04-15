/*
 * Abracadabra program - printing string in the frame
 * The 2nd homework (part 2) on Sber Java Developer Syllabus
 * @author: Andrei Beseda
 * @version: 1.0 15/04/2021
 * @nickname: mondrew
 */
package ru.sberjava.lesson3.homework.fibsys;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class FibSys {

    public static ArrayList<Long>   generateFibonacciSequence(long n) {

        ArrayList<Long> arrayList = new ArrayList<Long>();

        Collections.addAll(arrayList,1L, 2L);
        for (int i = 2; ; i++) {
            long k = arrayList.get(i - 1) + arrayList.get(i - 2);
            if (k > n || k < 0)
                break ;
            arrayList.add(k);
        }
        return (arrayList);
    }

    public static int               findIndexLessOrEquals(ArrayList<Long> fibArr, long num) {

        int i = 0;

        for (i = 0; i < fibArr.size(); i++) {
            long k = fibArr.get(i);
            if (k == num)
                return (i);
            else if (k > num)
                return (i - 1);
        }
        return (i - 1);
    }

    public static String            decimalToFibSys(long num) {

        // Create Fibonacci array
        ArrayList<Long>     fibArr = generateFibonacciSequence(num);
        StringBuilder       strBldr = new StringBuilder();
        ArrayList<Integer>  indexArr = new ArrayList<Integer>();

        if (num == 0)
            return ("0"); // Check it

        // System.out.println("Fibonacci sequence: " + fibArr); // debug
        // Add indexes in the array
        while (num > 0) {
            int idx = findIndexLessOrEquals(fibArr, num);
            if (idx == -1) {
                System.out.println("Error occurred");
                return "";
            }
            indexArr.add(idx);
            num -= fibArr.get(idx);
        }

        // Create final string
        for (int i = fibArr.size() - 1; i >= 0;  i--) {
            if (indexArr.contains(i))
                strBldr.append("1");
            else
                strBldr.append("0");
        }
        return (strBldr.toString());
    }

    public static void              main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter the decimal number: ");
        long    num = scanner.nextLong();
        if (num < 0) {
            System.out.println("Error: wrong input");
            return ;
        }
        System.out.println(decimalToFibSys(num));
    }
}
