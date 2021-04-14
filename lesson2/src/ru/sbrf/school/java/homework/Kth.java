/*
* Kth program - find k-th number in A007376 sequence
* The 1st homework on Sber Java Developer Syllabus
* @author: Andrei Beseda
* @version: 1.0 05/04/2021
* @nickname: mondrew
 */

package ru.sbrf.school.java.homework;
import java.util.Scanner;

public class Kth {

    public static long calculatePower(long base, int power) {

        long     res = base;

        if (power == 0)
            return (1);
        while (power > 1) {
            res *= base;
            power--;
        }
        return (res);
    }

    public static short   findDigitInSequence(long k) {

        long    theValue;
        long    numberOfDigits = 1;
        long    levelCapacity = 9;
        long    prevLevelCapacity;
        int     power = 0;

        // Find on which 'level' index is
        while (k >= levelCapacity * numberOfDigits) { // '=' - indexing form 0
            k -= numberOfDigits * levelCapacity;
            numberOfDigits++;
            power++;
            prevLevelCapacity = levelCapacity;
            levelCapacity = 9 * calculatePower(10, power);
            // Overflow case - means we are on the last level
            if (levelCapacity <= prevLevelCapacity) {
                break;
            }
        }
        // The number we are searching digit in
        theValue = calculatePower(10, power) + k / numberOfDigits;

        // Shift number to the right so the searched digit will be the last one
        theValue /= calculatePower(10,
                        (int)((numberOfDigits - 1) - (k % numberOfDigits)));
        return ((short)(theValue % 10));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index please: ");
        long    k = scanner.nextLong();

        System.out.println("The digit number " + k +
                " in the infinite sequence A007376 is: " +
                findDigitInSequence(k));
    }
}
