package ru.sbrf.school.java.homework.fibsys;
import java.util.Scanner;

public class FibSys {

    public static String    decimalToFibSys(long num) {
        return ("");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter the decimal number: ");
        long    num = scanner.nextLong();
        if (num < 0) {
            System.out.println("Error: wrong input");
            return ;
        }
        System.out.println("Your number in Fibonacci system is: " + decimalToFibSys(num));
    }
}
